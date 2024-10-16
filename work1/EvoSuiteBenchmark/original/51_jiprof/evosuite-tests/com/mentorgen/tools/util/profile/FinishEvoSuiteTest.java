/*
 * This file was automatically generated by EvoSuite
 */

package com.mentorgen.tools.util.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.mentorgen.tools.util.profile.Finish;
import java.io.IOException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FinishEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        Finish.doFinish("", "");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"\"
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Finish finish0 = new Finish();
      assertNotNull(finish0);
  }
}
