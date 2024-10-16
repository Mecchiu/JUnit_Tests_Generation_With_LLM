/*
 * This file was automatically generated by EvoSuite
 */

package it.pdfsam.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import it.pdfsam.exceptions.PluginLoadException;
import it.pdfsam.utils.PlugInsLoader;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PlugInsLoaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PlugInsLoader plugInsLoader0 = new PlugInsLoader("/");
      assertNotNull(plugInsLoader0);
      
      int int0 = plugInsLoader0.getPNumber();
      assertEquals(28, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      PlugInsLoader plugInsLoader0 = null;
      try {
        plugInsLoader0 = new PlugInsLoader((String) null);
        fail("Expecting exception: PluginLoadException");
      } catch(PluginLoadException e) {
        /*
         * Error getting working directory: java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PlugInsLoader plugInsLoader0 = null;
      try {
        plugInsLoader0 = new PlugInsLoader("");
        fail("Expecting exception: PluginLoadException");
      } catch(PluginLoadException e) {
        /*
         * Error getting pdfsam.jar file path
         */
      }
  }
}
