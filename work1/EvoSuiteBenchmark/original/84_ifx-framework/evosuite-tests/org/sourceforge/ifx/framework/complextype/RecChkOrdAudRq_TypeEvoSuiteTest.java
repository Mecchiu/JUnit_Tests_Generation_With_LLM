/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.RecChkOrdAudRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.Method;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RecChkOrdId;
import org.sourceforge.ifx.framework.element.RecCtrlIn;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SelRangeDt;

@RunWith(EvoSuiteRunner.class)
public class RecChkOrdAudRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      SelRangeDt selRangeDt0 = new SelRangeDt();
      recChkOrdAudRq_Type0.setSelRangeDt(selRangeDt0);
      assertEquals("org.sourceforge.ifx.framework.element.SelRangeDt = {\n  StartDt = NULL\n  EndDt = NULL\n}", selRangeDt0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      recChkOrdAudRq_Type0.setAsyncRqUID(asyncRqUID0);
      assertNull(asyncRqUID0.getString());
  }

  @Test
  public void test2()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      CustId custId0 = new CustId();
      recChkOrdAudRq_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n  CardLogicalData = NULL\n}", custId0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      boolean boolean0 = recChkOrdAudRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.Trk2EquivData = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      Method[] methodArray0 = new Method[10];
      recChkOrdAudRq_Type0.setMethod(methodArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRq_Type = {\n  Method = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n}", recChkOrdAudRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      RqUID rqUID0 = recChkOrdAudRq_Type0.getRqUID();
      assertNull(rqUID0);
  }

  @Test
  public void test6()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      Method[] methodArray0 = recChkOrdAudRq_Type0.getMethod();
      assertNull(methodArray0);
  }

  @Test
  public void test7()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      RecChkOrdId[] recChkOrdIdArray0 = recChkOrdAudRq_Type0.getRecChkOrdId();
      assertNull(recChkOrdIdArray0);
  }

  @Test
  public void test8()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      MsgRqHdr msgRqHdr0 = recChkOrdAudRq_Type0.getMsgRqHdr();
      assertNull(msgRqHdr0);
  }

  @Test
  public void test9()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      CustId custId0 = recChkOrdAudRq_Type0.getCustId();
      assertNull(custId0);
  }

  @Test
  public void test10()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      RecCtrlIn recCtrlIn0 = recChkOrdAudRq_Type0.getRecCtrlIn();
      assertNull(recCtrlIn0);
  }

  @Test
  public void test11()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      SelRangeDt selRangeDt0 = recChkOrdAudRq_Type0.getSelRangeDt();
      assertNull(selRangeDt0);
  }

  @Test
  public void test12()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      AsyncRqUID asyncRqUID0 = recChkOrdAudRq_Type0.getAsyncRqUID();
      assertNull(asyncRqUID0);
  }

  @Test
  public void test13()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      recChkOrdAudRq_Type0.setRecCtrlIn((RecCtrlIn) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n}", recChkOrdAudRq_Type0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      RecChkOrdId[] recChkOrdIdArray0 = new RecChkOrdId[10];
      recChkOrdAudRq_Type0.setRecChkOrdId(recChkOrdIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", recChkOrdAudRq_Type0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      recChkOrdAudRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n}", recChkOrdAudRq_Type0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      RecChkOrdAudRq_Type recChkOrdAudRq_Type0 = new RecChkOrdAudRq_Type();
      recChkOrdAudRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RecChkOrdAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  RecChkOrdId = NULL\n}", recChkOrdAudRq_Type0.toString());
  }
}
