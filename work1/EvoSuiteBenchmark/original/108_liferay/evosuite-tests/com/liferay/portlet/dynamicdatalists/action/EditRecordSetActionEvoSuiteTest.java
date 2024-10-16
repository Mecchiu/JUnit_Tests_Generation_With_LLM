/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.dynamicdatalists.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.dynamicdatalists.action.EditRecordSetAction;
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
public class EditRecordSetActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EditRecordSetAction editRecordSetAction0 = new EditRecordSetAction();
      try {
        editRecordSetAction0.deleteRecordSet((ActionRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      EditRecordSetAction editRecordSetAction0 = new EditRecordSetAction();
      DynaActionForm dynaActionForm0 = new DynaActionForm();
      BridgeEditPortlet bridgeEditPortlet0 = new BridgeEditPortlet();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      try {
        editRecordSetAction0.render((ActionMapping) null, (ActionForm) dynaActionForm0, (PortletConfig) bridgeEditPortlet0, (RenderRequest) renderRequestImpl0, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
