/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustDiscStatusModRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustDiscStatusCode;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DiscId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;

@RunWith(EvoSuiteRunner.class)
public class CustDiscStatusModRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      DiscId discId0 = custDiscStatusModRq_Type0.getDiscId();
      assertNull(discId0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      custDiscStatusModRq_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n}", custDiscStatusModRq_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      AsyncRqUID asyncRqUID0 = custDiscStatusModRq_Type0.getAsyncRqUID();
      assertNull(asyncRqUID0);
  }

  @Test
  public void test3()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      custDiscStatusModRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n}", custDiscStatusModRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      CustId custId0 = custDiscStatusModRq_Type0.getCustId();
      assertNull(custId0);
  }

  @Test
  public void test5()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      custDiscStatusModRq_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRqHdr = {\n  EMVRqData = NULL\n  NetworkTrnInfo = NULL\n  ClientTerminalSeqId = NULL\n  PointOfServiceData = NULL\n  MsgAuthCode = NULL\n}", msgRqHdr0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      boolean boolean0 = custDiscStatusModRq_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      CustDiscStatusCode custDiscStatusCode0 = new CustDiscStatusCode();
      custDiscStatusModRq_Type0.setCustDiscStatusCode(custDiscStatusCode0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DiscId = NULL\n  CustDiscStatusCode = null\n}", custDiscStatusModRq_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      RqUID rqUID0 = custDiscStatusModRq_Type0.getRqUID();
      assertNull(rqUID0);
  }

  @Test
  public void test9()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      MsgRqHdr msgRqHdr0 = custDiscStatusModRq_Type0.getMsgRqHdr();
      assertNull(msgRqHdr0);
  }

  @Test
  public void test10()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      custDiscStatusModRq_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n}", custDiscStatusModRq_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      custDiscStatusModRq_Type0.setDiscId((DiscId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustDiscStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DiscId = NULL\n  CustDiscStatusCode = NULL\n}", custDiscStatusModRq_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      CustDiscStatusModRq_Type custDiscStatusModRq_Type0 = new CustDiscStatusModRq_Type();
      CustDiscStatusCode custDiscStatusCode0 = custDiscStatusModRq_Type0.getCustDiscStatusCode();
      assertNull(custDiscStatusCode0);
  }
}
