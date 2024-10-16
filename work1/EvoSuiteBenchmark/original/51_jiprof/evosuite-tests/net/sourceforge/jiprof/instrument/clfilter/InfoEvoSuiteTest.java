/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jiprof.instrument.clfilter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jiprof.instrument.clfilter.Info;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Info info0 = new Info();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = info0.accept(classLoader0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Info info0 = new Info();
      boolean boolean0 = info0.canFilter();
      assertEquals(false, boolean0);
  }
}
