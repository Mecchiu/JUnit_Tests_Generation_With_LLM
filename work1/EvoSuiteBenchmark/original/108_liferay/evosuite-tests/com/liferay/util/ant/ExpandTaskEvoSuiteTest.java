/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.util.ant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.util.ant.ExpandTask;
import org.apache.tools.ant.BuildException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExpandTaskEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        ExpandTask.expand("", "");
        fail("Expecting exception: BuildException");
      } catch(BuildException e) {
        /*
         * src '' doesn't exist.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ExpandTask expandTask0 = new ExpandTask();
      assertNotNull(expandTask0);
  }
}
