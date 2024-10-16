/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.testgen.model.efsm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.testgen.model.daikon.DaikonModel;
import fi.vtt.noen.testgen.model.daikon.DaikonState;
import fi.vtt.noen.testgen.model.daikon.DaikonTransition;
import fi.vtt.noen.testgen.model.efsm.EFSMGenerator;
import fi.vtt.noen.testgen.model.fsm.FSMModel;
import fi.vtt.noen.testgen.model.fsm.FSMState;
import fi.vtt.noen.testgen.model.fsm.FSMTransition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.evosuite.testcase.CodeUnderTestException;
import org.processmining.models.graphbased.AttributeChangeListener;
import org.processmining.models.graphbased.directed.AbstractDirectedGraph;
import org.processmining.models.graphbased.directed.ContainableDirectedGraphElement;
import org.processmining.models.graphbased.directed.petrinet.PetrinetNode;
import org.processmining.models.graphbased.directed.petrinet.elements.ExpandableSubNet;
import org.processmining.models.graphbased.directed.transitionsystem.CoverabilityGraph;
import org.processmining.models.graphbased.directed.transitionsystem.ReachabilityGraph;
import org.processmining.models.graphbased.directed.transitionsystem.TransitionSystem;
import org.processmining.models.graphbased.directedhypergraph.AbstractDirectedOutgoingHyperedge;

