/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.messageboards.asset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.messageboards.asset.MBCategoryAssetRendererFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBCategoryAssetRendererFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      try {
        mBCategoryAssetRendererFactory0.hasPermission((PermissionChecker) null, 1443L, "J-IY\")x@gHF$u");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      String string0 = mBCategoryAssetRendererFactory0.getClassName();
      assertNotNull(string0);
      assertEquals("com.liferay.portlet.messageboards.model.MBCategory", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      String string0 = mBCategoryAssetRendererFactory0.getType();
      assertEquals("category", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      boolean boolean0 = mBCategoryAssetRendererFactory0.isCategorizable();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      // Undeclared exception!
      try {
        mBCategoryAssetRendererFactory0.getAssetRenderer(1630L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      boolean boolean0 = mBCategoryAssetRendererFactory0.isSelectable();
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      MBCategoryAssetRendererFactory mBCategoryAssetRendererFactory0 = new MBCategoryAssetRendererFactory();
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      String string0 = mBCategoryAssetRendererFactory0.getIconPath(themeDisplay0);
      assertEquals("/common/conversation.png", string0);
      assertNotNull(string0);
  }
}
