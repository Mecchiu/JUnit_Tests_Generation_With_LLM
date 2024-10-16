/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRecDt;
import org.sourceforge.ifx.framework.element.PmtEnclAddRs;
import org.sourceforge.ifx.framework.element.PmtEnclCanRs;
import org.sourceforge.ifx.framework.element.PmtEnclModRs;
import org.sourceforge.ifx.framework.element.PmtEnclRevRs;

@RunWith(EvoSuiteRunner.class)
public class PmtEnclMsgRec_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      String string0 = pmtEnclMsgRec_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  PmtEnclAddRs = NULL\n  PmtEnclModRs = NULL\n  PmtEnclCanRs = NULL\n  PmtEnclRevRs = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      pmtEnclMsgRec_Type0.setPmtEnclRevRs((PmtEnclRevRs) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  PmtEnclAddRs = NULL\n  PmtEnclModRs = NULL\n  PmtEnclCanRs = NULL\n  PmtEnclRevRs = NULL\n}", pmtEnclMsgRec_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      PmtEnclCanRs pmtEnclCanRs0 = pmtEnclMsgRec_Type0.getPmtEnclCanRs();
      pmtEnclMsgRec_Type0.setPmtEnclCanRs(pmtEnclCanRs0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  PmtEnclAddRs = NULL\n  PmtEnclModRs = NULL\n  PmtEnclCanRs = NULL\n  PmtEnclRevRs = NULL\n}", pmtEnclMsgRec_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      pmtEnclMsgRec_Type0.setPmtEnclAddRs((PmtEnclAddRs) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  PmtEnclAddRs = NULL\n  PmtEnclModRs = NULL\n  PmtEnclCanRs = NULL\n  PmtEnclRevRs = NULL\n}", pmtEnclMsgRec_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      pmtEnclMsgRec_Type0.setMsgRecDt((MsgRecDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  PmtEnclAddRs = NULL\n  PmtEnclModRs = NULL\n  PmtEnclCanRs = NULL\n  PmtEnclRevRs = NULL\n}", pmtEnclMsgRec_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      boolean boolean0 = pmtEnclMsgRec_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      pmtEnclMsgRec_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtEnclMsgRec_Type = {\n  CustId = NULL\n  MsgRecDt = NULL\n  PmtEnclAddRs = NULL\n  PmtEnclModRs = NULL\n  PmtEnclCanRs = NULL\n  PmtEnclRevRs = NULL\n}", pmtEnclMsgRec_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      PmtEnclMsgRec_Type pmtEnclMsgRec_Type0 = new PmtEnclMsgRec_Type();
      PmtEnclModRs pmtEnclModRs0 = new PmtEnclModRs();
      pmtEnclMsgRec_Type0.setPmtEnclModRs(pmtEnclModRs0);
      assertEquals("org.sourceforge.ifx.framework.element.PmtEnclModRs = {\n  CustId = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  PmtEnclInfo = NULL\n  PmtEnclRec = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n  PmtEnclId = NULL\n}", pmtEnclModRs0.toString());
  }
}
