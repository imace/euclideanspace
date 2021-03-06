/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coerce Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.CoerceExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CoerceExpression#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CoerceExpression#getRightType <em>Right Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getCoerceExpression()
 * @model
 * @generated
 */
public interface CoerceExpression extends Expr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCoerceExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CoerceExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCoerceExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CoerceExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Type</em>' containment reference.
   * @see #setRightType(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCoerceExpression_RightType()
   * @model containment="true"
   * @generated
   */
  TypeExpression getRightType();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CoerceExpression#getRightType <em>Right Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Type</em>' containment reference.
   * @see #getRightType()
   * @generated
   */
  void setRightType(TypeExpression value);

} // CoerceExpression
