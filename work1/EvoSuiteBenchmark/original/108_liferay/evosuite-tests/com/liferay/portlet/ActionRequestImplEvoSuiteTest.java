/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ActionRequestImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ActionRequestImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      actionRequestImpl0.getPreferences();
      assertEquals("ACTION_PHASE", actionRequestImpl0.getLifecycle());
  }
}
