/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.InterXferProf_Type;
import org.sourceforge.ifx.framework.element.DomXferFeeCurAmt;
import org.sourceforge.ifx.framework.element.IntlXferFeeCurAmt;
import org.sourceforge.ifx.framework.element.USA_ACHProf;
import org.sourceforge.ifx.framework.element.XferProf;

@RunWith(EvoSuiteRunner.class)
public class InterXferProf_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InterXferProf_Type interXferProf_Type0 = new InterXferProf_Type();
      USA_ACHProf uSA_ACHProf0 = new USA_ACHProf();
      interXferProf_Type0.setUSA_ACHProf(uSA_ACHProf0);
      assertEquals("org.sourceforge.ifx.framework.element.USA_ACHProf = {\n  DaysWith = NULL\n  DfltDaysToPay = NULL\n  CanWind = NULL\n}", uSA_ACHProf0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      InterXferProf_Type interXferProf_Type0 = new InterXferProf_Type();
      IntlXferFeeCurAmt intlXferFeeCurAmt0 = new IntlXferFeeCurAmt();
      interXferProf_Type0.setIntlXferFeeCurAmt(intlXferFeeCurAmt0);
      assertEquals("org.sourceforge.ifx.framework.element.IntlXferFeeCurAmt = {\n  Amt = NULL\n  CurCode = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}", intlXferFeeCurAmt0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      InterXferProf_Type interXferProf_Type0 = new InterXferProf_Type();
      boolean boolean0 = interXferProf_Type0.equals((Object) "org.sourceforge.ifx.framework.element.DomXferFeeCurAmt = {\n  Amt = NULL\n  CurCode = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      InterXferProf_Type interXferProf_Type0 = new InterXferProf_Type();
      String string0 = interXferProf_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.InterXferProf_Type = {\n  XferProf = NULL\n  DomXferFeeCurAmt = NULL\n  IntlXferFeeCurAmt = NULL\n  USA_ACHProf = NULL\n}", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      InterXferProf_Type interXferProf_Type0 = new InterXferProf_Type();
      interXferProf_Type0.setDomXferFeeCurAmt((DomXferFeeCurAmt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.InterXferProf_Type = {\n  XferProf = NULL\n  DomXferFeeCurAmt = NULL\n  IntlXferFeeCurAmt = NULL\n  USA_ACHProf = NULL\n}", interXferProf_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      InterXferProf_Type interXferProf_Type0 = new InterXferProf_Type();
      interXferProf_Type0.setXferProf((XferProf) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.InterXferProf_Type = {\n  XferProf = NULL\n  DomXferFeeCurAmt = NULL\n  IntlXferFeeCurAmt = NULL\n  USA_ACHProf = NULL\n}", interXferProf_Type0.toString());
  }
}
