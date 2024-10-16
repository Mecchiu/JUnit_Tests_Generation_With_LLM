/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.polls.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.polls.model.PollsChoice;
import com.liferay.portlet.polls.model.PollsChoiceWrapper;
import com.liferay.portlet.polls.service.PollsChoiceLocalServiceUtil;
import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PollsChoiceLocalServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = PollsChoiceLocalServiceUtil.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass(class0);
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(true);
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, 0, 0, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getPollsChoices((-671), (-671));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.createPollsChoice(647L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.deletePollsChoice(307L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getBeanIdentifier();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.updatePollsChoice((PollsChoice) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.addChoice(100L, "guYL{IDR{?XbW", "guYL{IDR{?XbW", serviceContext0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.dynamicQuery((DynamicQuery) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      PollsChoiceLocalServiceUtil pollsChoiceLocalServiceUtil0 = new PollsChoiceLocalServiceUtil();
      assertNotNull(pollsChoiceLocalServiceUtil0);
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.dynamicQuery();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      PollsChoiceWrapper pollsChoiceWrapper0 = new PollsChoiceWrapper((PollsChoice) null);
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.addPollsChoice((PollsChoice) pollsChoiceWrapper0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getChoices(0L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getChoice(465L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getChoicesCount((-1235L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName("wFQ+ay/r@OH^U", "wFQ+ay/r@OH^U");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, (-1790), (-1790));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.updateChoice(1095L, 1095L, "Note.t a f<t: ", "Note.t a f<t: ");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getPollsChoice(1L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.updatePollsChoice((PollsChoice) null, true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getPollsChoicesCount();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.setBeanIdentifier((String) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.getPersistedModel((Serializable) (-620L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.deletePollsChoice((PollsChoice) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try {
        PollsChoiceLocalServiceUtil.fetchPollsChoice((-1401L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
