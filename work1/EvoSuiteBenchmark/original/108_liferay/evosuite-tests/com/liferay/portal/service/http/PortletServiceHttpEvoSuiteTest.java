/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.PortletServiceHttp;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortletServiceHttpEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        PortletServiceHttp.getWARPortlets((HttpPrincipal) null);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.service.http.TunnelUtil
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PortletServiceHttp portletServiceHttp0 = new PortletServiceHttp();
      assertNotNull(portletServiceHttp0);
  }
}
