/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.simpletype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.simpletype.Date;

@RunWith(EvoSuiteRunner.class)
public class DateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Date date0 = new Date();
      date0.equals((Object) null);
  }
}
