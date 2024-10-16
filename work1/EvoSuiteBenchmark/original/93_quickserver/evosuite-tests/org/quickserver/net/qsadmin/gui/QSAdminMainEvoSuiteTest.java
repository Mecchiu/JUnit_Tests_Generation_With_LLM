/*
 * This file was automatically generated by EvoSuite
 */

package org.quickserver.net.qsadmin.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.BeforeClass;
import org.quickserver.net.qsadmin.gui.QSAdminGUI;
import org.quickserver.net.qsadmin.gui.QSAdminMain;

@RunWith(EvoSuiteRunner.class)
public class QSAdminMainEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      qSAdminMain0.startSocketListener();
      assertEquals(false, qSAdminMain0.isConnected());
      
      String string0 = qSAdminMain0.readResponse(true);
      assertEquals("", string0);
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals(true, qSAdminMain0.getAppendToConsole());
  }

  @Test
  public void test1()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      qSAdminMain0.setGUI((QSAdminGUI) null);
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals(false, qSAdminMain0.isConnected());
      assertEquals(false, qSAdminMain0.isLoggedIn());
  }

  @Test
  public void test2()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      String string0 = qSAdminMain0.sendCommunicationNoEcho("StackTrace:\n", true);
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertNotNull(string0);
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals("-ERR Not connected yet", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      boolean boolean0 = qSAdminMain0.isLoggedIn();
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals(false, boolean0);
      assertEquals(false, qSAdminMain0.isConnected());
  }

  @Test
  public void test4()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      qSAdminMain0.getGUI();
      assertEquals(false, qSAdminMain0.isConnected());
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals(false, qSAdminMain0.isLoggedIn());
  }

  @Test
  public void test5()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      // Undeclared exception!
      try {
        qSAdminMain0.emptyReceivedMsg();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      // Undeclared exception!
      try {
        qSAdminMain0.doLogout();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Not connected
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      // Undeclared exception!
      try {
        qSAdminMain0.sendCommand((String) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      qSAdminMain0.readResponse(false);
      assertEquals(false, qSAdminMain0.isConnected());
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals(true, qSAdminMain0.getAppendToConsole());
  }

  @Test
  public void test9()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      String string0 = qSAdminMain0.readResponse(true);
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals("-ERR null", string0);
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals(false, qSAdminMain0.isConnected());
  }

  @Test
  public void test10()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      // Undeclared exception!
      try {
        qSAdminMain0.sendCommunication((String) null, true, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      String string0 = qSAdminMain0.sendCommunicationSilent("StackTrace:\n", true, true);
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals("-ERR Not connected yet", string0);
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertNotNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      String string0 = qSAdminMain0.toString();
      assertEquals(false, qSAdminMain0.isConnected());
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals("Not connected", string0);
      assertNotNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      float float0 = qSAdminMain0.getServerVersionNo();
      assertEquals(true, qSAdminMain0.getAppendToConsole());
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals(false, qSAdminMain0.isConnected());
      assertEquals(1.49F, float0, 0.01F);
  }

  @Test
  public void test14()  throws Throwable  {
      QSAdminMain qSAdminMain0 = new QSAdminMain();
      qSAdminMain0.getIpAddress();
      assertEquals(false, qSAdminMain0.isConnected());
      assertEquals(false, qSAdminMain0.isLoggedIn());
      assertEquals(true, qSAdminMain0.getAppendToConsole());
  }
}
