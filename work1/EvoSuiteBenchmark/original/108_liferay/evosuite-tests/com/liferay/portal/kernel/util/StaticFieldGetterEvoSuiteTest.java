/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.StaticFieldGetter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StaticFieldGetterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StaticFieldGetter staticFieldGetter0 = StaticFieldGetter.getInstance();
      Object object0 = staticFieldGetter0.getFieldValue("~Gu", "~Gu");
      assertNull(object0);
  }
}
