/*
 * This file was automatically generated by EvoSuite
 */

package com.mentorgen.tools.profile.instrument.clfilter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.mentorgen.tools.profile.instrument.clfilter.CustomMultiClassLoaderFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CustomMultiClassLoaderFilterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustomMultiClassLoaderFilter customMultiClassLoaderFilter0 = new CustomMultiClassLoaderFilter();
      boolean boolean0 = customMultiClassLoaderFilter0.canFilter();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustomMultiClassLoaderFilter customMultiClassLoaderFilter0 = new CustomMultiClassLoaderFilter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = customMultiClassLoaderFilter0.accept(classLoader0);
      assertEquals(false, boolean0);
  }
}
