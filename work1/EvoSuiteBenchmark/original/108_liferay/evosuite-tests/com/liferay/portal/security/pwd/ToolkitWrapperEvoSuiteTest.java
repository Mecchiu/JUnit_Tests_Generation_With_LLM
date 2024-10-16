/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.pwd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.PasswordPolicy;
import com.liferay.portal.model.PasswordPolicyWrapper;
import com.liferay.portal.security.pwd.Toolkit;
import com.liferay.portal.security.pwd.ToolkitWrapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ToolkitWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ToolkitWrapper toolkitWrapper0 = new ToolkitWrapper((Toolkit) null);
      // Undeclared exception!
      try {
        toolkitWrapper0.validate(1000L, "RcFUJmT=L ", "RcFUJmT=L ", (PasswordPolicy) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ToolkitWrapper toolkitWrapper0 = new ToolkitWrapper((Toolkit) null);
      // Undeclared exception!
      try {
        toolkitWrapper0.generate((PasswordPolicy) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ToolkitWrapper toolkitWrapper0 = new ToolkitWrapper((Toolkit) null);
      PasswordPolicyWrapper passwordPolicyWrapper0 = new PasswordPolicyWrapper((PasswordPolicy) null);
      // Undeclared exception!
      try {
        toolkitWrapper0.validate(">xu", ">xu", (PasswordPolicy) passwordPolicyWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ToolkitWrapper toolkitWrapper0 = new ToolkitWrapper((Toolkit) null);
      toolkitWrapper0.setToolkit((Toolkit) toolkitWrapper0);
  }

  @Test
  public void test4()  throws Throwable  {
      ToolkitWrapper toolkitWrapper0 = new ToolkitWrapper((Toolkit) null);
      toolkitWrapper0.setToolkit((Toolkit) null);
  }
}