@RunWith(EvoSuiteRunner.class)
public class EFSMGeneratorEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getOutputInterfaceMethodByName(Ljava/lang/String;)Ljava/lang/reflect/Method;: I9 Branch 43 IFEQ L600 - true
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.parseInterfaces(Ljava/util/Collection;Ljava/util/Collection;)V: root-Branch
   * 3 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.<init>(Ljava/lang/Class;Lfi/vtt/noen/testgen/model/fsm/FSMModel;Lfi/vtt/noen/testgen/model/daikon/DaikonModel;Ljava/util/Collection;Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = EFSMGenerator.class;
      CoverabilityGraph coverabilityGraph0 = new CoverabilityGraph("");
      Collection<?> collection0 = coverabilityGraph0.getStates();
      TreeMap<String, FSMState> treeMap0 = new TreeMap<String, FSMState>();
      FSMModel fSMModel0 = new FSMModel(treeMap0, collection0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0, collection0, collection0);
      // Undeclared exception!
      try {
        eFSMGenerator0.getOutputInterfaceMethodByName("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No method '' found in any available output interface:[]
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.<init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = AbstractDirectedOutgoingHyperedge.class;
      CoverabilityGraph coverabilityGraph0 = new CoverabilityGraph(") == ");
      AbstractDirectedGraph<?, ?> abstractDirectedGraph0 = coverabilityGraph0.getGraph();
      ExpandableSubNet expandableSubNet0 = new ExpandableSubNet(") == ", abstractDirectedGraph0);
      expandableSubNet0.getChildren();
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.constructor(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.<init>(Ljava/lang/Class;Lfi/vtt/noen/testgen/model/fsm/FSMModel;Lfi/vtt/noen/testgen/model/daikon/DaikonModel;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = AttributeChangeListener.class;
      ReachabilityGraph reachabilityGraph0 = new ReachabilityGraph("))");
      FSMModel fSMModel0 = new FSMModel((TransitionSystem) reachabilityGraph0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      assertNotNull(eFSMGenerator0);
      
      String string0 = eFSMGenerator0.constructor("  //---------- TODO IMPLEMENT METHODS IN THIS SECTION TO GENERATE OBJECTS ------------\n  private AttributeChangeListener createAttributeChangeListener() throws Exception {\n    return null;\n  }\n\n");
      assertNotNull(string0);
      assertEquals("  public   //---------- TODO IMPLEMENT METHODS IN THIS SECTION TO GENERATE OBJECTS ------------\n  private AttributeChangeListener createAttributeChangeListener() throws Exception {\n    return null;\n  }\n\n(AttributeChangeListener attributeChangeListener) {\n    this.attributeChangeListener = attributeChangeListener;\n  }\n\n", string0);
  }

  //Test case number: 3
  /*
   * 26 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.generateEFSM(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I21 Branch 1 IFEQ L145 - false
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.generateEFSM(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I32 Branch 2 IFLE L146 - true
   * 3 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.transitionActionsFor(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFGT L293 - false
   * 4 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.mainNumberHelpers()Ljava/lang/String;: root-Branch
   * 5 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.randomCollectionItemHelper()Ljava/lang/String;: root-Branch
   * 6 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.helperMethods()Ljava/lang/String;: root-Branch
   * 7 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.guardCheckMethods()Ljava/lang/String;: root-Branch
   * 8 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.footer()Ljava/lang/String;: root-Branch
   * 9 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.numberHelper(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 10 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.testMethod(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 11 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.stateMethod()Ljava/lang/String;: root-Branch
   * 12 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.valueMethods()Ljava/lang/String;: I38 Branch 21 IFEQ L486 - true
   * 13 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.valueMethods()Ljava/lang/String;: I125 Branch 22 IFEQ L495 - true
   * 14 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.variables()Ljava/lang/String;: I57 Branch 3 IFEQ L182 - true
   * 15 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.mockSetup()Ljava/lang/String;: I13 Branch 59 IFEQ L746 - true
   * 16 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.arrays()Ljava/lang/String;: I13 Branch 4 IFEQ L212 - true
   * 17 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.resetMethod(Ljava/util/Collection;Ljava/util/Collection;)Ljava/lang/String;: I45 Branch 55 IFEQ L715 - true
   * 18 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.resetMethod(Ljava/util/Collection;Ljava/util/Collection;)Ljava/lang/String;: I77 Branch 56 IFEQ L718 - true
   * 19 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutSetup()Ljava/lang/String;: I43 Branch 57 IFEQ L731 - true
   * 20 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.generateEFSM(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I21 Branch 1 IFEQ L145 - true
   * 21 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I227 Branch 51 IFEQ L686 - true
   * 22 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I227 Branch 51 IFEQ L686 - false
   * 23 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I238 Branch 52 IFNE L688 - false
   * 24 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I244 Branch 53 IFLE L688 - true
   * 25 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I270 Branch 54 IFNE L692 - true
   * 26 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I270 Branch 54 IFNE L692 - false
   */
  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = AbstractDirectedOutgoingHyperedge.class;
      TreeMap<String, FSMState> treeMap0 = new TreeMap<String, FSMState>();
      CoverabilityGraph coverabilityGraph0 = new CoverabilityGraph(") == ");
      AbstractDirectedGraph<?, ?> abstractDirectedGraph0 = coverabilityGraph0.getGraph();
      ExpandableSubNet expandableSubNet0 = new ExpandableSubNet(") == ", abstractDirectedGraph0);
      FSMState fSMState0 = new FSMState(") == ");
      treeMap0.put(") == ", fSMState0);
      Set<? extends ContainableDirectedGraphElement> set0 = expandableSubNet0.getChildren();
      FSMModel fSMModel0 = new FSMModel(treeMap0, set0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      String string0 = eFSMGenerator0.generateEFSM(") == ", ") == ");
      assertEquals("package ) == ;\n\nimport static org.junit.Assert.*;\nimport static org.easymock.EasyMock.*;\n\nimport org.easymock.EasyMock;\nimport org.junit.Before;\nimport org.junit.Test;\nimport net.sourceforge.czt.modeljunit.Action;\nimport net.sourceforge.czt.modeljunit.FsmModel;\nimport net.sourceforge.czt.modeljunit.Tester;\nimport net.sourceforge.czt.modeljunit.RandomTester;\nimport net.sourceforge.czt.modeljunit.GraphListener;\nimport net.sourceforge.czt.modeljunit.coverage.CoverageMetric;\nimport net.sourceforge.czt.modeljunit.coverage.TransitionCoverage;\n\nimport net.sourceforge.czt.modeljunit.Action;\nimport java.util.Iterator;\nimport java.util.HashSet;\nimport java.util.List;\nimport java.util.Random;\nimport java.util.ArrayList;\nimport java.util.Collection;\nimport org.processmining.models.graphbased.directedhypergraph.AbstractDirectedOutgoingHyperedge;\n\npublic class ) ==  implements FsmModel {\n  private int testIndex = 1;\n  private String state = \"\";\n  private AbstractDirectedOutgoingHyperedge abstractDirectedOutgoingHyperedge;\n  @Test\n  public void modelJUnitTest() throws Exception {\n    Tester tester = new RandomTester(this);\n    GraphListener listener = tester.buildGraph();\n    listener.printGraphDot(\") == .dot\");\n    CoverageMetric trCoverage = new TransitionCoverage();\n    tester.addListener(trCoverage);\n    tester.addListener(\"verbose\");\n    tester.generate(20);\n    tester.getModel().printMessage(trCoverage.getName() + \" was \" + trCoverage.toString());\n  }\n\n  public void reset(boolean b) {\n    state = \"\";\n    System.out.println(\"------------------- STARTING TEST \"+testIndex+\"--------------------------\");\n    testIndex++;\n    try {\n      abstractDirectedOutgoingHyperedge = createAbstractDirectedOutgoingHyperedge();\n    } catch (Exception e) {\n      throw new RuntimeException(e);\n    }\n  }\n\n  public Object getState() {\n    return state;\n  }\n\n  //---------- TODO IMPLEMENT METHODS IN THIS SECTION TO GENERATE OBJECTS ------------\n  private AbstractDirectedOutgoingHyperedge createAbstractDirectedOutgoingHyperedge() throws Exception {\n    return null;\n  }\n\n\n  //---------- HELPER METHODS TO GENERATE PRIMITIVE VALUES -----------------------------------------\n  public int cInt() {\n    return (int) Math.round(cDouble());\n  }\n\n  public int cInt(int min, int max) {\n    return (int) Math.round(cDouble(min, max));\n  }\n\n  public float cFloat() {\n    return (float) Math.round(cDouble());\n  }\n\n  public float cFloat(float min, float max) {\n    return (float) Math.round(cDouble(min, max));\n  }\n\n  public long cLong() {\n    return (long) Math.round(cDouble());\n  }\n\n  public long cLong(long min, long max) {\n    return (long) Math.round(cDouble(min, max));\n  }\n\n  public byte cByte() {\n    return (byte) Math.round(cDouble());\n  }\n\n  public byte cByte(byte min, byte max) {\n    return (byte) Math.round(cDouble(min, max));\n  }\n\n  public char cChar() {\n    return (char) Math.round(cDouble());\n  }\n\n  public char cChar(char min, char max) {\n    return (char) Math.round(cDouble(min, max));\n  }\n\n  public double cDouble() {\n    double min = Integer.MIN_VALUE;\n    double max = Integer.MAX_VALUE;\n    return cDouble(min, max);\n  }\n\n  Random random = new Random(100);\n\n  public double cDouble(double min, double max) {\n    double diff = max-min;\n    double rnd = random.nextDouble();\n    rnd *= diff;\n    rnd += min;\n    return rnd;\n  }\n\n  public Object randomItemFrom(Collection array) {\n    List list = new ArrayList(array);\n    return list.get(cInt(0, array.size()-1));\n  }\n}\n", string0);
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.stateEnumFor(Ljava/util/Collection;)Ljava/lang/String;: I23 Branch 5 IFEQ L229 - true
   */
  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = PetrinetNode.class;
      DaikonModel daikonModel0 = new DaikonModel();
      TreeSet<Class<Object>> treeSet0 = new TreeSet<Class<Object>>();
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.actionFor(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 6 IFGT L263 - false
   */
  @Test
  public void test5()  throws Throwable  {
      Class<?> class0 = AttributeChangeListener.class;
      ReachabilityGraph reachabilityGraph0 = new ReachabilityGraph("))");
      FSMModel fSMModel0 = new FSMModel((TransitionSystem) reachabilityGraph0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      String string0 = eFSMGenerator0.actionFor("))");
      assertEquals("", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getTransitionsFrom(Ljava/lang/String;)Ljava/util/Collection;: I10 Branch 14 IFNONNULL L350 - false
   */
  @Test
  public void test6()  throws Throwable  {
      Class<?> class0 = EFSMGenerator.class;
      TreeMap<String, FSMState> treeMap0 = new TreeMap<String, FSMState>();
      ArrayList<FSMTransition> arrayList0 = new ArrayList<FSMTransition>();
      FSMModel fSMModel0 = new FSMModel(treeMap0, (Collection<FSMTransition>) arrayList0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      Collection<DaikonTransition> collection0 = eFSMGenerator0.getTransitionsFrom("    return false;\n");
      assertEquals(true, collection0.isEmpty());
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutCall(Ljava/lang/String;)Ljava/lang/String;: I34 Branch 16 IF_ICMPGE L440 - true
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutCall(Ljava/lang/String;)Ljava/lang/String;: I34 Branch 16 IF_ICMPGE L440 - false
   * 3 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutCall(Ljava/lang/String;)Ljava/lang/String;: I81 Branch 17 IF_ICMPGE L445 - true
   * 4 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutCall(Ljava/lang/String;)Ljava/lang/String;: I136 Branch 18 IFEQ L452 - true
   * 5 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I20 Branch 19 IF_ICMPGE L470 - false
   * 6 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I31 Branch 20 IFLE L471 - true
   * 7 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I31 Branch 20 IFLE L471 - false
   */
  @Test
  public void test7()  throws Throwable  {
      Class<?> class0 = EFSMGenerator.class;
      TreeMap<String, FSMState> treeMap0 = new TreeMap<String, FSMState>();
      ArrayList<FSMTransition> arrayList0 = new ArrayList<FSMTransition>();
      FSMModel fSMModel0 = new FSMModel(treeMap0, (Collection<FSMTransition>) arrayList0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      // Undeclared exception!
      try {
        eFSMGenerator0.sutCall("guardFor");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutCall(Ljava/lang/String;)Ljava/lang/String;: I136 Branch 18 IFEQ L452 - false
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.parseInterfaces(Ljava/util/Collection;Ljava/util/Collection;)V: root-Branch
   * 3 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.<init>(Ljava/lang/Class;Lfi/vtt/noen/testgen/model/fsm/FSMModel;Lfi/vtt/noen/testgen/model/daikon/DaikonModel;Ljava/util/Collection;Ljava/util/Collection;)V: root-Branch
   * 4 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I31 Branch 20 IFLE L471 - false
   * 5 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.sutCall(Ljava/lang/String;)Ljava/lang/String;: I34 Branch 16 IF_ICMPGE L440 - true
   */
  @Test
  public void test8()  throws Throwable  {
      Class<?> class0 = PetrinetNode.class;
      DaikonModel daikonModel0 = new DaikonModel();
      TreeSet<Class<Object>> treeSet0 = new TreeSet<Class<Object>>();
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I20 Branch 19 IF_ICMPGE L470 - true
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I20 Branch 19 IF_ICMPGE L470 - false
   * 3 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.getSUTMethod(Ljava/lang/String;)Ljava/lang/reflect/Method;: I31 Branch 20 IFLE L471 - true
   */
  @Test
  public void test9()  throws Throwable  {
      Class<?> class0 = EFSMGenerator.class;
      TreeMap<String, FSMState> treeMap0 = new TreeMap<String, FSMState>();
      LinkedHashSet<FSMTransition> linkedHashSet0 = new LinkedHashSet<FSMTransition>();
      FSMModel fSMModel0 = new FSMModel(treeMap0, (Collection<FSMTransition>) linkedHashSet0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      // Undeclared exception!
      try {
        eFSMGenerator0.sutCall("bX:#c`&*y\u0007H5Wx@@|");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No method 'bX:#c`&*y\u0007H5Wx@@|' found in class fi.vtt.noen.testgen.model.efsm.EFSMGenerator.
         */
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.booleanJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;I)Ljava/lang/String;: I15 Branch 27 IFEQ L538 - true
   */
  @Test
  public void test10()  throws Throwable  {
      Class<?> class0 = AttributeChangeListener.class;
      ReachabilityGraph reachabilityGraph0 = new ReachabilityGraph("))");
      FSMModel fSMModel0 = new FSMModel((TransitionSystem) reachabilityGraph0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      assertNotNull(eFSMGenerator0);
      
      DaikonState daikonState0 = new DaikonState("))");
      String string0 = eFSMGenerator0.booleanJavaReturn(daikonState0, 1);
      assertEquals("    return false;\n", string0);
  }

  //Test case number: 11
  /*
   * 8 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I23 Branch 29 IFNE L561 - true
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I115 Branch 36 IFGE L579 - true
   * 3 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I140 Branch 37 IFEQ L583 - true
   * 4 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I164 Branch 38 IFEQ L585 - true
   * 5 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I188 Branch 39 IFEQ L587 - true
   * 6 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I212 Branch 40 IFEQ L589 - true
   * 7 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I236 Branch 41 IFEQ L591 - true
   * 8 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.minMaxJavaReturn(Lfi/vtt/noen/testgen/model/daikon/DaikonState;ILjava/lang/Class;)Ljava/lang/String;: I260 Branch 42 IFEQ L593 - true
   */
  @Test
  public void test11()  throws Throwable  {
      Class<?> class0 = AttributeChangeListener.class;
      ReachabilityGraph reachabilityGraph0 = new ReachabilityGraph("))");
      FSMModel fSMModel0 = new FSMModel((TransitionSystem) reachabilityGraph0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      assertNotNull(eFSMGenerator0);
      
      DaikonState daikonState0 = new DaikonState("))");
      String string0 = eFSMGenerator0.minMaxJavaReturn(daikonState0, 1, (Class) class0);
      assertEquals("    return 0\n", string0);
      assertNotNull(string0);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.guardFor(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 49 IFGT L624 - false
   * 2 fi.vtt.noen.testgen.model.efsm.EFSMGenerator.<init>(Ljava/lang/Class;Lfi/vtt/noen/testgen/model/fsm/FSMModel;Lfi/vtt/noen/testgen/model/daikon/DaikonModel;)V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      Class<?> class0 = AttributeChangeListener.class;
      ReachabilityGraph reachabilityGraph0 = new ReachabilityGraph("))");
      FSMModel fSMModel0 = new FSMModel((TransitionSystem) reachabilityGraph0);
      DaikonModel daikonModel0 = new DaikonModel();
      EFSMGenerator eFSMGenerator0 = new EFSMGenerator((Class) class0, fSMModel0, daikonModel0);
      assertNotNull(eFSMGenerator0);
      
      String string0 = eFSMGenerator0.guardFor("%4yP*g0q");
      assertEquals("", string0);
      assertNotNull(string0);
  }
}
