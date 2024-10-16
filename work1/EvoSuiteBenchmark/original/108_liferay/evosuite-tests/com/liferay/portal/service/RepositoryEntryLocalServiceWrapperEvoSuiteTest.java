/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.model.RepositoryEntry;
import com.liferay.portal.service.RepositoryEntryLocalService;
import com.liferay.portal.service.RepositoryEntryLocalServiceWrapper;
import com.liferay.portal.service.ServiceContext;
import java.io.Serializable;
import javax.media.jai.PropertyGenerator;
import javax.media.jai.operator.DFTDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RepositoryEntryLocalServiceWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 322, 322, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.deleteRepositoryEntry(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.addRepositoryEntry(585L, 585L, "L3|@O|YC&I+_W}lf&", serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.getRepositoryEntriesCount();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      repositoryEntryLocalServiceWrapper0.setWrappedService((RepositoryEntryLocalService) null);
  }

  @Test
  public void test6()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.getBeanIdentifier();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      RepositoryEntryLocalService repositoryEntryLocalService0 = repositoryEntryLocalServiceWrapper0.getWrappedService();
      assertNull(repositoryEntryLocalService0);
  }

  @Test
  public void test8()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.getRepositoryEntries(0, (-18));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.updateRepositoryEntry((RepositoryEntry) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.addRepositoryEntry((RepositoryEntry) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.deleteRepositoryEntry((RepositoryEntry) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.setBeanIdentifier("#");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.getRepositoryEntryByUuidAndGroupId((String) null, 320L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.getRepositoryEntry((-1188L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.createRepositoryEntry(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.dynamicQuery((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.updateRepositoryEntry((RepositoryEntry) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.dynamicQuery();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.fetchRepositoryEntry(34359738368L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.updateRepositoryEntry(0L, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      RepositoryEntryLocalServiceWrapper repositoryEntryLocalServiceWrapper0 = new RepositoryEntryLocalServiceWrapper((RepositoryEntryLocalService) null);
      DFTDescriptor dFTDescriptor0 = new DFTDescriptor();
      PropertyGenerator[] propertyGeneratorArray0 = dFTDescriptor0.getPropertyGenerators();
      // Undeclared exception!
      try {
        repositoryEntryLocalServiceWrapper0.getPersistedModel((Serializable) propertyGeneratorArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
