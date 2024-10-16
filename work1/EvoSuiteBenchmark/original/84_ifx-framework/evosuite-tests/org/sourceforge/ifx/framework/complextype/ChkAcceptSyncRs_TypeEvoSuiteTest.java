/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.ChkAcceptId;
import org.sourceforge.ifx.framework.element.ChkAcceptMsgRec;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.NewToken;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.Token;

@RunWith(EvoSuiteRunner.class)
public class ChkAcceptSyncRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      Status status0 = new Status();
      chkAcceptSyncRs_Type0.setStatus(status0);
      assertEquals("org.sourceforge.ifx.framework.element.Status = {\n  Id = NULL\n  StatusCode = NULL\n  ServerStatusCode = NULL\n  Severity = NULL\n  StatusDesc = NULL\n  AdditionalStatus = NULL\n  AsyncRsInfo = NULL\n}", status0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      chkAcceptSyncRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      chkAcceptSyncRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      chkAcceptSyncRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      RecCtrlOut recCtrlOut0 = new RecCtrlOut();
      chkAcceptSyncRs_Type0.setRecCtrlOut(recCtrlOut0);
      assertEquals("org.sourceforge.ifx.framework.element.RecCtrlOut = {\n  MatchedRec = NULL\n  SentRec = NULL\n  Cursor = NULL\n}", recCtrlOut0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      String string0 = chkAcceptSyncRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      chkAcceptSyncRs_Type0.setToken((Token) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      ChkAcceptId[] chkAcceptIdArray0 = new ChkAcceptId[1];
      chkAcceptSyncRs_Type0.setChkAcceptId(chkAcceptIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      chkAcceptSyncRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      NewToken newToken0 = new NewToken();
      chkAcceptSyncRs_Type0.setNewToken(newToken0);
      assertEquals("org.sourceforge.ifx.framework.element.NewToken = {\n  String = NULL\n}", newToken0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      chkAcceptSyncRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = NULL\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      ChkAcceptMsgRec[] chkAcceptMsgRecArray0 = new ChkAcceptMsgRec[10];
      chkAcceptSyncRs_Type0.setChkAcceptMsgRec(chkAcceptMsgRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ChkAcceptSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ChkAcceptId = NULL\n  ChkAcceptMsgRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", chkAcceptSyncRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      ChkAcceptSyncRs_Type chkAcceptSyncRs_Type0 = new ChkAcceptSyncRs_Type();
      boolean boolean0 = chkAcceptSyncRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }
}
