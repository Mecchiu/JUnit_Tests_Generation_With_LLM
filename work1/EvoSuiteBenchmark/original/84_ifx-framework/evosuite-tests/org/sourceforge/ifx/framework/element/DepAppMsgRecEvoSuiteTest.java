/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.DepAppMsgRec;

@RunWith(EvoSuiteRunner.class)
public class DepAppMsgRecEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DepAppMsgRec depAppMsgRec0 = new DepAppMsgRec();
      depAppMsgRec0.equals((Object) "org.sourceforge.ifx.framework.element.IdentVerifyMethod = {\n  String = NULL\n}");
  }
}
