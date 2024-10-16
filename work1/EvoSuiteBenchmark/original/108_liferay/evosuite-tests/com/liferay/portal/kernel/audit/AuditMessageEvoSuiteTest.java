/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.audit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.json.JSONObjectImpl;
import com.liferay.portal.kernel.audit.AuditMessage;
import com.liferay.portal.kernel.json.JSONObject;
import java.awt.RenderingHints;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import org.jfree.data.time.Week;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuditMessageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      String string0 = auditMessage0.getClassName();
      assertNotNull(string0);
      assertEquals(5L, auditMessage0.getUserId());
      assertEquals(5L, auditMessage0.getCompanyId());
  }

  @Test
  public void test1()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setServerPort((-940));
      assertEquals(-940, auditMessage0.getServerPort());
      assertEquals(2028L, auditMessage0.getCompanyId());
  }

  @Test
  public void test2()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.getSessionID();
      assertEquals(5L, auditMessage0.getCompanyId());
      assertEquals(5L, auditMessage0.getUserId());
  }

  @Test
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setClassPK(5L);
      assertEquals("5", auditMessage0.getClassPK());
      assertEquals(5L, auditMessage0.getCompanyId());
  }

  @Test
  public void test4()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage(",Mrx", (-1620L), (-1620L), ",Mrx", ",Mrx", ",Mrx", ",Mrx", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setClientIP(",Mrx");
      assertEquals((-1620L), auditMessage0.getCompanyId());
      assertEquals((-1620L), auditMessage0.getUserId());
  }

  @Test
  public void test5()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.getServerName();
      assertEquals(5L, auditMessage0.getUserId());
      assertEquals(5L, auditMessage0.getCompanyId());
  }

  @Test
  public void test6()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      String string0 = auditMessage0.getEventType();
      assertEquals(5L, auditMessage0.getUserId());
      assertNotNull(string0);
      assertEquals(5L, auditMessage0.getCompanyId());
  }

  @Test
  public void test7()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.getClientIP();
      assertEquals(5L, auditMessage0.getCompanyId());
      assertEquals(5L, auditMessage0.getUserId());
  }

  @Test
  public void test8()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setSessionID("5?<C");
      assertEquals(5L, auditMessage0.getCompanyId());
      assertEquals(5L, auditMessage0.getUserId());
  }

  @Test
  public void test9()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage(",Mrx", (-1620L), (-1620L), ",Mrx", ",Mrx", ",Mrx", ",Mrx", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      Date date0 = auditMessage0.getTimestamp();
      assertNotNull(date0);
      assertEquals(1372740258635L, date0.getTime());
  }

  @Test
  public void test10()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setServerName("_ N:!wHlFI");
      assertEquals(2028L, auditMessage0.getCompanyId());
      assertEquals(2028L, auditMessage0.getUserId());
  }

  @Test
  public void test11()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage(",Mrx", (-1620L), (-1620L), ",Mrx", ",Mrx", ",Mrx", ",Mrx", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      long long0 = auditMessage0.getUserId();
      assertEquals((-1620L), auditMessage0.getCompanyId());
      assertEquals((-1620L), long0);
  }

  @Test
  public void test12()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setTimestamp((Date) null);
      assertEquals(2028L, auditMessage0.getUserId());
      assertEquals(2028L, auditMessage0.getCompanyId());
  }

  @Test
  public void test13()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setCompanyId(5L);
      assertEquals(5L, auditMessage0.getCompanyId());
      assertEquals(5L, auditMessage0.getUserId());
  }

  @Test
  public void test14()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setEventType("_ N:!wHlFI");
      assertEquals(2028L, auditMessage0.getCompanyId());
      assertEquals(2028L, auditMessage0.getUserId());
  }

  @Test
  public void test15()  throws Throwable  {
      Date date0 = new Date((-1224L));
      String[] stringArray0 = new String[1];
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Object) "date-time-at-completed", stringArray0);
      AuditMessage auditMessage0 = new AuditMessage("", (-1224L), (-1224L), "", "", "", "", date0, (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setAdditionalInfo((JSONObject) jSONObjectImpl0);
      assertEquals((-1224L), auditMessage0.getUserId());
      assertEquals((-1224L), auditMessage0.getCompanyId());
  }

  @Test
  public void test16()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setUserId(2028L);
      assertEquals(2028L, auditMessage0.getCompanyId());
      assertEquals(2028L, auditMessage0.getUserId());
  }

  @Test
  public void test17()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setClientHost("5?<C");
      assertEquals(5L, auditMessage0.getUserId());
      assertEquals(5L, auditMessage0.getCompanyId());
  }

  @Test
  public void test18()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      // Undeclared exception!
      try {
        auditMessage0.toJSONObject();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage(",Mrx", (-1620L), (-1620L), ",Mrx", ",Mrx", ",Mrx", ",Mrx", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      long long0 = auditMessage0.getCompanyId();
      assertEquals((-1620L), long0);
      assertEquals((-1620L), auditMessage0.getUserId());
  }

  @Test
  public void test20()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      String string0 = auditMessage0.getUserName();
      assertEquals(5L, auditMessage0.getCompanyId());
      assertEquals(5L, auditMessage0.getUserId());
      assertNotNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage(",Mrx", (-1620L), (-1620L), ",Mrx", ",Mrx", ",Mrx", ",Mrx", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      String string0 = auditMessage0.getMessage();
      assertNotNull(string0);
      assertEquals((-1620L), auditMessage0.getUserId());
      assertEquals((-1620L), auditMessage0.getCompanyId());
  }

  @Test
  public void test22()  throws Throwable  {
      Week week0 = new Week(69, 69);
      Date date0 = week0.getStart();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage("V}-8AP/0-Ys}T", (-1908L), (-1908L), "V}-8AP/0-Ys}T", "V}-8AP/0-Ys}T", "V}-8AP/0-Ys}T", "V}-8AP/0-Ys}T", date0, (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setUserName("V}-8AP/0-Ys}T");
      assertEquals((-1908L), auditMessage0.getUserId());
      assertEquals((-1908L), auditMessage0.getCompanyId());
  }

  @Test
  public void test23()  throws Throwable  {
      Date date0 = new Date((-1224L));
      String[] stringArray0 = new String[1];
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Object) "date-time-at-completed", stringArray0);
      AuditMessage auditMessage0 = new AuditMessage("", (-1224L), (-1224L), "", "", "", "", date0, (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.getClientHost();
      assertEquals((-1224L), auditMessage0.getCompanyId());
      assertEquals((-1224L), auditMessage0.getUserId());
  }

  @Test
  public void test24()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Object) "default");
      AuditMessage auditMessage0 = new AuditMessage("", (-1856L), (-1856L), "", "", "", "", (Date) null, (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      String string0 = auditMessage0.getClassPK();
      assertEquals((-1856L), auditMessage0.getUserId());
      assertEquals((-1856L), auditMessage0.getCompanyId());
      assertNotNull(string0);
  }

  @Test
  public void test25()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl();
      AuditMessage auditMessage0 = new AuditMessage(",Mrx", (-1620L), (-1620L), ",Mrx", ",Mrx", ",Mrx", ",Mrx", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      JSONObjectImpl jSONObjectImpl1 = (JSONObjectImpl)auditMessage0.getAdditionalInfo();
      assertEquals((-1620L), auditMessage0.getUserId());
      assertNotNull(jSONObjectImpl1);
      assertEquals((-1620L), auditMessage0.getCompanyId());
  }

  @Test
  public void test26()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setClassPK("_ N:!wHlFI");
      assertEquals(2028L, auditMessage0.getCompanyId());
      assertEquals(2028L, auditMessage0.getUserId());
  }

  @Test
  public void test27()  throws Throwable  {
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Object) "default");
      AuditMessage auditMessage0 = new AuditMessage("", (-1856L), (-1856L), "", "", "", "", (Date) null, (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setMessage("default");
      assertEquals((-1856L), auditMessage0.getUserId());
      assertEquals((-1856L), auditMessage0.getCompanyId());
  }

  @Test
  public void test28()  throws Throwable  {
      Properties properties0 = new Properties();
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl((Map<?, ?>) properties0);
      AuditMessage auditMessage0 = new AuditMessage("5?<C", 5L, 5L, "5?<C", "5?<C", "5?<C", "5?<C", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      int int0 = auditMessage0.getServerPort();
      assertEquals(5L, auditMessage0.getCompanyId());
      assertEquals(5L, auditMessage0.getUserId());
      assertEquals(0, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      Object object0 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      JSONObjectImpl jSONObjectImpl0 = new JSONObjectImpl(object0);
      AuditMessage auditMessage0 = new AuditMessage("_ N:!wHlFI", 2028L, 2028L, "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", "_ N:!wHlFI", (JSONObject) jSONObjectImpl0);
      assertNotNull(auditMessage0);
      
      auditMessage0.setClassName("_ N:!wHlFI");
      assertEquals(2028L, auditMessage0.getCompanyId());
      assertEquals(2028L, auditMessage0.getUserId());
  }

  @Test
  public void test30()  throws Throwable  {
      AuditMessage auditMessage0 = null;
      try {
        auditMessage0 = new AuditMessage("qhn\f/o", 34L, 34L, "qhn\f/o", "qhn\f/o", "qhn\f/o", "qhn\f/o");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
