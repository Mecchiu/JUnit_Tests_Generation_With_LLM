/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.PassbkItemDelRs;

@RunWith(EvoSuiteRunner.class)
public class PassbkItemDelRsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PassbkItemDelRs passbkItemDelRs0 = new PassbkItemDelRs();
      passbkItemDelRs0.equals((Object) "org.sourceforge.ifx.framework.element.EndDt = {\n  String = NULL\n}");
  }
}
