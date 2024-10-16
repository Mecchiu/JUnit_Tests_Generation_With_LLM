/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.networkmanager.LimitedRateGroup;
import com.aelitis.azureus.core.networkmanager.impl.TransferProcessor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TransferProcessorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TransferProcessor transferProcessor0 = null;
      try {
        transferProcessor0 = new TransferProcessor((-1), (LimitedRateGroup) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
