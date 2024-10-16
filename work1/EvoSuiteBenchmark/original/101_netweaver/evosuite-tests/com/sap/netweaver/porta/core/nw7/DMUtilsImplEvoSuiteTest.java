/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.engine.services.dc.wsgate.DeployResult;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.nw7.ApplicationImpl;
import com.sap.netweaver.porta.core.nw7.DMUtilsImpl;
import com.sap.netweaver.porta.core.nw7.FileUploaderImpl;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.xml.rpc.ServiceException;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DMUtilsImplEvoSuiteTest {

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
      DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
      Application[] applicationArray0 = new Application[10];
      com.sap.netweaver.porta.core.Application[] applicationArray1 = dMUtilsImpl0.convertApplications(applicationArray0);
      assertNotNull(applicationArray1);
  }

  @Test
  public void test1()  throws Throwable  {
      DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
      FileUploaderImpl fileUploaderImpl0 = (FileUploaderImpl)dMUtilsImpl0.getFileUploader("4dX->ISSFD.", 163);
      assertNotNull(fileUploaderImpl0);
  }

  @Test
  public void test2()  throws Throwable  {
      DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
      DeployResult deployResult0 = new DeployResult();
      // Undeclared exception!
      try {
        dMUtilsImpl0.convertDeployResult(deployResult0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
          URL uRL0 = dMUtilsImpl0.getDeployWSUrl("4dX->ISSFD.", 163);
          dMUtilsImpl0.getDeployWSProxy(uRL0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test4()  throws Throwable  {
      DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
      Application application0 = new Application("4dX->ISSFD.", "4dX->ISSFD.", "4dX->ISSFD.", "4dX->ISSFD.", "4dX->ISSFD.", "4dX->ISSFD.");
      ApplicationImpl applicationImpl0 = (ApplicationImpl)dMUtilsImpl0.convertApplication(application0);
      com.sap.netweaver.porta.core.Application[] applicationArray0 = new com.sap.netweaver.porta.core.Application[4];
      applicationArray0[0] = (com.sap.netweaver.porta.core.Application) applicationImpl0;
      applicationArray0[1] = applicationArray0[0];
      applicationArray0[2] = (com.sap.netweaver.porta.core.Application) applicationImpl0;
      applicationArray0[3] = applicationArray0[2];
      Application[] applicationArray1 = dMUtilsImpl0.convertApplications(applicationArray0);
      assertNotNull(applicationArray1);
  }

  @Test
  public void test5()  throws Throwable  {
      DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
      File[] fileArray0 = new File[1];
      File file0 = new File("k!M!Ld:`df", "k!M!Ld:`df");
      fileArray0[0] = file0;
      String[] stringArray0 = dMUtilsImpl0.getAsArchivePaths(fileArray0);
      assertNotNull(stringArray0);
  }

  @Test
  public void test6()  throws Throwable  {
      DMUtilsImpl dMUtilsImpl0 = new DMUtilsImpl();
      File[] fileArray0 = new File[1];
      // Undeclared exception!
      try {
        dMUtilsImpl0.getAsArchiveFiles(fileArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
