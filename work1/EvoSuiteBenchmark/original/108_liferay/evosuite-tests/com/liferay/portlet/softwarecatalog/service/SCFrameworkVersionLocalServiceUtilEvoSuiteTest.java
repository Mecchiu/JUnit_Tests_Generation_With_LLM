/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.softwarecatalog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ch.qos.logback.core.boolex.JaninoEventEvaluatorBase;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion;
import com.liferay.portlet.softwarecatalog.service.SCFrameworkVersionLocalServiceUtil;
import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import org.jfree.data.time.TimePeriodAnchor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SCFrameworkVersionLocalServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.getSCFrameworkVersionsCount();
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
        SCFrameworkVersionLocalServiceUtil.getSCFrameworkVersion(0L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName("__caucho_loadMask_");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.dynamicQueryCount((DynamicQuery) dynamicQueryImpl0);
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
        SCFrameworkVersionLocalServiceUtil.getBeanIdentifier();
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
        SCFrameworkVersionLocalServiceUtil.updateFrameworkVersion((-1L), "W/SS", "W/SS", false, 1245187);
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
        SCFrameworkVersionLocalServiceUtil.deleteFrameworkVersion((SCFrameworkVersion) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[21];
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.addFrameworkVersionResources(505L, stringArray0, stringArray0);
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
        SCFrameworkVersionLocalServiceUtil.getProductVersionFrameworkVersions(20L);
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
        SCFrameworkVersionLocalServiceUtil.getFrameworkVersions((-5L), false);
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
        SCFrameworkVersionLocalServiceUtil.deleteSCFrameworkVersion(353L);
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
        SCFrameworkVersionLocalServiceUtil.createSCFrameworkVersion(10L);
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
        SCFrameworkVersionLocalServiceUtil.deleteSCFrameworkVersion((SCFrameworkVersion) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.addFrameworkVersionResources((SCFrameworkVersion) null, stringArray0, stringArray0);
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
        SCFrameworkVersionLocalServiceUtil.getFrameworkVersionsCount(2032L, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.getFrameworkVersions(14L, false, 1629, 1629);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Class<?> class0 = TimePeriodAnchor.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, (-6), (-6), (OrderByComparator) baseWorkflowTaskDueDateComparator0);
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
        SCFrameworkVersionLocalServiceUtil.updateSCFrameworkVersion((SCFrameworkVersion) null);
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
        SCFrameworkVersionLocalServiceUtil.addFrameworkVersionResources((SCFrameworkVersion) null, false, false);
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
        SCFrameworkVersionLocalServiceUtil.fetchSCFrameworkVersion((-11L));
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
        SCFrameworkVersionLocalServiceUtil.updateSCFrameworkVersion((SCFrameworkVersion) null, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Class<?> class0 = JaninoEventEvaluatorBase.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "[ozKo%:RZ>wn/hHHYe");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0);
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
        SCFrameworkVersionLocalServiceUtil.getSCFrameworkVersions(331, 331);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.addFrameworkVersion((-1270L), "n<8nso$<3S(f5X{I<A", "n<8nso$<3S(f5X{I<A", false, (-1576), serviceContext0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName("w_VpW(Q#{|$5,>m5\"a");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, (-1920), (-1920));
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
        SCFrameworkVersionLocalServiceUtil.setBeanIdentifier("F+w");
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
        SCFrameworkVersionLocalServiceUtil.getFrameworkVersions(765L, (-1728), (-1728));
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
        SCFrameworkVersionLocalServiceUtil.deleteFrameworkVersions((-1537L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      SCFrameworkVersionLocalServiceUtil sCFrameworkVersionLocalServiceUtil0 = new SCFrameworkVersionLocalServiceUtil();
      assertNotNull(sCFrameworkVersionLocalServiceUtil0);
  }

  @Test
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.addSCFrameworkVersion((SCFrameworkVersion) null);
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
        SCFrameworkVersionLocalServiceUtil.getPersistedModel((Serializable) "");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.getFrameworkVersionsCount((-1890L));
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
        SCFrameworkVersionLocalServiceUtil.getFrameworkVersion(765L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.dynamicQuery();
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
        SCFrameworkVersionLocalServiceUtil.addFrameworkVersionResources((-1411L), false, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try {
        SCFrameworkVersionLocalServiceUtil.deleteFrameworkVersion((-19L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
