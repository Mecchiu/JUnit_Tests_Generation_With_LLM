/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.InvoiceAdj_Type;
import org.sourceforge.ifx.framework.element.AdjType;
import org.sourceforge.ifx.framework.element.CurAmt;
import org.sourceforge.ifx.framework.element.Desc;
import org.sourceforge.ifx.framework.element.EffDt;
import org.sourceforge.ifx.framework.element.InvoiceAdjNum;

@RunWith(EvoSuiteRunner.class)
public class InvoiceAdj_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      boolean boolean0 = invoiceAdj_Type0.equals((Object) "org.sourceforge.ifx.framework.element.CurAmt = {\n  Amt = NULL\n  CurCode = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      String string0 = invoiceAdj_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.InvoiceAdj_Type = {\n  Desc = NULL\n  InvoiceAdjNum = NULL\n  AdjType = NULL\n  CurAmt = NULL\n  EffDt = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      invoiceAdj_Type0.setInvoiceAdjNum((InvoiceAdjNum) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.InvoiceAdj_Type = {\n  Desc = NULL\n  InvoiceAdjNum = NULL\n  AdjType = NULL\n  CurAmt = NULL\n  EffDt = NULL\n}", invoiceAdj_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      invoiceAdj_Type0.setDesc((Desc) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.InvoiceAdj_Type = {\n  Desc = NULL\n  InvoiceAdjNum = NULL\n  AdjType = NULL\n  CurAmt = NULL\n  EffDt = NULL\n}", invoiceAdj_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      CurAmt curAmt0 = new CurAmt();
      invoiceAdj_Type0.setCurAmt(curAmt0);
      assertEquals("org.sourceforge.ifx.framework.complextype.InvoiceAdj_Type = {\n  Desc = NULL\n  InvoiceAdjNum = NULL\n  AdjType = NULL\n  CurAmt = org.sourceforge.ifx.framework.element.CurAmt = {\n    Amt = NULL\n    CurCode = NULL\n    CurRate = NULL\n    CurConvertRule = NULL\n  }\n  EffDt = NULL\n}", invoiceAdj_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      invoiceAdj_Type0.setEffDt((EffDt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.InvoiceAdj_Type = {\n  Desc = NULL\n  InvoiceAdjNum = NULL\n  AdjType = NULL\n  CurAmt = NULL\n  EffDt = NULL\n}", invoiceAdj_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      InvoiceAdj_Type invoiceAdj_Type0 = new InvoiceAdj_Type();
      AdjType adjType0 = new AdjType();
      invoiceAdj_Type0.setAdjType(adjType0);
      assertEquals("org.sourceforge.ifx.framework.element.AdjType = {\n  String = NULL\n}", adjType0.toString());
  }
}
