/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.ForExDealId;
import org.sourceforge.ifx.framework.element.ForExDealMsgRec;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.NewToken;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.Token;

@RunWith(EvoSuiteRunner.class)
public class ForExDealSyncRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      NewToken newToken0 = new NewToken();
      forExDealSyncRs_Type0.setNewToken(newToken0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = null\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      String string0 = forExDealSyncRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      forExDealSyncRs_Type0.setAsyncRqUID(asyncRqUID0);
      assertNull(asyncRqUID0.getString());
  }

  @Test
  public void test3()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      boolean boolean0 = forExDealSyncRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      forExDealSyncRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRsHdr = {\n  MsgAuthCode = NULL\n  EMVRsData = NULL\n  ServerTerminalSeqId = NULL\n}", msgRsHdr0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      CSPRefId[] cSPRefIdArray0 = new CSPRefId[5];
      forExDealSyncRs_Type0.setCSPRefId(cSPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      forExDealSyncRs_Type0.setRecCtrlOut((RecCtrlOut) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      forExDealSyncRs_Type0.setToken((Token) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      forExDealSyncRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      ForExDealId[] forExDealIdArray0 = new ForExDealId[8];
      forExDealSyncRs_Type0.setForExDealId(forExDealIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  }\n  ]\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      forExDealSyncRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      forExDealSyncRs_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = org.sourceforge.ifx.framework.element.MsgRqHdr = {\n    EMVRqData = NULL\n    NetworkTrnInfo = NULL\n    ClientTerminalSeqId = NULL\n    PointOfServiceData = NULL\n    MsgAuthCode = NULL\n  }\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[3];
      forExDealSyncRs_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      forExDealSyncRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      ForExDealSyncRs_Type forExDealSyncRs_Type0 = new ForExDealSyncRs_Type();
      ForExDealMsgRec[] forExDealMsgRecArray0 = new ForExDealMsgRec[5];
      forExDealSyncRs_Type0.setForExDealMsgRec(forExDealMsgRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealSyncRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  Token = NULL\n  NewToken = NULL\n  ForExDealId = NULL\n  ForExDealMsgRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CSPRefId = NULL\n  SPRefId = NULL\n}", forExDealSyncRs_Type0.toString());
  }
}
