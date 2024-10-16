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
import com.liferay.portal.service.permission.LayoutSetPrototypePermission;
import com.liferay.portal.service.permission.LayoutSetPrototypePermissionImpl;
import com.liferay.portal.service.permission.LayoutSetPrototypePermissionUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LayoutSetPrototypePermissionUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        LayoutSetPrototypePermissionUtil.check((PermissionChecker) null, (-270L), (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LayoutSetPrototypePermissionUtil layoutSetPrototypePermissionUtil0 = new LayoutSetPrototypePermissionUtil();
      LayoutSetPrototypePermissionImpl layoutSetPrototypePermissionImpl0 = new LayoutSetPrototypePermissionImpl();
      layoutSetPrototypePermissionUtil0.setLayoutSetPrototypePermission((LayoutSetPrototypePermission) layoutSetPrototypePermissionImpl0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        LayoutSetPrototypePermissionUtil.contains((PermissionChecker) null, (-2027L), "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
