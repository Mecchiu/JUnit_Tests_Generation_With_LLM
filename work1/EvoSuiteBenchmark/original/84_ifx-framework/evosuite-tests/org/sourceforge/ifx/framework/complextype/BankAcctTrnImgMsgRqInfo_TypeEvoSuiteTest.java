/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankAcctTrnImgMsgRqInfo_Type;
import org.sourceforge.ifx.framework.element.BankAcctTrnImgInqRq;

@RunWith(EvoSuiteRunner.class)
public class BankAcctTrnImgMsgRqInfo_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankAcctTrnImgMsgRqInfo_Type bankAcctTrnImgMsgRqInfo_Type0 = new BankAcctTrnImgMsgRqInfo_Type();
      BankAcctTrnImgInqRq bankAcctTrnImgInqRq0 = bankAcctTrnImgMsgRqInfo_Type0.getBankAcctTrnImgInqRq();
      assertNull(bankAcctTrnImgInqRq0);
  }

  @Test
  public void test1()  throws Throwable  {
      BankAcctTrnImgMsgRqInfo_Type bankAcctTrnImgMsgRqInfo_Type0 = new BankAcctTrnImgMsgRqInfo_Type();
      bankAcctTrnImgMsgRqInfo_Type0.setBankAcctTrnImgInqRq((BankAcctTrnImgInqRq) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankAcctTrnImgMsgRqInfo_Type = {\n  BankAcctTrnImgInqRq = NULL\n}", bankAcctTrnImgMsgRqInfo_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BankAcctTrnImgMsgRqInfo_Type bankAcctTrnImgMsgRqInfo_Type0 = new BankAcctTrnImgMsgRqInfo_Type();
      boolean boolean0 = bankAcctTrnImgMsgRqInfo_Type0.equals((Object) "org.sourceforge.ifx.framework.element.AcctKey = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }
}
