/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.messageboards.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.messageboards.model.impl.MBStatsUserCacheModel;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBStatsUserCacheModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MBStatsUserCacheModel mBStatsUserCacheModel0 = new MBStatsUserCacheModel();
      // Undeclared exception!
      try {
        mBStatsUserCacheModel0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MBStatsUserCacheModel mBStatsUserCacheModel0 = new MBStatsUserCacheModel();
      String string0 = mBStatsUserCacheModel0.toString();
      assertNotNull(string0);
      assertEquals("{statsUserId=0, groupId=0, userId=0, messageCount=0, lastPostDate=0}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MBStatsUserCacheModel mBStatsUserCacheModel0 = new MBStatsUserCacheModel();
      // Undeclared exception!
      try {
        mBStatsUserCacheModel0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
