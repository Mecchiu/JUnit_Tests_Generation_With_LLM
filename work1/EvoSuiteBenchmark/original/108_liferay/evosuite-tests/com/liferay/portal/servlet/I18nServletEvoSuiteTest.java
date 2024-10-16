/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.servlet.I18nServlet;
import com.liferay.portal.xml.DocumentImpl;
import com.liferay.portal.xml.ElementImpl;
import java.util.Set;
import org.dom4j.Document;
import org.dom4j.tree.DefaultDocument;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class I18nServletEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Set<String> set0 = I18nServlet.getLanguageIds();
      assertEquals(0, set0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      I18nServlet i18nServlet0 = new I18nServlet();
      assertEquals("", i18nServlet0.getServletInfo());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      DocumentImpl documentImpl0 = new DocumentImpl((Document) defaultDocument0);
      ElementImpl elementImpl0 = (ElementImpl)documentImpl0.addElement("log4j.reset", "log4j.reset");
      // Undeclared exception!
      try {
        I18nServlet.setLanguageIds((Element) elementImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
      assertEquals("log4j.reset", elementImpl0.getNamespaceURI());
  }
}
