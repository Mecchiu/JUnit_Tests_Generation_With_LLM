/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.PmtEnclRevRs;

@RunWith(EvoSuiteRunner.class)
public class PmtEnclRevRsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtEnclRevRs pmtEnclRevRs0 = new PmtEnclRevRs();
      pmtEnclRevRs0.equals((Object) "org.sourceforge.ifx.framework.element.PmtEnclStatusModRq = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  PmtEnclId = NULL\n  PmtEnclStatus = NULL\n}");
  }
}
