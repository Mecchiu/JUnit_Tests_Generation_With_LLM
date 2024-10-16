/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.XferRec_Type;
import org.sourceforge.ifx.framework.element.RecXferId;
import org.sourceforge.ifx.framework.element.RecXferMod;
import org.sourceforge.ifx.framework.element.XferId;
import org.sourceforge.ifx.framework.element.XferInfo;
import org.sourceforge.ifx.framework.element.XferStatus;

@RunWith(EvoSuiteRunner.class)
public class XferRec_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      RecXferId recXferId0 = xferRec_Type0.getRecXferId();
      xferRec_Type0.setRecXferId(recXferId0);
      assertEquals("org.sourceforge.ifx.framework.complextype.XferRec_Type = {\n  XferId = NULL\n  RecXferId = NULL\n  RecXferMod = NULL\n  XferInfo = NULL\n  XferStatus = NULL\n}", xferRec_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      XferStatus xferStatus0 = xferRec_Type0.getXferStatus();
      assertNull(xferStatus0);
  }

  @Test
  public void test2()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      XferId xferId0 = xferRec_Type0.getXferId();
      assertNull(xferId0);
  }

  @Test
  public void test3()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      xferRec_Type0.setXferStatus((XferStatus) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.XferRec_Type = {\n  XferId = NULL\n  RecXferId = NULL\n  RecXferMod = NULL\n  XferInfo = NULL\n  XferStatus = NULL\n}", xferRec_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      boolean boolean0 = xferRec_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      xferRec_Type0.setXferId((XferId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.XferRec_Type = {\n  XferId = NULL\n  RecXferId = NULL\n  RecXferMod = NULL\n  XferInfo = NULL\n  XferStatus = NULL\n}", xferRec_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      xferRec_Type0.setXferInfo((XferInfo) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.XferRec_Type = {\n  XferId = NULL\n  RecXferId = NULL\n  RecXferMod = NULL\n  XferInfo = NULL\n  XferStatus = NULL\n}", xferRec_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      XferInfo xferInfo0 = xferRec_Type0.getXferInfo();
      assertNull(xferInfo0);
  }

  @Test
  public void test8()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      xferRec_Type0.setRecXferMod((RecXferMod) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.XferRec_Type = {\n  XferId = NULL\n  RecXferId = NULL\n  RecXferMod = NULL\n  XferInfo = NULL\n  XferStatus = NULL\n}", xferRec_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      XferRec_Type xferRec_Type0 = new XferRec_Type();
      RecXferMod recXferMod0 = xferRec_Type0.getRecXferMod();
      assertNull(recXferMod0);
  }
}
