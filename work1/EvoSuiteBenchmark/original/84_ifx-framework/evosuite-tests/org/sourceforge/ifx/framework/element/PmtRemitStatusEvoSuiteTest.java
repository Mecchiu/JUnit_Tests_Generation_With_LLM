/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.PmtRemitStatus;

@RunWith(EvoSuiteRunner.class)
public class PmtRemitStatusEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtRemitStatus pmtRemitStatus0 = new PmtRemitStatus();
      pmtRemitStatus0.equals((Object) "org.sourceforge.ifx.framework.element.PmtRemitStatus = {\n  PmtRemitStatusCode = NULL\n  StatusDesc = NULL\n  EffDt = NULL\n  StatusModBy = NULL\n  Memo = NULL\n}");
  }
}
