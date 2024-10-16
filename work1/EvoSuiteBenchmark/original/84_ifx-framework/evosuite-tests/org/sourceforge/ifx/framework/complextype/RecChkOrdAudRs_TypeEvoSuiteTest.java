/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.Method;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RecChkOrdId;
import org.sourceforge.ifx.framework.element.RecChkOrdMsgRec;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SelRangeDt;
import org.sourceforge.ifx.framework.element.Status;

@RunWith(EvoSuiteRunner.class)
public class RecChkOrdAudRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      String string0 = recChkOrdAudRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      recChkOrdAudRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      Method[] methodArray0 = new Method[3];
      recChkOrdAudRs_Type0.setMethod(methodArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      SelRangeDt selRangeDt0 = new SelRangeDt();
      recChkOrdAudRs_Type0.setSelRangeDt(selRangeDt0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = org.sourceforge.ifx.framework.element.SelRangeDt = {\n    StartDt = NULL\n    EndDt = NULL\n  }\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      boolean boolean0 = recChkOrdAudRs_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      RecChkOrdMsgRec[] recChkOrdMsgRecArray0 = new RecChkOrdMsgRec[1];
      recChkOrdAudRs_Type0.setRecChkOrdMsgRec(recChkOrdMsgRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      recChkOrdAudRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      recChkOrdAudRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      RecChkOrdId[] recChkOrdIdArray0 = new RecChkOrdId[1];
      recChkOrdAudRs_Type0.setRecChkOrdId(recChkOrdIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      recChkOrdAudRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      recChkOrdAudRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      RecCtrlOut recCtrlOut0 = recChkOrdAudRs_Type0.getRecCtrlOut();
      recChkOrdAudRs_Type0.setRecCtrlOut(recCtrlOut0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      RecChkOrdAudRs_Type recChkOrdAudRs_Type0 = new RecChkOrdAudRs_Type();
      recChkOrdAudRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n  RecChkOrdMsgRec = NULL\n}", recChkOrdAudRs_Type0.toString());
  }
}
