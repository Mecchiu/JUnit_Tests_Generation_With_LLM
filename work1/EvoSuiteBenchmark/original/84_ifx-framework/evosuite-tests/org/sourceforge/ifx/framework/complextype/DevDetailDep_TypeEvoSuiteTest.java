/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DevDetailDep_Type;
import org.sourceforge.ifx.framework.element.DevDepContainer;
import org.sourceforge.ifx.framework.element.DevDepEnvelopeDispenser;
import org.sourceforge.ifx.framework.element.DevDepEnvelopeSupply;
import org.sourceforge.ifx.framework.element.DevDepNumOfDeposits;
import org.sourceforge.ifx.framework.element.DevDepOperation;
import org.sourceforge.ifx.framework.element.DevDepPrinter;
import org.sourceforge.ifx.framework.element.DevDepShutter;
import org.sourceforge.ifx.framework.element.DevDepToner;
import org.sourceforge.ifx.framework.element.DevDepTransport;
import org.sourceforge.ifx.framework.element.DevDepType;

@RunWith(EvoSuiteRunner.class)
public class DevDetailDep_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      DevDepType devDepType0 = new DevDepType();
      devDetailDep_Type0.setDevDepType(devDepType0);
      assertNull(devDepType0.getString());
  }

  @Test
  public void test1()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      String string0 = devDetailDep_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      DevDepOperation devDepOperation0 = new DevDepOperation();
      devDetailDep_Type0.setDevDepOperation(devDepOperation0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = null\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      DevDepTransport devDepTransport0 = new DevDepTransport();
      devDetailDep_Type0.setDevDepTransport(devDepTransport0);
      assertNull(devDepTransport0.getString());
  }

  @Test
  public void test4()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      devDetailDep_Type0.setDevDepNumOfDeposits((DevDepNumOfDeposits) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      devDetailDep_Type0.setDevDepContainer((DevDepContainer) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      devDetailDep_Type0.setDevDepToner((DevDepToner) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      DevDepPrinter devDepPrinter0 = new DevDepPrinter();
      devDetailDep_Type0.setDevDepPrinter(devDepPrinter0);
      assertNull(devDepPrinter0.getString());
  }

  @Test
  public void test8()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      devDetailDep_Type0.setDevDepEnvelopeDispenser((DevDepEnvelopeDispenser) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      DevDepShutter devDepShutter0 = new DevDepShutter();
      devDetailDep_Type0.setDevDepShutter(devDepShutter0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = null\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      boolean boolean0 = devDetailDep_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      DevDetailDep_Type devDetailDep_Type0 = new DevDetailDep_Type();
      devDetailDep_Type0.setDevDepEnvelopeSupply((DevDepEnvelopeSupply) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevDetailDep_Type = {\n  DevDepType = NULL\n  DevDepOperation = NULL\n  DevDepTransport = NULL\n  DevDepContainer = NULL\n  DevDepEnvelopeSupply = NULL\n  DevDepEnvelopeDispenser = NULL\n  DevDepPrinter = NULL\n  DevDepToner = NULL\n  DevDepShutter = NULL\n  DevDepNumOfDeposits = NULL\n}", devDetailDep_Type0.toString());
  }
}
