/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.technical.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xbus.base.core.XException;
import net.sf.xbus.technical.mail.POP3XMLReceiver;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class POP3XMLReceiverEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      String string0 = pOP3XMLReceiver0.getReturncode();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      // Undeclared exception!
      try {
        pOP3XMLReceiver0.getAddress();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      // Undeclared exception!
      try {
        pOP3XMLReceiver0.receive("");
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      String string0 = pOP3XMLReceiver0.getOnError();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      String string0 = pOP3XMLReceiver0.getType();
      assertEquals("Object", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      try {
        pOP3XMLReceiver0.open();
        fail("Expecting exception: XException");
      } catch(XException e) {
        /*
         * E_01_007_0 failed to connect
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      POP3XMLReceiver pOP3XMLReceiver0 = new POP3XMLReceiver();
      pOP3XMLReceiver0.deleteMail();
      assertNull(pOP3XMLReceiver0.getReturncode());
  }
}
