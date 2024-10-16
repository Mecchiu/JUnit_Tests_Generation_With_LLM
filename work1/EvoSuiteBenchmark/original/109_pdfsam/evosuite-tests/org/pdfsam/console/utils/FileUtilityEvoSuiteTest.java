/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.console.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
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
import org.pdfsam.console.business.dto.PdfFile;
import org.pdfsam.console.exceptions.console.ConsoleException;
import org.pdfsam.console.utils.FileUtility;

@RunWith(EvoSuiteRunner.class)
public class FileUtilityEvoSuiteTest {

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
      LinkedList<PdfFile> linkedList0 = new LinkedList<PdfFile>();
      PdfFile[] pdfFileArray0 = FileUtility.getPdfFiles((Collection) linkedList0);
      assertNotNull(pdfFileArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      jcmdline.dto.PdfFile pdfFile0 = new jcmdline.dto.PdfFile("|_4AJ", "|_4AJ");
      PdfFile pdfFile1 = FileUtility.getPdfFile(pdfFile0);
      assertEquals("|_4AJ", pdfFile1.getPassword());
  }

  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("P");
      File file1 = FileUtility.generateTmpFile(file0);
      assertNotNull(file1);
      assertEquals("/mnt/fastdata/ac1gf/SF110/dist/109_pdfsam/null/PDFsamTMPbufferAAAAA1.pdf", file1.getCanonicalPath());
  }

  @Test
  public void test3()  throws Throwable  {
      File file0 = FileUtility.generateTmpFile((File) null);
      assertNull(file0);
  }

  @Test
  public void test4()  throws Throwable  {
      File file0 = new File((File) null, "");
      File file1 = file0.getCanonicalFile();
      File file2 = FileUtility.generateTmpFile(file1);
      assertNotNull(file2);
      assertEquals("/mnt/fastdata/ac1gf/SF110/dist/109_pdfsam/PDFsamTMPbufferAAAAA1.pdf", file2.getAbsolutePath());
  }

  @Test
  public void test5()  throws Throwable  {
      FileUtility.renameTemporaryFile((File) null, (File) null, true);
  }

  @Test
  public void test6()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("", "");
          // Undeclared exception!
          try {
            FileUtility.renameTemporaryFile(file0, file0, true);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission / delete)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkDelete(SecurityManager.java:990)
             * java.io.File.delete(File.java:902)
             * org.pdfsam.console.utils.FileUtility.renameTemporaryFile(FileUtility.java:132)
             * sun.reflect.GeneratedMethodAccessor158.invoke(Unknown Source)
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
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test7()  throws Throwable  {
      File file0 = new File((File) null, "");
      FileUtility.renameTemporaryFile(file0, (File) null, true);
      assertEquals(false, file0.isHidden());
  }

  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("P");
          // Undeclared exception!
          try {
            FileUtility.renameTemporaryFile(file0, file0, false);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission P write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.renameTo(File.java:1225)
             * org.pdfsam.console.utils.FileUtility.renameFile(FileUtility.java:158)
             * org.pdfsam.console.utils.FileUtility.renameTemporaryFile(FileUtility.java:142)
             * sun.reflect.GeneratedMethodAccessor158.invoke(Unknown Source)
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
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test9()  throws Throwable  {
      File file0 = new File("", "");
      try {
        FileUtility.renameTemporaryFile(file0, file0, false);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS011 - Cannot overwrite output file (overwrite is false), a temporary file has been created ().
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      jcmdline.dto.PdfFile[] pdfFileArray0 = new jcmdline.dto.PdfFile[8];
      // Undeclared exception!
      try {
        FileUtility.getPdfFiles(pdfFileArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
