/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.RemitSyncRs;

@RunWith(EvoSuiteRunner.class)
public class RemitSyncRsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RemitSyncRs remitSyncRs0 = new RemitSyncRs();
      remitSyncRs0.equals((Object) "org.sourceforge.ifx.framework.element.InvoiceAdj = {\n  Desc = NULL\n  EffDt = NULL\n  CurAmt = NULL\n  InvoiceAdjNum = NULL\n  AdjType = NULL\n}");
  }
}
