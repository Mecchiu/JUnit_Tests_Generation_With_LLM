/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustDiscStatusCode;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DeliveryMethod;
import org.sourceforge.ifx.framework.element.DiscId;
import org.sourceforge.ifx.framework.element.IncDisc;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SvcName;

@RunWith(EvoSuiteRunner.class)
public class CustDiscInqRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      AsyncRqUID asyncRqUID0 = custDiscInqRq_Type0.getAsyncRqUID();
      assertNull(asyncRqUID0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      custDiscInqRq_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      DiscId discId0 = custDiscInqRq_Type0.getDiscId();
      assertNull(discId0);
  }

  @Test
  public void test3()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      SvcName svcName0 = custDiscInqRq_Type0.getSvcName();
      assertNull(svcName0);
  }

  @Test
  public void test4()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      DeliveryMethod deliveryMethod0 = custDiscInqRq_Type0.getDeliveryMethod();
      assertNull(deliveryMethod0);
  }

  @Test
  public void test5()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      custDiscInqRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      CustId custId0 = custDiscInqRq_Type0.getCustId();
      assertNull(custId0);
  }

  @Test
  public void test7()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      CustDiscStatusCode custDiscStatusCode0 = custDiscInqRq_Type0.getCustDiscStatusCode();
      custDiscInqRq_Type0.setCustDiscStatusCode(custDiscStatusCode0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      IncDisc incDisc0 = custDiscInqRq_Type0.getIncDisc();
      assertNull(incDisc0);
  }

  @Test
  public void test9()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      custDiscInqRq_Type0.setDiscId((DiscId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      boolean boolean0 = custDiscInqRq_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      MsgRqHdr msgRqHdr0 = custDiscInqRq_Type0.getMsgRqHdr();
      assertNull(msgRqHdr0);
  }

  @Test
  public void test12()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      custDiscInqRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      CustId custId0 = new CustId();
      custDiscInqRq_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n  CardLogicalData = NULL\n}", custId0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      IncDisc incDisc0 = new IncDisc();
      custDiscInqRq_Type0.setIncDisc(incDisc0);
      assertEquals("org.sourceforge.ifx.framework.element.IncDisc = {\n  String = NULL\n}", incDisc0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      RqUID rqUID0 = custDiscInqRq_Type0.getRqUID();
      assertNull(rqUID0);
  }

  @Test
  public void test16()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      custDiscInqRq_Type0.setDeliveryMethod((DeliveryMethod) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      CustDiscInqRq_Type custDiscInqRq_Type0 = new CustDiscInqRq_Type();
      custDiscInqRq_Type0.setSvcName((SvcName) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  SvcName = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n  IncDisc = NULL\n  DeliveryMethod = NULL\n}", custDiscInqRq_Type0.toString());
  }
}
