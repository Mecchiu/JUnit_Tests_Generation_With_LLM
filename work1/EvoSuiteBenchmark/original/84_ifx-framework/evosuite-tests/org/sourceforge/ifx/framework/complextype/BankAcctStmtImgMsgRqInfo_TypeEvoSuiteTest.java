/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankAcctStmtImgMsgRqInfo_Type;
import org.sourceforge.ifx.framework.element.BankAcctStmtImgInqRq;

@RunWith(EvoSuiteRunner.class)
public class BankAcctStmtImgMsgRqInfo_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankAcctStmtImgMsgRqInfo_Type bankAcctStmtImgMsgRqInfo_Type0 = new BankAcctStmtImgMsgRqInfo_Type();
      bankAcctStmtImgMsgRqInfo_Type0.setBankAcctStmtImgInqRq((BankAcctStmtImgInqRq) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankAcctStmtImgMsgRqInfo_Type = {\n  BankAcctStmtImgInqRq = NULL\n}", bankAcctStmtImgMsgRqInfo_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      BankAcctStmtImgMsgRqInfo_Type bankAcctStmtImgMsgRqInfo_Type0 = new BankAcctStmtImgMsgRqInfo_Type();
      String string0 = bankAcctStmtImgMsgRqInfo_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BankAcctStmtImgMsgRqInfo_Type = {\n  BankAcctStmtImgInqRq = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      BankAcctStmtImgMsgRqInfo_Type bankAcctStmtImgMsgRqInfo_Type0 = new BankAcctStmtImgMsgRqInfo_Type();
      boolean boolean0 = bankAcctStmtImgMsgRqInfo_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }
}
