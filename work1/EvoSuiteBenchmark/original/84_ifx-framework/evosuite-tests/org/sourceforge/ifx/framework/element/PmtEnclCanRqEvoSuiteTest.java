/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.PmtEnclCanRq;

@RunWith(EvoSuiteRunner.class)
public class PmtEnclCanRqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtEnclCanRq pmtEnclCanRq0 = new PmtEnclCanRq();
      pmtEnclCanRq0.equals((Object) "org.sourceforge.ifx.framework.element.MacValue = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
  }
}
