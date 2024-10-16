/*
 * This file was automatically generated by EvoSuite
 */

package de.huxhorn.lilith.data.access;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.huxhorn.lilith.data.access.AccessEvent;
import de.huxhorn.lilith.data.access.LoggerContext;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AccessEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRequestURI("rQD?3l^1^q,^`W1`F");
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      accessEvent0.setRequestHeaders((Map<String, String>) hashMap0);
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getRequestURL();
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.getTimeStamp();
  }

  @Test
  public void test4()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRemoteUser("Zz?0wR9SpH g`");
      accessEvent0.setRemoteHost("Zz?0wR9SpH g`");
      AccessEvent accessEvent1 = new AccessEvent();
      accessEvent1.setRemoteHost("Zz?0wR9SpH g`");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getServerName();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Long long0 = new Long(14L);
      accessEvent0.setTimeStamp(long0);
      accessEvent0.setRemoteUser("Zz?0wR9SpH g`");
      accessEvent0.setRemoteHost("Zz?0wR9SpH g`");
      AccessEvent accessEvent1 = new AccessEvent();
      accessEvent1.setRemoteHost("Zz?0wR9SpH g`");
      accessEvent1.setRemoteUser("Zz?0wR9SpH g`");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getRequestURI();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      LoggerContext loggerContext0 = accessEvent0.getLoggerContext();
      assertNull(loggerContext0);
  }

  @Test
  public void test9()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getMethod();
      assertNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setLocalPort(1671);
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(1671, accessEvent0.getLocalPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Map<String, String> map0 = accessEvent0.getResponseHeaders();
      assertNull(map0);
  }

  @Test
  public void test12()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setServerName("d-Wx+");
      int int0 = accessEvent0.hashCode();
      assertEquals(2073174015, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      accessEvent0.setRequestParameters((Map<String, String[]>) hashMap0);
      assertEquals(true, hashMap0.isEmpty());
  }

  @Test
  public void test14()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Map<String, String[]> map0 = accessEvent0.getRequestParameters();
      assertNull(map0);
  }

  @Test
  public void test15()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setStatusCode(7);
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(7, accessEvent0.getStatusCode());
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getRemoteUser();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      accessEvent0.setResponseHeaders((Map<String, String>) hashMap0);
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setMethod("");
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getRemoteHost();
      assertNull(string0);
  }

  @Test
  public void test20()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getProtocol();
      assertNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Map<String, String> map0 = accessEvent0.getRequestHeaders();
      assertNull(map0);
  }

  @Test
  public void test22()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.toString();
      assertEquals("AccessEvent[loggerContext=null, timeStamp=null]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      int int0 = accessEvent0.getStatusCode();
      assertEquals(0, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      int int0 = accessEvent0.getLocalPort();
      assertEquals(0, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      String string0 = accessEvent0.getRemoteAddress();
      assertNull(string0);
  }

  @Test
  public void test26()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      assertTrue(accessEvent1.equals(accessEvent0));
      
      LoggerContext loggerContext0 = new LoggerContext();
      accessEvent1.setLoggerContext(loggerContext0);
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertFalse(accessEvent1.equals(accessEvent0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) "7");
      assertEquals(false, boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      LoggerContext loggerContext0 = new LoggerContext();
      accessEvent0.setLoggerContext(loggerContext0);
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      LoggerContext loggerContext0 = new LoggerContext();
      AccessEvent accessEvent1 = new AccessEvent();
      accessEvent0.setLoggerContext(loggerContext0);
      assertFalse(accessEvent0.equals(accessEvent1));
      
      accessEvent1.setLoggerContext(loggerContext0);
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertTrue(accessEvent1.equals(accessEvent0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setMethod("AccessEvent[");
      AccessEvent accessEvent1 = new AccessEvent();
      assertFalse(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setMethod("AccessEvent[");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertTrue(accessEvent1.equals(accessEvent0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      assertTrue(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setMethod("Zz?0wR9SpH g`");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertFalse(accessEvent1.equals(accessEvent0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      assertTrue(accessEvent1.equals(accessEvent0));
      
      accessEvent0.setProtocol("");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRemoteAddress("");
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      accessEvent1.setRemoteAddress("AccessEvent[loggerContext=null, timeStamp=null]");
      assertFalse(accessEvent1.equals(accessEvent0));
      
      accessEvent0.setRemoteAddress("AccessEvent[loggerContext=null, timeStamp=null]");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertTrue(accessEvent1.equals(accessEvent0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      assertTrue(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setRemoteAddress("");
      accessEvent0.setProtocol("");
      accessEvent1.setProtocol("");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRemoteHost("Zz?0wR9SpH g`");
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test38()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      assertTrue(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setRemoteHost("");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      accessEvent0.setRequestHeaders((Map<String, String>) hashMap0);
      AccessEvent accessEvent1 = new AccessEvent();
      assertFalse(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setRequestHeaders((Map<String, String>) hashMap0);
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertTrue(accessEvent1.equals(accessEvent0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRequestURI("loggeKContext=");
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent1.equals((Object) accessEvent0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test41()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRequestURL("6sYUw.\u0002XXCkET");
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test42()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      AccessEvent accessEvent1 = new AccessEvent();
      assertTrue(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setRequestURL("loggerContext=");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      accessEvent0.setResponseHeaders((Map<String, String>) hashMap0);
      AccessEvent accessEvent1 = new AccessEvent();
      assertFalse(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setResponseHeaders((Map<String, String>) hashMap0);
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertTrue(accessEvent1.equals(accessEvent0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test44()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRequestURL("6sYUw.\u0002XXCkET");
      accessEvent0.setServerName("6sYUw.\u0002XXCkET");
      AccessEvent accessEvent1 = new AccessEvent();
      accessEvent0.setRequestURI("6sYUw.\u0002XXCkET");
      accessEvent1.setRequestURL("6sYUw.\u0002XXCkET");
      accessEvent1.setRequestURI("6sYUw.\u0002XXCkET");
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test45()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Long long0 = new Long(14L);
      accessEvent0.setTimeStamp(long0);
      accessEvent0.setRemoteUser("Zz?0wR9SpH g`");
      accessEvent0.setRemoteHost("Zz?0wR9SpH g`");
      AccessEvent accessEvent1 = new AccessEvent();
      accessEvent1.setRemoteHost("Zz?0wR9SpH g`");
      accessEvent1.setRemoteUser("Zz?0wR9SpH g`");
      assertFalse(accessEvent1.equals(accessEvent0));
      
      accessEvent1.setTimeStamp((Long) 14L);
      boolean boolean0 = accessEvent0.equals((Object) accessEvent1);
      assertTrue(accessEvent1.equals(accessEvent0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test46()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Long long0 = new Long(15L);
      accessEvent0.setTimeStamp(long0);
      AccessEvent accessEvent1 = new AccessEvent();
      boolean boolean0 = accessEvent1.equals((Object) accessEvent0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      Long long0 = new Long(1L);
      accessEvent0.setTimeStamp(long0);
      int int0 = accessEvent0.hashCode();
      assertEquals(129082719, int0);
  }

  @Test
  public void test48()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      LoggerContext loggerContext0 = new LoggerContext();
      accessEvent0.setLoggerContext(loggerContext0);
      int int0 = accessEvent0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test49()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRequestURI("d-Wx+");
      int int0 = accessEvent0.hashCode();
      assertEquals((-1735138113), int0);
  }

  @Test
  public void test50()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRequestURL("|z8&,ZqtN;");
      int int0 = accessEvent0.hashCode();
      assertEquals(2037882282, int0);
  }

  @Test
  public void test51()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRemoteHost("d-Wx+");
      int int0 = accessEvent0.hashCode();
      assertEquals(628361343, int0);
  }

  @Test
  public void test52()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRemoteUser("|z8&,ZqtN;");
      int int0 = accessEvent0.hashCode();
      assertEquals(1798766634, int0);
  }

  @Test
  public void test53()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setProtocol("T");
      int int0 = accessEvent0.hashCode();
      assertEquals((-1890118612), int0);
  }

  @Test
  public void test54()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setMethod("");
      int int0 = accessEvent0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test55()  throws Throwable  {
      AccessEvent accessEvent0 = new AccessEvent();
      accessEvent0.setRemoteAddress("T");
      int int0 = accessEvent0.hashCode();
      assertEquals(80724, int0);
  }
}
