/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.DevPlatformData;

@RunWith(EvoSuiteRunner.class)
public class DevPlatformDataEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DevPlatformData devPlatformData0 = new DevPlatformData();
      devPlatformData0.equals((Object) "org.sourceforge.ifx.framework.element.DevPlatformData = {\n  DevPlatformSource = NULL\n  DevPlatformXfs = NULL\n}");
  }
}
