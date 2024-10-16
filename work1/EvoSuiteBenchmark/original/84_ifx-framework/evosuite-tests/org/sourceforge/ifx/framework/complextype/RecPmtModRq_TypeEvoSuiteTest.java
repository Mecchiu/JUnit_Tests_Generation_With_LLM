/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.ModPending;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.PmtInfo;
import org.sourceforge.ifx.framework.element.RecModelInfo;
import org.sourceforge.ifx.framework.element.RecPmtId;
import org.sourceforge.ifx.framework.element.RqUID;

@RunWith(EvoSuiteRunner.class)
public class RecPmtModRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      recPmtModRq_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = NULL\n  ModPending = NULL\n}", recPmtModRq_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      boolean boolean0 = recPmtModRq_Type0.equals((Object) "org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = NULL\n  ModPending = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      recPmtModRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = NULL\n  ModPending = NULL\n}", recPmtModRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      RqUID rqUID0 = new RqUID();
      recPmtModRq_Type0.setRqUID(rqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.RqUID = {\n  String = NULL\n}", rqUID0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      RecModelInfo recModelInfo0 = new RecModelInfo();
      recPmtModRq_Type0.setRecModelInfo(recModelInfo0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = org.sourceforge.ifx.framework.element.RecModelInfo = {\n    Freq = NULL\n    NumInsts = NULL\n    FinalPrcDt = NULL\n    FinalDueDt = NULL\n    InitialCurAmt = NULL\n    FinalCurAmt = NULL\n    Nickname = NULL\n    SkipNextN = NULL\n  }\n  ModPending = NULL\n}", recPmtModRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      recPmtModRq_Type0.setPmtInfo((PmtInfo) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = NULL\n  ModPending = NULL\n}", recPmtModRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      String string0 = recPmtModRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = NULL\n  ModPending = NULL\n}", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      ModPending modPending0 = new ModPending();
      recPmtModRq_Type0.setModPending(modPending0);
      assertNull(modPending0.getString());
  }

  @Test
  public void test8()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      CustId custId0 = new CustId();
      recPmtModRq_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n  CardLogicalData = NULL\n}", custId0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      RecPmtModRq_Type recPmtModRq_Type0 = new RecPmtModRq_Type();
      recPmtModRq_Type0.setRecPmtId((RecPmtId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecPmtModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecPmtId = NULL\n  PmtInfo = NULL\n  RecModelInfo = NULL\n  ModPending = NULL\n}", recPmtModRq_Type0.toString());
  }
}
