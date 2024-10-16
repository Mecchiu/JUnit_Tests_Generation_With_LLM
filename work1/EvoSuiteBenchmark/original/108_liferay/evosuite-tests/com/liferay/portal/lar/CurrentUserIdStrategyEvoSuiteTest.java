/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.lar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.lar.CurrentUserIdStrategy;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserWrapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CurrentUserIdStrategyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UserWrapper userWrapper0 = new UserWrapper((User) null);
      CurrentUserIdStrategy currentUserIdStrategy0 = new CurrentUserIdStrategy((User) userWrapper0);
      // Undeclared exception!
      try {
        currentUserIdStrategy0.getUserId("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      CurrentUserIdStrategy currentUserIdStrategy0 = new CurrentUserIdStrategy((User) null);
      // Undeclared exception!
      try {
        currentUserIdStrategy0.getUserId("z~,Z,Yc91hopb>fEU5b");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
