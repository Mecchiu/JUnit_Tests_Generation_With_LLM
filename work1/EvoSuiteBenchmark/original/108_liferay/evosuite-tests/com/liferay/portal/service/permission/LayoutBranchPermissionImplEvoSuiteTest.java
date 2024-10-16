/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.LayoutBranch;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.permission.LayoutBranchPermissionImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LayoutBranchPermissionImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LayoutBranchPermissionImpl layoutBranchPermissionImpl0 = new LayoutBranchPermissionImpl();
      // Undeclared exception!
      try {
        layoutBranchPermissionImpl0.check((PermissionChecker) null, 170L, (String) null);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LayoutBranchPermissionImpl layoutBranchPermissionImpl0 = new LayoutBranchPermissionImpl();
      // Undeclared exception!
      try {
        layoutBranchPermissionImpl0.check((PermissionChecker) null, (LayoutBranch) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
