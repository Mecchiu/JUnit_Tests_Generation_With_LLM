/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager.admin.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.AzureusCore;
import com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminProtocolImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NetworkAdminProtocolImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NetworkAdminProtocolImpl networkAdminProtocolImpl0 = new NetworkAdminProtocolImpl((AzureusCore) null, 0, (-1));
      assertEquals("UDP outbound", networkAdminProtocolImpl0.getName());
      assertEquals(0, networkAdminProtocolImpl0.getType());
  }
}
