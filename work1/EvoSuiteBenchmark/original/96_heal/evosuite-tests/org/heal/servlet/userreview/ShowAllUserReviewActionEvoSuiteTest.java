/*
 * This file was automatically generated by EvoSuite
 */

package org.heal.servlet.userreview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.heal.servlet.userreview.ShowAllUserReviewAction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShowAllUserReviewActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ShowAllUserReviewAction showAllUserReviewAction0 = new ShowAllUserReviewAction();
      boolean boolean0 = showAllUserReviewAction0.actionRequiresLogin();
      assertEquals(true, boolean0);
  }
}
