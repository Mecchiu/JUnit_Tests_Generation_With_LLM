/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.iframe.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.iframe.action.ViewAction;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ViewActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ViewAction viewAction0 = new ViewAction();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      // Undeclared exception!
      try {
        viewAction0.getUserName((RenderRequest) renderRequestImpl0, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ViewAction viewAction0 = new ViewAction();
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
  public void test2()  throws Throwable  {
      ViewAction viewAction0 = new ViewAction();
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      // Undeclared exception!
      try {
        viewAction0.getPassword((RenderRequest) renderRequestImpl0, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
