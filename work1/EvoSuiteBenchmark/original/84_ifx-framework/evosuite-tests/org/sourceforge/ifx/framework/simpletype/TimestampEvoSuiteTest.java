/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.simpletype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.simpletype.Timestamp;

@RunWith(EvoSuiteRunner.class)
public class TimestampEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Timestamp timestamp0 = new Timestamp();
      timestamp0.equals((Object) null);
  }
}
