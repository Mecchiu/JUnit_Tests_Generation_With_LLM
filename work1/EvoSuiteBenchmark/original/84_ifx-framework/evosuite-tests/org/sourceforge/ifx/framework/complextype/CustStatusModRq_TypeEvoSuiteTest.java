/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustStatusModRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.CustStatus;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;

@RunWith(EvoSuiteRunner.class)
public class CustStatusModRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      String string0 = custStatusModRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CustStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CustStatus = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      custStatusModRq_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = org.sourceforge.ifx.framework.element.MsgRqHdr = {\n    EMVRqData = NULL\n    NetworkTrnInfo = NULL\n    ClientTerminalSeqId = NULL\n    PointOfServiceData = NULL\n    MsgAuthCode = NULL\n  }\n  AsyncRqUID = NULL\n  CustId = NULL\n  CustStatus = NULL\n}", custStatusModRq_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      custStatusModRq_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.AsyncRqUID = {\n  String = NULL\n}", asyncRqUID0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      CustStatus custStatus0 = new CustStatus();
      custStatusModRq_Type0.setCustStatus(custStatus0);
      assertEquals("org.sourceforge.ifx.framework.element.CustStatus = {\n  CustStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  ResolvePendingDt = NULL\n}", custStatus0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      custStatusModRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CustStatus = NULL\n}", custStatusModRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      boolean boolean0 = custStatusModRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.CDOL1 = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      CustStatusModRq_Type custStatusModRq_Type0 = new CustStatusModRq_Type();
      custStatusModRq_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CustStatus = NULL\n}", custStatusModRq_Type0.toString());
  }
}
