/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.rolesadmin.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.rolesadmin.util.RolesAdminImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RolesAdminImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RolesAdminImpl rolesAdminImpl0 = new RolesAdminImpl();
      assertNotNull(rolesAdminImpl0);
  }
}
