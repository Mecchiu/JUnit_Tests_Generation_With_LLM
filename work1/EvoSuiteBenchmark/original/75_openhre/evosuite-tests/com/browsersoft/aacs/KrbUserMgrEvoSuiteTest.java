/*
 * This file was automatically generated by EvoSuite
 */

package com.browsersoft.aacs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.browsersoft.aacs.KrbUserMgr;
import com.browsersoft.aacs.User;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class KrbUserMgrEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      KrbUserMgr krbUserMgr0 = new KrbUserMgr();
      User user0 = krbUserMgr0.getUser("'lNY");
      assertNull(user0);
  }

  @Test
  public void test1()  throws Throwable  {
      KrbUserMgr krbUserMgr0 = new KrbUserMgr();
      krbUserMgr0.logOut();
  }

  @Test
  public void test2()  throws Throwable  {
      KrbUserMgr krbUserMgr0 = new KrbUserMgr();
      User user0 = krbUserMgr0.getUser();
      assertNull(user0);
  }

  @Test
  public void test3()  throws Throwable  {
      KrbUserMgr krbUserMgr0 = new KrbUserMgr();
      boolean boolean0 = krbUserMgr0.checkSecret("'lNY", "'lNY", "'lNY");
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      KrbUserMgr krbUserMgr0 = new KrbUserMgr();
      boolean boolean0 = krbUserMgr0.checkSecret((String) null, (String) null, (String) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          KrbUserMgr krbUserMgr0 = new KrbUserMgr();
          boolean boolean0 = krbUserMgr0.checkSecret("?@s5", "krb5", "krb5");
          assertEquals(false, boolean0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test6()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          KrbUserMgr krbUserMgr0 = new KrbUserMgr();
          boolean boolean0 = krbUserMgr0.checkSecret("krb5", "krb5", "krb5");
          assertEquals(false, boolean0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
