/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import java.net.URL;
import java.net.URLClassLoader;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ResourceURLContentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ResourceURLContent resourceURLContent0 = new ResourceURLContent((URL) null, true);
      assertEquals(true, resourceURLContent0.isMultiPartResource());
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = ResourceURLContent.class;
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(class0, "");
      assertNotNull(resourceURLContent0);
      
      boolean boolean0 = resourceURLContent0.isMultiPartResource();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = ResourceURLContent.class;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "@`");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unknown resource @`
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = ResourceURLContent.class;
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(class0, "");
      URL uRL0 = resourceURLContent0.getURL();
      URL[] uRLArray0 = new URL[10];
      uRLArray0[0] = uRL0;
      URLClassLoader uRLClassLoader0 = new URLClassLoader(uRLArray0);
      ResourceURLContent resourceURLContent1 = new ResourceURLContent((ClassLoader) uRLClassLoader0, "");
      assertEquals(true, resourceURLContent1.isJAREntry());
  }

  @Test
  public void test4()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(classLoader0, " >~#ljyP");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unknown resource  >~#ljyP
         */
      }
  }
}
