/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.messageboards.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.messageboards.model.impl.MBDiscussionImpl;
import org.evosuite.testcase.TestCaseExecutor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBDiscussionImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MBDiscussionImpl mBDiscussionImpl0 = null;
      try {
        mBDiscussionImpl0 = new MBDiscussionImpl();
        fail("Expecting exception: ExceptionInInitializerError");
      } catch(ExceptionInInitializerError e) {
      }
  }
}
