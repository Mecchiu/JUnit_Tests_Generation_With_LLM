/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.sites.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.sites.action.ViewMembershipRequestsAction;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.junit.BeforeClass;
import org.portletbridge.portlet.BridgeViewPortlet;

@RunWith(EvoSuiteRunner.class)
public class ViewMembershipRequestsActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ViewMembershipRequestsAction viewMembershipRequestsAction0 = new ViewMembershipRequestsAction();
      DynaActionForm dynaActionForm0 = new DynaActionForm();
      BridgeViewPortlet bridgeViewPortlet0 = null;
      try {
        bridgeViewPortlet0 = new BridgeViewPortlet();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.portletbridge.portlet.BridgeViewPortlet
         */
      }
  }
}
