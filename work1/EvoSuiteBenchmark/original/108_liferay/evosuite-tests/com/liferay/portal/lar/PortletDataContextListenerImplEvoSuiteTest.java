/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.lar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.lar.PortletDataContextListenerImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortletDataContextListenerImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortletDataContextListenerImpl portletDataContextListenerImpl0 = new PortletDataContextListenerImpl((PortletDataContext) null);
      portletDataContextListenerImpl0.onAddZipEntry("u-");
  }

  @Test
  public void test1()  throws Throwable  {
      PortletDataContextListenerImpl portletDataContextListenerImpl0 = new PortletDataContextListenerImpl((PortletDataContext) null);
      portletDataContextListenerImpl0.onGetZipEntry("u-");
  }
}
