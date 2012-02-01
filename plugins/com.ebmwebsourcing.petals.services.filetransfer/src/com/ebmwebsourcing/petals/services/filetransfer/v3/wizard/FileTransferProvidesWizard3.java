/******************************************************************************
 * Copyright (c) 2011-2012, EBM WebSourcing
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     EBM WebSourcing - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.filetransfer.v3.wizard;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package;
import com.ebmwebsourcing.petals.services.cdk.Cdk5Utils;
import com.ebmwebsourcing.petals.services.filetransfer.filetransfer3.Filetransfer3Package;
import com.ebmwebsourcing.petals.services.filetransfer.generated.FileTransferService;
import com.ebmwebsourcing.petals.services.filetransfer.v24.wizard.FiletransferProvidesPage;
import com.ebmwebsourcing.petals.services.filetransfer.v3.FileTransferDescription3;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.ebmwebsourcing.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Provides;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class FileTransferProvidesWizard3 extends AbstractServiceUnitWizard {

	public FileTransferProvidesWizard3() {
		super();
		settings.showWsdl = false;
		settings.activateInterfaceName = false;
	}

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new FileTransferDescription3();
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #predefineJbiValues(com.sun.java.xml.ns.jbi.AbstractEndpoint)
	 */
	@Override
	public void presetServiceValues( AbstractEndpoint ae ) {
		ae.setInterfaceName(new QName("http://petals.ow2.org/components/filetransfer/version-3", "FileTransferType"));
		ae.setServiceName( new QName( "http://petals.ow2.org/components/filetransfer/version-3", "change-it" ));
		Cdk5Utils.setInitialProvidesValues((Provides)ae);
		ae.eSet(Cdk5Package.Literals.CDK5_PROVIDES__WSDL, "FileTransferService.wsdl");
	}

	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {
		String wsdlFileName = (String)abstractEndpoint.eGet(Cdk5Package.Literals.CDK5_PROVIDES__WSDL);
		IFile wsdlFile = resourceFolder.getFile(wsdlFileName);
		createFile( wsdlFile, new FileTransferService().generate( abstractEndpoint ), monitor );

		return Status.OK_STATUS;
	}


	@Override
	protected AbstractSuWizardPage[] getCustomWizardPagesAfterJbi() {
		return null;
	}


	@Override
	protected AbstractSuWizardPage[] getCustomWizardPagesAfterProject() {
		return new AbstractSuWizardPage[] { new SimpleFeatureListSuWizardPage(
				Filetransfer3Package.Literals.FILE_TRANSFER3_PROVIDES__FILENAME,
				Filetransfer3Package.Literals.FILE_TRANSFER3_PROVIDES__BACKUP_DIRECTORY,
				Filetransfer3Package.Literals.FILE_TRANSFER3_PROVIDES__FOLDER
			) };
	}


	@Override
	protected AbstractSuWizardPage[] getCustomWizardPagesBeforeProject() {
		return null;
	}


	@Override
	protected IStatus importAdditionalFiles(IFolder resourceDirectory, IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}


	@Override
	protected boolean isJavaProject() {
		return false;
	}
}