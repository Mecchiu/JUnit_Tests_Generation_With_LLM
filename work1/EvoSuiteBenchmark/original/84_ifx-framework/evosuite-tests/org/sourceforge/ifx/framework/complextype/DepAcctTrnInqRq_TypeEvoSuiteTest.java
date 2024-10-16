/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.CardAcctId;
import org.sourceforge.ifx.framework.element.ChkRange;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DeliveryMethod;
import org.sourceforge.ifx.framework.element.DepAcctId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RecCtrlIn;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.SelRangeCurAmt;
import org.sourceforge.ifx.framework.element.SelRangeDt;
import org.sourceforge.ifx.framework.element.TrnCountLimit;
import org.sourceforge.ifx.framework.element.TrnSrc;
import org.sourceforge.ifx.framework.element.TrnType;

@RunWith(EvoSuiteRunner.class)
public class DepAcctTrnInqRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      CustId custId0 = new CustId();
      depAcctTrnInqRq_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n  CardLogicalData = NULL\n}", custId0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      String string0 = depAcctTrnInqRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      TrnSrc[] trnSrcArray0 = new TrnSrc[3];
      depAcctTrnInqRq_Type0.setTrnSrc(trnSrcArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      depAcctTrnInqRq_Type0.setChkRange((ChkRange) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      depAcctTrnInqRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      TrnType[] trnTypeArray0 = new TrnType[3];
      depAcctTrnInqRq_Type0.setTrnType(trnTypeArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      depAcctTrnInqRq_Type0.setSelRangeCurAmt((SelRangeCurAmt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[5];
      depAcctTrnInqRq_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      depAcctTrnInqRq_Type0.setCardAcctId((CardAcctId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      depAcctTrnInqRq_Type0.setSelRangeDt((SelRangeDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      boolean boolean0 = depAcctTrnInqRq_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      RqUID rqUID0 = new RqUID();
      depAcctTrnInqRq_Type0.setRqUID(rqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.RqUID = {\n  String = NULL\n}", rqUID0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      depAcctTrnInqRq_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      DeliveryMethod[] deliveryMethodArray0 = new DeliveryMethod[3];
      depAcctTrnInqRq_Type0.setDeliveryMethod(deliveryMethodArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      RecCtrlIn recCtrlIn0 = new RecCtrlIn();
      depAcctTrnInqRq_Type0.setRecCtrlIn(recCtrlIn0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = org.sourceforge.ifx.framework.element.RecCtrlIn = {\n    MaxRec = NULL\n    Cursor = NULL\n  }\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      DepAcctId depAcctId0 = new DepAcctId();
      depAcctTrnInqRq_Type0.setDepAcctId(depAcctId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = org.sourceforge.ifx.framework.element.DepAcctId = {\n    AcctId = NULL\n    AcctType = NULL\n    AcctKey = NULL\n    AcctCur = NULL\n    BankInfo = NULL\n  }\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      TrnCountLimit[] trnCountLimitArray0 = new TrnCountLimit[9];
      depAcctTrnInqRq_Type0.setTrnCountLimit(trnCountLimitArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CSPRefId = NULL\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      DepAcctTrnInqRq_Type depAcctTrnInqRq_Type0 = new DepAcctTrnInqRq_Type();
      CSPRefId[] cSPRefIdArray0 = new CSPRefId[6];
      depAcctTrnInqRq_Type0.setCSPRefId(cSPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DepAcctTrnInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  DepAcctId = NULL\n  CardAcctId = NULL\n  SelRangeDt = NULL\n  SelRangeCurAmt = NULL\n  ChkRange = NULL\n  TrnType = NULL\n  TrnSrc = NULL\n  TrnCountLimit = NULL\n  CSPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  }\n  ]\n  SPRefId = NULL\n  DeliveryMethod = NULL\n}", depAcctTrnInqRq_Type0.toString());
  }
}
