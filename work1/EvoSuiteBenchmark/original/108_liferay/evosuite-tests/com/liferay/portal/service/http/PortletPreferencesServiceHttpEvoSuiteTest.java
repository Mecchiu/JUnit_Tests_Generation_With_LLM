/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.http.PortletPreferencesServiceHttp;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortletPreferencesServiceHttpEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortletPreferencesServiceHttp portletPreferencesServiceHttp0 = new PortletPreferencesServiceHttp();
      assertNotNull(portletPreferencesServiceHttp0);
  }
}
