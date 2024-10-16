/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.audit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.audit.AuditRequestThreadLocal;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuditRequestThreadLocalEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setRealUserId(0L);
      assertNull(auditRequestThreadLocal0.getServerName());
  }

  @Test
  public void test1()  throws Throwable  {
      AuditRequestThreadLocal.removeAuditThreadLocal();
  }

  @Test
  public void test2()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      assertEquals(0, auditRequestThreadLocal0.getServerPort());
      assertNotNull(auditRequestThreadLocal0);
      
      auditRequestThreadLocal0.setServerPort((-1092));
      assertEquals(-1092, auditRequestThreadLocal0.getServerPort());
  }

  @Test
  public void test3()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      assertNotNull(auditRequestThreadLocal0);
      
      int int0 = auditRequestThreadLocal0.getServerPort();
      assertEquals(1092, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setRequestURL("");
      assertNull(auditRequestThreadLocal0.getClientIP());
  }

  @Test
  public void test5()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      String string0 = auditRequestThreadLocal0.getRequestURL();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setServerName("");
      assertNull(auditRequestThreadLocal0.getClientIP());
  }

  @Test
  public void test7()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getQueryString();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.getSessionID();
      AuditRequestThreadLocal auditRequestThreadLocal1 = new AuditRequestThreadLocal();
      auditRequestThreadLocal1.setSessionID("AdY~%8Mm");
      AuditRequestThreadLocal auditRequestThreadLocal2 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal2.getClientIP();
      auditRequestThreadLocal2.getClientIP();
      auditRequestThreadLocal2.getServerName();
      AuditRequestThreadLocal auditRequestThreadLocal3 = new AuditRequestThreadLocal();
      auditRequestThreadLocal3.setQueryString((String) null);
      auditRequestThreadLocal3.getRealUserId();
      auditRequestThreadLocal3.getServerName();
      auditRequestThreadLocal1.setClientIP((String) null);
      assertNull(auditRequestThreadLocal1.getClientIP());
  }

  @Test
  public void test9()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getClientHost();
      assertNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getClientIP();
      assertNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setClientHost("");
      assertEquals(0L, auditRequestThreadLocal0.getRealUserId());
  }
}
