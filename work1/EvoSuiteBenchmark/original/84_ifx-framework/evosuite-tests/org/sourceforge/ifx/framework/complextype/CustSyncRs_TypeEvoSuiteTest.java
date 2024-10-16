/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustSyncRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.CustMsgRec;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.NewToken;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.Token;

@RunWith(EvoSuiteRunner.class)
public class CustSyncRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      boolean boolean0 = custSyncRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      String string0 = custSyncRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      Status status0 = new Status();
      custSyncRs_Type0.setStatus(status0);
      assertEquals("org.sourceforge.ifx.framework.element.Status = {\n  Id = NULL\n  StatusCode = NULL\n  ServerStatusCode = NULL\n  Severity = NULL\n  StatusDesc = NULL\n  AdditionalStatus = NULL\n  AsyncRsInfo = NULL\n}", status0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      custSyncRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", custSyncRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      CustMsgRec[] custMsgRecArray0 = new CustMsgRec[2];
      custSyncRs_Type0.setCustMsgRec(custMsgRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", custSyncRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      NewToken newToken0 = new NewToken();
      custSyncRs_Type0.setNewToken(newToken0);
      assertEquals("org.sourceforge.ifx.framework.element.NewToken = {\n  String = NULL\n}", newToken0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      custSyncRs_Type0.setToken((Token) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", custSyncRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      RecCtrlOut recCtrlOut0 = new RecCtrlOut();
      custSyncRs_Type0.setRecCtrlOut(recCtrlOut0);
      assertEquals("org.sourceforge.ifx.framework.element.RecCtrlOut = {\n  MatchedRec = NULL\n  SentRec = NULL\n  Cursor = NULL\n}", recCtrlOut0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      custSyncRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", custSyncRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      custSyncRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", custSyncRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      RqUID rqUID0 = new RqUID();
      custSyncRs_Type0.setRqUID(rqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = null\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", custSyncRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      CustSyncRs_Type custSyncRs_Type0 = new CustSyncRs_Type();
      custSyncRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  CustMsgRec = NULL\n}", custSyncRs_Type0.toString());
  }
}
