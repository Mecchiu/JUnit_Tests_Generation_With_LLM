/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.net.natpmp.upnp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.net.natpmp.NatPMPDevice;
import com.aelitis.net.natpmp.upnp.NatPMPUPnPFactory;
import com.aelitis.net.upnp.UPnP;
import com.aelitis.net.upnp.UPnPException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NatPMPUPnPFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NatPMPUPnPFactory.create((UPnP) null, (NatPMPDevice) null);
  }

  @Test
  public void test1()  throws Throwable  {
      NatPMPUPnPFactory natPMPUPnPFactory0 = new NatPMPUPnPFactory();
  }
}
