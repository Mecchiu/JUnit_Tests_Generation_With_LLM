/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.messaging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.messaging.MessageStatus;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MessageStatusEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      messageStatus0.stopTimer();
      assertEquals("{startTime=0, endTime=0, payload=null, errorMessage=null, errorStackTrace=null}", messageStatus0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      messageStatus0.startTimer();
      assertNull(messageStatus0.getExceptionMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      Object object0 = messageStatus0.getPayload();
      assertNull(object0);
  }

  @Test
  public void test3()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      String string0 = messageStatus0.toString();
      assertNotNull(string0);
      assertEquals("{startTime=0, endTime=0, payload=null, errorMessage=null, errorStackTrace=null}", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      messageStatus0.setPayload((Object) null);
      assertEquals(false, messageStatus0.hasException());
  }

  @Test
  public void test5()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      // Undeclared exception!
      try {
        messageStatus0.setException((Exception) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      String string0 = messageStatus0.getExceptionStackTrace();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      String string0 = messageStatus0.getExceptionMessage();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      long long0 = messageStatus0.getDuration();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      MessageStatus messageStatus0 = new MessageStatus();
      boolean boolean0 = messageStatus0.hasException();
      assertEquals(false, boolean0);
  }
}
