/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.workflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.liferay.portal.workflow.LayoutRevisionWorkflowHandler;
import com.liferay.portal.workflow.WorkflowHandlerRegistryImpl;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WorkflowHandlerRegistryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WorkflowHandlerRegistryImpl workflowHandlerRegistryImpl0 = new WorkflowHandlerRegistryImpl();
      List<WorkflowHandler> list0 = workflowHandlerRegistryImpl0.getWorkflowHandlers();
      assertEquals(0, list0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      WorkflowHandlerRegistryImpl workflowHandlerRegistryImpl0 = new WorkflowHandlerRegistryImpl();
      List<WorkflowHandler> list0 = workflowHandlerRegistryImpl0.getScopeableWorkflowHandlers();
      assertEquals(0, list0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      WorkflowHandlerRegistryImpl workflowHandlerRegistryImpl0 = new WorkflowHandlerRegistryImpl();
      WorkflowHandler workflowHandler0 = workflowHandlerRegistryImpl0.getWorkflowHandler("uwqzGNm0t;.l[f");
      assertNull(workflowHandler0);
  }

  @Test
  public void test3()  throws Throwable  {
      WorkflowHandlerRegistryImpl workflowHandlerRegistryImpl0 = new WorkflowHandlerRegistryImpl();
      LayoutRevisionWorkflowHandler layoutRevisionWorkflowHandler0 = new LayoutRevisionWorkflowHandler();
      workflowHandlerRegistryImpl0.register((WorkflowHandler) layoutRevisionWorkflowHandler0);
      assertEquals(true, layoutRevisionWorkflowHandler0.isAssetTypeSearchable());
  }

  @Test
  public void test4()  throws Throwable  {
      WorkflowHandlerRegistryImpl workflowHandlerRegistryImpl0 = new WorkflowHandlerRegistryImpl();
      LayoutRevisionWorkflowHandler layoutRevisionWorkflowHandler0 = new LayoutRevisionWorkflowHandler();
      workflowHandlerRegistryImpl0.unregister((WorkflowHandler) layoutRevisionWorkflowHandler0);
      assertEquals("com.liferay.portal.model.LayoutRevision", layoutRevisionWorkflowHandler0.getClassName());
  }
}
