/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type;
import org.sourceforge.ifx.framework.element.BankSvcChkSumAddRs;
import org.sourceforge.ifx.framework.element.BankSvcChkSumDelRs;
import org.sourceforge.ifx.framework.element.BankSvcChkSumModRs;
import org.sourceforge.ifx.framework.element.BankSvcChkSumStatusModRs;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRecDt;

@RunWith(EvoSuiteRunner.class)
public class BankSvcChkSumMsgRec_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      bankSvcChkSumMsgRec_Type0.setBankSvcChkSumDelRs((BankSvcChkSumDelRs) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  BankSvcChkSumAddRs = NULL\n  BankSvcChkSumModRs = NULL\n  BankSvcChkSumStatusModRs = NULL\n  BankSvcChkSumDelRs = NULL\n}", bankSvcChkSumMsgRec_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      boolean boolean0 = bankSvcChkSumMsgRec_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      bankSvcChkSumMsgRec_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  BankSvcChkSumAddRs = NULL\n  BankSvcChkSumModRs = NULL\n  BankSvcChkSumStatusModRs = NULL\n  BankSvcChkSumDelRs = NULL\n}", bankSvcChkSumMsgRec_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      BankSvcChkSumAddRs bankSvcChkSumAddRs0 = new BankSvcChkSumAddRs();
      bankSvcChkSumMsgRec_Type0.setBankSvcChkSumAddRs(bankSvcChkSumAddRs0);
      assertEquals("org.sourceforge.ifx.framework.element.BankSvcChkSumAddRs = {\n  CustId = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  SvcRqUID = NULL\n  BankSvcChkSumInfo = NULL\n  BankSvcChkSumRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", bankSvcChkSumAddRs0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      bankSvcChkSumMsgRec_Type0.setBankSvcChkSumModRs((BankSvcChkSumModRs) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  BankSvcChkSumAddRs = NULL\n  BankSvcChkSumModRs = NULL\n  BankSvcChkSumStatusModRs = NULL\n  BankSvcChkSumDelRs = NULL\n}", bankSvcChkSumMsgRec_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      String string0 = bankSvcChkSumMsgRec_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  BankSvcChkSumAddRs = NULL\n  BankSvcChkSumModRs = NULL\n  BankSvcChkSumStatusModRs = NULL\n  BankSvcChkSumDelRs = NULL\n}", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      bankSvcChkSumMsgRec_Type0.setMsgRecDt((MsgRecDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  BankSvcChkSumAddRs = NULL\n  BankSvcChkSumModRs = NULL\n  BankSvcChkSumStatusModRs = NULL\n  BankSvcChkSumDelRs = NULL\n}", bankSvcChkSumMsgRec_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      BankSvcChkSumMsgRec_Type bankSvcChkSumMsgRec_Type0 = new BankSvcChkSumMsgRec_Type();
      bankSvcChkSumMsgRec_Type0.setBankSvcChkSumStatusModRs((BankSvcChkSumStatusModRs) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  BankSvcChkSumAddRs = NULL\n  BankSvcChkSumModRs = NULL\n  BankSvcChkSumStatusModRs = NULL\n  BankSvcChkSumDelRs = NULL\n}", bankSvcChkSumMsgRec_Type0.toString());
  }
}
