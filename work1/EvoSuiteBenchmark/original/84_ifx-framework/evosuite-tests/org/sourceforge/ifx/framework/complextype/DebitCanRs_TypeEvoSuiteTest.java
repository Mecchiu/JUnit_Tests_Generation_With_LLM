/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DebitCanRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.ClientChgCode;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DebitId;
import org.sourceforge.ifx.framework.element.DebitRec;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;
import org.sourceforge.ifx.framework.element.Status;

@RunWith(EvoSuiteRunner.class)
public class DebitCanRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      String string0 = debitCanRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      boolean boolean0 = debitCanRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.AddrType = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      ClientChgCode clientChgCode0 = new ClientChgCode();
      debitCanRs_Type0.setClientChgCode(clientChgCode0);
      assertNull(clientChgCode0.getString());
  }

  @Test
  public void test4()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      CSPRefId cSPRefId0 = new CSPRefId();
      debitCanRs_Type0.setCSPRefId(cSPRefId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = null\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setDebitId((DebitId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setSPRefId((SPRefId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      DebitRec debitRec0 = new DebitRec();
      debitCanRs_Type0.setDebitRec(debitRec0);
      assertEquals("org.sourceforge.ifx.framework.element.DebitRec = {\n  DebitId = NULL\n  DebitInfo = NULL\n  DebitStatus = NULL\n}", debitRec0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      RqUID rqUID0 = new RqUID();
      debitCanRs_Type0.setRqUID(rqUID0);
      assertEquals("org.sourceforge.ifx.framework.element.RqUID = {\n  String = NULL\n}", rqUID0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      DebitCanRs_Type debitCanRs_Type0 = new DebitCanRs_Type();
      debitCanRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DebitCanRs_Type = {\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  DebitId = NULL\n  DebitRec = NULL\n  ClientChgCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", debitCanRs_Type0.toString());
  }
}
