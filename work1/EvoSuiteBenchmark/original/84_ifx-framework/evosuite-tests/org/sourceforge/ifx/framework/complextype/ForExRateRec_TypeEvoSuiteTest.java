/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.ForExRateRec_Type;
import org.sourceforge.ifx.framework.element.ForExRateId;
import org.sourceforge.ifx.framework.element.ForExRateInfo;

@RunWith(EvoSuiteRunner.class)
public class ForExRateRec_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ForExRateRec_Type forExRateRec_Type0 = new ForExRateRec_Type();
      String string0 = forExRateRec_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExRateRec_Type = {\n  ForExRateId = NULL\n  ForExRateInfo = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ForExRateRec_Type forExRateRec_Type0 = new ForExRateRec_Type();
      forExRateRec_Type0.setForExRateId((ForExRateId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExRateRec_Type = {\n  ForExRateId = NULL\n  ForExRateInfo = NULL\n}", forExRateRec_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      ForExRateRec_Type forExRateRec_Type0 = new ForExRateRec_Type();
      boolean boolean0 = forExRateRec_Type0.equals((Object) "org.sourceforge.ifx.framework.complextype.ForExRateRec_Type = {\n  ForExRateId = NULL\n  ForExRateInfo = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      ForExRateRec_Type forExRateRec_Type0 = new ForExRateRec_Type();
      forExRateRec_Type0.setForExRateInfo((ForExRateInfo) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExRateRec_Type = {\n  ForExRateId = NULL\n  ForExRateInfo = NULL\n}", forExRateRec_Type0.toString());
  }
}
