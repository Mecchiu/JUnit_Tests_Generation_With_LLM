/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.dynamicdatalists.lar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.dynamicdatalists.lar.DDLPortletDataHandler;
import com.liferay.portlet.dynamicdatalists.lar.DDLPortletDataHandlerImpl;
import com.liferay.portlet.dynamicdatalists.lar.DDLPortletDataHandlerUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DDLPortletDataHandlerUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DDLPortletDataHandlerUtil dDLPortletDataHandlerUtil0 = new DDLPortletDataHandlerUtil();
      DDLPortletDataHandlerImpl dDLPortletDataHandlerImpl0 = (DDLPortletDataHandlerImpl)DDLPortletDataHandlerUtil.getDDLPortletDataHandler();
      dDLPortletDataHandlerUtil0.setDDLPortletDataHandler((DDLPortletDataHandler) dDLPortletDataHandlerImpl0);
  }
}
