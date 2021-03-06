/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name Or Function Call2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getTfnname <em>Tfnname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT25 <em>T25</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT44 <em>T44</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT45 <em>T45</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT6 <em>T6</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2()
 * @model
 * @generated
 */
public interface TypeNameOrFunctionCall2 extends TypePrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Tfnname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tfnname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tfnname</em>' attribute.
   * @see #setTfnname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2_Tfnname()
   * @model
   * @generated
   */
  String getTfnname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getTfnname <em>Tfnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tfnname</em>' attribute.
   * @see #getTfnname()
   * @generated
   */
  void setTfnname(String value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2_T4()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T25</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T25</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T25</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2_T25()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT25();

  /**
   * Returns the value of the '<em><b>T44</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.StatementExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T44</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T44</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2_T44()
   * @model containment="true"
   * @generated
   */
  EList<StatementExpression> getT44();

  /**
   * Returns the value of the '<em><b>T45</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T45</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T45</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2_T45()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT45();

  /**
   * Returns the value of the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T6</em>' containment reference.
   * @see #setT6(TypePrimaryExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall2_T6()
   * @model containment="true"
   * @generated
   */
  TypePrimaryExpression getT6();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall2#getT6 <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T6</em>' containment reference.
   * @see #getT6()
   * @generated
   */
  void setT6(TypePrimaryExpression value);

} // TypeNameOrFunctionCall2
