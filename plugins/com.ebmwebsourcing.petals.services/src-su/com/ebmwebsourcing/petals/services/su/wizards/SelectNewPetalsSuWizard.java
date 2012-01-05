package com.ebmwebsourcing.petals.services.su.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.ebmwebsourcing.petals.services.Messages;
import com.ebmwebsourcing.petals.services.su.wizards.pages.ChoicePage;

public class SelectNewPetalsSuWizard extends Wizard implements INewWizard, IExecutableExtension {

	private PetalsMode petalsMode;
	private FinishServiceCreationStrategy strategy;

	public SelectNewPetalsSuWizard() {
		setForcePreviousAndNextButtons(true);
	}
		
	public SelectNewPetalsSuWizard(PetalsMode mode, FinishServiceCreationStrategy strategy) {
		this();
		this.strategy = strategy;
		this.petalsMode = mode;
		init();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.IExecutableExtension
	 * #setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setInitializationData( IConfigurationElement config, String propertyName, Object data ) throws CoreException {
		this.petalsMode = "provides".equalsIgnoreCase( String.valueOf( data )) ? PetalsMode.provides : PetalsMode.consumes;
		this.strategy = new CreateJBIStrategy();
		init();
	}
	
	public void init() {
		if (petalsMode == PetalsMode.provides) {
			setWindowTitle(Messages.provideTitle);
		} else {
			setWindowTitle(Messages.consumeTitle);
		}
	}
	
	/**
	 * Adds the first page of the wizard.
	 */
	@Override
	public void addPages() {
		addPage( new ChoicePage(this.petalsMode, strategy));
	}

	
	@Override
	public boolean performFinish() {
		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

}