/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.permission.UserGroupRolePermissionImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UserGroupRolePermissionImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UserGroupRolePermissionImpl userGroupRolePermissionImpl0 = new UserGroupRolePermissionImpl();
      assertNotNull(userGroupRolePermissionImpl0);
  }
}
