/****************************************************************************
 * 
 * Copyright (c) 2008-2011, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 * 
 *****************************************************************************/

package com.ebmwebsourcing.petals.common.internal.provisional.ui;

import org.eclipse.swt.widgets.Composite;

import com.ebmwebsourcing.petals.common.internal.provisional.ui.validation.FileValidator;
import com.ebmwebsourcing.petals.common.internal.provisional.ui.validation.URIValidator;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class FileUriBrowser extends FileBrowser {

	/**
	 * Constructor.
	 * 
	 * @param initialValue
	 * @param parent
	 * @param baseLabel
	 * @param labelSuffix
	 * @param labelTooltip
	 * @param isOptional
	 * @param singleSelection
	 * @param alignAll
	 */
	public FileUriBrowser(
				String initialValue, Composite parent,
				String baseLabel, String labelSuffix,
				String labelTooltip, boolean isOptional,
				boolean singleSelection, boolean alignAll ) {

		super( initialValue, parent, baseLabel, labelSuffix, labelTooltip, isOptional, singleSelection, alignAll );
		this.validators.add( new URIValidator ());
		this.validators.add( new FileValidator ());
		this.getUrl = true;
	}
}
