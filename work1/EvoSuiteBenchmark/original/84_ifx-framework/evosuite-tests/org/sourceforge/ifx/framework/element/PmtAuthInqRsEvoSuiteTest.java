/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.PmtAuthInqRs;

@RunWith(EvoSuiteRunner.class)
public class PmtAuthInqRsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtAuthInqRs pmtAuthInqRs0 = new PmtAuthInqRs();
      pmtAuthInqRs0.equals((Object) "org.sourceforge.ifx.framework.element.CVMList = {\n  AmtX = NULL\n  AmtY = NULL\n  CVMRule = NULL\n}");
  }
}
