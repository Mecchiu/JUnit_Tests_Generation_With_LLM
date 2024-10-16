/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.ClientChgCode;
import org.sourceforge.ifx.framework.element.CreditAuthId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;

@RunWith(EvoSuiteRunner.class)
public class CreditAuthCanRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      String string0 = creditAuthCanRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      creditAuthCanRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      creditAuthCanRs_Type0.setCreditAuthId((CreditAuthId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      Status status0 = new Status();
      creditAuthCanRs_Type0.setStatus(status0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = org.sourceforge.ifx.framework.element.Status = {\n    Id = NULL\n    StatusCode = NULL\n    ServerStatusCode = NULL\n    Severity = NULL\n    StatusDesc = NULL\n    AdditionalStatus = NULL\n    AsyncRsInfo = NULL\n  }\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      boolean boolean0 = creditAuthCanRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      creditAuthCanRs_Type0.setCSPRefId((CSPRefId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      creditAuthCanRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      creditAuthCanRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      creditAuthCanRs_Type0.setSPRefId((SPRefId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      ClientChgCode clientChgCode0 = new ClientChgCode();
      creditAuthCanRs_Type0.setClientChgCode(clientChgCode0);
      assertNull(clientChgCode0.getString());
  }

  @Test
  public void test10()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      MsgRqHdr msgRqHdr0 = creditAuthCanRs_Type0.getMsgRqHdr();
      creditAuthCanRs_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CreditAuthId = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", creditAuthCanRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      CreditAuthCanRs_Type creditAuthCanRs_Type0 = new CreditAuthCanRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      creditAuthCanRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRsHdr = {\n  MsgAuthCode = NULL\n  EMVRsData = NULL\n  ServerTerminalSeqId = NULL\n}", msgRsHdr0.toString());
  }
}
