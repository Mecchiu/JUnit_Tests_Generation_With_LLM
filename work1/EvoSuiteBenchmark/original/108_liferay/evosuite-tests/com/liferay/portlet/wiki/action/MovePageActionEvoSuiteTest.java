/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.wiki.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ActionRequestImpl;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.VelocityPortlet;
import com.liferay.portlet.wiki.action.MovePageAction;
import javax.portlet.ActionRequest;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.ActionRequestWrapper;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MovePageActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MovePageAction movePageAction0 = new MovePageAction();
      boolean boolean0 = movePageAction0.isCheckMethodOnProcessAction();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MovePageAction movePageAction0 = new MovePageAction();
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      ActionRequestWrapper actionRequestWrapper0 = new ActionRequestWrapper((ActionRequest) actionRequestImpl0);
      try {
        movePageAction0.changeParentPage((ActionRequest) actionRequestWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MovePageAction movePageAction0 = new MovePageAction();
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      try {
        movePageAction0.renamePage((ActionRequest) actionRequestImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MovePageAction movePageAction0 = new MovePageAction();
      VelocityPortlet velocityPortlet0 = new VelocityPortlet();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      try {
        movePageAction0.render((ActionMapping) null, (ActionForm) null, (PortletConfig) velocityPortlet0, (RenderRequest) renderRequestImpl0, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
