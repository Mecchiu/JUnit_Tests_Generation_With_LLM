/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.plugin.split.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.pdfsam.plugin.split.components.JSplitRadioButton;

@RunWith(EvoSuiteRunner.class)
public class JSplitRadioButtonEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JSplitRadioButton jSplitRadioButton0 = new JSplitRadioButton("");
      String string0 = jSplitRadioButton0.getSplitCommand();
      assertNotNull(string0);
      assertEquals("", string0);
  }
}
