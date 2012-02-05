/****************************************************************************
 *
 * Copyright (c) 2008-2012, EBM WebSourcing
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 *
 *****************************************************************************/
package com.ebmwebsourcing.petals.services.soap.v40;

import com.ebmwebsourcing.petals.services.soap.soap.SoapPackage;
import com.ebmwebsourcing.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class SoapConsumesWizardPage40 extends SimpleFeatureListSuWizardPage {

	/**
	 * Constructor.
	 */
	public SoapConsumesWizardPage40() {
		super(
			SoapPackage.Literals.SOAP_CONSUMES__SOAP_SERVICE_NAME,
			SoapPackage.Literals.SOAP_CONSUMES__SOAP_ACTION,
			SoapPackage.Literals.SOAP_CONSUMES__SYNCHONOUS_TIMEOUT,
			SoapPackage.Literals.SOAP_CONSUMES__ENABLE_HTTP_TRANSPORT,
			SoapPackage.Literals.SOAP_CONSUMES__ENABLE_JMS_TRANSPORT);
	}
}