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
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.service.LayoutSetLocalService;
import com.liferay.portal.service.LayoutSetLocalServiceWrapper;
import com.liferay.portal.service.ServiceContext;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.TimeZone;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LayoutSetLocalServiceWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getLayoutSetsByLayoutSetPrototypeUuid("-qRqP~J7z3 X85:");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLogo(16L, false, false, byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getPersistedModel((Serializable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      Class<?> class0 = TimeZone.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "V2/u");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.dynamicQuery((DynamicQuery) dynamicQueryImpl0, (-9), (-9));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.deleteLayoutSet(10000000L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 0, 0, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateVirtualHost((-1462L), true, "$>XG%_P");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLogo(61L, false, false, (File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      layoutSetLocalServiceWrapper0.setWrappedService((LayoutSetLocalService) layoutSetLocalServiceWrapper0);
  }

  @Test
  public void test9()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.setBeanIdentifier("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLogo((-966L), false, false, (InputStream) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.deleteLayoutSet((LayoutSet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getLayoutSet("8ErbP@z{t)E");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateSettings(5000L, true, "l&/q");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.addLayoutSet((LayoutSet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updatePageCount((-1851L), false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.dynamicQuery();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      LayoutSetLocalService layoutSetLocalService0 = layoutSetLocalServiceWrapper0.getWrappedService();
      assertNull(layoutSetLocalService0);
  }

  @Test
  public void test19()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLayoutSet((LayoutSet) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.deleteLayoutSet(0L, false, serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.fetchLayoutSet("defaultLogic00");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLogo((-1200L), true, true, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.addLayoutSet(1284652111260L, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.fetchLayoutSet(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getLayoutSet((-1L), true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getBeanIdentifier();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLayoutSetPrototypeLinkEnabled(0L, true, false, "4:oYACG'Hy");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLookAndFeel(0L, "x#Y:p", "x#Y:p", "x#Y:p", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getLayoutSet(1L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLayoutSet((LayoutSet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test31()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.dynamicQuery((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test32()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.updateLookAndFeel((-887L), false, "*pq6N%]@mn>xy9", "*pq6N%]@mn>xy9", "*pq6N%]@mn>xy9", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test33()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getLayoutSets((-1477), (-1477));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test34()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.getLayoutSetsCount();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test35()  throws Throwable  {
      LayoutSetLocalServiceWrapper layoutSetLocalServiceWrapper0 = new LayoutSetLocalServiceWrapper((LayoutSetLocalService) null);
      // Undeclared exception!
      try {
        layoutSetLocalServiceWrapper0.createLayoutSet(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
