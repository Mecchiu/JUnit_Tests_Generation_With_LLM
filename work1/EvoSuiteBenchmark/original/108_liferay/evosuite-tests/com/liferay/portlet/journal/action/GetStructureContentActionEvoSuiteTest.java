/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.journal.action.GetStructureContentAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetStructureContentActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GetStructureContentAction getStructureContentAction0 = new GetStructureContentAction();
      DynaActionForm dynaActionForm0 = new DynaActionForm();
      try {
        getStructureContentAction0.execute((ActionMapping) null, (ActionForm) dynaActionForm0, (HttpServletRequest) null, (HttpServletResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
