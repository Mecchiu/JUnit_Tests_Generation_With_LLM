/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.taglib.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.taglib.ui.IconListTag;
import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import org.junit.BeforeClass;
import org.springframework.mock.web.MockPageContext;
import org.tuckey.web.MockServletContext;

@RunWith(EvoSuiteRunner.class)
public class IconListTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      iconListTag0.setStartPage("/html/taglib/ui/icon_list/end.jsp");
      String string0 = iconListTag0.getStartPage();
      assertEquals("/html/taglib/ui/icon_list/start.jsp", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      iconListTag0.setShowWhenSingleIcon(true);
      assertEquals("/html/taglib/ui/icon_list/start.jsp", iconListTag0.getStartPage());
  }

  @Test
  public void test2()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      iconListTag0.setEndPage("#rR0Q&9z)uZ");
      String string0 = iconListTag0.getEndPage();
      assertEquals("/html/taglib/ui/icon_list/end.jsp", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      MockServletContext mockServletContext0 = new MockServletContext();
      MockPageContext mockPageContext0 = new MockPageContext((ServletContext) mockServletContext0);
      iconListTag0.setPageContext((PageContext) mockPageContext0);
      int int0 = iconListTag0.doAfterBody();
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      MockServletContext mockServletContext0 = new MockServletContext();
      MockPageContext mockPageContext0 = new MockPageContext((ServletContext) mockServletContext0);
      iconListTag0.setPageContext((PageContext) mockPageContext0);
      int int0 = iconListTag0.doStartTag();
      assertEquals(2, int0);
      
      int int1 = iconListTag0.doAfterBody();
      assertEquals(0, int1);
  }

  @Test
  public void test5()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      MockServletContext mockServletContext0 = new MockServletContext();
      MockPageContext mockPageContext0 = new MockPageContext((ServletContext) mockServletContext0);
      iconListTag0.setPageContext((PageContext) mockPageContext0);
      try {
        iconListTag0.doEndTag();
        fail("Expecting exception: JspException");
      } catch(JspException e) {
        /*
         * java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      MockPageContext mockPageContext0 = new MockPageContext();
      iconListTag0.setPageContext((PageContext) mockPageContext0);
      iconListTag0.doStartTag();
      try {
        iconListTag0.doEndTag();
        fail("Expecting exception: JspException");
      } catch(JspException e) {
        /*
         * java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      String string0 = iconListTag0.getEndPage();
      assertEquals("/html/taglib/ui/icon_list/end.jsp", string0);
      assertNotNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      IconListTag iconListTag0 = new IconListTag();
      String string0 = iconListTag0.getStartPage();
      assertNotNull(string0);
      assertEquals("/html/taglib/ui/icon_list/start.jsp", string0);
  }
}
