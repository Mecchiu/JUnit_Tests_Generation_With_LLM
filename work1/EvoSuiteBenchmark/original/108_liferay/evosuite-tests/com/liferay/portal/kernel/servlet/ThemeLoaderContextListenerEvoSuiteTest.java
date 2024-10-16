/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.servlet.ThemeLoaderContextListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import org.junit.BeforeClass;
import org.tuckey.web.MockServletContext;

@RunWith(EvoSuiteRunner.class)
public class ThemeLoaderContextListenerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThemeLoaderContextListener themeLoaderContextListener0 = new ThemeLoaderContextListener();
      MockServletContext mockServletContext0 = new MockServletContext();
      ServletContextEvent servletContextEvent0 = new ServletContextEvent((ServletContext) mockServletContext0);
      themeLoaderContextListener0.contextDestroyed(servletContextEvent0);
  }

  @Test
  public void test1()  throws Throwable  {
      ThemeLoaderContextListener themeLoaderContextListener0 = new ThemeLoaderContextListener();
      themeLoaderContextListener0.contextInitialized((ServletContextEvent) null);
  }
}
