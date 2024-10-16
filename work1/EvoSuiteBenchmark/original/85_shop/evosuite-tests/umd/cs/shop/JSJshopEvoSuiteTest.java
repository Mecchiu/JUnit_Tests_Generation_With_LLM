/*
 * This file was automatically generated by EvoSuite
 */

package umd.cs.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSParserError;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoSuiteRunner.class)
public class JSJshopEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  @Test
  public void test1()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * name can't be null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  @Test
  public void test3()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try {
        jSJshop0.getBufferedReader("0 plans found", "0 plans found");
        fail("Expecting exception: StackOverflowError");
      } catch(StackOverflowError e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  @Test
  public void test5()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test
  public void test6()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try {
        jSJshop0.getAppletURL((String) null, (JApplet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  @Test
  public void test8()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  @Test
  public void test9()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("", "");
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("r", "r", (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("r", (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer((Reader) pipedReader0);
      // Undeclared exception!
      try {
        jSJshop0.processToken(streamTokenizer0);
        fail("Expecting exception: JSParserError");
      } catch(JSParserError e) {
      }
  }
}
