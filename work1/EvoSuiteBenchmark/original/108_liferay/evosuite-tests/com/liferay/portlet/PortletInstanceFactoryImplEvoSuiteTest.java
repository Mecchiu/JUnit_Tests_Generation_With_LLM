/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.Portlet;
import com.liferay.portlet.InvokerPortletFactory;
import com.liferay.portlet.MonitoringPortletFactoryImpl;
import com.liferay.portlet.PortletInstanceFactoryImpl;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import org.junit.BeforeClass;
import org.portletbridge.portlet.BridgeViewPortlet;

@RunWith(EvoSuiteRunner.class)
public class PortletInstanceFactoryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortletInstanceFactoryImpl portletInstanceFactoryImpl0 = new PortletInstanceFactoryImpl();
      // Undeclared exception!
      try {
        portletInstanceFactoryImpl0.destroy((Portlet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PortletInstanceFactoryImpl portletInstanceFactoryImpl0 = new PortletInstanceFactoryImpl();
      BridgeViewPortlet bridgeViewPortlet0 = null;
      try {
        bridgeViewPortlet0 = new BridgeViewPortlet();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.portletbridge.portlet.BridgeViewPortlet
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PortletInstanceFactoryImpl portletInstanceFactoryImpl0 = new PortletInstanceFactoryImpl();
      MonitoringPortletFactoryImpl monitoringPortletFactoryImpl0 = new MonitoringPortletFactoryImpl();
      portletInstanceFactoryImpl0.setInvokerPortletFactory((InvokerPortletFactory) monitoringPortletFactoryImpl0);
  }

  @Test
  public void test3()  throws Throwable  {
      PortletInstanceFactoryImpl portletInstanceFactoryImpl0 = new PortletInstanceFactoryImpl();
      portletInstanceFactoryImpl0.destroy();
  }
}
