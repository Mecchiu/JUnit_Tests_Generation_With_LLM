/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.PmtInqRq;

@RunWith(EvoSuiteRunner.class)
public class PmtInqRqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtInqRq pmtInqRq0 = new PmtInqRq();
      pmtInqRq0.equals((Object) "org.sourceforge.ifx.framework.element.AppTrnCounter = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
  }
}
