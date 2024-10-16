/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.asset.service;

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
import com.liferay.portal.service.LockLocalService;
import com.liferay.portlet.asset.model.AssetLink;
import com.liferay.portlet.asset.service.AssetLinkLocalService;
import com.liferay.portlet.asset.service.AssetLinkLocalServiceWrapper;
import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AssetLinkLocalServiceWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.addLink((-1752L), (-1752L), (-1752L), 1671, 209);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getReverseLinks((long) 1710, 1710);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      AssetLinkLocalService assetLinkLocalService0 = assetLinkLocalServiceWrapper0.getWrappedService();
      assertNull(assetLinkLocalService0);
  }

  @Test
  public void test4()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getDirectLinks((-1885L), 439);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.deleteLink(5L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.deleteLinks((-2029L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.addAssetLink((AssetLink) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getLinks(1198L, 343);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.setBeanIdentifier("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getAssetLink(7L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.deleteLinks((-7L), (-7L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.deleteLink((AssetLink) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getPersistedModel((Serializable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.dynamicQuery();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.deleteAssetLink(762L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(false);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, (-1), (-1), (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      long[] longArray0 = new long[10];
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.updateLinks((-192L), 1749L, longArray0, 97);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      assetLinkLocalServiceWrapper0.setWrappedService((AssetLinkLocalService) null);
  }

  @Test
  public void test20()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getLinks(652L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.fetchAssetLink(1284652111280L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      Class<?> class0 = LockLocalService.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "#aqj7m4lD mj^I`lo)d");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.dynamicQuery((DynamicQuery) dynamicQueryImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.updateAssetLink((AssetLink) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.deleteAssetLink((AssetLink) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getDirectLinks(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getBeanIdentifier();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.updateAssetLink((AssetLink) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getAssetLinksCount();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.createAssetLink((-1300L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      AssetLinkLocalServiceWrapper assetLinkLocalServiceWrapper0 = new AssetLinkLocalServiceWrapper((AssetLinkLocalService) null);
      // Undeclared exception!
      try {
        assetLinkLocalServiceWrapper0.getAssetLinks(358, 358);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
