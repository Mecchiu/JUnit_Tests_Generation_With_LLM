/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.CreditMsgRqInfo;

@RunWith(EvoSuiteRunner.class)
public class CreditMsgRqInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CreditMsgRqInfo creditMsgRqInfo0 = new CreditMsgRqInfo();
      creditMsgRqInfo0.equals((Object) "org.sourceforge.ifx.framework.element.TrnStatInfo = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
  }
}
