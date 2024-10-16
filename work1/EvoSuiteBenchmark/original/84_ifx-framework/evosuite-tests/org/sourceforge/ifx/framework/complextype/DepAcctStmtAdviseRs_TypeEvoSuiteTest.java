/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DepAcctStmtRec;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;

@RunWith(EvoSuiteRunner.class)
public class DepAcctStmtAdviseRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      CustId custId0 = new CustId();
      depAcctStmtAdviseRs_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n  CardLogicalData = NULL\n}", custId0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      String string0 = depAcctStmtAdviseRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  CustId = NULL\n  DepAcctStmtRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      depAcctStmtAdviseRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  CustId = NULL\n  DepAcctStmtRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", depAcctStmtAdviseRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      depAcctStmtAdviseRs_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRqHdr = {\n  EMVRqData = NULL\n  NetworkTrnInfo = NULL\n  ClientTerminalSeqId = NULL\n  PointOfServiceData = NULL\n  MsgAuthCode = NULL\n}", msgRqHdr0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      DepAcctStmtRec depAcctStmtRec0 = new DepAcctStmtRec();
      depAcctStmtAdviseRs_Type0.setDepAcctStmtRec(depAcctStmtRec0);
      assertEquals("org.sourceforge.ifx.framework.element.DepAcctStmtRec = {\n  URL = NULL\n  SPRefId = NULL\n  DepAcctId = NULL\n  DepAcctStmtId = NULL\n  EffDt = NULL\n  NextDt = NULL\n  AcctBal = NULL\n  StmtSummAmt = NULL\n  MktgInfo = NULL\n  StartDt = NULL\n  EndDt = NULL\n  DepAcctTrnRec = NULL\n}", depAcctStmtRec0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      depAcctStmtAdviseRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  CustId = NULL\n  DepAcctStmtRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", depAcctStmtAdviseRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[8];
      depAcctStmtAdviseRs_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  CustId = NULL\n  DepAcctStmtRec = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", depAcctStmtAdviseRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      CSPRefId[] cSPRefIdArray0 = new CSPRefId[1];
      depAcctStmtAdviseRs_Type0.setCSPRefId(cSPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  CustId = NULL\n  DepAcctStmtRec = NULL\n  CSPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  SPRefId = NULL\n}", depAcctStmtAdviseRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      depAcctStmtAdviseRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctStmtAdviseRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  CustId = NULL\n  DepAcctStmtRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", depAcctStmtAdviseRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DepAcctStmtAdviseRs_Type depAcctStmtAdviseRs_Type0 = new DepAcctStmtAdviseRs_Type();
      boolean boolean0 = depAcctStmtAdviseRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.AuthAmt = {\n  CurCode = NULL\n  Amt = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}");
      assertEquals(false, boolean0);
  }
}
