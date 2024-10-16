/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.permission.UserPermission;
import com.liferay.portal.service.permission.UserPermissionImpl;
import com.liferay.portal.service.permission.UserPermissionUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UserPermissionUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        UserPermissionUtil.contains((PermissionChecker) null, 1037L, (-1361L), (-1361L), "BY8/,>fKZf6k[kKkI");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      UserPermissionUtil userPermissionUtil0 = new UserPermissionUtil();
      UserPermissionImpl userPermissionImpl0 = (UserPermissionImpl)UserPermissionUtil.getUserPermission();
      userPermissionUtil0.setUserPermission((UserPermission) userPermissionImpl0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        UserPermissionUtil.check((PermissionChecker) null, 0L, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        UserPermissionUtil.check((PermissionChecker) null, 0L, 0L, 0L, "[Q!#'($");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        UserPermissionUtil.contains((PermissionChecker) null, 0L, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
