/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.WorkflowInstanceLink;
import com.liferay.portal.model.WorkflowInstanceLinkSoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WorkflowInstanceLinkSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setClassNameId(0L);
      assertEquals(0L, workflowInstanceLinkSoap0.getGroupId());
  }

  @Test
  public void test1()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      Date date0 = workflowInstanceLinkSoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test2()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getWorkflowInstanceId();
      assertEquals(0L, long0);
  }

  @Test
  public void test3()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setPrimaryKey((-15L));
      assertEquals((-15L), workflowInstanceLinkSoap0.getPrimaryKey());
      assertEquals((-15L), workflowInstanceLinkSoap0.getWorkflowInstanceLinkId());
  }

  @Test
  public void test4()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getClassPK();
      assertEquals(0L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      Date date0 = workflowInstanceLinkSoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test7()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setGroupId((-15L));
      assertEquals((-15L), workflowInstanceLinkSoap0.getGroupId());
  }

  @Test
  public void test8()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setCreateDate((Date) null);
      assertNull(workflowInstanceLinkSoap0.getUserName());
  }

  @Test
  public void test9()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setClassPK(0L);
      assertEquals(0L, workflowInstanceLinkSoap0.getWorkflowInstanceId());
  }

  @Test
  public void test11()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getClassNameId();
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setUserName(";teet2");
      assertEquals(0L, workflowInstanceLinkSoap0.getPrimaryKey());
  }

  @Test
  public void test14()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setCompanyId(0L);
      assertEquals(0L, workflowInstanceLinkSoap0.getWorkflowInstanceLinkId());
  }

  @Test
  public void test15()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setWorkflowInstanceId(0L);
      assertEquals(0L, workflowInstanceLinkSoap0.getWorkflowInstanceId());
  }

  @Test
  public void test16()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      String string0 = workflowInstanceLinkSoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test18()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setModifiedDate((Date) null);
      assertEquals(0L, workflowInstanceLinkSoap0.getGroupId());
  }

  @Test
  public void test19()  throws Throwable  {
      LinkedList<WorkflowInstanceLink> linkedList0 = new LinkedList<WorkflowInstanceLink>();
      linkedList0.add((WorkflowInstanceLink) null);
      // Undeclared exception!
      try {
        WorkflowInstanceLinkSoap.toSoapModels((List<WorkflowInstanceLink>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      long long0 = workflowInstanceLinkSoap0.getWorkflowInstanceLinkId();
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      WorkflowInstanceLinkSoap workflowInstanceLinkSoap0 = new WorkflowInstanceLinkSoap();
      workflowInstanceLinkSoap0.setUserId(0L);
      assertEquals(0L, workflowInstanceLinkSoap0.getUserId());
  }

  @Test
  public void test22()  throws Throwable  {
      WorkflowInstanceLink[][] workflowInstanceLinkArray0 = new WorkflowInstanceLink[1][7];
      // Undeclared exception!
      try {
        WorkflowInstanceLinkSoap.toSoapModels(workflowInstanceLinkArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      LinkedList<WorkflowInstanceLink> linkedList0 = new LinkedList<WorkflowInstanceLink>();
      WorkflowInstanceLinkSoap[] workflowInstanceLinkSoapArray0 = WorkflowInstanceLinkSoap.toSoapModels((List<WorkflowInstanceLink>) linkedList0);
      assertNotNull(workflowInstanceLinkSoapArray0);
  }
}
