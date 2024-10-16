/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.net.natpmp.upnp.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.plugins.upnp.UPnPPlugin;
import com.aelitis.net.natpmp.NatPMPDevice;
import com.aelitis.net.natpmp.upnp.impl.NatPMPUPnPImpl;
import com.aelitis.net.upnp.UPnP;
import com.aelitis.net.upnp.UPnPListener;
import org.evosuite.testcase.TestCaseExecutor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NatPMPUPnPImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NatPMPUPnPImpl natPMPUPnPImpl0 = new NatPMPUPnPImpl((UPnP) null, (NatPMPDevice) null);
      natPMPUPnPImpl0.setEnabled(false);
      UPnPPlugin uPnPPlugin0 = new UPnPPlugin();
      natPMPUPnPImpl0.addListener((UPnPListener) uPnPPlugin0);
  }

  @Test
  public void test1()  throws Throwable  {
      NatPMPUPnPImpl natPMPUPnPImpl0 = new NatPMPUPnPImpl((UPnP) null, (NatPMPDevice) null);
      UPnPPlugin uPnPPlugin0 = new UPnPPlugin();
      natPMPUPnPImpl0.addListener((UPnPListener) uPnPPlugin0);
      natPMPUPnPImpl0.removeListener((UPnPListener) uPnPPlugin0);
      natPMPUPnPImpl0.addListener((UPnPListener) uPnPPlugin0);
  }

  @Test
  public void test2()  throws Throwable  {
      NatPMPUPnPImpl natPMPUPnPImpl0 = new NatPMPUPnPImpl((UPnP) null, (NatPMPDevice) null);
      boolean boolean0 = natPMPUPnPImpl0.isEnabled();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      NatPMPUPnPImpl natPMPUPnPImpl0 = new NatPMPUPnPImpl((UPnP) null, (NatPMPDevice) null);
      UPnPPlugin uPnPPlugin0 = new UPnPPlugin();
      natPMPUPnPImpl0.removeListener((UPnPListener) uPnPPlugin0);
  }

  @Test
  public void test4()  throws Throwable  {
      NatPMPUPnPImpl natPMPUPnPImpl0 = new NatPMPUPnPImpl((UPnP) null, (NatPMPDevice) null);
      UPnPPlugin uPnPPlugin0 = new UPnPPlugin();
      natPMPUPnPImpl0.addListener((UPnPListener) uPnPPlugin0);
      natPMPUPnPImpl0.addListener((UPnPListener) uPnPPlugin0);
  }
}
