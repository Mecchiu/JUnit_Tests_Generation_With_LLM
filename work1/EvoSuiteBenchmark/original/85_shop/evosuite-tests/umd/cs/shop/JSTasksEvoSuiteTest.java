/*
 * This file was automatically generated by EvoSuite
 */

package umd.cs.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.CharArrayReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.Vector;
import org.junit.BeforeClass;
import umd.cs.shop.JSListPairPlanTStateNodes;
import umd.cs.shop.JSPairPlanTState;
import umd.cs.shop.JSParserError;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTState;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;

@RunWith(EvoSuiteRunner.class)
public class JSTasksEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.makeSucceed();
      assertEquals(false, jSPlan0.fail());
  }

  @Test
  public void test1()  throws Throwable  {
      JSTasks jSTasks0 = new JSTasks();
      boolean boolean0 = jSTasks0.fail();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      JSTasks jSTasks0 = new JSTasks();
      jSTasks0.makeFail();
      assertEquals(true, jSTasks0.fail());
  }

  @Test
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[10];
      charArray0[0] = 'p';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer((Reader) charArrayReader0);
      JSTasks jSTasks0 = null;
      try {
        jSTasks0 = new JSTasks(streamTokenizer0);
        fail("Expecting exception: JSParserError");
      } catch(JSParserError e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) charArrayReader0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer((Reader) lineNumberReader0);
      JSTasks jSTasks0 = null;
      try {
        jSTasks0 = new JSTasks(streamTokenizer0);
        fail("Expecting exception: JSParserError");
      } catch(JSParserError e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[10];
      charArray0[0] = 'p';
      charArray0[0] = '%';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer((Reader) charArrayReader0);
      JSTasks jSTasks0 = null;
      try {
        jSTasks0 = new JSTasks(streamTokenizer0);
        fail("Expecting exception: JSParserError");
      } catch(JSParserError e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSTState jSTState0 = new JSTState();
      jSPlan0.add((Object) jSPlan0);
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      // Undeclared exception!
      try {
        jSPlan0.seekPlan(jSTState0, jSPlanningDomain0, jSPlan0, (Vector) jSPlan0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * umd.cs.shop.JSPlan cannot be cast to umd.cs.shop.JSTaskAtom
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSTState jSTState0 = new JSTState();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      JSPairPlanTState jSPairPlanTState0 = jSPlan0.seekPlan(jSTState0, jSPlanningDomain0, jSPlan0, (Vector) jSPlan0);
      assertNotNull(jSPairPlanTState0);
  }

  @Test
  public void test8()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      JSListPairPlanTStateNodes jSListPairPlanTStateNodes0 = jSPlan0.seekPlanAll((JSTState) null, jSPlanningDomain0, true);
      assertNotNull(jSListPairPlanTStateNodes0);
      assertEquals(false, jSListPairPlanTStateNodes0.isEmpty());
  }

  @Test
  public void test9()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTasks jSTasks0 = jSPlan0.applySubstitutionTasks(jSSubstitution0);
      assertEquals(10, jSTasks0.capacity());
  }

  @Test
  public void test10()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) "[]");
      // Undeclared exception!
      try {
        jSPlan0.applySubstitutionTasks((JSSubstitution) null);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to umd.cs.shop.JSTaskAtom
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) null);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      boolean boolean0 = jSPlan0.contains(jSTaskAtom0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSTasks jSTasks0 = jSPlan0.cloneTasks();
      assertEquals(true, jSTasks0.isEmpty());
  }

  @Test
  public void test13()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSTasks jSTasks0 = jSPlan0.cdr();
      assertEquals(0, jSTasks0.size());
  }

  @Test
  public void test14()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      JSTasks jSTasks0 = jSPlan0.standarizerTasks();
      assertEquals("[]", jSTasks0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.insertElementAt((Object) "/mnt/fastdata/ac1gf/SF110/dist/85_shop/.4N/operator", 0);
      // Undeclared exception!
      try {
        jSPlan0.standarizerTasks();
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to umd.cs.shop.JSTaskAtom
         */
      }
  }
}
