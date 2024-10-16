/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DebitId;
import org.sourceforge.ifx.framework.element.DebitStatus;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;

@RunWith(EvoSuiteRunner.class)
public class DebitStatusModRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      debitStatusModRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitStatus = NULL\n}", debitStatusModRq_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      boolean boolean0 = debitStatusModRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.POSCapabilities = {\n  POSAttended = NULL\n  POSOperation = NULL\n  POSEntryCapability = NULL\n  POSCaptureCapability = NULL\n  POSVerifyCapability = NULL\n  POSOutCapabilities = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      DebitId debitId0 = new DebitId();
      debitStatusModRq_Type0.setDebitId(debitId0);
      assertNull(debitId0.getString());
  }

  @Test
  public void test3()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      debitStatusModRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitStatus = NULL\n}", debitStatusModRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      debitStatusModRq_Type0.setDebitStatus((DebitStatus) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitStatus = NULL\n}", debitStatusModRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      String string0 = debitStatusModRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitStatus = NULL\n}", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      debitStatusModRq_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitStatus = NULL\n}", debitStatusModRq_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DebitStatusModRq_Type debitStatusModRq_Type0 = new DebitStatusModRq_Type();
      debitStatusModRq_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitStatusModRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitStatus = NULL\n}", debitStatusModRq_Type0.toString());
  }
}
