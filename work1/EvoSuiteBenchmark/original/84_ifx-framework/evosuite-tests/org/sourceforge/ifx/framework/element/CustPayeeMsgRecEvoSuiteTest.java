/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.CustPayeeMsgRec;

@RunWith(EvoSuiteRunner.class)
public class CustPayeeMsgRecEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustPayeeMsgRec custPayeeMsgRec0 = new CustPayeeMsgRec();
      custPayeeMsgRec0.equals((Object) "org.sourceforge.ifx.framework.element.IssScriptResult = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
  }
}
