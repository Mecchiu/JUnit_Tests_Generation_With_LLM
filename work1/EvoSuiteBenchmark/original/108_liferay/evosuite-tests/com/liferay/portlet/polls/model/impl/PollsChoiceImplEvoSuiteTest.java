/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.polls.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.polls.model.impl.PollsChoiceImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PollsChoiceImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PollsChoiceImpl pollsChoiceImpl0 = null;
      try {
        pollsChoiceImpl0 = new PollsChoiceImpl();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portlet.polls.model.impl.PollsChoiceImpl
         */
      }
  }
}
