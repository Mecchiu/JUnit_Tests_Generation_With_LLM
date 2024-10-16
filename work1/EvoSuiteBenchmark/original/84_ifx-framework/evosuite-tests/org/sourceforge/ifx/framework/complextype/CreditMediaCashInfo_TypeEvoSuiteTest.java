/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CreditMediaCashInfo_Type;
import org.sourceforge.ifx.framework.element.CashAmt;
import org.sourceforge.ifx.framework.element.CashQuality;
import org.sourceforge.ifx.framework.element.CashValidity;

@RunWith(EvoSuiteRunner.class)
public class CreditMediaCashInfo_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CreditMediaCashInfo_Type creditMediaCashInfo_Type0 = new CreditMediaCashInfo_Type();
      String string0 = creditMediaCashInfo_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditMediaCashInfo_Type = {\n  CashAmt = NULL\n  CashValidity = NULL\n  CashQuality = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      CreditMediaCashInfo_Type creditMediaCashInfo_Type0 = new CreditMediaCashInfo_Type();
      creditMediaCashInfo_Type0.setCashValidity((CashValidity) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditMediaCashInfo_Type = {\n  CashAmt = NULL\n  CashValidity = NULL\n  CashQuality = NULL\n}", creditMediaCashInfo_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CreditMediaCashInfo_Type creditMediaCashInfo_Type0 = new CreditMediaCashInfo_Type();
      creditMediaCashInfo_Type0.setCashAmt((CashAmt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditMediaCashInfo_Type = {\n  CashAmt = NULL\n  CashValidity = NULL\n  CashQuality = NULL\n}", creditMediaCashInfo_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CreditMediaCashInfo_Type creditMediaCashInfo_Type0 = new CreditMediaCashInfo_Type();
      creditMediaCashInfo_Type0.setCashQuality((CashQuality) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditMediaCashInfo_Type = {\n  CashAmt = NULL\n  CashValidity = NULL\n  CashQuality = NULL\n}", creditMediaCashInfo_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CreditMediaCashInfo_Type creditMediaCashInfo_Type0 = new CreditMediaCashInfo_Type();
      boolean boolean0 = creditMediaCashInfo_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }
}
