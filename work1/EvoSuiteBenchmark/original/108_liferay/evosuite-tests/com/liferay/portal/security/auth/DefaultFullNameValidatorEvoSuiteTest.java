/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.security.auth.DefaultFullNameValidator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultFullNameValidatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultFullNameValidator defaultFullNameValidator0 = new DefaultFullNameValidator();
      boolean boolean0 = defaultFullNameValidator0.validate((-1L), "(j}`i", "(j}`i", "(j}`i");
      assertEquals(true, boolean0);
  }
}
