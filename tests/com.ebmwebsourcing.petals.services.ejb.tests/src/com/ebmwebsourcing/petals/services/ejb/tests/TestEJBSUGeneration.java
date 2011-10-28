/******************************************************************************
 * Copyright (c) 2011, EBM WebSourcing
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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.junit.Assert;
import org.junit.Test;

import com.ebmwebsourcing.petals.services.ejb.v12.EJBCustomSpecificationPage12;
import com.ebmwebsourcing.petals.services.su.wizards.legacy.swt.FileList;
import com.ebmwebsourcing.petals.tests.common.FileTestUtil;

public class TestEJBSUGeneration extends SWTBotGefTestCase {


	protected File businessFile;
	protected File jeeFile;

	public void initFiles() throws Exception {
		URL url = TestEJBSUGeneration.class.getResource("/addorder.jar");
		url = FileLocator.toFileURL(url);
		this.businessFile = new File(url.getFile());
		url = TestEJBSUGeneration.class.getResource("/easybeans-all-1.0.2.jar");
		url = FileLocator.toFileURL(url);
		this.jeeFile = new File(url.getFile());
	}

	@Test
	public void testFileLocked() throws Exception {
		initFiles();
		this.bot.menu("New").menu("Service Unit").click();
		this.bot.comboBox(1).setSelection("EJB  //  petals-bc-ejb");
		this.bot.button("Next >").click();
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					WizardDialog wizardDialog = (WizardDialog)TestEJBSUGeneration.this.bot.activeShell().widget.getData();
					EJBCustomSpecificationPage12 page = (EJBCustomSpecificationPage12)wizardDialog.getCurrentPage();
					{
						FileList list = page.getEJBFiles();
						List<File> files = new ArrayList<File>();
						files.add(TestEJBSUGeneration.this.businessFile);
						list.addFiles(files);
					}
					{
						FileList list = page.getJEEFiles();
						List<File> files = new ArrayList<File>();
						files.add(TestEJBSUGeneration.this.jeeFile);
						list.addFiles(files);
					}
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
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

		this.bot.waitUntil(new ICondition() {

			@Override
			public boolean test() throws Exception {
				return TestEJBSUGeneration.this.bot.activeEditor().getTitle().equals(suName);
			}

			@Override
			public void init(SWTBot bot) {
			}

			@Override
			public String getFailureMessage() {
				return null;
			}
		});

		Assert.assertFalse(FileTestUtil.fileOpen(this.jeeFile));
		Assert.assertFalse(FileTestUtil.fileOpen(this.businessFile));
	}



}
