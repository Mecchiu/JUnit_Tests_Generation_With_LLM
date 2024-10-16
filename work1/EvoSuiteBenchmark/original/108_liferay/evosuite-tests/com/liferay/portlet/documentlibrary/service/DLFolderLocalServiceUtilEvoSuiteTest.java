/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.documentlibrary.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.caucho.java.gen.BaseMethod;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.QueryDefinition;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DLFolderLocalServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.deleteFolder((-1589L));
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
        DLFolderLocalServiceUtil.deleteAll((-495L));
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
        DLFolderLocalServiceUtil.getCompanyFoldersCount(1161L);
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
        DLFolderLocalServiceUtil.getMountFoldersCount((-7L), (-7L));
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
        DLFolderLocalServiceUtil.updateDLFolder((DLFolder) null);
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
        DLFolderLocalServiceUtil.getPersistedModel((Serializable) "yHj}J+,Eg]il`7.equals(yHj}J+,Eg]il`7)");
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
        DLFolderLocalServiceUtil.getSubfolderIds((List<Long>) null, (-9L), (-9L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      QueryDefinition queryDefinition0 = new QueryDefinition();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getFileEntriesAndFileShortcuts((-1027L), (-1027L), queryDefinition0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.dynamicQuery((DynamicQuery) null, 41, 41, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
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
        DLFolderLocalServiceUtil.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getFolders(0L, 0L, true, 0, 0, (OrderByComparator) baseWorkflowTaskNameComparator0);
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
        DLFolderLocalServiceUtil.getFoldersCount((-1898L), (-1898L), false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "s Pm\\8@{";
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName(string0, string0);
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      int int0 = (-1);
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, int0, int0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.updateFolder(663L, "d_=QS)s>.s-dUm|pD<", "d_=QS)s>.s-dUm|pD<", 663L, (List<Long>) null, true, serviceContext0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      Map<String, Serializable> map0 = serviceContext0.getExpandoBridgeAttributes();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.updateStatus((-163L), 0L, 8, map0, serviceContext0);
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
        DLFolderLocalServiceUtil.getFileEntriesAndFileShortcutsCount(36028797018963968L, 36028797018963968L, (QueryDefinition) null);
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
        DLFolderLocalServiceUtil.dynamicQuery();
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
        DLFolderLocalServiceUtil.getFolders(539L, 539L);
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
        DLFolderLocalServiceUtil.getFoldersCount((long) (-12), (long) (-12));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test19()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-1602), (-1602), (-1602), (-1602), (-1602), (-1602));
      Date date0 = gregorianCalendar0.getTime();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.updateLastPostDate((-2002L), date0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Class<?> class0 = BaseMethod.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass((Class) class0, "YCLUz^mxTmzU-Q%ET");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0);
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
        DLFolderLocalServiceUtil.deleteFolder(1261L, true);
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
        DLFolderLocalServiceUtil.addFolder((-772L), (-1206L), (-772L), false, (-772L), "`<G.xW\u0000b^e3{<+", "`<G.xW\u0000b^e3{<+", false, serviceContext0);
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
        DLFolderLocalServiceUtil.getFolders((-1742L), (-1742L), false);
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
        DLFolderLocalServiceUtil.getBeanIdentifier();
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
        DLFolderLocalServiceUtil.getCompanyFolders(533L, 434, 434);
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
        DLFolderLocalServiceUtil.getMountFolder(1187L);
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
        DLFolderLocalServiceUtil.updateDLFolder((DLFolder) null, true);
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
        DLFolderLocalServiceUtil.createDLFolder(1422L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.updateFolderAndFileEntryTypes(79L, 79L, "", "", 79L, (List<Long>) null, false, serviceContext0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      DLFolderLocalServiceUtil dLFolderLocalServiceUtil0 = new DLFolderLocalServiceUtil();
      assertNotNull(dLFolderLocalServiceUtil0);
  }

  @Test
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getDLFolders(540, 540);
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
        DLFolderLocalServiceUtil.getDLFolder((-220L));
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
        DLFolderLocalServiceUtil.updateFolder(0L, 0L, (String) null, (String) null, 0L, (List<Long>) null, true, (ServiceContext) null);
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
        DLFolderLocalServiceUtil.getFolder(0L, 0L, "hv[WK)7G5vf ");
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
        DLFolderLocalServiceUtil.getDLFolderByUuidAndGroupId("Exit: SOAPPart::getAsString()", 195L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.addDLFolder((DLFolder) null);
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
        DLFolderLocalServiceUtil.getFolder((-1404L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test38()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(false);
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getMountFolders(1L, 1L, 1037, 1037, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test39()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(false);
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getFolders(667L, 667L, (-71), (-71), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.fetchFolder(72057594037927936L, 72057594037927936L, ". Exception: ");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.deleteDLFolder(0L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.moveFolder(1L, 1L, serviceContext0);
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
        DLFolderLocalServiceUtil.setBeanIdentifier("\"");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[5];
      QueryDefinition queryDefinition0 = new QueryDefinition(1913);
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getFoldersAndFileEntriesAndFileShortcuts((-15L), (-15L), stringArray0, true, queryDefinition0);
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
        DLFolderLocalServiceUtil.getFolderId(350L, 350L);
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
        DLFolderLocalServiceUtil.deleteDLFolder((DLFolder) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getDLFoldersCount();
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
        DLFolderLocalServiceUtil.fetchDLFolder(0L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[5];
      QueryDefinition queryDefinition0 = new QueryDefinition();
      // Undeclared exception!
      try {
        DLFolderLocalServiceUtil.getFoldersAndFileEntriesAndFileShortcutsCount(1800000L, 1800000L, stringArray0, true, queryDefinition0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
