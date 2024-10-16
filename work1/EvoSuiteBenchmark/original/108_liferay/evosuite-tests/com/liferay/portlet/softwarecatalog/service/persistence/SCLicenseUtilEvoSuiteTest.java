/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.softwarecatalog.service.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.softwarecatalog.NoSuchLicenseException;
import com.liferay.portlet.softwarecatalog.model.SCLicense;
import com.liferay.portlet.softwarecatalog.model.SCProductEntry;
import com.liferay.portlet.softwarecatalog.service.persistence.SCLicenseUtil;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SCLicenseUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[18];
      // Undeclared exception!
      try {
        SCLicenseUtil.addSCProductEntries(1252L, longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        SCLicenseUtil.update((SCLicense) null, true, serviceContext0);
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
        SCLicenseUtil.countByActive(false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.fetchByA_R_Last(false, false, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByA_R_PrevAndNext(31536000000L, false, false, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByA_R(false, false, 0, 0, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
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
        SCLicenseUtil.containsSCProductEntry(1240L, 1240L);
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
        SCLicenseUtil.clearCache((SCLicense) null);
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
        SCLicenseUtil.removeSCProductEntries(0L, (List<SCProductEntry>) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findByActive(false, 3732, 3732, (OrderByComparator) baseWorkflowTaskNameComparator0);
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
        SCLicenseUtil.fetchByPrimaryKey((-61L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      // Undeclared exception!
      try {
        SCLicenseUtil.fetchByActive_Last(true, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      // Undeclared exception!
      try {
        SCLicenseUtil.findByA_R_First(true, true, (OrderByComparator) baseWorkflowTaskNameComparator0);
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
        SCLicenseUtil.addSCProductEntry(1L, 1L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(false);
      // Undeclared exception!
      try {
        SCLicenseUtil.findAll((-1514), (-1514), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findByActive_PrevAndNext((-1L), false, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(false);
      // Undeclared exception!
      try {
        SCLicenseUtil.fetchByActive_First(false, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Class<?> class0 = SCLicenseUtil.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findWithDynamicQuery((DynamicQuery) dynamicQueryImpl0, 0, 0, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
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
        SCLicenseUtil.removeByA_R(true, true);
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
        SCLicenseUtil.remove(0L);
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
        SCLicenseUtil.findAll();
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
        SCLicenseUtil.findByActive(true, 0, (-542));
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
        SCLicenseUtil.countByA_R(false, false);
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
        SCLicenseUtil.removeSCProductEntry(1L, (SCProductEntry) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.getSCProductEntriesSize(603L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.removeSCProductEntry(448L, 448L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findWithDynamicQuery((DynamicQuery) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.updateImpl((SCLicense) null, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByActive(false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.removeByActive(true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      SCLicenseUtil sCLicenseUtil0 = new SCLicenseUtil();
      // Undeclared exception!
      try {
        sCLicenseUtil0.countWithDynamicQuery((DynamicQuery) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.cacheResult((List<SCLicense>) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findByA_R_Last(true, true, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.setSCProductEntries((-2L), (List<SCProductEntry>) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      long[] longArray0 = new long[6];
      // Undeclared exception!
      try {
        SCLicenseUtil.setSCProductEntries(0L, longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findByA_R(true, true, (-1100), 0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test36()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.fetchByA_R_First(false, false, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findAll(3145, 3145);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.filterCountByActive(true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test39()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByActive(false, 0, 0, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test40()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.getSCProductEntries(173L, (-1036), (-1036), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test41()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findByActive_First(false, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findByActive_Last(false, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByA_R(false, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.getSCProductEntries(1L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByA_R(false, false, 460, 460);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.clearSCProductEntries(5000L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      Class<?> class0 = SCLicenseUtil.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "net.sf.ehcache.rejoin.sleepMillisOnException");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        SCLicenseUtil.findWithDynamicQuery((DynamicQuery) dynamicQueryImpl0, (-1595), (-1595));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.addSCProductEntries(0L, (List<SCProductEntry>) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findByActive(false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.containsSCProductEntries((-17L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.clearCache();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByActive(false, (-1810), (-1810));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.update((SCLicense) null, true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.filterCountByA_R(false, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.addSCProductEntry((-964L), (SCProductEntry) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test56()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.filterFindByActive_PrevAndNext(36524L, true, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findByA_R(false, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test58()  throws Throwable  {
      long[] longArray0 = new long[5];
      // Undeclared exception!
      try {
        SCLicenseUtil.removeSCProductEntries(1596L, longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findByPrimaryKey((-20L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.cacheResult((SCLicense) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.removeAll();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.countAll();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.create(1510L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.getSCProductEntries(0L, (-146), (-146));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseUtil.findByA_R_PrevAndNext((-776L), true, true, (OrderByComparator) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test66()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCLicenseUtil.findByA_R(true, true, 668, 668, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
