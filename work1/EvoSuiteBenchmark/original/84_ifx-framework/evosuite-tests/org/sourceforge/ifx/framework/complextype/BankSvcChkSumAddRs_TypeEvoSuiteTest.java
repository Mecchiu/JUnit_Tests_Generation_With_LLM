/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.BankSvcChkSumInfo;
import org.sourceforge.ifx.framework.element.BankSvcChkSumRec;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.SvcRqUID;

@RunWith(EvoSuiteRunner.class)
public class BankSvcChkSumAddRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      bankSvcChkSumAddRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = org.sourceforge.ifx.framework.element.MsgRsHdr = {\n    MsgAuthCode = NULL\n    EMVRsData = NULL\n    ServerTerminalSeqId = NULL\n  }\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      BankSvcChkSumInfo bankSvcChkSumInfo0 = new BankSvcChkSumInfo();
      bankSvcChkSumAddRs_Type0.setBankSvcChkSumInfo(bankSvcChkSumInfo0);
      assertEquals("org.sourceforge.ifx.framework.element.BankSvcChkSumInfo = {\n  Count = NULL\n  RefInfo = NULL\n  MsgType = NULL\n  BankSvcChkSum = NULL\n}", bankSvcChkSumInfo0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      bankSvcChkSumAddRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      String string0 = bankSvcChkSumAddRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      CSPRefId cSPRefId0 = new CSPRefId();
      bankSvcChkSumAddRs_Type0.setCSPRefId(cSPRefId0);
      assertNull(cSPRefId0.getString());
  }

  @Test
  public void test5()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      bankSvcChkSumAddRs_Type0.setSPRefId((SPRefId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      bankSvcChkSumAddRs_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = null\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      bankSvcChkSumAddRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      boolean boolean0 = bankSvcChkSumAddRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      Status status0 = new Status();
      bankSvcChkSumAddRs_Type0.setStatus(status0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = org.sourceforge.ifx.framework.element.Status = {\n    Id = NULL\n    StatusCode = NULL\n    ServerStatusCode = NULL\n    Severity = NULL\n    StatusDesc = NULL\n    AdditionalStatus = NULL\n    AsyncRsInfo = NULL\n  }\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      BankSvcChkSumRec bankSvcChkSumRec0 = new BankSvcChkSumRec();
      bankSvcChkSumAddRs_Type0.setBankSvcChkSumRec(bankSvcChkSumRec0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = org.sourceforge.ifx.framework.element.BankSvcChkSumRec = {\n    BankSvcChkSumInfo = NULL\n    BankSvcChkSumId = NULL\n    BankSvcChkSumStatus = NULL\n  }\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      bankSvcChkSumAddRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumAddRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      BankSvcChkSumAddRs_Type bankSvcChkSumAddRs_Type0 = new BankSvcChkSumAddRs_Type();
      SvcRqUID svcRqUID0 = new SvcRqUID();
      bankSvcChkSumAddRs_Type0.setSvcRqUID(svcRqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.SvcRqUID = {\n  String = NULL\n}", svcRqUID0.toString());
  }
}
