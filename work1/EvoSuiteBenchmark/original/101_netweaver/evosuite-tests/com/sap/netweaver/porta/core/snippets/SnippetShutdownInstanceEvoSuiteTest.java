/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.snippets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.snippets.SnippetShutdownInstance;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SnippetShutdownInstanceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SnippetShutdownInstance snippetShutdownInstance0 = new SnippetShutdownInstance();
      assertNotNull(snippetShutdownInstance0);
  }
}
