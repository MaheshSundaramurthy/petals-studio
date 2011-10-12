/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ebmwebsourcing.petals.services.filetransfer.filetransfer.util;

import com.ebmwebsourcing.petals.services.filetransfer.filetransfer.*;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.AbstractExtensibleElement;
import com.sun.java.xml.ns.jbi.Consumes;
import com.sun.java.xml.ns.jbi.Provides;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferPackage
 * @generated
 */
public class FileTransferAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FileTransferPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FileTransferPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTransferSwitch<Adapter> modelSwitch =
		new FileTransferSwitch<Adapter>() {
			@Override
			public Adapter caseFileTransferExtension(FileTransferExtension object) {
				return createFileTransferExtensionAdapter();
			}
			@Override
			public Adapter caseFileTransferProvides(FileTransferProvides object) {
				return createFileTransferProvidesAdapter();
			}
			@Override
			public Adapter caseFileTransferConsumes(FileTransferConsumes object) {
				return createFileTransferConsumesAdapter();
			}
			@Override
			public Adapter caseAbstractExtensibleElement(AbstractExtensibleElement object) {
				return createAbstractExtensibleElementAdapter();
			}
			@Override
			public Adapter caseAbstractEndpoint(AbstractEndpoint object) {
				return createAbstractEndpointAdapter();
			}
			@Override
			public Adapter caseProvides(Provides object) {
				return createProvidesAdapter();
			}
			@Override
			public Adapter caseConsumes(Consumes object) {
				return createConsumesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferExtension
	 * @generated
	 */
	public Adapter createFileTransferExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferProvides
	 * @generated
	 */
	public Adapter createFileTransferProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferConsumes
	 * @generated
	 */
	public Adapter createFileTransferConsumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.AbstractExtensibleElement <em>Abstract Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.AbstractExtensibleElement
	 * @generated
	 */
	public Adapter createAbstractExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.AbstractEndpoint <em>Abstract Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.AbstractEndpoint
	 * @generated
	 */
	public Adapter createAbstractEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.Provides
	 * @generated
	 */
	public Adapter createProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.Consumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.Consumes
	 * @generated
	 */
	public Adapter createConsumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FileTransferAdapterFactory