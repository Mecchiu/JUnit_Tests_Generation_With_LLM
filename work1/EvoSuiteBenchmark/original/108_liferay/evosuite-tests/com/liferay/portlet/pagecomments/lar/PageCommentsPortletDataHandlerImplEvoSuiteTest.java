/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.pagecomments.lar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.PortletDataHandlerControl;
import com.liferay.portlet.pagecomments.lar.PageCommentsPortletDataHandlerImpl;
import javax.portlet.PortletPreferences;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PageCommentsPortletDataHandlerImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PageCommentsPortletDataHandlerImpl pageCommentsPortletDataHandlerImpl0 = new PageCommentsPortletDataHandlerImpl();
      PortletDataHandlerControl[] portletDataHandlerControlArray0 = pageCommentsPortletDataHandlerImpl0.getExportControls();
      assertNotNull(portletDataHandlerControlArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      PageCommentsPortletDataHandlerImpl pageCommentsPortletDataHandlerImpl0 = new PageCommentsPortletDataHandlerImpl();
      PortletDataHandlerControl[] portletDataHandlerControlArray0 = pageCommentsPortletDataHandlerImpl0.getImportControls();
      assertNotNull(portletDataHandlerControlArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      PageCommentsPortletDataHandlerImpl pageCommentsPortletDataHandlerImpl0 = new PageCommentsPortletDataHandlerImpl();
      try {
        pageCommentsPortletDataHandlerImpl0.doDeleteData((PortletDataContext) null, "4xW4AXs1W.N", (PortletPreferences) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
