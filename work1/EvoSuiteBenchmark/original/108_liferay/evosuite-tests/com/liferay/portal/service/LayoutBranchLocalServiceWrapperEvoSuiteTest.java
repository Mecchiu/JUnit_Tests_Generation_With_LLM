/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.model.LayoutBranch;
import com.liferay.portal.service.LayoutBranchLocalService;
import com.liferay.portal.service.LayoutBranchLocalServiceWrapper;
import com.liferay.portal.service.ServiceContext;
import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import org.jfree.data.time.RegularTimePeriod;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LayoutBranchLocalServiceWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.deleteLayoutBranch((LayoutBranch) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getMasterLayoutBranch(261L, 261L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.setBeanIdentifier("|10");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 1858, 564, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.deleteLayoutBranch(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      Class<?> class0 = RegularTimePeriod.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass(class0);
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.dynamicQuery((DynamicQuery) dynamicQueryImpl0, 1621, 1621);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.dynamicQuery();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.deleteLayoutSetBranchLayoutBranches(4L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.addLayoutBranch((LayoutBranch) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.fetchLayoutBranch(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      layoutBranchLocalServiceWrapper0.setWrappedService((LayoutBranchLocalService) null);
  }

  @Test
  public void test12()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getPersistedModel((Serializable) (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.createLayoutBranch(1284652112095L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getLayoutSetBranchLayoutBranches(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.addLayoutBranch(1892L, 1892L, "", "", true, serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getLayoutBranchsCount();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getLayoutBranchs(1, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.updateLayoutBranch((LayoutBranch) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.addLayoutBranch(939L, "Resource has been heuristically rolled back.", "Resource has been heuristically rolled back.", true, serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getLayoutBranches(1L, 624L, 386, 386, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      LayoutBranchLocalService layoutBranchLocalService0 = layoutBranchLocalServiceWrapper0.getWrappedService();
      assertNull(layoutBranchLocalService0);
  }

  @Test
  public void test22()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getBeanIdentifier();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.updateLayoutBranch((-2024L), "", "", serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.getLayoutBranch(918L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.dynamicQuery((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      LayoutBranchLocalServiceWrapper layoutBranchLocalServiceWrapper0 = new LayoutBranchLocalServiceWrapper((LayoutBranchLocalService) null);
      // Undeclared exception!
      try {
        layoutBranchLocalServiceWrapper0.updateLayoutBranch((LayoutBranch) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
