/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.BillerInqRq;

@RunWith(EvoSuiteRunner.class)
public class BillerInqRqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BillerInqRq billerInqRq0 = new BillerInqRq();
      billerInqRq0.equals((Object) "org.sourceforge.ifx.framework.element.MagData2 = {\n  String = NULL\n}");
  }
}
