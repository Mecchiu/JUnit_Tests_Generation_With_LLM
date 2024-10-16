/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.plugins.net.buddy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.plugins.net.buddy.BuddyPluginBuddyMessage;
import com.aelitis.azureus.plugins.net.buddy.BuddyPluginBuddyMessageHandler;
import com.aelitis.azureus.plugins.net.buddy.BuddyPluginException;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BuddyPluginBuddyMessageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 1589, (-371), (Map) null, 1, (-1731L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      // Undeclared exception!
      try {
        buddyPluginBuddyMessage0.getReply();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 0, 3000, (Map) null, (-1117), (-1L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      int int0 = buddyPluginBuddyMessage0.getID();
      assertEquals(0, int0);
      assertEquals(-1117, buddyPluginBuddyMessage0.getTimeout());
      assertEquals((-1L), buddyPluginBuddyMessage0.getCreateTime());
      assertEquals(3000, buddyPluginBuddyMessage0.getSubsystem());
  }

  @Test
  public void test2()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 0, 0, (Map) null, 0, (-1142L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      // Undeclared exception!
      try {
        buddyPluginBuddyMessage0.getBuddy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 1589, (-371), (Map) null, 1, (-1731L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      buddyPluginBuddyMessage0.isDeleted();
      assertEquals(1, buddyPluginBuddyMessage0.getTimeout());
      assertEquals((-1731L), buddyPluginBuddyMessage0.getCreateTime());
      assertEquals(-371, buddyPluginBuddyMessage0.getSubsystem());
      assertEquals(1589, buddyPluginBuddyMessage0.getID());
  }

  @Test
  public void test4()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 99, (-465), (Map) null, 0, (-1L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      long long0 = buddyPluginBuddyMessage0.getCreateTime();
      assertEquals(0, buddyPluginBuddyMessage0.getTimeout());
      assertEquals(-465, buddyPluginBuddyMessage0.getSubsystem());
      assertEquals(99, buddyPluginBuddyMessage0.getID());
      assertEquals((-1L), long0);
  }

  @Test
  public void test5()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 0, (-742), (Map) null, (-742), 1565L);
      assertNotNull(buddyPluginBuddyMessage0);
      
      // Undeclared exception!
      try {
        buddyPluginBuddyMessage0.getRequest();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 0, 0, (Map) null, 0, (-1142L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      int int0 = buddyPluginBuddyMessage0.getTimeout();
      assertEquals((-1142L), buddyPluginBuddyMessage0.getCreateTime());
      assertEquals(0, int0);
      assertEquals(0, buddyPluginBuddyMessage0.getID());
      assertEquals(0, buddyPluginBuddyMessage0.getSubsystem());
  }

  @Test
  public void test7()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 0, 0, (Map) null, 0, (-1142L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      int int0 = buddyPluginBuddyMessage0.getSubsystem();
      assertEquals((-1142L), buddyPluginBuddyMessage0.getCreateTime());
      assertEquals(0, buddyPluginBuddyMessage0.getTimeout());
      assertEquals(0, buddyPluginBuddyMessage0.getID());
      assertEquals(0, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, 0, 3000, (Map) null, (-1117), (-1L));
      assertNotNull(buddyPluginBuddyMessage0);
      
      // Undeclared exception!
      try {
        buddyPluginBuddyMessage0.delete();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      BuddyPluginBuddyMessage buddyPluginBuddyMessage0 = null;
      try {
        buddyPluginBuddyMessage0 = new BuddyPluginBuddyMessage((BuddyPluginBuddyMessageHandler) null, (-1), 99, (Map) hashMap0, (-27), (long) (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
