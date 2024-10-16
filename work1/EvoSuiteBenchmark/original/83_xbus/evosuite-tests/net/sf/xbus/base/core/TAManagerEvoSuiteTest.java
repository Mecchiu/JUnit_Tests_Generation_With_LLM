/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.base.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Hashtable;
import net.sf.xbus.base.core.TAManager;
import net.sf.xbus.base.core.TAResource;
import net.sf.xbus.base.core.XException;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.technical.as400.AS400LineReaderReceiver;
import net.sf.xbus.technical.file.FileByteArrayListSender;
import net.sf.xbus.technical.mail.POP3XMLReceiver;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TAManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TAManager tAManager0 = TAManager.getInstance();
      AS400LineReaderReceiver aS400LineReaderReceiver0 = new AS400LineReaderReceiver();
      tAManager0.registerResource((TAResource) aS400LineReaderReceiver0);
      tAManager0.removeResource((TAResource) aS400LineReaderReceiver0);
      assertEquals("Object", aS400LineReaderReceiver0.getType());
  }

  @Test
  public void test1()  throws Throwable  {
      TAManager tAManager0 = TAManager.getInstance();
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      // Undeclared exception!
      try {
        tAManager0.removeResource((TAResource) pOP3XMLReceiver0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TAManager tAManager0 = TAManager.getInstance();
      tAManager0.begin();
  }

  @Test
  public void test3()  throws Throwable  {
      System.setCurrentTimeMillis(86400000L);
      TAManager tAManager0 = TAManager.getInstance();
      tAManager0.commit();
      TAManager tAManager1 = TAManager.getInstance();
      TAManager.getInstance();
      tAManager1.rollback();
      tAManager1.rollback();
      tAManager1.clearManager();
      String string0 = "";
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem("");
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TAManager tAManager0 = TAManager.getInstance();
      tAManager0.commit();
  }

  @Test
  public void test5()  throws Throwable  {
      TAManager tAManager0 = TAManager.getInstance();
      tAManager0.close();
  }

  @Test
  public void test6()  throws Throwable  {
      TAManager.clear();
  }
}
