/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DiscInqRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DeliveryMethod;
import org.sourceforge.ifx.framework.element.DiscId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SvcName;
import org.sourceforge.ifx.framework.element.UpDt;

@RunWith(EvoSuiteRunner.class)
public class DiscInqRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      String string0 = discInqRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      discInqRq_Type0.setDeliveryMethod((DeliveryMethod[]) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      SvcName[] svcNameArray0 = new SvcName[4];
      discInqRq_Type0.setSvcName(svcNameArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      discInqRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      DiscId[] discIdArray0 = new DiscId[8];
      discInqRq_Type0.setDiscId(discIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      discInqRq_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      discInqRq_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      discInqRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = NULL\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      UpDt[] upDtArray0 = new UpDt[3];
      discInqRq_Type0.setUpDt(upDtArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  DeliveryMethod = NULL\n  UpDt = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", discInqRq_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DiscInqRq_Type discInqRq_Type0 = new DiscInqRq_Type();
      boolean boolean0 = discInqRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.NetworkRefId = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }
}
