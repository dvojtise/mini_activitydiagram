/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.Token;

import activitydiagramTrace.Values.ActivityNode_heldTokens_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokens <em>Held Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokensTrace <em>Held Tokens Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface TracedActivityNode extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_Incoming()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(TracedActivity)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_Activity()
	 * @model required="true"
	 * @generated
	 */
	TracedActivity getActivity();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(TracedActivity value);

	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_HeldTokens()
	 * @model
	 * @generated
	 */
	EList<Token> getHeldTokens();

	/**
	 * Returns the value of the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_HeldTokensTrace()
	 * @see activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNode_heldTokens_Value> getHeldTokensTrace();

} // TracedActivityNode
