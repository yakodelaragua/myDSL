/**
 * generated by Xtext 2.25.0
 */
package diazdecerio.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diazdecerio.mydsl.myDsl.SumStmt#getReg <em>Reg</em>}</li>
 *   <li>{@link diazdecerio.mydsl.myDsl.SumStmt#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see diazdecerio.mydsl.myDsl.MyDslPackage#getSumStmt()
 * @model
 * @generated
 */
public interface SumStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Reg</b></em>' attribute.
   * The literals are from the enumeration {@link diazdecerio.mydsl.myDsl.Register}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg</em>' attribute.
   * @see diazdecerio.mydsl.myDsl.Register
   * @see #setReg(Register)
   * @see diazdecerio.mydsl.myDsl.MyDslPackage#getSumStmt_Reg()
   * @model
   * @generated
   */
  Register getReg();

  /**
   * Sets the value of the '{@link diazdecerio.mydsl.myDsl.SumStmt#getReg <em>Reg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg</em>' attribute.
   * @see diazdecerio.mydsl.myDsl.Register
   * @see #getReg()
   * @generated
   */
  void setReg(Register value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see diazdecerio.mydsl.myDsl.MyDslPackage#getSumStmt_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link diazdecerio.mydsl.myDsl.SumStmt#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SumStmt
