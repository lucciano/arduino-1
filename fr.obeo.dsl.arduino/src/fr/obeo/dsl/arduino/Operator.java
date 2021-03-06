/**
 */
package fr.obeo.dsl.arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Operator#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Operator#getRight <em>Right</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Operator#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Value)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getOperator_Left()
	 * @model required="true"
	 * @generated
	 */
	Value getLeft();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Operator#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Value value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Value)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getOperator_Right()
	 * @model required="true"
	 * @generated
	 */
	Value getRight();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Operator#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Value value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.arduino.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see fr.obeo.dsl.arduino.OperatorKind
	 * @see #setOperator(OperatorKind)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getOperator_Operator()
	 * @model
	 * @generated
	 */
	OperatorKind getOperator();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Operator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see fr.obeo.dsl.arduino.OperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorKind value);

} // Operator
