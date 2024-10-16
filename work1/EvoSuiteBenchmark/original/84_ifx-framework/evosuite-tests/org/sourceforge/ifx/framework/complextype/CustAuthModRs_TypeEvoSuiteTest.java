/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.ExpDt;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;

@RunWith(EvoSuiteRunner.class)
public class CustAuthModRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      custAuthModRs_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRqHdr = {\n  EMVRqData = NULL\n  NetworkTrnInfo = NULL\n  ClientTerminalSeqId = NULL\n  PointOfServiceData = NULL\n  MsgAuthCode = NULL\n}", msgRqHdr0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      custAuthModRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = org.sourceforge.ifx.framework.element.MsgRsHdr = {\n    MsgAuthCode = NULL\n    EMVRsData = NULL\n    ServerTerminalSeqId = NULL\n  }\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      custAuthModRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      custAuthModRs_Type0.setSPRefId((SPRefId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      custAuthModRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      custAuthModRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      CustId custId0 = custAuthModRs_Type0.getCustId();
      custAuthModRs_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      custAuthModRs_Type0.setExpDt((ExpDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", custAuthModRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      String string0 = custAuthModRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CustAuthModRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  ExpDt = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      CustAuthModRs_Type custAuthModRs_Type0 = new CustAuthModRs_Type();
      boolean boolean0 = custAuthModRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.BankId = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }
}
