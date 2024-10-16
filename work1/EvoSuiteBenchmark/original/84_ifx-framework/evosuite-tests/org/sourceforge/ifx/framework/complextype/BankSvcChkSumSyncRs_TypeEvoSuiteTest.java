/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.BankSvcChkSumMsgRec;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.NewToken;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.Token;

@RunWith(EvoSuiteRunner.class)
public class BankSvcChkSumSyncRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setToken((Token) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      boolean boolean0 = bankSvcChkSumSyncRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.POSEntryCapability = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setNewToken((NewToken) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      String string0 = bankSvcChkSumSyncRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setCSPRefId((CSPRefId[]) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      RecCtrlOut recCtrlOut0 = new RecCtrlOut();
      bankSvcChkSumSyncRs_Type0.setRecCtrlOut(recCtrlOut0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = org.sourceforge.ifx.framework.element.RecCtrlOut = {\n    MatchedRec = NULL\n    SentRec = NULL\n    Cursor = NULL\n  }\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      BankSvcChkSumMsgRec[] bankSvcChkSumMsgRecArray0 = new BankSvcChkSumMsgRec[9];
      bankSvcChkSumSyncRs_Type0.setBankSvcChkSumMsgRec(bankSvcChkSumMsgRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      Status status0 = new Status();
      bankSvcChkSumSyncRs_Type0.setStatus(status0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = org.sourceforge.ifx.framework.element.Status = {\n    Id = NULL\n    StatusCode = NULL\n    ServerStatusCode = NULL\n    Severity = NULL\n    StatusDesc = NULL\n    AdditionalStatus = NULL\n    AsyncRsInfo = NULL\n  }\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[2];
      bankSvcChkSumSyncRs_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", bankSvcChkSumSyncRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      bankSvcChkSumSyncRs_Type0.setAsyncRqUID(asyncRqUID0);
      assertNull(asyncRqUID0.getString());
  }

  @Test
  public void test13()  throws Throwable  {
      BankSvcChkSumSyncRs_Type bankSvcChkSumSyncRs_Type0 = new BankSvcChkSumSyncRs_Type();
      bankSvcChkSumSyncRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  BankSvcChkSumMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumSyncRs_Type0.toString());
  }
}
