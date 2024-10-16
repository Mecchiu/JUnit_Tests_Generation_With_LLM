/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.ForExDealStatus_Type;
import org.sourceforge.ifx.framework.element.EffDt;
import org.sourceforge.ifx.framework.element.ForExDealStatusCode;
import org.sourceforge.ifx.framework.element.StatusDesc;
import org.sourceforge.ifx.framework.element.StatusModBy;

@RunWith(EvoSuiteRunner.class)
public class ForExDealStatus_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ForExDealStatus_Type forExDealStatus_Type0 = new ForExDealStatus_Type();
      forExDealStatus_Type0.setStatusDesc((StatusDesc) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealStatus_Type = {\n  ForExDealStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n}", forExDealStatus_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ForExDealStatus_Type forExDealStatus_Type0 = new ForExDealStatus_Type();
      boolean boolean0 = forExDealStatus_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ForExDealStatus_Type forExDealStatus_Type0 = new ForExDealStatus_Type();
      StatusModBy statusModBy0 = forExDealStatus_Type0.getStatusModBy();
      forExDealStatus_Type0.setStatusModBy(statusModBy0);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealStatus_Type = {\n  ForExDealStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n}", forExDealStatus_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      ForExDealStatus_Type forExDealStatus_Type0 = new ForExDealStatus_Type();
      forExDealStatus_Type0.setEffDt((EffDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealStatus_Type = {\n  ForExDealStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n}", forExDealStatus_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ForExDealStatus_Type forExDealStatus_Type0 = new ForExDealStatus_Type();
      String string0 = forExDealStatus_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.ForExDealStatus_Type = {\n  ForExDealStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n}", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      ForExDealStatus_Type forExDealStatus_Type0 = new ForExDealStatus_Type();
      ForExDealStatusCode forExDealStatusCode0 = new ForExDealStatusCode();
      forExDealStatus_Type0.setForExDealStatusCode(forExDealStatusCode0);
      assertEquals("org.sourceforge.ifx.framework.element.ForExDealStatusCode = {\n  String = NULL\n}", forExDealStatusCode0.toString());
  }
}
