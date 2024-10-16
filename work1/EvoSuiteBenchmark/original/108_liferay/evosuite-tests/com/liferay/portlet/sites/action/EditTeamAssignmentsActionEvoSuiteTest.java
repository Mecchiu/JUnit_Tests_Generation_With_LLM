/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.sites.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ActionRequestImpl;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.sites.action.EditTeamAssignmentsAction;
import javax.portlet.ActionRequest;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.junit.BeforeClass;
import org.portletbridge.portlet.BridgeEditPortlet;

@RunWith(EvoSuiteRunner.class)
public class EditTeamAssignmentsActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EditTeamAssignmentsAction editTeamAssignmentsAction0 = new EditTeamAssignmentsAction();
      try {
        editTeamAssignmentsAction0.updateTeamUsers((ActionRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      EditTeamAssignmentsAction editTeamAssignmentsAction0 = new EditTeamAssignmentsAction();
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      try {
        editTeamAssignmentsAction0.updateTeamUserGroups((ActionRequest) actionRequestImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      EditTeamAssignmentsAction editTeamAssignmentsAction0 = new EditTeamAssignmentsAction();
      DynaActionForm dynaActionForm0 = new DynaActionForm();
      BridgeEditPortlet bridgeEditPortlet0 = new BridgeEditPortlet();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      try {
        editTeamAssignmentsAction0.render((ActionMapping) null, (ActionForm) dynaActionForm0, (PortletConfig) bridgeEditPortlet0, (RenderRequest) renderRequestImpl0, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
