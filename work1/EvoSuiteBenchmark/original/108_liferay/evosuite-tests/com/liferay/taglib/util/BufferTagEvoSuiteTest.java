/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.taglib.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.taglib.util.BufferTag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BufferTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BufferTag bufferTag0 = new BufferTag();
      int int0 = bufferTag0.doStartTag();
      assertEquals(2, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      BufferTag bufferTag0 = new BufferTag();
      // Undeclared exception!
      try {
        bufferTag0.doEndTag();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BufferTag bufferTag0 = new BufferTag();
      bufferTag0.setVar((String) null);
      assertEquals(0, bufferTag0.doAfterBody());
  }
}
