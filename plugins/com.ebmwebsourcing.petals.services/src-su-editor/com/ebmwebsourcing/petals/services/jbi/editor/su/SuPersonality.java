/****************************************************************************
 * 
 * Copyright (c) 2009-2011, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 * 
 *****************************************************************************/

package com.ebmwebsourcing.petals.services.jbi.editor.su;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelProvider;

import com.ebmwebsourcing.petals.services.jbi.editor.AbstractJBIFormPage;
import com.ebmwebsourcing.petals.services.jbi.editor.IJbiEditorPersonality;
import com.ebmwebsourcing.petals.services.jbi.editor.JbiFormEditor;
import com.ebmwebsourcing.petals.services.jbi.editor.ServicesLabelProvider;
import com.sun.java.xml.ns.jbi.Jbi;

/**
 * The SU personality for the JBI editor.
 */
public class SuPersonality implements IJbiEditorPersonality {

	private ILabelProvider statusLineLabelProvider;


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.editor.IServicesFormEditorPersonality
	 * #getStatusLineLabelProvider()
	 */
	public ILabelProvider getStatusLineLabelProvider() {

		if( this.statusLineLabelProvider == null )
			this.statusLineLabelProvider = new ServicesLabelProvider();

		return this.statusLineLabelProvider;
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.editor.IServicesFormEditorPersonality
	 * #dispose()
	 */
	public void dispose() {

		if( this.statusLineLabelProvider != null ) {
			this.statusLineLabelProvider.dispose();
			this.statusLineLabelProvider = null;
		}
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.editor.IJbiEditorPersonality
	 * #getGeneralMasterPage(com.ebmwebsourcing.petals.services.editor.AbstractServicesFormEditor)
	 */
	public AbstractJBIFormPage getGeneralMasterPage( JbiFormEditor editor ) {

		SUEditorPage saPage = new SUEditorPage( editor, "petals-su-general-page", "General" );
		return saPage;
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.editor.IServicesFormEditorPersonality
	 * #matchesPersonality(org.eclipse.core.resources.IFile)
	 */
	public boolean matchesPersonality(Jbi jbi, IFile jbiXmlFile ) {
		return jbi.getServices() != null;
	}
}