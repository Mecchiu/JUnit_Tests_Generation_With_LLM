/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DiscRec;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.SvcAcctId;
import org.sourceforge.ifx.framework.element.SvcAcctInfo;
import org.sourceforge.ifx.framework.element.SvcAcctRec;

@RunWith(EvoSuiteRunner.class)
public class SvcAcctAddRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      CSPRefId[] cSPRefIdArray0 = new CSPRefId[1];
      svcAcctAddRs_Type0.setCSPRefId(cSPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setSvcAcctRec((SvcAcctRec) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setSvcAcctInfo((SvcAcctInfo) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      String string0 = svcAcctAddRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setDiscRec((DiscRec[]) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[1];
      svcAcctAddRs_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      Status status0 = new Status();
      svcAcctAddRs_Type0.setStatus(status0);
      assertEquals("org.sourceforge.ifx.framework.element.Status = {\n  Id = NULL\n  StatusCode = NULL\n  ServerStatusCode = NULL\n  Severity = NULL\n  StatusDesc = NULL\n  AdditionalStatus = NULL\n  AsyncRsInfo = NULL\n}", status0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      svcAcctAddRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = NULL\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      SvcAcctId svcAcctId0 = new SvcAcctId();
      svcAcctAddRs_Type0.setSvcAcctId(svcAcctId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SvcAcctAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcAcctId = org.sourceforge.ifx.framework.element.SvcAcctId = {\n    CustSvcId = NULL\n    DepAcctId = NULL\n    CardAcctId = NULL\n    LoanAcctId = NULL\n    PresAcctId = NULL\n    PresAcctInfo = NULL\n  }\n  SvcAcctInfo = NULL\n  SvcAcctRec = NULL\n  DiscRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", svcAcctAddRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      boolean boolean0 = svcAcctAddRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.CardSeqNum = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      SvcAcctAddRs_Type svcAcctAddRs_Type0 = new SvcAcctAddRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      svcAcctAddRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRsHdr = {\n  MsgAuthCode = NULL\n  EMVRsData = NULL\n  ServerTerminalSeqId = NULL\n}", msgRsHdr0.toString());
  }
}
