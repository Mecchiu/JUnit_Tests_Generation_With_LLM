/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.ForExDealSyncRs;

@RunWith(EvoSuiteRunner.class)
public class ForExDealSyncRsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ForExDealSyncRs forExDealSyncRs0 = new ForExDealSyncRs();
      forExDealSyncRs0.equals((Object) "org.sourceforge.ifx.framework.element.AmtX = {\n  CurCode = NULL\n  Amt = NULL\n  CurRate = NULL\n  CurConvertRule = NULL\n}");
  }
}
