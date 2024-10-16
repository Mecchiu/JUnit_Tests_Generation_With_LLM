/*
 * This file was automatically generated by EvoSuite
 */

package org.quickserver.net.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.quickserver.net.server.GhostSocketReaper;
import org.quickserver.net.server.QuickServer;

@RunWith(EvoSuiteRunner.class)
public class GhostSocketReaperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GhostSocketReaper ghostSocketReaper0 = new GhostSocketReaper();
      String string0 = ghostSocketReaper0.info();
      assertEquals(3649L, ghostSocketReaper0.getId());
      assertEquals("GhostSocketReaper - ServerHook", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      QuickServer quickServer0 = new QuickServer();
      boolean boolean0 = quickServer0.startService();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      GhostSocketReaper ghostSocketReaper0 = new GhostSocketReaper();
      boolean boolean0 = ghostSocketReaper0.handleEvent(202);
      assertEquals(3768L, ghostSocketReaper0.getId());
      assertEquals(true, boolean0);
  }
}
