/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.xml.QName;
import com.liferay.portal.model.EventDefinition;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.model.PortletApp;
import com.liferay.portal.model.PortletFilter;
import com.liferay.portal.model.PortletURLListener;
import com.liferay.portal.model.PublicRenderParameter;
import com.liferay.portal.model.SpriteImage;
import com.liferay.portal.model.impl.EventDefinitionImpl;
import com.liferay.portal.model.impl.PortletAppImpl;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortletAppImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("$");
      Set<PortletFilter> set0 = portletAppImpl0.getPortletFilters();
      assertEquals(true, set0.isEmpty());
  }

  @Test
  public void test1()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("D");
      portletAppImpl0.addPublicRenderParameter("D", (QName) null);
      assertEquals(true, portletAppImpl0.isWARFile());
  }

  @Test
  public void test2()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("jt");
      Set<String> set0 = portletAppImpl0.getUserAttributes();
      portletAppImpl0.addServletURLPatterns(set0);
      assertEquals("", portletAppImpl0.getDefaultNamespace());
  }

  @Test
  public void test3()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("T");
      // Undeclared exception!
      try {
        portletAppImpl0.addPortletURLListener((PortletURLListener) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("Uey+55.~v!Bwf");
      String string0 = portletAppImpl0.getServletContextName();
      assertEquals("Uey+55.~v!Bwf", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("AvV0 ;qyzIxQ)p/aI.");
      Set<PortletURLListener> set0 = portletAppImpl0.getPortletURLListeners();
      assertEquals(0, set0.size());
  }

  @Test
  public void test6()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("$");
      PublicRenderParameter publicRenderParameter0 = portletAppImpl0.getPublicRenderParameter("$");
      assertNull(publicRenderParameter0);
  }

  @Test
  public void test7()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("$");
      PortletURLListener portletURLListener0 = portletAppImpl0.getPortletURLListener("$");
      assertNull(portletURLListener0);
  }

  @Test
  public void test8()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("i");
      // Undeclared exception!
      try {
        portletAppImpl0.addPortletFilter((PortletFilter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("Uey+55.~v!Bwf");
      String string0 = portletAppImpl0.getDefaultNamespace();
      assertEquals("", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("T");
      List<Portlet> list0 = portletAppImpl0.getPortlets();
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test11()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("");
      Map<String, String[]> map0 = portletAppImpl0.getContainerRuntimeOptions();
      assertEquals(true, map0.isEmpty());
  }

  @Test
  public void test12()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("Uey+55.~v!Bwf");
      Map<String, String> map0 = portletAppImpl0.getCustomUserAttributes();
      assertEquals(0, map0.size());
  }

  @Test
  public void test13()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("AvV0 ;qyzIxQ)p/aI.");
      portletAppImpl0.addPortlet((Portlet) null);
      assertEquals("AvV0 ;qyzIxQ)p/aI.", portletAppImpl0.getServletContextName());
  }

  @Test
  public void test14()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("");
      portletAppImpl0.setWARFile(false);
      assertEquals(false, portletAppImpl0.isWARFile());
  }

  @Test
  public void test15()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("i");
      PortletFilter portletFilter0 = portletAppImpl0.getPortletFilter("/i");
      assertNull(portletFilter0);
  }

  @Test
  public void test16()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("i");
      String string0 = portletAppImpl0.getContextPath();
      assertEquals("/i", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("Uey+55.~v!Bwf");
      SpriteImage spriteImage0 = portletAppImpl0.getSpriteImage("Uey+55.~v!Bwf");
      assertNull(spriteImage0);
  }

  @Test
  public void test18()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("D");
      EventDefinitionImpl eventDefinitionImpl0 = new EventDefinitionImpl((QName) null, "D", (PortletApp) portletAppImpl0);
      portletAppImpl0.addEventDefinition((EventDefinition) eventDefinitionImpl0);
      assertEquals("D", portletAppImpl0.getServletContextName());
  }

  @Test
  public void test19()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("jt");
      boolean boolean0 = portletAppImpl0.isWARFile();
      assertEquals(true, boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("jt");
      Set<String> set0 = portletAppImpl0.getServletURLPatterns();
      assertEquals(true, set0.isEmpty());
  }

  @Test
  public void test21()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("i");
      portletAppImpl0.setDefaultNamespace("i");
      assertEquals("/i", portletAppImpl0.getContextPath());
  }

  @Test
  public void test22()  throws Throwable  {
      PortletAppImpl portletAppImpl0 = new PortletAppImpl("");
      Properties properties0 = new Properties();
      portletAppImpl0.setSpriteImages("", properties0);
      assertEquals("", portletAppImpl0.getDefaultNamespace());
  }
}
