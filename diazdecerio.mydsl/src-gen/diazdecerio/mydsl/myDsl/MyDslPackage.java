/**
 * generated by Xtext 2.25.0
 */
package diazdecerio.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diazdecerio.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mydsl.diazdecerio/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.JavaClassImpl <em>Java Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.JavaClassImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getJavaClass()
   * @generated
   */
  int JAVA_CLASS = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__NAME = 1;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__CONSTRUCTOR = 2;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__MAIN = 3;

  /**
   * The number of structural features of the '<em>Java Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.MainImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getMain()
   * @generated
   */
  int MAIN = 1;

  /**
   * The feature id for the '<em><b>The Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__THE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Again</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__AGAIN = 1;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.ConstructorImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 2;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__CONSTRUCTOR = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__STMTS = 1;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.StmtImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getStmt()
   * @generated
   */
  int STMT = 3;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.SumStmtImpl <em>Sum Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.SumStmtImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getSumStmt()
   * @generated
   */
  int SUM_STMT = 4;

  /**
   * The feature id for the '<em><b>Reg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_STMT__REG = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_STMT__VALUE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sum Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.MulStmtImpl <em>Mul Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.MulStmtImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getMulStmt()
   * @generated
   */
  int MUL_STMT = 5;

  /**
   * The feature id for the '<em><b>Reg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_STMT__REG = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_STMT__VALUE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mul Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.DivStmtImpl <em>Div Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.DivStmtImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getDivStmt()
   * @generated
   */
  int DIV_STMT = 6;

  /**
   * The feature id for the '<em><b>Reg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_STMT__REG = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_STMT__VALUE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.WhileStmtImpl <em>While Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.WhileStmtImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getWhileStmt()
   * @generated
   */
  int WHILE_STMT = 7;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__COND = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmts While</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__STMTS_WHILE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.impl.ConditionImpl
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Reg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__REG = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__NUMBER = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link diazdecerio.mydsl.myDsl.Register <em>Register</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see diazdecerio.mydsl.myDsl.Register
   * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getRegister()
   * @generated
   */
  int REGISTER = 9;


  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.JavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Class</em>'.
   * @see diazdecerio.mydsl.myDsl.JavaClass
   * @generated
   */
  EClass getJavaClass();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.JavaClass#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see diazdecerio.mydsl.myDsl.JavaClass#getPackageName()
   * @see #getJavaClass()
   * @generated
   */
  EAttribute getJavaClass_PackageName();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.JavaClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see diazdecerio.mydsl.myDsl.JavaClass#getName()
   * @see #getJavaClass()
   * @generated
   */
  EAttribute getJavaClass_Name();

  /**
   * Returns the meta object for the containment reference '{@link diazdecerio.mydsl.myDsl.JavaClass#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor</em>'.
   * @see diazdecerio.mydsl.myDsl.JavaClass#getConstructor()
   * @see #getJavaClass()
   * @generated
   */
  EReference getJavaClass_Constructor();

  /**
   * Returns the meta object for the containment reference '{@link diazdecerio.mydsl.myDsl.JavaClass#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see diazdecerio.mydsl.myDsl.JavaClass#getMain()
   * @see #getJavaClass()
   * @generated
   */
  EReference getJavaClass_Main();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see diazdecerio.mydsl.myDsl.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the reference '{@link diazdecerio.mydsl.myDsl.Main#getTheType <em>The Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>The Type</em>'.
   * @see diazdecerio.mydsl.myDsl.Main#getTheType()
   * @see #getMain()
   * @generated
   */
  EReference getMain_TheType();

  /**
   * Returns the meta object for the reference '{@link diazdecerio.mydsl.myDsl.Main#getAgain <em>Again</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Again</em>'.
   * @see diazdecerio.mydsl.myDsl.Main#getAgain()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Again();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see diazdecerio.mydsl.myDsl.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the reference '{@link diazdecerio.mydsl.myDsl.Constructor#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Constructor</em>'.
   * @see diazdecerio.mydsl.myDsl.Constructor#getConstructor()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link diazdecerio.mydsl.myDsl.Constructor#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see diazdecerio.mydsl.myDsl.Constructor#getStmts()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Stmts();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see diazdecerio.mydsl.myDsl.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.SumStmt <em>Sum Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Stmt</em>'.
   * @see diazdecerio.mydsl.myDsl.SumStmt
   * @generated
   */
  EClass getSumStmt();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.SumStmt#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reg</em>'.
   * @see diazdecerio.mydsl.myDsl.SumStmt#getReg()
   * @see #getSumStmt()
   * @generated
   */
  EAttribute getSumStmt_Reg();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.SumStmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see diazdecerio.mydsl.myDsl.SumStmt#getValue()
   * @see #getSumStmt()
   * @generated
   */
  EAttribute getSumStmt_Value();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.MulStmt <em>Mul Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Stmt</em>'.
   * @see diazdecerio.mydsl.myDsl.MulStmt
   * @generated
   */
  EClass getMulStmt();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.MulStmt#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reg</em>'.
   * @see diazdecerio.mydsl.myDsl.MulStmt#getReg()
   * @see #getMulStmt()
   * @generated
   */
  EAttribute getMulStmt_Reg();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.MulStmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see diazdecerio.mydsl.myDsl.MulStmt#getValue()
   * @see #getMulStmt()
   * @generated
   */
  EAttribute getMulStmt_Value();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.DivStmt <em>Div Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Stmt</em>'.
   * @see diazdecerio.mydsl.myDsl.DivStmt
   * @generated
   */
  EClass getDivStmt();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.DivStmt#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reg</em>'.
   * @see diazdecerio.mydsl.myDsl.DivStmt#getReg()
   * @see #getDivStmt()
   * @generated
   */
  EAttribute getDivStmt_Reg();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.DivStmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see diazdecerio.mydsl.myDsl.DivStmt#getValue()
   * @see #getDivStmt()
   * @generated
   */
  EAttribute getDivStmt_Value();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.WhileStmt <em>While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Stmt</em>'.
   * @see diazdecerio.mydsl.myDsl.WhileStmt
   * @generated
   */
  EClass getWhileStmt();

  /**
   * Returns the meta object for the containment reference '{@link diazdecerio.mydsl.myDsl.WhileStmt#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see diazdecerio.mydsl.myDsl.WhileStmt#getCond()
   * @see #getWhileStmt()
   * @generated
   */
  EReference getWhileStmt_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link diazdecerio.mydsl.myDsl.WhileStmt#getStmtsWhile <em>Stmts While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts While</em>'.
   * @see diazdecerio.mydsl.myDsl.WhileStmt#getStmtsWhile()
   * @see #getWhileStmt()
   * @generated
   */
  EReference getWhileStmt_StmtsWhile();

  /**
   * Returns the meta object for class '{@link diazdecerio.mydsl.myDsl.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see diazdecerio.mydsl.myDsl.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.Condition#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reg</em>'.
   * @see diazdecerio.mydsl.myDsl.Condition#getReg()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Reg();

  /**
   * Returns the meta object for the attribute '{@link diazdecerio.mydsl.myDsl.Condition#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see diazdecerio.mydsl.myDsl.Condition#getNumber()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Number();

  /**
   * Returns the meta object for enum '{@link diazdecerio.mydsl.myDsl.Register <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Register</em>'.
   * @see diazdecerio.mydsl.myDsl.Register
   * @generated
   */
  EEnum getRegister();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.JavaClassImpl <em>Java Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.JavaClassImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getJavaClass()
     * @generated
     */
    EClass JAVA_CLASS = eINSTANCE.getJavaClass();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CLASS__PACKAGE_NAME = eINSTANCE.getJavaClass_PackageName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CLASS__NAME = eINSTANCE.getJavaClass_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_CLASS__CONSTRUCTOR = eINSTANCE.getJavaClass_Constructor();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_CLASS__MAIN = eINSTANCE.getJavaClass_Main();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.MainImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>The Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__THE_TYPE = eINSTANCE.getMain_TheType();

    /**
     * The meta object literal for the '<em><b>Again</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__AGAIN = eINSTANCE.getMain_Again();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.ConstructorImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__CONSTRUCTOR = eINSTANCE.getConstructor_Constructor();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__STMTS = eINSTANCE.getConstructor_Stmts();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.StmtImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.SumStmtImpl <em>Sum Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.SumStmtImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getSumStmt()
     * @generated
     */
    EClass SUM_STMT = eINSTANCE.getSumStmt();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUM_STMT__REG = eINSTANCE.getSumStmt_Reg();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUM_STMT__VALUE = eINSTANCE.getSumStmt_Value();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.MulStmtImpl <em>Mul Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.MulStmtImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getMulStmt()
     * @generated
     */
    EClass MUL_STMT = eINSTANCE.getMulStmt();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_STMT__REG = eINSTANCE.getMulStmt_Reg();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_STMT__VALUE = eINSTANCE.getMulStmt_Value();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.DivStmtImpl <em>Div Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.DivStmtImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getDivStmt()
     * @generated
     */
    EClass DIV_STMT = eINSTANCE.getDivStmt();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIV_STMT__REG = eINSTANCE.getDivStmt_Reg();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIV_STMT__VALUE = eINSTANCE.getDivStmt_Value();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.WhileStmtImpl <em>While Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.WhileStmtImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getWhileStmt()
     * @generated
     */
    EClass WHILE_STMT = eINSTANCE.getWhileStmt();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__COND = eINSTANCE.getWhileStmt_Cond();

    /**
     * The meta object literal for the '<em><b>Stmts While</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__STMTS_WHILE = eINSTANCE.getWhileStmt_StmtsWhile();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.impl.ConditionImpl
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__REG = eINSTANCE.getCondition_Reg();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__NUMBER = eINSTANCE.getCondition_Number();

    /**
     * The meta object literal for the '{@link diazdecerio.mydsl.myDsl.Register <em>Register</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see diazdecerio.mydsl.myDsl.Register
     * @see diazdecerio.mydsl.myDsl.impl.MyDslPackageImpl#getRegister()
     * @generated
     */
    EEnum REGISTER = eINSTANCE.getRegister();

  }

} //MyDslPackage
