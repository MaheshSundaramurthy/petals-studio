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

package com.ebmwebsourcing.petals.services.ejb.tests;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.junit.Assert;
import org.junit.Test;

import com.ebmwebsourcing.petals.services.ejb.wizards.EJBCustomSpecificationPage12;
import com.ebmwebsourcing.petals.services.ejb.wizards.EjbWizard13;
import com.ebmwebsourcing.petals.tests.common.FileTestUtil;

/**
 * @author Micka�l Istria - EBM WebSourcing
 */
public class TestEJBSUGeneration extends SWTBotGefTestCase {

	protected File businessFile;
	protected File jeeFile;


	/**
	 * @throws Exception
	 */
	public void initFiles() throws Exception {
		URL url = TestEJBSUGeneration.class.getResource("/addorder.jar");
		url = FileLocator.toFileURL(url);
		this.businessFile = new File(url.getFile());
		url = TestEJBSUGeneration.class.getResource("/easybeans-all-1.0.2.jar");
		url = FileLocator.toFileURL(url);
		this.jeeFile = new File(url.getFile());
	}


	/**
	 * @throws Exception
	 */
	@Test
	public void testFileLocked() throws Exception {
		initFiles();

		this.bot.perspectiveById( "com.ebmwebsourcing.petals.common.mainPerspective" ).activate();
		this.bot.menu("New").menu("Petals Service Provider").click();

		this.bot.comboBox(1).setSelection( 0 );
		this.bot.button("Next >").click();

		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				WizardDialog wizardDialog = (WizardDialog) TestEJBSUGeneration.this.bot.activeShell().widget.getData();
				EJBCustomSpecificationPage12 page = (EJBCustomSpecificationPage12) wizardDialog.getCurrentPage();

				// Validate the page
				page.setEjbFiles( Arrays.asList( TestEJBSUGeneration.this.businessFile ));

				// Complete the wizard
				((EjbWizard13) page.getWizard()).setEJBFiles( Arrays.asList( TestEJBSUGeneration.this.businessFile ));
				((EjbWizard13) page.getWizard()).setJEEFiles( Arrays.asList( TestEJBSUGeneration.this.jeeFile ));
				page.validate();
			}
		});

		this.bot.text().setText("org.ow2.petals.examples.ejb.addorder.AddOrderRemote");
		this.bot.button("Next >").click();

		final String suName = "ejbSu " + System.currentTimeMillis();
		this.bot.text().setText(suName);
		this.bot.button("Next >").click();

		this.bot.text(0).setText("jndiName");
		this.bot.text(1).setText("jndiFactory");
		this.bot.text(3).setText("jndiUrl");
		this.bot.comboBox().setSelection(0);
		Assert.assertFalse(FileTestUtil.fileOpen(this.jeeFile));
		Assert.assertFalse(FileTestUtil.fileOpen(this.businessFile));
		this.bot.button("Finish").click();

		this.bot.waitUntil( new ICondition() {

			@Override
			public boolean test() throws Exception {
				// The view is activated after the editor was open
				SWTBotView view = TestEJBSUGeneration.this.bot.viewById("com.ebmwebsourcing.petals.common.projects");
				return view.isActive();
			}

			@Override
			public void init(SWTBot bot) {
				// nothing
			}

			@Override
			public String getFailureMessage() {
				return "Could not get the file selected.";
			}
		}, 10000, 1000 );

		Assert.assertFalse(FileTestUtil.fileOpen(this.jeeFile));
		Assert.assertFalse(FileTestUtil.fileOpen(this.businessFile));
	}
}
