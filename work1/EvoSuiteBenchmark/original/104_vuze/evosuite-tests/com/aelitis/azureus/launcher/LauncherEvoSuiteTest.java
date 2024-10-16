/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.launcher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.launcher.Launcher;
import java.net.URL;
import org.evosuite.runtime.System;
import org.gudy.azureus2.core3.util.protocol.AzURLStreamHandlerFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LauncherEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = AzURLStreamHandlerFactory.class;
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try {
        Launcher.launch((Class) class0, stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Launcher launcher0 = new Launcher();
      assertEquals(true, launcher0.isBootStrapped());
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = AzURLStreamHandlerFactory.class;
      String[] stringArray0 = new String[4];
      boolean boolean0 = Launcher.checkAndLaunch((Class) class0, stringArray0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      URL[] uRLArray0 = new URL[16];
      // Undeclared exception!
      try {
        Launcher.getComponentLoader(uRLArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
