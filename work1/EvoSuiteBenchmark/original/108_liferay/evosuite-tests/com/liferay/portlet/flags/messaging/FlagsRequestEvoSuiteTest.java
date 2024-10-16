/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.flags.messaging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.flags.messaging.FlagsRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FlagsRequestEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.getClassName();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.getContentTitle();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setComments("DiCjR.d5W@tY3l%");
      assertNull(flagsRequest0.getClassName());
  }

  @Test
  public void test3()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setClassPK(0L);
      assertEquals(0L, flagsRequest0.getClassPK());
  }

  @Test
  public void test4()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setReason(";)3i07j*'6U#1f");
      assertEquals(0L, flagsRequest0.getClassPK());
  }

  @Test
  public void test5()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setContentURL("Ui");
      assertNull(flagsRequest0.getContentTitle());
  }

  @Test
  public void test6()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.getReason();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.getComments();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      long long0 = flagsRequest0.getReportedUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      ServiceContext serviceContext0 = flagsRequest0.getServiceContext();
      assertNull(serviceContext0);
  }

  @Test
  public void test10()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setClassName((String) null);
      assertNull(flagsRequest0.getComments());
  }

  @Test
  public void test11()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setContentTitle("");
      assertEquals("{className=null, classPK=0, comments=null, contentTitle=, contentURL=null, reason=null, reportedUserId=0, reporterEmailAddress=null, serviceContext=null}", flagsRequest0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setServiceContext((ServiceContext) null);
      assertNull(flagsRequest0.getContentURL());
  }

  @Test
  public void test13()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setReporterEmailAddress("Guest");
      assertEquals(0L, flagsRequest0.getReportedUserId());
  }

  @Test
  public void test14()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest(":y7Jz.a", 0L, ":y7Jz.a", 1457L, ":y7Jz.a", ":y7Jz.a", ":y7Jz.a", (ServiceContext) null);
      assertEquals("{className=:y7Jz.a, classPK=0, comments=null, contentTitle=:y7Jz.a, contentURL=:y7Jz.a, reason=:y7Jz.a, reportedUserId=1457, reporterEmailAddress=:y7Jz.a, serviceContext=null}", flagsRequest0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      long long0 = flagsRequest0.getClassPK();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.getContentURL();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.getReporterEmailAddress();
      assertNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      flagsRequest0.setReportedUserId((-1008L));
      assertEquals("{className=null, classPK=0, comments=null, contentTitle=null, contentURL=null, reason=null, reportedUserId=-1008, reporterEmailAddress=null, serviceContext=null}", flagsRequest0.toString());
      assertEquals((-1008L), flagsRequest0.getReportedUserId());
  }

  @Test
  public void test19()  throws Throwable  {
      FlagsRequest flagsRequest0 = new FlagsRequest();
      String string0 = flagsRequest0.toString();
      assertEquals("{className=null, classPK=0, comments=null, contentTitle=null, contentURL=null, reason=null, reportedUserId=0, reporterEmailAddress=null, serviceContext=null}", string0);
  }
}
