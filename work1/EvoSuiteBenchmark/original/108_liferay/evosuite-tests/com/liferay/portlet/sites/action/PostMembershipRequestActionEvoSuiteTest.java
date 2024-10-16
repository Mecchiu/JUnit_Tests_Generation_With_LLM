/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.sites.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ActionRequestImpl;
import com.liferay.portlet.sites.action.PostMembershipRequestAction;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.ActionRequestWrapper;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.junit.BeforeClass;
import org.portletbridge.portlet.BridgeHelpPortlet;
import org.portletbridge.portlet.BridgeViewPortlet;

@RunWith(EvoSuiteRunner.class)
public class PostMembershipRequestActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PostMembershipRequestAction postMembershipRequestAction0 = new PostMembershipRequestAction();
      ActionMapping actionMapping0 = null;
      try {
        actionMapping0 = new ActionMapping();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.apache.struts.action.ActionMapping
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PostMembershipRequestAction postMembershipRequestAction0 = new PostMembershipRequestAction();
      DynaActionForm dynaActionForm0 = new DynaActionForm();
      BridgeViewPortlet bridgeViewPortlet0 = new BridgeViewPortlet();
      try {
        postMembershipRequestAction0.render((ActionMapping) null, (ActionForm) dynaActionForm0, (PortletConfig) bridgeViewPortlet0, (RenderRequest) null, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
