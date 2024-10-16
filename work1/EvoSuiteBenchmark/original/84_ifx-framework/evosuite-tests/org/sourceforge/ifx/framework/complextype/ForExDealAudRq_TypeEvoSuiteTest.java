/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.ForExDealId;
import org.sourceforge.ifx.framework.element.Method;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RecCtrlIn;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SelRangeDt;

@RunWith(EvoSuiteRunner.class)
public class ForExDealAudRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      forExDealAudRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = NULL\n}", forExDealAudRq_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      String string0 = forExDealAudRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      Method method0 = new Method();
      forExDealAudRq_Type0.setMethod(method0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = null\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = NULL\n}", forExDealAudRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      forExDealAudRq_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.AsyncRqUID = {\n  String = NULL\n}", asyncRqUID0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      forExDealAudRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = NULL\n}", forExDealAudRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      ForExDealId[] forExDealIdArray0 = new ForExDealId[10];
      forExDealAudRq_Type0.setForExDealId(forExDealIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", forExDealAudRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      forExDealAudRq_Type0.setSelRangeDt((SelRangeDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = NULL\n}", forExDealAudRq_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      boolean boolean0 = forExDealAudRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.TCHash = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      forExDealAudRq_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealAudRq_Type = {\n  Method = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlIn = NULL\n  SelRangeDt = NULL\n  ForExDealId = NULL\n}", forExDealAudRq_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      ForExDealAudRq_Type forExDealAudRq_Type0 = new ForExDealAudRq_Type();
      RecCtrlIn recCtrlIn0 = new RecCtrlIn();
      forExDealAudRq_Type0.setRecCtrlIn(recCtrlIn0);
      assertEquals("org.sourceforge.ifx.framework.element.RecCtrlIn = {\n  MaxRec = NULL\n  Cursor = NULL\n}", recCtrlIn0.toString());
  }
}
