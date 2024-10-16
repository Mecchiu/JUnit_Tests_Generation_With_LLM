/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankSvcChkSumStatus_Type;
import org.sourceforge.ifx.framework.element.BankSvcChkSumStatusCode;
import org.sourceforge.ifx.framework.element.EffDt;
import org.sourceforge.ifx.framework.element.Memo;
import org.sourceforge.ifx.framework.element.StatusDesc;
import org.sourceforge.ifx.framework.element.StatusModBy;

@RunWith(EvoSuiteRunner.class)
public class BankSvcChkSumStatus_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      boolean boolean0 = bankSvcChkSumStatus_Type0.equals((Object) "org.sourceforge.ifx.framework.element.Memo = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      BankSvcChkSumStatusCode bankSvcChkSumStatusCode0 = new BankSvcChkSumStatusCode();
      bankSvcChkSumStatus_Type0.setBankSvcChkSumStatusCode(bankSvcChkSumStatusCode0);
      assertEquals("org.sourceforge.ifx.framework.element.BankSvcChkSumStatusCode = {\n  String = NULL\n}", bankSvcChkSumStatusCode0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      String string0 = bankSvcChkSumStatus_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumStatus_Type = {\n  BankSvcChkSumStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      EffDt effDt0 = new EffDt();
      bankSvcChkSumStatus_Type0.setEffDt(effDt0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumStatus_Type = {\n  BankSvcChkSumStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = null\n  StatusModBy = NULL\n  Memo = NULL\n}", bankSvcChkSumStatus_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      bankSvcChkSumStatus_Type0.setMemo((Memo) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumStatus_Type = {\n  BankSvcChkSumStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", bankSvcChkSumStatus_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      bankSvcChkSumStatus_Type0.setStatusModBy((StatusModBy) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSumStatus_Type = {\n  BankSvcChkSumStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}", bankSvcChkSumStatus_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      BankSvcChkSumStatus_Type bankSvcChkSumStatus_Type0 = new BankSvcChkSumStatus_Type();
      StatusDesc statusDesc0 = new StatusDesc();
      bankSvcChkSumStatus_Type0.setStatusDesc(statusDesc0);
      assertEquals("org.sourceforge.ifx.framework.element.StatusDesc = {\n  String = NULL\n}", statusDesc0.toString());
  }
}
