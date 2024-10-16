/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BankSvcChkSum_Type;
import org.sourceforge.ifx.framework.element.BankSvcChkSumType;
import org.sourceforge.ifx.framework.element.BankSvcChkSumValue;

@RunWith(EvoSuiteRunner.class)
public class BankSvcChkSum_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BankSvcChkSum_Type bankSvcChkSum_Type0 = new BankSvcChkSum_Type();
      String string0 = bankSvcChkSum_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSum_Type = {\n  BankSvcChkSumType = NULL\n  BankSvcChkSumValue = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      BankSvcChkSum_Type bankSvcChkSum_Type0 = new BankSvcChkSum_Type();
      BankSvcChkSumValue bankSvcChkSumValue0 = new BankSvcChkSumValue();
      bankSvcChkSum_Type0.setBankSvcChkSumValue(bankSvcChkSumValue0);
      assertEquals("org.sourceforge.ifx.framework.element.BankSvcChkSumValue = {\n  String = Exception! java.lang.reflect.InvocationTargetException\n}", bankSvcChkSumValue0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BankSvcChkSum_Type bankSvcChkSum_Type0 = new BankSvcChkSum_Type();
      bankSvcChkSum_Type0.setBankSvcChkSumType((BankSvcChkSumType) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BankSvcChkSum_Type = {\n  BankSvcChkSumType = NULL\n  BankSvcChkSumValue = NULL\n}", bankSvcChkSum_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      BankSvcChkSum_Type bankSvcChkSum_Type0 = new BankSvcChkSum_Type();
      boolean boolean0 = bankSvcChkSum_Type0.equals((Object) "org.sourceforge.ifx.framework.element.BankSvcChkSumValue = {\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
      assertEquals(false, boolean0);
  }
}
