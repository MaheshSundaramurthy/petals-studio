/******************************************************************************
 * Copyright (c) 2011-2013, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.services.eip.designer.palette;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.ui.palette.DefaultPaletteViewerPreferences;
import org.eclipse.gef.ui.palette.PaletteEditPartFactory;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerPreferences;
import org.eclipse.jface.preference.IPreferenceStore;

import com.ebmwebsourcing.petals.services.eip.PetalsEipPlugin;
import com.ebmwebsourcing.petals.services.eip.designer.edit.parts.EipToolEntryEditPart;

/**
 * Our own palette provider.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EipPaletteViewer extends PaletteViewer {

	/**
	 * Constructor.
	 */
	public EipPaletteViewer() {

		// Super constructor
		super();

		// Define the preferences
		IPreferenceStore store = PetalsEipPlugin.getDefault().getPreferenceStore();
		PaletteViewerPreferences prefs = new DefaultPaletteViewerPreferences( store );
		store.setDefault( PaletteViewerPreferences.PREFERENCE_LAYOUT, PaletteViewerPreferences.LAYOUT_COLUMNS );
		setPaletteViewerPreferences( prefs );

		// Change the factory for tool tips
		setEditPartFactory( new PaletteEditPartFactory() {
			@Override
			protected EditPart createEntryEditPart( EditPart parentEditPart, Object model ) {
				return new EipToolEntryEditPart((PaletteEntry) model);
			}
		});

		// DnD
		addDragSourceListener( new TemplateTransferDragSourceListener( this ));
	}
}
