/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.Term_Type;
import org.sourceforge.ifx.framework.element.Count;
import org.sourceforge.ifx.framework.element.DaysCall;
import org.sourceforge.ifx.framework.element.Desc;
import org.sourceforge.ifx.framework.element.TermUnits;

@RunWith(EvoSuiteRunner.class)
public class Term_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      Desc desc0 = term_Type0.getDesc();
      assertNull(desc0);
  }

  @Test
  public void test1()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      term_Type0.setDesc((Desc) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.Term_Type = {\n  Count = NULL\n  Desc = NULL\n  TermUnits = NULL\n  DaysCall = NULL\n}", term_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      TermUnits termUnits0 = term_Type0.getTermUnits();
      term_Type0.setTermUnits(termUnits0);
      assertEquals("org.sourceforge.ifx.framework.complextype.Term_Type = {\n  Count = NULL\n  Desc = NULL\n  TermUnits = NULL\n  DaysCall = NULL\n}", term_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      term_Type0.setCount((Count) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.Term_Type = {\n  Count = NULL\n  Desc = NULL\n  TermUnits = NULL\n  DaysCall = NULL\n}", term_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      Count count0 = term_Type0.getCount();
      assertNull(count0);
  }

  @Test
  public void test5()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      DaysCall daysCall0 = term_Type0.getDaysCall();
      term_Type0.setDaysCall(daysCall0);
      assertEquals("org.sourceforge.ifx.framework.complextype.Term_Type = {\n  Count = NULL\n  Desc = NULL\n  TermUnits = NULL\n  DaysCall = NULL\n}", term_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      Term_Type term_Type0 = new Term_Type();
      boolean boolean0 = term_Type0.equals((Object) "org.sourceforge.ifx.framework.element.Count = {\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
      assertEquals(false, boolean0);
  }
}
