/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.editor.fckeditor.command.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.editor.fckeditor.command.CommandArgument;
import com.liferay.portal.editor.fckeditor.command.impl.CreateFolderCommand;
import com.liferay.portal.theme.ThemeDisplay;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CreateFolderCommandEvoSuiteTest {

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
          CreateFolderCommand createFolderCommand0 = new CreateFolderCommand();
          ThemeDisplay themeDisplay0 = new ThemeDisplay();
          CommandArgument commandArgument0 = new CommandArgument("", "", "E'\u0005JMU)", "E'\u0005JMU)", themeDisplay0, (HttpServletRequest) null);
          // Undeclared exception!
          try {
            createFolderCommand0.execute(commandArgument0, (HttpServletRequest) null, (HttpServletResponse) null);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.lang.RuntimePermission getClassLoader.portal)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * com.liferay.portal.kernel.util.PortalClassLoaderUtil.getClassLoader(PortalClassLoaderUtil.java:38)
             * com.liferay.portal.kernel.util.InstancePool._get(InstancePool.java:68)
             * com.liferay.portal.kernel.util.InstancePool._get(InstancePool.java:59)
             * com.liferay.portal.kernel.util.InstancePool.get(InstancePool.java:33)
             * com.liferay.portal.editor.fckeditor.receiver.CommandReceiverFactory.getCommandReceiver(CommandReceiverFactory.java:32)
             * com.liferay.portal.editor.fckeditor.command.impl.CreateFolderCommand.execute(CreateFolderCommand.java:34)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
