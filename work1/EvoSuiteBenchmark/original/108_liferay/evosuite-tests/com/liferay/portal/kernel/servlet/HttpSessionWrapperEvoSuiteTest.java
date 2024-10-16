/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.servlet.HttpSessionWrapper;
import com.liferay.portlet.PortletRequestImpl;
import com.liferay.portlet.PortletServletSession;
import com.liferay.portlet.RenderRequestImpl;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.junit.BeforeClass;
import org.tuckey.web.MockSession;

@RunWith(EvoSuiteRunner.class)
public class HttpSessionWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) null);
      HttpSession httpSession0 = httpSessionWrapper0.getWrappedSession();
      assertNull(httpSession0);
  }

  @Test
  public void test1()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      boolean boolean0 = httpSessionWrapper0.isNew();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      Enumeration<String> enumeration0 = httpSessionWrapper0.getAttributeNames();
      assertNull(enumeration0);
  }

  @Test
  public void test3()  throws Throwable  {
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      PortletServletSession portletServletSession0 = new PortletServletSession((HttpSession) null, (PortletRequestImpl) renderRequestImpl0);
      // Undeclared exception!
      try {
        portletServletSession0.invalidate();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      Object object0 = httpSessionWrapper0.getAttribute("F[sr'6r{(");
      assertNull(object0);
  }

  @Test
  public void test5()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      long long0 = httpSessionWrapper0.getLastAccessedTime();
      assertEquals(0L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      ServletContext servletContext0 = httpSessionWrapper0.getServletContext();
      assertNull(servletContext0);
  }

  @Test
  public void test7()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      long long0 = httpSessionWrapper0.getCreationTime();
      assertEquals(0L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      String string0 = httpSessionWrapper0.getId();
      assertNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      httpSessionWrapper0.setMaxInactiveInterval((-1943));
      assertEquals(false, httpSessionWrapper0.isNew());
  }

  @Test
  public void test10()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      int int0 = httpSessionWrapper0.getMaxInactiveInterval();
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      HttpSessionWrapper httpSessionWrapper0 = new HttpSessionWrapper((HttpSession) mockSession0);
      httpSessionWrapper0.removeAttribute("pu_61T");
      assertEquals(0L, httpSessionWrapper0.getLastAccessedTime());
  }

  @Test
  public void test12()  throws Throwable  {
      MockSession mockSession0 = new MockSession();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      PortletServletSession portletServletSession0 = new PortletServletSession((HttpSession) mockSession0, (PortletRequestImpl) renderRequestImpl0);
      // Undeclared exception!
      try {
        portletServletSession0.setAttribute("w-l,c", (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
