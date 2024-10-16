/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.bi.rules;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.bi.rules.RulesEngineProxyBean;
import com.liferay.portal.kernel.bi.rules.Fact;
import com.liferay.portal.kernel.bi.rules.Query;
import com.liferay.portal.kernel.bi.rules.RulesResourceRetriever;
import com.liferay.portal.kernel.resource.ByteArrayResourceRetriever;
import com.liferay.portal.kernel.resource.ContextClassLoaderResourceRetriever;
import com.liferay.portal.kernel.resource.ResourceRetriever;
import com.liferay.portal.kernel.resource.StringResourceRetriever;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RulesEngineProxyBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      byte[] byteArray0 = new byte[4];
      ByteArrayResourceRetriever byteArrayResourceRetriever0 = new ByteArrayResourceRetriever(byteArray0);
      RulesResourceRetriever rulesResourceRetriever0 = new RulesResourceRetriever((ResourceRetriever) byteArrayResourceRetriever0, "");
      Query query0 = Query.createStandardQuery();
      ClassLoader[] classLoaderArray0 = new ClassLoader[1];
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.execute(rulesResourceRetriever0, (List<Fact<?>>) null, query0, classLoaderArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.containsRuleDomain("r1Z=AGbEI^?)$94G|a");
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.remove("Fvgs");
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      RulesResourceRetriever rulesResourceRetriever0 = new RulesResourceRetriever("X");
      ClassLoader[] classLoaderArray0 = new ClassLoader[6];
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.update("X", rulesResourceRetriever0, classLoaderArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      Query query0 = Query.createStandardQuery();
      ClassLoader[] classLoaderArray0 = new ClassLoader[2];
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.execute("N", (List<Fact<?>>) null, query0, classLoaderArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      LinkedList<Fact<?>> linkedList0 = new LinkedList<Fact<?>>();
      ClassLoader[] classLoaderArray0 = new ClassLoader[14];
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.execute("a]._^O^#3", (List<Fact<?>>) linkedList0, classLoaderArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      ContextClassLoaderResourceRetriever contextClassLoaderResourceRetriever0 = new ContextClassLoaderResourceRetriever("");
      RulesResourceRetriever rulesResourceRetriever0 = new RulesResourceRetriever((ResourceRetriever) contextClassLoaderResourceRetriever0, "");
      ClassLoader[] classLoaderArray0 = new ClassLoader[20];
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.add("", rulesResourceRetriever0, classLoaderArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      RulesEngineProxyBean rulesEngineProxyBean0 = new RulesEngineProxyBean();
      StringResourceRetriever stringResourceRetriever0 = new StringResourceRetriever("*~");
      RulesResourceRetriever rulesResourceRetriever0 = new RulesResourceRetriever((ResourceRetriever) stringResourceRetriever0);
      LinkedList<Fact<?>> linkedList0 = new LinkedList<Fact<?>>();
      ClassLoader[] classLoaderArray0 = new ClassLoader[2];
      // Undeclared exception!
      try {
        rulesEngineProxyBean0.execute(rulesResourceRetriever0, (List<Fact<?>>) linkedList0, classLoaderArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }
}
