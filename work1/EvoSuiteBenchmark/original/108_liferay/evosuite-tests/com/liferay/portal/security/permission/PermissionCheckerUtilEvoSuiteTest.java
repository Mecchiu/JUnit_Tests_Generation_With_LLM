/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserWrapper;
import com.liferay.portal.security.permission.PermissionCheckerUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PermissionCheckerUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PermissionCheckerUtil permissionCheckerUtil0 = new PermissionCheckerUtil();
      assertNotNull(permissionCheckerUtil0);
  }

  @Test
  public void test1()  throws Throwable  {
      UserWrapper userWrapper0 = new UserWrapper((User) null);
      // Undeclared exception!
      try {
        PermissionCheckerUtil.setThreadValues((User) userWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PermissionCheckerUtil.setThreadValues((User) null);
  }
}
