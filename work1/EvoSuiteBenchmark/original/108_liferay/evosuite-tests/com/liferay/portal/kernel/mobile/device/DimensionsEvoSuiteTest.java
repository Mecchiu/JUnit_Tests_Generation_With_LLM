/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.mobile.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.mobile.device.Dimensions;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DimensionsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Dimensions dimensions0 = new Dimensions((-500.38235F), (-500.38235F));
      float float0 = dimensions0.getWidth();
      assertEquals((-500.38235F), float0, 0.01F);
      assertEquals((-500.38235F), dimensions0.getHeight(), 0.01F);
  }

  @Test
  public void test1()  throws Throwable  {
      Dimensions dimensions0 = new Dimensions((-500.38235F), (-500.38235F));
      String string0 = dimensions0.toString();
      assertNotNull(string0);
      assertEquals("{height=-500.38235, width=-500.38235}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Dimensions dimensions0 = new Dimensions((-500.38235F), (-500.38235F));
      float float0 = dimensions0.getHeight();
      assertEquals((-500.38235F), float0, 0.01F);
      assertEquals((-500.38235F), dimensions0.getWidth(), 0.01F);
  }
}
