/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.element.IssPreScriptData;

@RunWith(EvoSuiteRunner.class)
public class IssPreScriptDataEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IssPreScriptData issPreScriptData0 = new IssPreScriptData();
      issPreScriptData0.equals((Object) "org.sourceforge.ifx.framework.element.IssPreScriptData = {\n  IssScriptId = NULL\n  IssScriptCmd = NULL\n}");
  }
}
