/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.CreditAdviseRq;

@RunWith(EvoSuiteRunner.class)
public class CreditAdviseRqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CreditAdviseRq creditAdviseRq0 = new CreditAdviseRq();
      creditAdviseRq0.equals((Object) "org.sourceforge.ifx.framework.element.CreditAuthId = {\n  String = NULL\n}");
  }
}
