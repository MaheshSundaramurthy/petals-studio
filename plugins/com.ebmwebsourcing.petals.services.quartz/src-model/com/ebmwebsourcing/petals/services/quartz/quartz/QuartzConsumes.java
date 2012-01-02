/**
 * Copyright (c) 2011, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 */
package com.ebmwebsourcing.petals.services.quartz.quartz;

import com.sun.java.xml.ns.jbi.Consumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.quartz.quartz.QuartzConsumes#getCronExpression <em>Cron Expression</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.quartz.quartz.QuartzConsumes#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ebmwebsourcing.petals.services.quartz.quartz.QuartzPackage#getQuartzConsumes()
 * @model extendedMetaData="name=''"
 * @generated
 */
public interface QuartzConsumes extends Consumer {
	/**
	 * Returns the value of the '<em><b>Cron Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cron Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron Expression</em>' attribute.
	 * @see #setCronExpression(String)
	 * @see com.ebmwebsourcing.petals.services.quartz.quartz.QuartzPackage#getQuartzConsumes_CronExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='cron-expression' namespace='##targetNamespace' group='#group:0' kind='element'"
	 * @generated
	 */
	String getCronExpression();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.quartz.quartz.QuartzConsumes#getCronExpression <em>Cron Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron Expression</em>' attribute.
	 * @see #getCronExpression()
	 * @generated
	 */
	void setCronExpression(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see com.ebmwebsourcing.petals.services.quartz.quartz.QuartzPackage#getQuartzConsumes_Content()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='cron-expression' namespace='##targetNamespace' group='#group:0' kind='element'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.quartz.quartz.QuartzConsumes#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // QuartzConsumes