/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.messageboards.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.messageboards.service.http.MBThreadServiceSoap;
import java.rmi.RemoteException;
import java.util.Date;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBThreadServiceSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        MBThreadServiceSoap.getThreadsCount((-1905L), 1L, (-1237));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MBThreadServiceSoap mBThreadServiceSoap0 = new MBThreadServiceSoap();
      assertNotNull(mBThreadServiceSoap0);
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        MBThreadServiceSoap.getGroupThreads(792L, (-264L), 10, 10, 10);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      try {
        MBThreadServiceSoap.getThreads((-1063L), (-1063L), 61, 61, 61);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      try {
        MBThreadServiceSoap.moveThreadToTrash(1L);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      try {
        MBThreadServiceSoap.deleteThread(1L);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      try {
        MBThreadServiceSoap.restoreThreadFromTrash(0L);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      try {
        MBThreadServiceSoap.unlockThread((-560L));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Date date0 = new Date((-1L));
      try {
        MBThreadServiceSoap.getGroupThreadsCount(0L, 833L, date0, (-69));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      try {
        MBThreadServiceSoap.getGroupThreads((-750L), 1887L, 0, false, 0, (-1077));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      try {
        MBThreadServiceSoap.getGroupThreadsCount(0L, (-1801L), 1223);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        MBThreadServiceSoap.splitThread(0L, "^4#`Z[", serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      try {
        MBThreadServiceSoap.getGroupThreadsCount(233L, (-784L), 10, false, true);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Date date0 = new Date(266L);
      try {
        MBThreadServiceSoap.getGroupThreads((-497L), (-1897L), date0, 1, 0, 1);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      try {
        MBThreadServiceSoap.getGroupThreads(1854L, (-314L), 0, false, true, 0, 0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      try {
        MBThreadServiceSoap.getGroupThreadsCount((-98L), (-98L), (-1), false);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      try {
        MBThreadServiceSoap.moveThread(1731L, 0L);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
