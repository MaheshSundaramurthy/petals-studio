/****************************************************************************
 *
 * Copyright (c) 2011-2012, EBM WebSourcing
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 *
 *****************************************************************************/

package com.ebmwebsourcing.petals.services.bpel.wizards;

import java.io.IOException;
import java.net.URI;

import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.wizards.NewBpelFileFirstPage.BpelCreationMode;
import org.eclipse.bpel.ui.wizards.NewBpelFileWizardUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import com.ebmwebsourcing.petals.common.internal.provisional.utils.JbiXmlUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsConstants;
import com.ebmwebsourcing.petals.services.bpel.PetalsBpelHelper;
import com.ebmwebsourcing.petals.services.bpel.PetalsBpelPlugin;
import com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.ebmwebsourcing.petals.services.su.wizards.FinishServiceCreationStrategy;
import com.ebmwebsourcing.petals.services.su.wizards.pages.ProjectPage;
import com.ebmwebsourcing.petals.services.utils.PetalsServicesProjectUtils;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Jbi;

/**
 * @author Micka�l Istria - EBM WebSourcing
 */
public class BpelStrategy implements FinishServiceCreationStrategy {

	private IProject project;


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.FinishServiceCreationStrategy
	 * #finishWizard(com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard,
	 * com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void finishWizard( AbstractServiceUnitWizard wizard, AbstractEndpoint endpoint, IProgressMonitor monitor )
	throws Exception {

		// Create the BPEL stuff
		final BpelSuWizard wiz = (BpelSuWizard) wizard;
		String bpelName = wiz.firstPage.getProcessTemplateProperties().get( "processName" ) + ".bpel";
		final IFile bpelFile = this.project.getFolder( PetalsConstants.LOC_RES_FOLDER ).getFile( bpelName );

		monitor.subTask( "Creating the process..." );
		NewBpelFileWizardUtils utils = new NewBpelFileWizardUtils( wiz.firstPage, wiz.wsdlPage, wiz.portTypePage, bpelFile );
		if( wiz.firstPage.getCreationMode() == BpelCreationMode.GENERATE_BPEL_FROM_WSDL )
			utils.createResourcesFromWsdl( monitor );
		else
			utils.createResourcesFromTemplate( monitor );


		// Analyze the created BPEL file to generate a jbi.xml file
		Assert.isTrue( bpelFile.exists());
		PetalsBpelHelper helper = new PetalsBpelHelper( bpelFile.getLocation().toFile());


		// Create the jbi.xml
		final IFile jbiFile = this.project.getFile( PetalsConstants.LOC_JBI_FILE );
		Jbi jbiInstance = helper.createJbiXml( jbiFile, bpelName );


		// Create the project
		createProject( wizard, monitor );


		// Write the jbi.xml file
		monitor.subTask( "Creating the jbi.xml..." );
		JbiXmlUtils.writeJbiXmlModel( jbiInstance, jbiFile.getLocation().toFile());
		monitor.worked( 1 );


		// Refresh the workspace
		try {
			bpelFile.getProject().refreshLocal( IResource.DEPTH_INFINITE, null );
		} catch( CoreException e ) {
			BPELUIPlugin.log( e );
		}


		// Open the file?
		wiz.getShell().getDisplay().asyncExec( new Runnable() {
			@Override
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IDE.openEditor( page, bpelFile );
					BasicNewResourceWizard.selectAndReveal( bpelFile, page.getWorkbenchWindow());

				} catch( PartInitException e ) {
					BPELUIPlugin.log( e );
				}
			}
		});
	}


	/**
	 * Creates the project.
	 * <p>
	 * If the project already exists, this method does nothing.
	 * </p>
	 *
	 * @param wizard
	 * @param monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	public void createProject( AbstractServiceUnitWizard wizard, IProgressMonitor monitor ) throws CoreException, IOException {

		if( this.project != null )
			return;

		monitor.beginTask( "", IProgressMonitor.UNKNOWN );
		monitor.subTask( "Creating the project structure..." );

		ProjectPage ppage = (ProjectPage) wizard.getPage( ProjectPage.PAGE_NAME );
		Assert.isNotNull( ppage );
		URI locationURI = ppage.isAtDefaultlocation() ? null : ppage.computeProjectLocation().toURI();
		this.project = PetalsServicesProjectUtils.createSuProject(
				ppage.getProjectName(),
				locationURI,
				wizard.getComponentVersionDescription().getComponentName(),
				wizard.getComponentVersionDescription().getComponentVersion(),
				wizard.getComponentVersionDescription().getComponentAlias(),
				false,
				monitor );
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.FinishServiceCreationStrategy
	 * #getSUProject(com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IProject getSUProject( AbstractServiceUnitWizard wizard, IProgressMonitor monitor ) {

		if (this.project == null) {
			try {
				createProject( wizard, monitor );

			} catch (Exception ex) {
				PetalsBpelPlugin.log( ex, IStatus.ERROR );
			}
		}

		return this.project;
	}
}