/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.messaging.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.messaging.proxy.ProxyResponse;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ProxyResponseEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ProxyResponse proxyResponse0 = new ProxyResponse();
      proxyResponse0.setResult((Object) proxyResponse0);
      assertEquals(false, proxyResponse0.hasError());
  }

  @Test
  public void test1()  throws Throwable  {
      ProxyResponse proxyResponse0 = new ProxyResponse();
      proxyResponse0.setException((Exception) null);
      assertEquals(false, proxyResponse0.hasError());
  }

  @Test
  public void test2()  throws Throwable  {
      ProxyResponse proxyResponse0 = new ProxyResponse();
      Object object0 = proxyResponse0.getResult();
      assertNull(object0);
  }

  @Test
  public void test3()  throws Throwable  {
      ProxyResponse proxyResponse0 = new ProxyResponse();
      boolean boolean0 = proxyResponse0.hasError();
      assertEquals(false, boolean0);
  }
}
