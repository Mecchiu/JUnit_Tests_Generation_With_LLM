/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.plugin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Plugin;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.ThemeImpl;
import com.liferay.portal.plugin.PluginUtil;
import java.util.List;
import java.util.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PluginUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Vector<Plugin> vector0 = new Vector<Plugin>();
      // Undeclared exception!
      try {
        PluginUtil.restrictPlugins((List<Plugin>) vector0, (User) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PluginUtil pluginUtil0 = new PluginUtil();
      assertNotNull(pluginUtil0);
  }

  @Test
  public void test2()  throws Throwable  {
      Vector<Plugin> vector0 = new Vector<Plugin>();
      List<Plugin> list0 = PluginUtil.restrictPlugins((List<Plugin>) vector0, 24L, 24L);
      assertEquals(0, list0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      Vector<Plugin> vector0 = new Vector<Plugin>();
      ThemeImpl themeImpl0 = new ThemeImpl();
      vector0.add((Plugin) themeImpl0);
      // Undeclared exception!
      try {
        PluginUtil.restrictPlugins((List<Plugin>) vector0, (-280L), (-280L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
