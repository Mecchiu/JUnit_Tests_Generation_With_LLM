/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.portletconfiguration.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.RenderResponseImpl;
import com.liferay.portlet.portletconfiguration.action.EditPublicRenderParametersAction;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.junit.BeforeClass;
import org.portletbridge.portlet.PortletBridgePortlet;

@RunWith(EvoSuiteRunner.class)
public class EditPublicRenderParametersActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EditPublicRenderParametersAction editPublicRenderParametersAction0 = new EditPublicRenderParametersAction();
      PortletBridgePortlet portletBridgePortlet0 = null;
      try {
        portletBridgePortlet0 = new PortletBridgePortlet();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.portletbridge.portlet.PortletBridgePortlet
         */
      }
  }
}
