/*
 * This file was automatically generated by EvoSuite
 */

package org.character;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.character.CharServer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CharServerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CharServer charServer0 = new CharServer();
      assertNotNull(charServer0);
  }
}
