/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.assembly.DefaultScaffold;
import org.jcvi.jillion.assembly.ScaffoldBuilder;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultScaffoldEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ScaffoldBuilder scaffoldBuilder0 = DefaultScaffold.createBuilder("");
      assertNotNull(scaffoldBuilder0);
  }
}
