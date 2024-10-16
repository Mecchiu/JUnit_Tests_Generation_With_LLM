/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.messageboards.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.messageboards.service.MBMessageService;
import com.liferay.portlet.messageboards.service.MBMessageServiceWrapper;
import java.io.InputStream;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBMessageServiceWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getBeanIdentifier();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getCompanyMessagesRSS((-1L), (-1413), (-1413), "[18>%R<viQ$`C", (double) (-1413), "[18>%R<viQ$`C", "[18>%R<viQ$`C", "[18>%R<viQ$`C", themeDisplay0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.deleteMessageAttachments(2031L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.subscribeMessage(506L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getThreadMessagesRSS(134695760L, 1090, 1090, "", (double) 1090, "", "", "", themeDisplay0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getThreadMessages(1461L, 1461L, 1461L, 48, 48, 48);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      MBMessageService mBMessageService0 = mBMessageServiceWrapper0.getWrappedService();
      assertNull(mBMessageService0);
  }

  @Test
  public void test7()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getGroupMessagesRSS((-97L), (-97L), 760, 760, "Could not invalidate region: ", (double) 760, "Could not invalidate region: ", "Could not invalidate region: ", "Could not invalidate region: ", themeDisplay0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.addMessage((-1799L), 0L, "2B:Y", "2B:Y", "2B:Y", (List<ObjectValuePair<String, InputStream>>) null, false, 0.0, false, (ServiceContext) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.unsubscribeMessage((-1759L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getGroupMessagesRSS((-1178L), 0, 0, "msg.defaultvw.?Ialue", (double) 0, "msg.defaultvw.?Ialue", "msg.defaultvw.?Ialue", "msg.defaultvw.?Ialue", themeDisplay0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.addMessage((-1L), "", "", "", (List<ObjectValuePair<String, InputStream>>) null, false, (double) (-1L), false, serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getCategoryMessages(1470L, 1470L, (-1036), (-1036), (-1036));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getThreadAnswersCount(1284652111714L, 1284652111714L, 1284652111714L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.updateMessage(0L, "EmIG", "EmIG", (List<ObjectValuePair<String, InputStream>>) null, (List<String>) null, (double) 0L, false, serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getCategoryMessagesRSS(3L, (long) 1452, 1452, 1452, "R2w P/oLX*", (double) 1452, "R2w P/oLX*", "R2w P/oLX*", "R2w P/oLX*", themeDisplay0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.deleteDiscussionMessage(8L, "NCharacterStream", 8L, "NCharacterStream", 8L, 8L, 8L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.updateAnswer(250L, true, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      mBMessageServiceWrapper0.setWrappedService((MBMessageService) null);
  }

  @Test
  public void test19()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getGroupMessagesCount((long) 458, 458);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getMessageDisplay(551L, 1033, "oGdJRV,n", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getCategoryMessagesCount((-1633L), (-1633L), 8417);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.addDiscussionMessage((-7L), "", (-7L), "", (-7L), (-7L), (-7L), (-7L), "", "", serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getThreadMessagesCount((-1721L), (-1721L), (-1721L), 501);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.updateDiscussionMessage("d%R_", (-1788L), "d%R_", (-1788L), (-1788L), (-1788L), "d%R_", "d%R_", serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.deleteMessage((-1008L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.getMessage((-1796L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      MBMessageServiceWrapper mBMessageServiceWrapper0 = new MBMessageServiceWrapper((MBMessageService) null);
      // Undeclared exception!
      try {
        mBMessageServiceWrapper0.setBeanIdentifier("7[G-hb$HiSaDg^!");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
