/**
 * generated by Xtext 2.25.0
 */
package diazdecerio.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diazdecerio.mydsl.myDsl.JavaClass#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link diazdecerio.mydsl.myDsl.JavaClass#getName <em>Name</em>}</li>
 *   <li>{@link diazdecerio.mydsl.myDsl.JavaClass#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link diazdecerio.mydsl.myDsl.JavaClass#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @see diazdecerio.mydsl.myDsl.MyDslPackage#getJavaClass()
 * @model
 * @generated
 */
public interface JavaClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see diazdecerio.mydsl.myDsl.MyDslPackage#getJavaClass_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link diazdecerio.mydsl.myDsl.JavaClass#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see diazdecerio.mydsl.myDsl.MyDslPackage#getJavaClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link diazdecerio.mydsl.myDsl.JavaClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor</em>' containment reference.
   * @see #setConstructor(Constructor)
   * @see diazdecerio.mydsl.myDsl.MyDslPackage#getJavaClass_Constructor()
   * @model containment="true"
   * @generated
   */
  Constructor getConstructor();

  /**
   * Sets the value of the '{@link diazdecerio.mydsl.myDsl.JavaClass#getConstructor <em>Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor</em>' containment reference.
   * @see #getConstructor()
   * @generated
   */
  void setConstructor(Constructor value);

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see diazdecerio.mydsl.myDsl.MyDslPackage#getJavaClass_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link diazdecerio.mydsl.myDsl.JavaClass#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

} // JavaClass
