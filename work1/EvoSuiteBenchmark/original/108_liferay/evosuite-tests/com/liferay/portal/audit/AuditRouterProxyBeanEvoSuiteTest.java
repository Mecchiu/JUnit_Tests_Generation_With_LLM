/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.audit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.audit.AuditRouterProxyBean;
import com.liferay.portal.kernel.audit.AuditMessage;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuditRouterProxyBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AuditRouterProxyBean auditRouterProxyBean0 = new AuditRouterProxyBean();
      // Undeclared exception!
      try {
        auditRouterProxyBean0.route((AuditMessage) null);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }
}
