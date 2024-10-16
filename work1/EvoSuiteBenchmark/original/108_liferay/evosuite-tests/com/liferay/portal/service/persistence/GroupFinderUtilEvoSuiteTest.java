/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.NoSuchGroupException;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.service.persistence.GroupFinder;
import com.liferay.portal.service.persistence.GroupFinderImpl;
import com.liferay.portal.service.persistence.GroupFinderUtil;
import java.util.LinkedHashMap;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GroupFinderUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>(0, 500.3566F);
      // Undeclared exception!
      try {
        GroupFinderUtil.countByKeywords(7L, "$HiSaDg^!,6_c?", linkedHashMap0);
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
        GroupFinderUtil.findByC_N((-610L), "");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      GroupFinderUtil groupFinderUtil0 = new GroupFinderUtil();
      // Undeclared exception!
      try {
        GroupFinderUtil.getFinder();
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
        GroupFinderUtil.findBySystem(8L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      long[] longArray0 = new long[8];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_C_PG_N_D(1L, longArray0, (-839L), "?(E*%!V", "?(E*%!V", "TABLE", "TABLE", linkedHashMap0, true);
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
        GroupFinderUtil.findByNullFriendlyURL();
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
        GroupFinderUtil.findByLayouts(1623L, 1623L, true, (-290), 1);
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
        GroupFinderUtil.countByG_U((-1375L), 1299L, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_N_D(1000L, "", "", "", linkedHashMap0, false, (-1073741725), 447, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
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
        GroupFinderUtil.countByLayouts((-48L), (-48L), false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[9];
      String[] stringArray0 = new String[6];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_C_PG_N_D(0L, longArray0, 0L, (String) null, stringArray0, stringArray0, stringArray0, linkedHashMap0, true, 924, 1045, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      long[] longArray0 = new long[1];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByKeywords(10800000L, longArray0, "FileChooser.win32.newFolder", linkedHashMap0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_PG_N_D(1L, 1L, (String) null, (String) null, (String) null, (String) null, linkedHashMap0, true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByCompanyId((-1219L), (LinkedHashMap<String, Object>) null, 1481, 0, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(true);
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_PG_N_D(10800000L, 15L, "", stringArray0, stringArray0, stringArray0, (LinkedHashMap<String, Object>) null, true, 1397, 1397, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      long[] longArray0 = new long[9];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_C_PG_N_D((-1L), longArray0, (-632L), "", "", "", "", linkedHashMap0, true, (-286), 0, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_PG_N_D((-1300L), (-492L), (String) null, stringArray0, stringArray0, stringArray0, linkedHashMap0, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[6];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_C_N_D(0L, longArray0, "]waLDq6S2Y<", "]waLDq6S2Y<", "]waLDq6S2Y<", linkedHashMap0, false, (-1599), (-1525), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      long[] longArray0 = new long[4];
      // Undeclared exception!
      try {
        GroupFinderUtil.findByKeywords(852L, longArray0, "", (LinkedHashMap<String, Object>) null, 0, 0, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[8];
      String[] stringArray0 = new String[5];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_C_PG_N_D((-32L), longArray0, (-32L), "Ze7J", stringArray0, stringArray0, stringArray0, linkedHashMap0, true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_N_D(800L, "yy,5XV}wn@{J`l4Y$BQ", "yy,5XV}wn@{J`l4Y$BQ", "yy,5XV}wn@{J`l4Y$BQ", linkedHashMap0, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(false);
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_PG_N_D(1049L, 1049L, (String) null, (String) null, (String) null, (String) null, linkedHashMap0, false, 2001, 2001, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByKeywords((-326L), (-326L), "w;A}q", "w;A}q", linkedHashMap0, 4, 4, (OrderByComparator) baseWorkflowTaskNameComparator0);
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
        GroupFinderUtil.findByNoLayouts(1L, true, (-979), 0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByKeywords(1000000L, 1526L, (String) null, (String) null, linkedHashMap0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test25()  throws Throwable  {
      long[] longArray0 = new long[8];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_C_N_D(0L, longArray0, "", "", "", linkedHashMap0, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      long[] longArray0 = new long[10];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(false);
      // Undeclared exception!
      try {
        GroupFinderUtil.findByKeywords(1955L, longArray0, 1955L, "K", "K", linkedHashMap0, (-1093), (-1093), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      // Undeclared exception!
      try {
        GroupFinderUtil.findByKeywords((-893L), "", (LinkedHashMap<String, Object>) null, (-2042), (-2042), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String[] stringArray1 = new String[8];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByC_N_D(29L, stringArray0, stringArray1, stringArray1, linkedHashMap0, true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      long[] longArray0 = new long[7];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.countByKeywords(0L, longArray0, 29L, "", "", linkedHashMap0);
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
        GroupFinderUtil.findByLiveGroups();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[7];
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        GroupFinderUtil.findByC_N_D(0L, stringArray0, stringArray0, stringArray0, linkedHashMap0, false, (-1455), 941, (OrderByComparator) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
