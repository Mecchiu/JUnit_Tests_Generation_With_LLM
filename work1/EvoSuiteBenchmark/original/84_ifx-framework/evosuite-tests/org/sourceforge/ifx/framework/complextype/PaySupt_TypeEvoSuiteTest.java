/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.PaySupt_Type;
import org.sourceforge.ifx.framework.element.MaxCurAmt;
import org.sourceforge.ifx.framework.element.MinCurAmt;

@RunWith(EvoSuiteRunner.class)
public class PaySupt_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PaySupt_Type paySupt_Type0 = new PaySupt_Type();
      MinCurAmt minCurAmt0 = new MinCurAmt();
      paySupt_Type0.setMinCurAmt(minCurAmt0);
      assertEquals("org.sourceforge.ifx.framework.element.MinCurAmt = {\n  Amt = NULL\n  CurCode = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}", minCurAmt0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      PaySupt_Type paySupt_Type0 = new PaySupt_Type();
      MinCurAmt minCurAmt0 = paySupt_Type0.getMinCurAmt();
      assertNull(minCurAmt0);
  }

  @Test
  public void test2()  throws Throwable  {
      PaySupt_Type paySupt_Type0 = new PaySupt_Type();
      boolean boolean0 = paySupt_Type0.equals((Object) "org.sourceforge.ifx.framework.element.CurCode = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      PaySupt_Type paySupt_Type0 = new PaySupt_Type();
      MaxCurAmt maxCurAmt0 = paySupt_Type0.getMaxCurAmt();
      assertNull(maxCurAmt0);
  }

  @Test
  public void test4()  throws Throwable  {
      PaySupt_Type paySupt_Type0 = new PaySupt_Type();
      MaxCurAmt maxCurAmt0 = new MaxCurAmt();
      paySupt_Type0.setMaxCurAmt(maxCurAmt0);
      assertEquals("org.sourceforge.ifx.framework.element.MaxCurAmt = {\n  Amt = NULL\n  CurCode = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}", maxCurAmt0.toString());
  }
}
