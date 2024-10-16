/*
 * This file was automatically generated by EvoSuite
 */

package freemind.extensions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import freemind.extensions.PermanentNodeHookSubstituteUnknown;
import freemind.modes.MindMap;
import freemind.modes.MindMapNode;
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
import plugins.collaboration.socket.MindMapMaster;

@RunWith(EvoSuiteRunner.class)
public class NodeHookAdapterEvoSuiteTest {

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
      PermanentNodeHookSubstituteUnknown permanentNodeHookSubstituteUnknown0 = new PermanentNodeHookSubstituteUnknown("filetypes");
      // Undeclared exception!
      try {
        permanentNodeHookSubstituteUnknown0.nodeChanged((MindMapNode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PermanentNodeHookSubstituteUnknown permanentNodeHookSubstituteUnknown0 = new PermanentNodeHookSubstituteUnknown("I8HpM+");
      permanentNodeHookSubstituteUnknown0.shutdownMapHook();
      assertEquals("I8HpM+", permanentNodeHookSubstituteUnknown0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          MindMapMaster mindMapMaster0 = new MindMapMaster();
          MindMap mindMap0 = mindMapMaster0.getMap();
          assertNull(mindMap0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          MindMapMaster mindMapMaster0 = new MindMapMaster();
          MindMapNode mindMapNode0 = mindMapMaster0.getNode();
          assertNull(mindMapNode0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test4()  throws Throwable  {
      PermanentNodeHookSubstituteUnknown permanentNodeHookSubstituteUnknown0 = new PermanentNodeHookSubstituteUnknown("filetypes");
      permanentNodeHookSubstituteUnknown0.invoke((MindMapNode) null);
      assertEquals("filetypes", permanentNodeHookSubstituteUnknown0.getName());
  }
}
