/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.net.upnp.impl.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.net.upnp.impl.services.UPnPActionArgumentImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UPnPActionArgumentImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UPnPActionArgumentImpl uPnPActionArgumentImpl0 = new UPnPActionArgumentImpl("", "");
      String string0 = uPnPActionArgumentImpl0.getValue();
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      UPnPActionArgumentImpl uPnPActionArgumentImpl0 = new UPnPActionArgumentImpl("", "");
      String string0 = uPnPActionArgumentImpl0.getName();
      assertEquals("", string0);
  }
}
