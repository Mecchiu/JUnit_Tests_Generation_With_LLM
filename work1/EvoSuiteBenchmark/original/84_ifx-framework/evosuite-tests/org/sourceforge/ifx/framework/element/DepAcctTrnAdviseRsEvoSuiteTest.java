/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.DepAcctTrnAdviseRs;

@RunWith(EvoSuiteRunner.class)
public class DepAcctTrnAdviseRsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DepAcctTrnAdviseRs depAcctTrnAdviseRs0 = new DepAcctTrnAdviseRs();
      depAcctTrnAdviseRs0.equals((Object) "org.sourceforge.ifx.framework.element.PhoneType = {\n  String = NULL\n}");
  }
}
