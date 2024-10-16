/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserGroupRoleServiceUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UserGroupRoleServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[6];
      // Undeclared exception!
      try {
        UserGroupRoleServiceUtil.deleteUserGroupRoles(longArray0, 0L, 0L);
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
        UserGroupRoleServiceUtil.getBeanIdentifier();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      long[] longArray0 = new long[7];
      // Undeclared exception!
      try {
        UserGroupRoleServiceUtil.addUserGroupRoles(longArray0, 0L, 1869L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      UserGroupRoleServiceUtil userGroupRoleServiceUtil0 = new UserGroupRoleServiceUtil();
      assertNotNull(userGroupRoleServiceUtil0);
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        UserGroupRoleServiceUtil.setBeanIdentifier("#k^");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      long[] longArray0 = new long[16];
      // Undeclared exception!
      try {
        UserGroupRoleServiceUtil.deleteUserGroupRoles((-1615L), (-1615L), longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      long[] longArray0 = new long[1];
      // Undeclared exception!
      try {
        UserGroupRoleServiceUtil.addUserGroupRoles((-12L), (-12L), longArray0);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
