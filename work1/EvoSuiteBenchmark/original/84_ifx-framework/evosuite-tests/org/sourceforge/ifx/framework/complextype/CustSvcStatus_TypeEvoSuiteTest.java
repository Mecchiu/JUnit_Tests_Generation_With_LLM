/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustSvcStatus_Type;
import org.sourceforge.ifx.framework.element.CustSvcStatusCode;
import org.sourceforge.ifx.framework.element.EffDt;
import org.sourceforge.ifx.framework.element.ResolvePendingDt;
import org.sourceforge.ifx.framework.element.StatusDesc;
import org.sourceforge.ifx.framework.element.StatusModBy;

@RunWith(EvoSuiteRunner.class)
public class CustSvcStatus_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      boolean boolean0 = custSvcStatus_Type0.equals((Object) "org.sourceforge.ifx.framework.element.ResolvePendingDt = {\n  String = Exception! java.lang.ClassCastException: java.lang.String cannot be cast to org.sourceforge.ifx.basetypes.IFXObject\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      CustSvcStatusCode custSvcStatusCode0 = new CustSvcStatusCode();
      custSvcStatus_Type0.setCustSvcStatusCode(custSvcStatusCode0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSvcStatus_Type = {\n  CustSvcStatusCode = null\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  ResolvePendingDt = NULL\n}", custSvcStatus_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      custSvcStatus_Type0.setResolvePendingDt((ResolvePendingDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSvcStatus_Type = {\n  CustSvcStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  ResolvePendingDt = NULL\n}", custSvcStatus_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      StatusDesc statusDesc0 = new StatusDesc();
      custSvcStatus_Type0.setStatusDesc(statusDesc0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSvcStatus_Type = {\n  CustSvcStatusCode = NULL\n  StatusDesc = null\n  EffDt = NULL\n  StatusModBy = NULL\n  ResolvePendingDt = NULL\n}", custSvcStatus_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      String string0 = custSvcStatus_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSvcStatus_Type = {\n  CustSvcStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  ResolvePendingDt = NULL\n}", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      EffDt effDt0 = new EffDt();
      custSvcStatus_Type0.setEffDt(effDt0);
      assertEquals("org.sourceforge.ifx.framework.element.EffDt = {\n  String = NULL\n}", effDt0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CustSvcStatus_Type custSvcStatus_Type0 = new CustSvcStatus_Type();
      custSvcStatus_Type0.setStatusModBy((StatusModBy) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSvcStatus_Type = {\n  CustSvcStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  ResolvePendingDt = NULL\n}", custSvcStatus_Type0.toString());
  }
}
