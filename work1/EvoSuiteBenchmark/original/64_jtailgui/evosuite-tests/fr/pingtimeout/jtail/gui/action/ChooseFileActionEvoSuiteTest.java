/*
 * This file was automatically generated by EvoSuite
 */

package fr.pingtimeout.jtail.gui.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fr.pingtimeout.jtail.gui.action.ChooseFileAction;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import java.awt.event.ActionEvent;
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
public class ChooseFileActionEvoSuiteTest {

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
          OpenFileModel openFileModel0 = new OpenFileModel();
          ChooseFileAction chooseFileAction0 = new ChooseFileAction(openFileModel0);
          // Undeclared exception!
          try {
            chooseFileAction0.actionPerformed((ActionEvent) null);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /home/ac1gf write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.canWrite(File.java:711)
             * sun.awt.shell.ShellFolder.canWrite(ShellFolder.java:284)
             * sun.swing.FilePane.canWrite(FilePane.java:1817)
             * sun.swing.FilePane.doDirectoryChanged(FilePane.java:1470)
             * sun.swing.FilePane.propertyChange(FilePane.java:1516)
             * java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:339)
             * java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:276)
             * java.awt.Component.firePropertyChange(Component.java:8154)
             * javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:568)
             * javax.swing.JFileChooser.<init>(JFileChooser.java:334)
             * javax.swing.JFileChooser.<init>(JFileChooser.java:286)
             * fr.pingtimeout.jtail.gui.action.ChooseFileAction.actionPerformed(ChooseFileAction.java:53)
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
