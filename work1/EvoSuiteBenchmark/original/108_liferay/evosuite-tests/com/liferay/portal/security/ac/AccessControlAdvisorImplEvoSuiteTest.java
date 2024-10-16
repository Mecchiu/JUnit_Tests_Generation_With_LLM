/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.ac;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.security.ac.AccessControlAdvisorImpl;
import com.liferay.portal.security.ac.AccessControlled;
import java.lang.reflect.Method;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AccessControlAdvisorImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AccessControlAdvisorImpl accessControlAdvisorImpl0 = new AccessControlAdvisorImpl();
      try {
        accessControlAdvisorImpl0.accept((Method) null, (AccessControlled) null);
        fail("Expecting exception: SecurityException");
      } catch(SecurityException e) {
        /*
         * Authenticated access required
         */
      }
  }
}
