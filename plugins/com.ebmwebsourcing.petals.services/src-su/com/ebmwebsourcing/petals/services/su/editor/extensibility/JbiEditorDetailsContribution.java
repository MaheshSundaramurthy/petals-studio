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

package com.ebmwebsourcing.petals.services.su.editor.extensibility;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import com.ebmwebsourcing.petals.common.internal.provisional.formeditor.ISharedEdition;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public abstract class JbiEditorDetailsContribution {

	/**
	 * Adds content in the main tab of the JBI editor.
	 * @param endpoint
	 * @param toolkit
	 * @param generalDetails
	 * @param ise
	 */
	public abstract void addMainSUContent(AbstractEndpoint endpoint, FormToolkit toolkit, Composite generalDetails, ISharedEdition ise);


	/**
	 * Adds content in the advanced tab of the JBI editor.
	 * @param endpoint
	 * @param toolkit
	 * @param advancedDetails
	 * @param ise
	 */
	public abstract void addAdvancedSUContent(AbstractEndpoint endpoint, FormToolkit toolkit, Composite advancedDetails, ISharedEdition ise);


	/**
	 * Creates an editor section which is not expanded.
	 * <p>
	 * Equivalent to <code>createEditorSection( parent, toolkit, title, false );</code>.
	 * </p>
	 *
	 * @param parent
	 * @param toolkit
	 * @param title
	 * @return a composite (which the client of a section)
	 */
	protected Composite createEditorSection( Composite parent, FormToolkit toolkit, String title ) {
		return createEditorSection( parent, toolkit, title, false );
	}


	/**
	 * Creates an editor section.
	 * @param parent
	 * @param toolkit
	 * @param title
	 * @param expandable true to make it expandable, false otherwise
	 * @return a composite (which the client of a section)
	 */
	protected Composite createEditorSection( Composite parent, FormToolkit toolkit, String title, boolean expandable ) {
		return createEditorSection( parent, toolkit, title, null, expandable );
	}


	/**
	 * Creates an editor section.
	 * @param parent
	 * @param toolkit
	 * @param title
	 * @param description
	 * @param expandable true to make it expandable, false otherwise
	 * @return a composite (which the client of a section)
	 */
	protected Composite createEditorSection( Composite parent, FormToolkit toolkit, String title, String description, boolean expandable ) {

		int style = expandable ? Section.EXPANDED | Section.TITLE_BAR : Section.TITLE_BAR | ExpandableComposite.TWISTIE;
		if( description != null )
			style |= Section.DESCRIPTION;

		Section section = toolkit.createSection( parent, style );
		section.setText( title );
		section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		if( description != null ) {
			section.setDescription( description );
			section.clientVerticalSpacing = 10;
		}

		Composite composite = toolkit.createComposite( section );
		composite.setLayout( new GridLayout( 2, false ));
		section.setClient( composite );

		return composite;
	}


	/**
	 * Creates the common section for "provides" blocks.
	 * @param parent
	 * @param toolkit
	 * @return a composite
	 */
	protected Composite createCommonProvideSection( Composite parent, FormToolkit toolkit ) {
		return createEditorSection( parent, toolkit, "Identification", "Edit the service identifiers and WSDL properties.", true );
	}


	/**
	 * Creates the common section for "consumes" blocks.
	 * @param parent
	 * @param toolkit
	 * @return a composite
	 */
	protected Composite createCommonConsumeSection( Composite parent, FormToolkit toolkit ) {
		return createEditorSection( parent, toolkit, "Identification", "Define the service search filters and invocation properties.", true );
	}
}
