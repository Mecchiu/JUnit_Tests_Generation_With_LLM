/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager.impl.tcp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.networkmanager.impl.tcp.ProxyLoginHandler;
import com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportImpl;
import java.net.InetSocketAddress;
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
public class ProxyLoginHandlerEvoSuiteTest {

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
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          InetSocketAddress inetSocketAddress0 = ProxyLoginHandler.DEFAULT_SOCKS_SERVER_ADDRESS;
          ProxyLoginHandler proxyLoginHandler0 = null;
          try {
            proxyLoginHandler0 = new ProxyLoginHandler((TCPTransportImpl) null, inetSocketAddress0, (ProxyLoginHandler.ProxyListener) null, "V4a", "V4a", "V4a");
            fail("Expecting exception: NullPointerException");
          } catch(NullPointerException e) {
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test1()  throws Throwable  {
      ProxyLoginHandler.readConfig();
  }

  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          InetSocketAddress inetSocketAddress0 = InetSocketAddress.createUnresolved("?VnV`;wu$", 4);
          ProxyLoginHandler proxyLoginHandler0 = null;
          try {
            proxyLoginHandler0 = new ProxyLoginHandler((TCPTransportImpl) null, inetSocketAddress0, (ProxyLoginHandler.ProxyListener) null, "?VnV`;wu$", "?VnV`;wu$", "?VnV`;wu$");
            fail("Expecting exception: NullPointerException");
          } catch(NullPointerException e) {
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          InetSocketAddress inetSocketAddress0 = new InetSocketAddress(1946);
          ProxyLoginHandler proxyLoginHandler0 = null;
          try {
            proxyLoginHandler0 = new ProxyLoginHandler((TCPTransportImpl) null, inetSocketAddress0, (ProxyLoginHandler.ProxyListener) null);
            fail("Expecting exception: NullPointerException");
          } catch(NullPointerException e) {
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
