/*
 * This file was automatically generated by EvoSuite
 */

package com.mentorgen.tools.profile.output;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.mentorgen.tools.profile.output.FrameDump;
import com.mentorgen.tools.profile.runtime.Frame;
import java.io.PrintWriter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FrameDumpEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FrameDump frameDump0 = new FrameDump();
      assertNotNull(frameDump0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        FrameDump.dump((PrintWriter) null, (Frame) null, 46);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
