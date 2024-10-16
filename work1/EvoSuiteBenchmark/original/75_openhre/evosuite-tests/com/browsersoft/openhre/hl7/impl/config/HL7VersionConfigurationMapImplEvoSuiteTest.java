/*
 * This file was automatically generated by EvoSuite
 */

package com.browsersoft.openhre.hl7.impl.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.browsersoft.openhre.hl7.api.config.HL7Configuration;
import com.browsersoft.openhre.hl7.impl.config.HL7VersionConfigurationMapImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HL7VersionConfigurationMapImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HL7VersionConfigurationMapImpl hL7VersionConfigurationMapImpl0 = new HL7VersionConfigurationMapImpl();
      hL7VersionConfigurationMapImpl0.addConfiguration("", (HL7Configuration) null);
      hL7VersionConfigurationMapImpl0.getConfigurationsKeys();
      assertEquals(1, hL7VersionConfigurationMapImpl0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      HL7VersionConfigurationMapImpl hL7VersionConfigurationMapImpl0 = new HL7VersionConfigurationMapImpl();
      int int0 = hL7VersionConfigurationMapImpl0.size();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      HL7VersionConfigurationMapImpl hL7VersionConfigurationMapImpl0 = new HL7VersionConfigurationMapImpl();
      hL7VersionConfigurationMapImpl0.clearAll();
      assertEquals(0, hL7VersionConfigurationMapImpl0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      HL7VersionConfigurationMapImpl hL7VersionConfigurationMapImpl0 = new HL7VersionConfigurationMapImpl();
      String[] stringArray0 = hL7VersionConfigurationMapImpl0.getConfigurationsKeys();
      assertNotNull(stringArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      HL7VersionConfigurationMapImpl hL7VersionConfigurationMapImpl0 = new HL7VersionConfigurationMapImpl();
      HL7Configuration hL7Configuration0 = hL7VersionConfigurationMapImpl0.getSuitableConfiguration("");
      assertNull(hL7Configuration0);
  }

  @Test
  public void test5()  throws Throwable  {
      HL7VersionConfigurationMapImpl hL7VersionConfigurationMapImpl0 = new HL7VersionConfigurationMapImpl();
      hL7VersionConfigurationMapImpl0.addConfiguration("", (HL7Configuration) null);
      hL7VersionConfigurationMapImpl0.getSuitableConfiguration("");
      assertEquals(1, hL7VersionConfigurationMapImpl0.size());
  }
}
