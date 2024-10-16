/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.remit.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.EffDt;
import org.sourceforge.ifx.framework.element.Memo;
import org.sourceforge.ifx.framework.element.PmtRemitStatusCode;
import org.sourceforge.ifx.framework.element.StatusDesc;
import org.sourceforge.ifx.framework.element.StatusModBy;
import org.sourceforge.ifx.framework.remit.complextype.PmtRemitStatus_Type;

@RunWith(EvoSuiteRunner.class)
public class PmtRemitStatus_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      boolean boolean0 = pmtRemitStatus_Type0.equals((Object) "org.sourceforge.ifx.framework.element.PmtRemitStatusCode = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      pmtRemitStatus_Type0.setPmtRemitStatusCode((PmtRemitStatusCode) null);
      assertEquals("org.sourceforge.ifx.framework.remit.complextype.PmtRemitStatus_Type = {\n  PmtRemitStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", pmtRemitStatus_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      String string0 = pmtRemitStatus_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.remit.complextype.PmtRemitStatus_Type = {\n  PmtRemitStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      pmtRemitStatus_Type0.setStatusModBy((StatusModBy) null);
      assertEquals("org.sourceforge.ifx.framework.remit.complextype.PmtRemitStatus_Type = {\n  PmtRemitStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", pmtRemitStatus_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      StatusDesc statusDesc0 = new StatusDesc();
      pmtRemitStatus_Type0.setStatusDesc(statusDesc0);
      assertEquals("org.sourceforge.ifx.framework.remit.complextype.PmtRemitStatus_Type = {\n  PmtRemitStatusCode = NULL\n  StatusDesc = null\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", pmtRemitStatus_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      EffDt effDt0 = new EffDt();
      pmtRemitStatus_Type0.setEffDt(effDt0);
      assertNull(effDt0.getString());
  }

  @Test
  public void test6()  throws Throwable  {
      PmtRemitStatus_Type pmtRemitStatus_Type0 = new PmtRemitStatus_Type();
      Memo memo0 = new Memo();
      pmtRemitStatus_Type0.setMemo(memo0);
      assertEquals("org.sourceforge.ifx.framework.remit.complextype.PmtRemitStatus_Type = {\n  PmtRemitStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = null\n}", pmtRemitStatus_Type0.toString());
  }
}
