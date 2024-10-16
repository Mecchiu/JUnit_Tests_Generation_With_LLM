/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.webserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.webserver.WebServerServletToken;
import com.liferay.portal.webserver.WebServerServletTokenImpl;
import com.liferay.portal.webserver.WebServerServletTokenUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WebServerServletTokenUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        WebServerServletTokenUtil.getToken((-1216L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        WebServerServletTokenUtil.resetToken(1922L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      WebServerServletTokenImpl webServerServletTokenImpl0 = (WebServerServletTokenImpl)WebServerServletTokenUtil.getWebServerServletToken();
      WebServerServletTokenUtil webServerServletTokenUtil0 = new WebServerServletTokenUtil();
      webServerServletTokenUtil0.setWebServerServletToken((WebServerServletToken) webServerServletTokenImpl0);
  }
}
