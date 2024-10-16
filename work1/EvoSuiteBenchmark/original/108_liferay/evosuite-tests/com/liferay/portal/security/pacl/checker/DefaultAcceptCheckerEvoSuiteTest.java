/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.pacl.checker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.security.pacl.checker.DefaultAcceptChecker;
import java.io.ObjectStreamConstants;
import java.io.SerializablePermission;
import java.security.AllPermission;
import java.security.Permission;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultAcceptCheckerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultAcceptChecker defaultAcceptChecker0 = new DefaultAcceptChecker();
      defaultAcceptChecker0.afterPropertiesSet();
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultAcceptChecker defaultAcceptChecker0 = new DefaultAcceptChecker();
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBSTITUTION_PERMISSION;
      defaultAcceptChecker0.checkPermission((Permission) serializablePermission0);
      assertEquals("enableSubstitution", serializablePermission0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultAcceptChecker defaultAcceptChecker0 = new DefaultAcceptChecker();
      AllPermission allPermission0 = new AllPermission();
      defaultAcceptChecker0.checkPermission((Permission) allPermission0);
      assertEquals("(java.security.AllPermission <all permissions> <all actions>)", allPermission0.toString());
  }
}
