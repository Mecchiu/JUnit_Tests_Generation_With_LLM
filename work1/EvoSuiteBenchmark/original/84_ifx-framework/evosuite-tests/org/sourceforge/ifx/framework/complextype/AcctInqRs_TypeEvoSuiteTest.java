/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.AcctInqRs_Type;
import org.sourceforge.ifx.framework.element.AcctBal;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CCAcctRec;
import org.sourceforge.ifx.framework.element.CardAcctId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DeliveryMethod;
import org.sourceforge.ifx.framework.element.DepAcctId;
import org.sourceforge.ifx.framework.element.DepAcctRec;
import org.sourceforge.ifx.framework.element.ExtAcctBal;
import org.sourceforge.ifx.framework.element.IncBal;
import org.sourceforge.ifx.framework.element.IncExtBal;
import org.sourceforge.ifx.framework.element.LOCAcctRec;
import org.sourceforge.ifx.framework.element.LastStmtDt;
import org.sourceforge.ifx.framework.element.LastTrnDt;
import org.sourceforge.ifx.framework.element.LoanAcctId;
import org.sourceforge.ifx.framework.element.LoanAcctRec;
import org.sourceforge.ifx.framework.element.MortAcctRec;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.UpDt;

@RunWith(EvoSuiteRunner.class)
public class AcctInqRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      String string0 = acctInqRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      acctInqRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = org.sourceforge.ifx.framework.element.MsgRsHdr = {\n    MsgAuthCode = NULL\n    EMVRsData = NULL\n    ServerTerminalSeqId = NULL\n  }\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      AcctBal[] acctBalArray0 = new AcctBal[5];
      acctInqRs_Type0.setAcctBal(acctBalArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      LoanAcctRec[] loanAcctRecArray0 = new LoanAcctRec[8];
      acctInqRs_Type0.setLoanAcctRec(loanAcctRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  }\n  ]\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      MortAcctRec[] mortAcctRecArray0 = new MortAcctRec[5];
      acctInqRs_Type0.setMortAcctRec(mortAcctRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      CCAcctRec[] cCAcctRecArray0 = new CCAcctRec[5];
      acctInqRs_Type0.setCCAcctRec(cCAcctRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      assertNotNull(acctInqRs_Type0);
      
      LastTrnDt lastTrnDt0 = new LastTrnDt();
      acctInqRs_Type0.setLastTrnDt(lastTrnDt0);
      assertEquals("org.sourceforge.ifx.framework.element.LastTrnDt = {\n  String = Exception! java.lang.ClassCastException: java.lang.String cannot be cast to org.sourceforge.ifx.basetypes.IFXObject\n}", lastTrnDt0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      DepAcctRec[] depAcctRecArray0 = new DepAcctRec[6];
      acctInqRs_Type0.setDepAcctRec(depAcctRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      acctInqRs_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.AsyncRqUID = {\n  String = NULL\n}", asyncRqUID0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      DepAcctId depAcctId0 = new DepAcctId();
      acctInqRs_Type0.setDepAcctId(depAcctId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = org.sourceforge.ifx.framework.element.DepAcctId = {\n    AcctId = NULL\n    AcctType = NULL\n    AcctKey = NULL\n    AcctCur = NULL\n    BankInfo = NULL\n  }\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      ExtAcctBal[] extAcctBalArray0 = new ExtAcctBal[1];
      acctInqRs_Type0.setExtAcctBal(extAcctBalArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setCardAcctId((CardAcctId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setIncBal((IncBal) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setLastStmtDt((LastStmtDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      IncExtBal incExtBal0 = new IncExtBal();
      acctInqRs_Type0.setIncExtBal(incExtBal0);
      assertEquals("org.sourceforge.ifx.framework.element.IncExtBal = {\n  String = NULL\n}", incExtBal0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      boolean boolean0 = acctInqRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.LastYrInsPaidDt = {\n  String = Exception! java.lang.ClassCastException\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      assertNotNull(acctInqRs_Type0);
      
      UpDt upDt0 = new UpDt();
      acctInqRs_Type0.setUpDt(upDt0);
      assertEquals("2013-07-01T23:47:17.000795-+0100:+0100", upDt0.getString());
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = 2013-07-01T23:47:17.000795-+0100:+0100\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setDeliveryMethod((DeliveryMethod) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test21()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setLoanAcctId((LoanAcctId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test22()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      LOCAcctRec[] lOCAcctRecArray0 = new LOCAcctRec[4];
      acctInqRs_Type0.setLOCAcctRec(lOCAcctRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }

  @Test
  public void test23()  throws Throwable  {
      AcctInqRs_Type acctInqRs_Type0 = new AcctInqRs_Type();
      acctInqRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.AcctInqRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  LoanAcctId = NULL\n  IncExtBal = NULL\n  IncBal = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n  LastTrnDt = NULL\n  LastStmtDt = NULL\n  AcctBal = NULL\n  ExtAcctBal = NULL\n  DepAcctRec = NULL\n  CCAcctRec = NULL\n  LoanAcctRec = NULL\n  LOCAcctRec = NULL\n  MortAcctRec = NULL\n}", acctInqRs_Type0.toString());
  }
}
