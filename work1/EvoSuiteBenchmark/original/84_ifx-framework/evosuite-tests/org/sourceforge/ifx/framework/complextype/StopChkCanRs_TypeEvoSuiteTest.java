/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CardAcctId;
import org.sourceforge.ifx.framework.element.ChkRange;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DepAcctId;
import org.sourceforge.ifx.framework.element.LoanAcctId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.StopChkInfo;
import org.sourceforge.ifx.framework.element.StopChkRec;

@RunWith(EvoSuiteRunner.class)
public class StopChkCanRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setLoanAcctId((LoanAcctId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      String string0 = stopChkCanRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      StopChkRec[] stopChkRecArray0 = new StopChkRec[2];
      stopChkCanRs_Type0.setStopChkRec(stopChkRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setCardAcctId((CardAcctId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      CustId custId0 = stopChkCanRs_Type0.getCustId();
      stopChkCanRs_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setChkRange((ChkRange) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[10];
      stopChkCanRs_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setDepAcctId((DepAcctId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      stopChkCanRs_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = null\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      boolean boolean0 = stopChkCanRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      StopChkInfo stopChkInfo0 = new StopChkInfo();
      stopChkCanRs_Type0.setStopChkInfo(stopChkInfo0);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = org.sourceforge.ifx.framework.element.StopChkInfo = {\n    Name = NULL\n    Desc = NULL\n    ChkNum = NULL\n    CurAmt = NULL\n    OrigDt = NULL\n    BaseEnvr = NULL\n  }\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      stopChkCanRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      StopChkCanRs_Type stopChkCanRs_Type0 = new StopChkCanRs_Type();
      CSPRefId[] cSPRefIdArray0 = new CSPRefId[10];
      stopChkCanRs_Type0.setCSPRefId(cSPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.StopChkCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  ChkRange = NULL\n  StopChkInfo = NULL\n  StopChkRec = NULL\n  CSPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n  SPRefId = NULL\n}", stopChkCanRs_Type0.toString());
  }
}
