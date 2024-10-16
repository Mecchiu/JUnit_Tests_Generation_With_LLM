/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service;

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
import com.liferay.portal.model.PasswordTracker;
import com.liferay.portal.model.PasswordTrackerWrapper;
import com.liferay.portal.service.PasswordTrackerLocalServiceUtil;
import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PasswordTrackerLocalServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.dynamicQuery((DynamicQuery) null, 0, 0, (OrderByComparator) null);
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
        PasswordTrackerLocalServiceUtil.setBeanIdentifier("-;");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PasswordTrackerLocalServiceUtil passwordTrackerLocalServiceUtil0 = new PasswordTrackerLocalServiceUtil();
      assertNotNull(passwordTrackerLocalServiceUtil0);
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.dynamicQuery((DynamicQuery) null, 12, 12);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      PasswordTrackerWrapper passwordTrackerWrapper0 = new PasswordTrackerWrapper((PasswordTracker) null);
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.updatePasswordTracker((PasswordTracker) passwordTrackerWrapper0);
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
        PasswordTrackerLocalServiceUtil.getPasswordTrackersCount();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.isSameAsCurrentPassword(146097L, "K?g");
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
        PasswordTrackerLocalServiceUtil.getPasswordTracker((-580L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.deletePasswordTracker(72057594037927946L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.getPasswordTrackers(0, 0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.dynamicQuery();
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
        PasswordTrackerLocalServiceUtil.deletePasswordTrackers(1266L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName("{{umR(eY1HT", "{{umR(eY1HT");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0);
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
        PasswordTrackerLocalServiceUtil.fetchPasswordTracker(9L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Class<?> class0 = PasswordTrackerLocalServiceUtil.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "[RY-*ZVSqsJ7}csW+f");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        PasswordTrackerLocalServiceUtil.dynamicQueryCount((DynamicQuery) dynamicQueryImpl0);
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
        PasswordTrackerLocalServiceUtil.updatePasswordTracker((PasswordTracker) null, false);
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
        PasswordTrackerLocalServiceUtil.trackPassword((-1914L), "");
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
        PasswordTrackerLocalServiceUtil.getBeanIdentifier();
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
        PasswordTrackerLocalServiceUtil.deletePasswordTracker((PasswordTracker) null);
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
        PasswordTrackerLocalServiceUtil.isValidPassword((-2L), "A{TbE\"FOzj");
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
        PasswordTrackerLocalServiceUtil.addPasswordTracker((PasswordTracker) null);
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
        PasswordTrackerLocalServiceUtil.createPasswordTracker((-1652L));
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
        PasswordTrackerLocalServiceUtil.getPersistedModel((Serializable) "not null auto_increment");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
