/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.instancemanager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.instancemanager.impl.AZInstanceManagerImpl;
import com.aelitis.azureus.core.instancemanager.impl.AZPortClashHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AZPortClashHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AZPortClashHandler aZPortClashHandler0 = null;
      try {
        aZPortClashHandler0 = new AZPortClashHandler((AZInstanceManagerImpl) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
