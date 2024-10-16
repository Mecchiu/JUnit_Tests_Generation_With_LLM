/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.counter.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.counter.model.Counter;
import com.liferay.counter.model.CounterWrapper;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CounterWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      Counter counter0 = counterWrapper0.getWrappedModel();
      assertNull(counter0);
  }

  @Test
  public void test1()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.toXmlString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.getPrimaryKey();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.resetOriginalValues();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.getPrimaryKeyObj();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.toEscapedModel();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.isEscapedModel();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setCurrentId(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      Class<?> class0 = counterWrapper0.getModelClass();
      assertEquals(false, class0.isEnum());
  }

  @Test
  public void test10()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.getExpandoBridge();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setCachedModel(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.getCurrentId();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.getModelAttributes();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      String string0 = counterWrapper0.getModelClassName();
      assertEquals("com.liferay.counter.model.Counter", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setPrimaryKeyObj((Serializable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setPrimaryKey("Ym4<");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.isNew();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setNew(false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setName("com.liferay.counter.model.Counter");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.persist();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.setExpandoBridgeAttributes((ServiceContext) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.toCacheModel();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.isCachedModel();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.compareTo((Counter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      // Undeclared exception!
      try {
        counterWrapper0.clone();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      counterWrapper0.setModelAttributes((Map<String, Object>) hashtable0);
      assertEquals(true, hashtable0.isEmpty());
  }
}
