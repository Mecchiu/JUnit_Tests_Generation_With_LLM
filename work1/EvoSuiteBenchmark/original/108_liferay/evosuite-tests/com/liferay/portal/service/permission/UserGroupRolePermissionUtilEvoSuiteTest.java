/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.permission.UserGroupRolePermission;
import com.liferay.portal.service.permission.UserGroupRolePermissionImpl;
import com.liferay.portal.service.permission.UserGroupRolePermissionUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UserGroupRolePermissionUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        UserGroupRolePermissionUtil.contains((PermissionChecker) null, 268435456L, 268435456L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      UserGroupRolePermissionUtil userGroupRolePermissionUtil0 = new UserGroupRolePermissionUtil();
      UserGroupRolePermissionImpl userGroupRolePermissionImpl0 = (UserGroupRolePermissionImpl)UserGroupRolePermissionUtil.getUserGroupRolePermission();
      userGroupRolePermissionUtil0.setUserGroupRolePermission((UserGroupRolePermission) userGroupRolePermissionImpl0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        UserGroupRolePermissionUtil.check((PermissionChecker) null, 176L, 176L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
