/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.Activity;
import activitydiagram.Trace;

import activitydiagramTrace.Values.Activity_trace_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getEdges <em>Edges</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getLocals <em>Locals</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTrace <em>Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTraceTrace <em>Trace Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity()
 * @model
 * @generated
 */
public interface TracedActivity extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_Nodes()
	 * @model
	 * @generated
	 */
	EList<TracedActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_Edges()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_Locals()
	 * @model
	 * @generated
	 */
	EList<TracedVariable> getLocals();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_Inputs()
	 * @model
	 * @generated
	 */
	EList<TracedVariable> getInputs();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(Trace)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_Trace()
	 * @model
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Activity)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_OriginalObject()
	 * @model
	 * @generated
	 */
	Activity getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Activity value);

	/**
	 * Returns the value of the '<em><b>Trace Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Activity_trace_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Activity_trace_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivity_TraceTrace()
	 * @see activitydiagramTrace.Values.Activity_trace_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_trace_Value> getTraceTrace();

} // TracedActivity
