/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ColorScheme;
import com.liferay.portal.model.Theme;
import com.liferay.portal.model.ThemeSetting;
import com.liferay.portal.model.impl.ThemeImpl;
import com.liferay.portal.theme.ThemeCompanyLimit;
import com.liferay.portal.theme.ThemeGroupLimit;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ThemeImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("T9}2_kx0%6DUw");
      themeImpl0.isCompanyAvailable((-433L));
  }

  @Test
  public void test1()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("&67L@;~");
      String string0 = themeImpl0.getTemplateExtension();
      assertNotNull(string0);
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("&67L@;~", themeImpl0.getPluginId());
      assertEquals("vm", string0);
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
  }

  @Test
  public void test2()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("T9}2_kx0%6DUw");
      themeImpl0.getWapTheme();
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("T9}2_kx0%6DUw", themeImpl0.getThemeId());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("T9}2_kx0%6DUw", themeImpl0.getPluginId());
  }

  @Test
  public void test3()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      // Undeclared exception!
      try {
        themeImpl0.compareTo((Theme) themeImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl((String) null, (String) null);
      themeImpl0.setName((String) null);
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("/", themeImpl0.getRootPath());
  }

  @Test
  public void test5()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("sA4ft ", "sA4ft ");
      ThemeGroupLimit themeGroupLimit0 = new ThemeGroupLimit();
      themeImpl0.setThemeCompanyLimit((ThemeCompanyLimit) themeGroupLimit0);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("sA4ft ", themeImpl0.getName());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("sA4ft ", themeImpl0.getPluginId());
      assertEquals("sA4ft ", themeImpl0.getThemeId());
  }

  @Test
  public void test6()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      String string0 = themeImpl0.getDevice();
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("regular", string0);
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("", themeImpl0.getThemeId());
  }

  @Test
  public void test7()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      Map<String, ThemeSetting> map0 = themeImpl0.getSettings();
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertNotNull(map0);
  }

  @Test
  public void test8()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      String string0 = themeImpl0.getImagesPath();
      assertEquals("${root-path}/images", string0);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertNotNull(string0);
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
  }

  @Test
  public void test9()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("sA4ft ", "sA4ft ");
      themeImpl0.setTimestamp(0L);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("sA4ft ", themeImpl0.getName());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("sA4ft ", themeImpl0.getPluginId());
      assertEquals("vm", themeImpl0.getTemplateExtension());
  }

  @Test
  public void test10()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("sA4ft ", "sA4ft ");
      themeImpl0.setServletContextName("sA4ft ");
      String string0 = themeImpl0.getContextPath();
      assertEquals(true, themeImpl0.isWARFile());
      assertEquals("/sA4ft ", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.isLoadFromServletContext();
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }

  @Test
  public void test12()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.getLoadFromServletContext();
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test13()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      
      themeImpl0.setImagesPath("");
      assertEquals("", themeImpl0.getThemeId());
  }

  @Test
  public void test14()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      String string0 = themeImpl0.getCssPath();
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertNotNull(string0);
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", string0);
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("vm", themeImpl0.getTemplateExtension());
  }

  @Test
  public void test15()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      themeImpl0.setJavaScriptPath("${root-path}/css");
      assertEquals("${root-path}/css", themeImpl0.getJavaScriptPath());
      assertEquals("", themeImpl0.getPluginId());
  }

  @Test
  public void test16()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      boolean boolean0 = themeImpl0.isGroupAvailable(617L);
      assertEquals(true, boolean0);
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("", themeImpl0.getPluginId());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }

  @Test
  public void test17()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("#TWub-qC");
      int int0 = themeImpl0.hashCode();
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals(580806871, int0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test18()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      String string0 = themeImpl0.getPluginId();
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertNotNull(string0);
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      themeImpl0.getTimestamp();
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("", themeImpl0.getPluginId());
  }

  @Test
  public void test20()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      String string0 = themeImpl0.getJavaScriptPath();
      assertNotNull(string0);
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("", themeImpl0.getPluginId());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", string0);
  }

  @Test
  public void test21()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.setWapTheme(true);
      String string0 = themeImpl0.getDevice();
      assertEquals(true, themeImpl0.isWapTheme());
      assertEquals("wap", string0);
  }

  @Test
  public void test22()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("sA4ft ", "sA4ft ");
      themeImpl0.setTemplateExtension("sA4ft ");
      assertEquals("sA4ft ", themeImpl0.getTemplateExtension());
      assertEquals("sA4ft ", themeImpl0.getName());
  }

  @Test
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try {
        ThemeImpl.getDefaultWapThemeId(617L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("", "");
      themeImpl0.setCssPath("theme");
      assertEquals("theme", themeImpl0.getCssPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test25()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("&#N)x;", "&#N)x;");
      themeImpl0.getWARFile();
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("&#N)x;", themeImpl0.getName());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("&#N)x;", themeImpl0.getThemeId());
  }

  @Test
  public void test26()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.getSpriteImage("{-ii0qxM< __c");
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test27()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      themeImpl0.setThemeGroupLimit((ThemeGroupLimit) null);
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
  }

  @Test
  public void test28()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("&#N)x;", "&#N)x;");
      themeImpl0.setRootPath("&#N)x;");
      assertEquals("&#N)x;", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
  }

  @Test
  public void test29()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      List<ColorScheme> list0 = themeImpl0.getColorSchemes();
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertNotNull(list0);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
  }

  @Test
  public void test30()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      themeImpl0.setSetting("", "");
      String string0 = themeImpl0.getSetting("");
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("", string0);
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertNotNull(string0);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }

  @Test
  public void test31()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      Map<String, ColorScheme> map0 = themeImpl0.getColorSchemesMap();
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertNotNull(map0);
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("", themeImpl0.getPluginId());
  }

  @Test
  public void test32()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("", "");
      String string0 = themeImpl0.getPluginType();
      assertEquals("", themeImpl0.getName());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("theme", string0);
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("", themeImpl0.getPluginId());
  }

  @Test
  public void test33()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      String string0 = themeImpl0.getTemplatesPath();
      assertNotNull(string0);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/templates", string0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
  }

  @Test
  public void test34()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.setTemplatesPath("&67L@q ~");
      assertEquals("&67L@q ~", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test35()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("~", "~");
      String string0 = themeImpl0.getVirtualPath();
      assertNotNull(string0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("~", themeImpl0.getPluginId());
      assertEquals("", string0);
      assertEquals("~", themeImpl0.getName());
  }

  @Test
  public void test36()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.setLoadFromServletContext(true);
      String string0 = themeImpl0.getFreeMarkerTemplateLoader();
      assertEquals("_SERVLET_CONTEXT_", themeImpl0.getVelocityResourceListener());
      assertEquals("_SERVLET_CONTEXT_", string0);
  }

  @Test
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try {
        ThemeImpl.getDefaultRegularThemeId(19L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl((String) null, (String) null);
      String string0 = themeImpl0.getRootPath();
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("/", string0);
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertNotNull(string0);
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }

  @Test
  public void test39()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("&#N)x;", "&#N)x;");
      boolean boolean0 = themeImpl0.equals((Object) themeImpl0);
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals(true, boolean0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("&#N)x;", themeImpl0.getName());
      assertEquals("&#N)x;", themeImpl0.getThemeId());
      assertEquals("/", themeImpl0.getRootPath());
  }

  @Test
  public void test40()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("~", "~");
      boolean boolean0 = themeImpl0.equals((Object) null);
      assertEquals("~", themeImpl0.getName());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals(false, boolean0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("~", themeImpl0.getThemeId());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
  }

  @Test
  public void test41()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("", "");
      themeImpl0.setSetting("", "");
      Map<String, ThemeSetting> map0 = themeImpl0.getConfigurableSettings();
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("", themeImpl0.getName());
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals(true, map0.isEmpty());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertNotNull(map0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
  }

  @Test
  public void test42()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      String[] stringArray0 = new String[6];
      themeImpl0.addSetting("{-ii0qxM< __c", "{-ii0qxM< __c", true, "{-ii0qxM< __c", stringArray0, (String) null);
      Map<String, ThemeSetting> map0 = themeImpl0.getConfigurableSettings();
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertNotNull(map0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals(1, map0.size());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
  }

  @Test
  public void test43()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      // Undeclared exception!
      try {
        themeImpl0.getContextPath();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test44()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("T9}2_kx0%6DUw");
      String string0 = themeImpl0.getFreeMarkerTemplateLoader();
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("_THEME_LOADER_CONTEXT_", string0);
      assertEquals("T9}2_kx0%6DUw", themeImpl0.getThemeId());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }

  @Test
  public void test45()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("T9}2_kx0%6DUw");
      String string0 = themeImpl0.getSetting("T9}2_kx0%6DUw");
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertNull(string0);
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("T9}2_kx0%6DUw", themeImpl0.getPluginId());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test46()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.getSettingOptions("wap");
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("/", themeImpl0.getRootPath());
  }

  @Test
  public void test47()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      String[] stringArray0 = new String[10];
      themeImpl0.addSetting("", "", true, "", stringArray0, (String) null);
      String[] stringArray1 = themeImpl0.getSettingOptions("");
      assertNotNull(stringArray1);
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }

  @Test
  public void test48()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("&#N)x;", "&#N)x;");
      String string0 = themeImpl0.getVelocityResourceListener();
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("_THEME_LOADER_CONTEXT_", string0);
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("&#N)x;", themeImpl0.getPluginId());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("&#N)x;", themeImpl0.getName());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
  }

  @Test
  public void test49()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.setLoadFromServletContext(true);
      String string0 = themeImpl0.getVelocityResourceListener();
      assertEquals(true, themeImpl0.getLoadFromServletContext());
      assertEquals("_SERVLET_CONTEXT_", string0);
  }

  @Test
  public void test50()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("T9}2_kx0%6DUw");
      boolean boolean0 = themeImpl0.hasColorSchemes();
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("T9}2_kx0%6DUw", themeImpl0.getThemeId());
      assertEquals(false, boolean0);
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
  }

  @Test
  public void test51()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.setServletContextName("");
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals(false, themeImpl0.getWARFile());
      assertEquals(false, themeImpl0.isWARFile());
  }

  @Test
  public void test52()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      themeImpl0.setSetting("", "");
      themeImpl0.setSetting("", "");
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("", themeImpl0.getPluginId());
  }

  @Test
  public void test53()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      Properties properties0 = new Properties();
      themeImpl0.setSpriteImages("", properties0);
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("", themeImpl0.getThemeId());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("", themeImpl0.getPluginId());
  }

  @Test
  public void test54()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      String[] stringArray0 = new String[6];
      themeImpl0.addSetting("{-ii0qxM< __c", "{-ii0qxM< __c", true, "{-ii0qxM< __c", stringArray0, (String) null);
      Properties properties0 = themeImpl0.getSettingsProperties();
      assertNotNull(properties0);
      
      // Undeclared exception!
      try {
        themeImpl0.setSpriteImages("{-ii0qxM< __c", properties0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1
         */
      }
  }

  @Test
  public void test55()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("");
      themeImpl0.setVirtualPath("");
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("", themeImpl0.getVirtualPath());
      assertEquals("", themeImpl0.getPluginId());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("", themeImpl0.getThemeId());
  }

  @Test
  public void test56()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("&67L@;~");
      themeImpl0.setServletContextName("&67L@;~");
      themeImpl0.setVirtualPath("&67L@;~");
      assertEquals("&67L@;~", themeImpl0.getVirtualPath());
      assertEquals("&67L@;~", themeImpl0.getPluginId());
  }

  @Test
  public void test57()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl();
      themeImpl0.setServletContextName("&67L@q ~");
      // Undeclared exception!
      try {
        themeImpl0.setVirtualPath("");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsValues
         */
      }
  }

  @Test
  public void test58()  throws Throwable  {
      ThemeImpl themeImpl0 = new ThemeImpl("T9}2_kx0%6DUw");
      ThemeGroupLimit themeGroupLimit0 = new ThemeGroupLimit();
      themeImpl0.isAvailable((ThemeCompanyLimit) themeGroupLimit0, (-433L));
      assertEquals("/", themeImpl0.getRootPath());
      assertEquals("vm", themeImpl0.getTemplateExtension());
      assertEquals("${root-path}/templates", themeImpl0.getTemplatesPath());
      assertEquals("T9}2_kx0%6DUw", themeImpl0.getPluginId());
      assertEquals("${root-path}/js", themeImpl0.getJavaScriptPath());
      assertEquals("${root-path}/css", themeImpl0.getCssPath());
      assertEquals("${root-path}/images", themeImpl0.getImagesPath());
  }
}
