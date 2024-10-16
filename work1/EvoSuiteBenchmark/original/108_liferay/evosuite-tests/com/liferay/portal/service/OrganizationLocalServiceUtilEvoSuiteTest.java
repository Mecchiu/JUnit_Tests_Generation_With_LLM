/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.caucho.servlet.comet.CometServlet;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.OrganizationWrapper;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OrganizationLocalServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.deleteLogo((-2019L));
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
        OrganizationLocalServiceUtil.updateOrganization((Organization) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.search((-1761L), (-1761L), "", "", (Long) 0L, (Long) (-1761L), linkedHashMap0, (-1120), 0, (OrderByComparator) null);
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
        OrganizationLocalServiceUtil.getOrganizations((-761L), (-761L), 1, 1);
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
        OrganizationLocalServiceUtil.getOrganization(65535L);
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
        OrganizationLocalServiceUtil.addOrganization((Organization) null);
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
        OrganizationLocalServiceUtil.search(67108844L, (LinkedHashMap<String, Object>) null, 120, 120);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      OrganizationLocalServiceUtil organizationLocalServiceUtil0 = new OrganizationLocalServiceUtil();
      assertNotNull(organizationLocalServiceUtil0);
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.dynamicQueryCount((DynamicQuery) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      long[] longArray0 = new long[6];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.addPasswordPolicyOrganizations((-1266L), longArray0);
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
        OrganizationLocalServiceUtil.rebuildTree(0L);
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
        OrganizationLocalServiceUtil.deleteOrganization((Organization) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.updateOrganization(0L, (-1710L), 0L, "0x6}~z=c(9?9C", "7#uf8}}9/SU|^26X>", true, (-1901L), 0L, 9554, "7#uf8}}9/SU|^26X>", true, serviceContext0);
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
        OrganizationLocalServiceUtil.getOrganizationsCount((-1L), (-1L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      OrganizationWrapper organizationWrapper0 = new OrganizationWrapper((Organization) null);
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.updateOrganization((Organization) organizationWrapper0, false);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      long[] longArray0 = new long[7];
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.updateAsset(1241L, (Organization) null, longArray0, stringArray0);
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
        OrganizationLocalServiceUtil.getParentOrganizations((-14L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.search((long) 632, (long) 632, "", "Can't enlist resource {0} because the transaction is suspended.", "", "Can't enlist resource {0} because the transaction is suspended.", "", (Long) 0L, (Long) 0L, linkedHashMap0, true, 632, 1983, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.searchCount((-1L), (-1L), "C|l.pde;*X<lS(HeQ", "C|l.pde;*X<lS(HeQ", "C|l.pde;*X<lS(HeQ", "C|l.pde;*X<lS(HeQ", "C|l.pde;*X<lS(HeQ", (Long) (-1L), (Long) (-1L), linkedHashMap0, false);
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
        OrganizationLocalServiceUtil.addOrganizationResources((-143L), (Organization) null);
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
        OrganizationLocalServiceUtil.getOrganizations((-357L), (-357L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName("fS]W5C_~cWgH99T\"m-M");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, 0, 0);
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
        OrganizationLocalServiceUtil.hasUserOrganization(0L, 0L, false, false);
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
        OrganizationLocalServiceUtil.dynamicQuery();
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
        OrganizationLocalServiceUtil.hasPasswordPolicyOrganization(0L, 0L);
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
        OrganizationLocalServiceUtil.getUserOrganizations(60L);
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
        OrganizationLocalServiceUtil.setBeanIdentifier("");
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
        OrganizationLocalServiceUtil.fetchOrganization((-4L));
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
        OrganizationLocalServiceUtil.getUserOrganizations(1741L, 1050, 1050);
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
        OrganizationLocalServiceUtil.getOrganizationsCount();
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
        OrganizationLocalServiceUtil.createOrganization(1955L);
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
        OrganizationLocalServiceUtil.hasUserOrganization(604800000L, 0L);
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
        OrganizationLocalServiceUtil.deleteOrganization((-1372L));
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
        OrganizationLocalServiceUtil.getPersistedModel((Serializable) null);
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
        OrganizationLocalServiceUtil.getBeanIdentifier();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test35()  throws Throwable  {
      long[] longArray0 = new long[3];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.setGroupOrganizations(128L, longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test36()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Sort sort0 = new Sort("{pzWOvWg5^Tt*H)5", true);
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.search((-1282L), (-1282L), "{pzWOvWg5^Tt*H)5", linkedHashMap0, 270, (-76), sort0);
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
        OrganizationLocalServiceUtil.getUserOrganizations(688L, false);
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
        OrganizationLocalServiceUtil.getSuborganizations((List<Organization>) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.getOrganization(14L, "icAqZNPL%UOQ");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test40()  throws Throwable  {
      long[] longArray0 = new long[7];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.unsetGroupOrganizations(0L, longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test41()  throws Throwable  {
      Class<?> class0 = CometServlet.class;
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forClass(class0);
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.getGroupOrganizations(1142L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test43()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.search(0L, 0L, "When connecting to a pre-7.3 server, the database encoding to assume is in use.", "When connecting to a pre-7.3 server, the database encoding to assume is in use.", (Long) 0L, (Long) 0L, linkedHashMap0, 748, 0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.addOrganization(435L, 435L, "wg=L&\"LX", "wg=L&\"LX", false, 435L, 435L, 887, "wg=L&\"LX", false, serviceContext0);
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
        OrganizationLocalServiceUtil.hasGroupOrganization(1038L, 1038L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test46()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.search(0L, 0L, "mc[3?zEAi", ".*", "mc[3?zEAi", "mc[3?zEAi", ".*", (Long) 0L, (Long) 0L, linkedHashMap0, true, (-1386), (-1386));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      Long long0 = new Long((-447L));
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.searchCount(1225L, (-447L), "\"q|[wx=l%rP>RgNS >", "\"q|[wx=l%rP>RgNS >", long0, (Long) 1225L, (LinkedHashMap<String, Object>) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test48()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Sort sort0 = new Sort("nwef", 0, true);
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.search(790L, 790L, "nwef", "nwef", "nwef", "nwef", "nwef", "nwef", "nwef", linkedHashMap0, true, 1678, 1678, sort0);
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
        OrganizationLocalServiceUtil.getOrganizations(2608, 2608);
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
        OrganizationLocalServiceUtil.getOrganizationId(0L, ")");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test51()  throws Throwable  {
      DetachedCriteria detachedCriteria0 = DetachedCriteria.forEntityName("hA};\"(sHCA", "hA};\"(sHCA");
      DynamicQueryImpl dynamicQueryImpl0 = new DynamicQueryImpl(detachedCriteria0);
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.dynamicQuery((DynamicQuery) dynamicQueryImpl0, 0, 592, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test52()  throws Throwable  {
      long[] longArray0 = new long[5];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.getOrganizations(longArray0);
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
        OrganizationLocalServiceUtil.getUserOrganizationsCount((-1948L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test54()  throws Throwable  {
      long[] longArray0 = new long[1];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.addGroupOrganizations(1166L, longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test55()  throws Throwable  {
      long[] longArray0 = new long[8];
      // Undeclared exception!
      try {
        OrganizationLocalServiceUtil.unsetPasswordPolicyOrganizations((-103L), longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
