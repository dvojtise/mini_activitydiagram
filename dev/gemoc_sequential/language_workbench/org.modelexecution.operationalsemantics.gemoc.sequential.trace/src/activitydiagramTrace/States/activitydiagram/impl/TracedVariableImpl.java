/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Variable_currentValue_Value;
import activitydiagramTrace.States.Variable_initialValue_Value;
import activitydiagramTrace.States.Variable_name_Value;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl#getCurrentValueSequence <em>Current Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl#getInitialValueSequence <em>Initial Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl#getNameSequence <em>Name Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedVariableImpl extends MinimalEObjectImpl.Container implements TracedVariable {
	/**
	 * The cached value of the '{@link #getCurrentValueSequence() <em>Current Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_currentValue_Value> currentValueSequence;

	/**
	 * The cached value of the '{@link #getInitialValueSequence() <em>Initial Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_initialValue_Value> initialValueSequence;

	/**
	 * The cached value of the '{@link #getNameSequence() <em>Name Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_name_Value> nameSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_currentValue_Value> getCurrentValueSequence() {
		if (currentValueSequence == null) {
			currentValueSequence = new EObjectContainmentWithInverseEList<Variable_currentValue_Value>(Variable_currentValue_Value.class, this, ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE, StatesPackage.VARIABLE_CURRENT_VALUE_VALUE__PARENT);
		}
		return currentValueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_initialValue_Value> getInitialValueSequence() {
		if (initialValueSequence == null) {
			initialValueSequence = new EObjectContainmentWithInverseEList<Variable_initialValue_Value>(Variable_initialValue_Value.class, this, ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE, StatesPackage.VARIABLE_INITIAL_VALUE_VALUE__PARENT);
		}
		return initialValueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_name_Value> getNameSequence() {
		if (nameSequence == null) {
			nameSequence = new EObjectContainmentWithInverseEList<Variable_name_Value>(Variable_name_Value.class, this, ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE, StatesPackage.VARIABLE_NAME_VALUE__PARENT);
		}
		return nameSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentValueSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitialValueSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNameSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return ((InternalEList<?>)getCurrentValueSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE:
				return ((InternalEList<?>)getInitialValueSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE:
				return ((InternalEList<?>)getNameSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return getCurrentValueSequence();
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE:
				return getInitialValueSequence();
			case ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE:
				return getNameSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				getCurrentValueSequence().clear();
				getCurrentValueSequence().addAll((Collection<? extends Variable_currentValue_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE:
				getInitialValueSequence().clear();
				getInitialValueSequence().addAll((Collection<? extends Variable_initialValue_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE:
				getNameSequence().clear();
				getNameSequence().addAll((Collection<? extends Variable_name_Value>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				getCurrentValueSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE:
				getInitialValueSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE:
				getNameSequence().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return currentValueSequence != null && !currentValueSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE:
				return initialValueSequence != null && !initialValueSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_VARIABLE__NAME_SEQUENCE:
				return nameSequence != null && !nameSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedVariableImpl
