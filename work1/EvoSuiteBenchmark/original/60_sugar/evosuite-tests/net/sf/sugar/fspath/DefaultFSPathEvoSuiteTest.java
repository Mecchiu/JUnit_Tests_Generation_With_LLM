/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.sugar.fspath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.xml.namespace.QName;
import net.sf.sugar.fspath.DefaultFSPath;
import net.sf.sugar.fspath.FSPathResultListImpl;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultFSPathEvoSuiteTest {

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
      DefaultFSPath defaultFSPath0 = new DefaultFSPath();
      // Undeclared exception!
      try {
        defaultFSPath0.query("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("");
          File file1 = file0.getCanonicalFile();
          DefaultFSPath defaultFSPath0 = null;
          try {
            defaultFSPath0 = new DefaultFSPath(file1);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /mnt/fastdata/ac1gf/SF110/dist/60_sugar/evosuite-tests/net/sf/sugar/fspath/cli/PromptEvoSuiteTest.java write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.canWrite(File.java:711)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:194)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.createChildElement(DefaultFSPath.java:184)
             * net.sf.sugar.fspath.DefaultFSPath.buildDOM(DefaultFSPath.java:166)
             * net.sf.sugar.fspath.DefaultFSPath.<init>(DefaultFSPath.java:130)
             * sun.reflect.GeneratedConstructorAccessor25.newInstance(Unknown Source)
             * sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
             * java.lang.reflect.Constructor.newInstance(Constructor.java:513)
             * org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
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
  public void test2()  throws Throwable  {
      DefaultFSPath defaultFSPath0 = new DefaultFSPath();
      File file0 = defaultFSPath0.getRootDirectory();
      assertNull(file0);
  }

  @Test
  public void test3()  throws Throwable  {
      File file0 = new File("-gW/E/&:d ^c6u8m");
      DefaultFSPath defaultFSPath0 = null;
      try {
        defaultFSPath0 = new DefaultFSPath(file0);
        fail("Expecting exception: InstantiationError");
      } catch(InstantiationError e) {
        /*
         * the java.io.File specified must be a Directory
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultFSPath defaultFSPath0 = new DefaultFSPath();
      QName qName0 = new QName("");
      FSPathResultListImpl fSPathResultListImpl0 = (FSPathResultListImpl)defaultFSPath0.query("", qName0);
      assertEquals("[]", fSPathResultListImpl0.toString());
  }
}
