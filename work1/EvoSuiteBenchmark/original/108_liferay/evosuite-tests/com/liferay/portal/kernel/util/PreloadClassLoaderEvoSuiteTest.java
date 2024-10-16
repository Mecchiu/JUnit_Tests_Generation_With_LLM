/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.PreloadClassLoader;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PreloadClassLoaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      HashMap<String, Class<?>> hashMap0 = new HashMap<String, Class<?>>();
      PreloadClassLoader preloadClassLoader0 = new PreloadClassLoader(classLoader0, (Map<String, Class<?>>) hashMap0);
      try {
        preloadClassLoader0.loadClass("%h/1WMs-F2iCM;ama");
        fail("Expecting exception: ClassNotFoundException");
      } catch(ClassNotFoundException e) {
        /*
         * %h/1WMs-F2iCM;ama
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      HashMap<String, Class<?>> hashMap0 = new HashMap<String, Class<?>>();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = PreloadClassLoader.class;
      hashMap0.put("jCIFS", class0);
      PreloadClassLoader preloadClassLoader0 = new PreloadClassLoader(classLoader0, (Map<String, Class<?>>) hashMap0);
      Class<?> class1 = preloadClassLoader0.loadClass("jCIFS");
      assertEquals(false, class1.isSynthetic());
  }
}
