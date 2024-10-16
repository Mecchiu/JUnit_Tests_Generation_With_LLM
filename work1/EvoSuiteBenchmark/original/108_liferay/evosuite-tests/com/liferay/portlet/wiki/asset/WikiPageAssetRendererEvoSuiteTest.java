/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.wiki.asset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.EventResponseImpl;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.RenderResponseImpl;
import com.liferay.portlet.ResourceResponseImpl;
import com.liferay.portlet.wiki.asset.WikiPageAssetRenderer;
import com.liferay.portlet.wiki.model.WikiPage;
import com.liferay.portlet.wiki.model.WikiPageWrapper;
import java.util.Locale;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;
import javax.swing.JComponent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WikiPageAssetRendererEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.hasEditPermission((PermissionChecker) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      RenderResponseImpl renderResponseImpl0 = new RenderResponseImpl();
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getURLExport((LiferayPortletRequest) null, (LiferayPortletResponse) renderResponseImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      String string0 = wikiPageAssetRenderer0.getIconPath(themeDisplay0);
      assertNotNull(string0);
      assertEquals("/common/page.png", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      ResourceResponseImpl resourceResponseImpl0 = new ResourceResponseImpl();
      try {
        wikiPageAssetRenderer0.getURLView((LiferayPortletResponse) resourceResponseImpl0, (WindowState) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      String string0 = wikiPageAssetRenderer0.getType();
      assertEquals("wiki_page", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      Locale locale0 = JComponent.getDefaultLocale();
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getSearchSummary(locale0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.hasViewPermission((PermissionChecker) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getClassPK();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      boolean boolean0 = wikiPageAssetRenderer0.isConvertible();
      assertEquals(true, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      boolean boolean0 = wikiPageAssetRenderer0.isPrintable();
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      String string0 = wikiPageAssetRenderer0.getAssetRendererFactoryClassName();
      assertEquals("com.liferay.portlet.wiki.model.WikiPage", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      EventResponseImpl eventResponseImpl0 = new EventResponseImpl();
      try {
        wikiPageAssetRenderer0.getURLEdit((LiferayPortletRequest) null, (LiferayPortletResponse) eventResponseImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      ResourceResponseImpl resourceResponseImpl0 = new ResourceResponseImpl();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getURLViewInContext((LiferayPortletRequest) renderRequestImpl0, (LiferayPortletResponse) resourceResponseImpl0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.hasDeletePermission((PermissionChecker) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      String string0 = wikiPageAssetRenderer0.getPortletId();
      assertEquals("36", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getUuid();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getGroupId();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) null);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getUserId();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      // Undeclared exception!
      try {
        wikiPageAssetRenderer0.getUserName();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      WikiPageWrapper wikiPageWrapper0 = new WikiPageWrapper((WikiPage) null);
      WikiPageAssetRenderer wikiPageAssetRenderer0 = new WikiPageAssetRenderer((WikiPage) wikiPageWrapper0);
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      RenderResponseImpl renderResponseImpl0 = new RenderResponseImpl();
      String string0 = wikiPageAssetRenderer0.render((RenderRequest) renderRequestImpl0, (RenderResponse) renderResponseImpl0, "pageCount");
      assertNull(string0);
  }
}
