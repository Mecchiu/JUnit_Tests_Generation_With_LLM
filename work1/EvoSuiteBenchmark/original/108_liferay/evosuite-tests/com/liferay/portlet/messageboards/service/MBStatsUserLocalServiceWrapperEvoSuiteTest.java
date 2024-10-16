/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.messageboards.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portlet.messageboards.model.MBStatsUser;
import com.liferay.portlet.messageboards.service.MBStatsUserLocalService;
import com.liferay.portlet.messageboards.service.MBStatsUserLocalServiceWrapper;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.criterion.DetachedCriteria;
import org.jfree.data.time.Minute;
import org.jfree.data.time.SimpleTimePeriod;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBStatsUserLocalServiceWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      Class<?> class0 = MBStatsUserLocalServiceWrapper.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.dynamicQuery((DynamicQuery) dynamicQueryImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.updateMBStatsUser((MBStatsUser) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getMessageCountByGroupId(964L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 1923, 1923);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getBeanIdentifier();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.deleteStatsUsersByUserId(15L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.deleteMBStatsUser(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getMBStatsUsers(1082, (-1690));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.setBeanIdentifier((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.deleteMBStatsUser((MBStatsUser) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.addStatsUser(30000L, 30000L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.dynamicQuery();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.deleteStatsUsersByGroupId(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      mBStatsUserLocalServiceWrapper0.setWrappedService((MBStatsUserLocalService) null);
  }

  @Test
  public void test15()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getMBStatsUser(1L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.updateMBStatsUser((MBStatsUser) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      Minute minute0 = new Minute();
      Date date0 = minute0.getEnd();
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.updateStatsUser((long) (-610), (long) (-610), 55, date0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      MBStatsUserLocalService mBStatsUserLocalService0 = mBStatsUserLocalServiceWrapper0.getWrappedService();
      assertNull(mBStatsUserLocalService0);
  }

  @Test
  public void test19()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getStatsUsersByGroupId((long) 0, 0, (-659));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getPersistedModel((Serializable) 0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.fetchMBStatsUser((-1636L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.deleteStatsUser((MBStatsUser) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.createMBStatsUser(365L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getMessageCountByUserId(1284652111321L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getStatsUsersByUserId(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getLasPostDateByUserId((-967L), 67324752L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.deleteStatsUser((-837L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getMBStatsUsersCount();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.addMBStatsUser((MBStatsUser) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getStatsUser(673L, 673L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test31()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.getStatsUsersByGroupIdCount((-278L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test32()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.updateStatsUser((-459L), (-459L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test33()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 0, 0, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test34()  throws Throwable  {
      MBStatsUserLocalServiceWrapper mBStatsUserLocalServiceWrapper0 = new MBStatsUserLocalServiceWrapper((MBStatsUserLocalService) null);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1365L), (-1365L));
      Date date0 = simpleTimePeriod0.getEnd();
      // Undeclared exception!
      try {
        mBStatsUserLocalServiceWrapper0.updateStatsUser(0L, (-1365L), date0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
