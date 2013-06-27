/**
 * Copyright (c) 2011-2013, Linagora
 *
 *  This source code is available under agreement available at
 *  http://www.petalslink.com/legal/licenses/petals-studio
 *
 *  You should have received a copy of the agreement along with this program.
 *  If not, write to Linagora (80, rue Roque de Fillol - 92800 Puteaux, France).
 */
package com.ebmwebsourcing.petals.services.su.editor.extensibility.defaultpages;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.ebmwebsourcing.petals.common.internal.provisional.swt.OpenSourceEditorHyperlinkListener;
import com.ebmwebsourcing.petals.services.PetalsServicesPlugin;
import com.ebmwebsourcing.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;
import com.ebmwebsourcing.petals.services.su.editor.su.JBIEndpointUIHelpers;
import com.ebmwebsourcing.petals.studio.dev.properties.AbstractModel;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * This class generates default contributions.
 * <p>
 * It is parameterized by the {@link EClass}es to introspect to generate widgets.
 * The main tab is made of default JBI stuff, advanced tab is made of generated widgets
 * </p>
 *
 * @author Mickael Istria - EBM WebSourcing
 */
public class DefaultJbiEditorContribution extends JbiEditorDetailsContribution {

	@Override
	public void addMainSUContent(
			AbstractEndpoint edpt,
			AbstractModel componentModel,
			AbstractModel cdkModel,
			FormToolkit toolkit,
			Composite mainTab,
			IFile editedFile ) {

		Composite composite = createCommonProvideSection( mainTab, toolkit );
		JBIEndpointUIHelpers.createCommonEndpointUI( edpt, toolkit, composite );

		// Add a warning message
		final Image noticeImage = PetalsServicesPlugin.loadImage( "icons/obj16/smartmode_co.gif" );
		FormText ft = new FormText( composite, SWT.BORDER | SWT.WRAP ) {
			@Override
			public void dispose() {
				super.dispose();
				if( noticeImage != null && ! noticeImage.isDisposed())
					noticeImage.dispose();
			}
		};

		ft.marginWidth = 7;
		ft.marginHeight = 7;
		GridData layoutData = new GridData( GridData.FILL_HORIZONTAL );
		layoutData.horizontalSpan = 2;
		layoutData.verticalIndent = 30;
		layoutData.widthHint = 380;
		layoutData.heightHint = 100;
		ft.setLayoutData( layoutData );

		ft.setImage( "tip", noticeImage );
		StringBuilder sb = new StringBuilder();
		sb.append( "<form>" );
		sb.append( "<p><img href=\"tip\" /> <b>Notice</b></p>" );
		sb.append( "<p>This a default edition view. This component or this component version is not supported by the current Petals tooling.</p>" );
		sb.append( "<p vspace=\"false\">It is also possible that this component does not support <b>provides</b> or <b>consumes</b> blocks.</p>" );
		sb.append( "<p>You may prefer to edit the sources directly. In this case, please use the <a>Petals Source Editor</a>.</p>" );
		sb.append( "</form>" );

		ft.addHyperlinkListener( new OpenSourceEditorHyperlinkListener( editedFile, false ));
		ft.setText( sb.toString(), true, false );
	}


	@Override
	public void addAdvancedSUContent( AbstractEndpoint edpt, AbstractModel componentModel, AbstractModel cdkModel, FormToolkit toolkit, Composite advancedTab ) {
		toolkit.createLabel( advancedTab, "Advanced settings are not available." );
	}
}
