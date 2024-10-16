/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jiprof.instrument.clfilter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jiprof.instrument.clfilter.JBossServletClassLoaderFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JBossServletClassLoaderFilterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JBossServletClassLoaderFilter jBossServletClassLoaderFilter0 = new JBossServletClassLoaderFilter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = jBossServletClassLoaderFilter0.accept(classLoader0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      JBossServletClassLoaderFilter jBossServletClassLoaderFilter0 = new JBossServletClassLoaderFilter();
      boolean boolean0 = jBossServletClassLoaderFilter0.canFilter();
      assertEquals(true, boolean0);
  }
}
