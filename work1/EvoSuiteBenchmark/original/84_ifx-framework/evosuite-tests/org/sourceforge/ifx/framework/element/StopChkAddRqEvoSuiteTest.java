/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.StopChkAddRq;

@RunWith(EvoSuiteRunner.class)
public class StopChkAddRqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StopChkAddRq stopChkAddRq0 = new StopChkAddRq();
      stopChkAddRq0.equals((Object) "org.sourceforge.ifx.framework.element.RefId = {\n  String = NULL\n}");
  }
}
