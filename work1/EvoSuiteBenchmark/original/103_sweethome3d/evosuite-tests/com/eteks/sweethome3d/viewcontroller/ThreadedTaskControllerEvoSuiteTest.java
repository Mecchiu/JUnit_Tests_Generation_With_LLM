/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.viewcontroller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.swing.SwingViewFactory;
import com.eteks.sweethome3d.swing.ThreadedTaskPanel;
import com.eteks.sweethome3d.viewcontroller.ThreadedTaskController;
import com.eteks.sweethome3d.viewcontroller.View;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;
import java.util.concurrent.Callable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ThreadedTaskControllerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      ThreadedTaskController threadedTaskController0 = new ThreadedTaskController((Callable<Void>) null, "", (ThreadedTaskController.ExceptionHandler) null, (UserPreferences) null, (ViewFactory) swingViewFactory0);
      ThreadedTaskPanel threadedTaskPanel0 = (ThreadedTaskPanel)threadedTaskController0.getView();
      // Undeclared exception!
      try {
        threadedTaskController0.executeTask((View) threadedTaskPanel0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      ThreadedTaskController threadedTaskController0 = new ThreadedTaskController((Callable<Void>) null, "", (ThreadedTaskController.ExceptionHandler) null, (UserPreferences) null, (ViewFactory) swingViewFactory0);
      ThreadedTaskPanel threadedTaskPanel0 = (ThreadedTaskPanel)threadedTaskController0.getView();
      assertNotNull(threadedTaskPanel0);
      
      ThreadedTaskPanel threadedTaskPanel1 = (ThreadedTaskPanel)threadedTaskController0.getView();
      assertSame(threadedTaskPanel1, threadedTaskPanel0);
  }

  @Test
  public void test2()  throws Throwable  {
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      ThreadedTaskController threadedTaskController0 = new ThreadedTaskController((Callable<Void>) null, "", (ThreadedTaskController.ExceptionHandler) null, (UserPreferences) null, (ViewFactory) swingViewFactory0);
      threadedTaskController0.cancelTask();
      assertEquals(false, threadedTaskController0.isTaskRunning());
  }

  @Test
  public void test3()  throws Throwable  {
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      ThreadedTaskController threadedTaskController0 = new ThreadedTaskController((Callable<Void>) null, "", (ThreadedTaskController.ExceptionHandler) null, (UserPreferences) null, (ViewFactory) swingViewFactory0);
      boolean boolean0 = threadedTaskController0.isTaskRunning();
      assertEquals(false, boolean0);
  }
}
