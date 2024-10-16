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
import com.liferay.portal.service.permission.PortalPermissionImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortalPermissionImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortalPermissionImpl portalPermissionImpl0 = new PortalPermissionImpl();
      // Undeclared exception!
      try {
        portalPermissionImpl0.check((PermissionChecker) null, "org.bouncycvstle.jce.prLvider.*CEMac$PBEWithRIPEMD160");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
