/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.gds.impl.jni;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.firebirdsql.gds.impl.jni.DynamicLibraryLoader;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DynamicLibraryLoaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DynamicLibraryLoader dynamicLibraryLoader0 = new DynamicLibraryLoader();
      assertNotNull(dynamicLibraryLoader0);
  }

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = DynamicLibraryLoader.loadLibraryFromClassPath("_e^\b");
      assertEquals(false, boolean0);
  }
}
