/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.DepAppModRq;

@RunWith(EvoSuiteRunner.class)
public class DepAppModRqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DepAppModRq depAppModRq0 = new DepAppModRq();
      depAppModRq0.equals((Object) "org.sourceforge.ifx.framework.element.IssAppData = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
  }
}
