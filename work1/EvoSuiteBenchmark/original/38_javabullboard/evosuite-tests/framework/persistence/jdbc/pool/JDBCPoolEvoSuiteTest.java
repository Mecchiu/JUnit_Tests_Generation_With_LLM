/*
 * This file was automatically generated by EvoSuite
 */

package framework.persistence.jdbc.pool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import framework.persistence.jdbc.pool.OraclePoolImpl;
import java.sql.Connection;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JDBCPoolEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      String string0 = oraclePoolImpl0.getQueryValidation();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      int int0 = oraclePoolImpl0.getDebugLevel();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      Map<Object, Object> map0 = oraclePoolImpl0.getTypeMap();
      assertNull(map0);
  }

  @Test
  public void test3()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      String string0 = oraclePoolImpl0.getDriver();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      oraclePoolImpl0.setPoolName("");
      oraclePoolImpl0.initialize();
      assertEquals("jdbc:oracle:thin:@smdev01:1535:DEVDB02", oraclePoolImpl0.getUrl());
      assertEquals("", oraclePoolImpl0.getPoolName());
      assertEquals("oracle", oraclePoolImpl0.getDatabaseType());
      assertEquals("TIGER", oraclePoolImpl0.getPassword());
      assertEquals("SCOTT", oraclePoolImpl0.getUsername());
  }

  @Test
  public void test5()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      try {
        oraclePoolImpl0.getConnection();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      boolean boolean0 = oraclePoolImpl0.isAutocommit();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      // Undeclared exception!
      try {
        oraclePoolImpl0.getPoolSize();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      int int0 = oraclePoolImpl0.getMaxLimit();
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      boolean boolean0 = oraclePoolImpl0.doValidation();
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      int int0 = oraclePoolImpl0.getMinLimit();
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      oraclePoolImpl0.releaseConnection((Connection) null);
      assertNull(oraclePoolImpl0.getUsername());
  }

  @Test
  public void test12()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      String string0 = oraclePoolImpl0.getQueryTimestamp();
      assertNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      try {
        oraclePoolImpl0.validateConnection((Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      String string0 = oraclePoolImpl0.getQueryUsername();
      assertNull(string0);
  }

  @Test
  public void test15()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      try {
        oraclePoolImpl0.getConnection("cM6],H", (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      OraclePoolImpl oraclePoolImpl0 = new OraclePoolImpl();
      try {
        oraclePoolImpl0.getConnection("-cv;Ubttg~ S", "-cv;Ubttg~ S");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
