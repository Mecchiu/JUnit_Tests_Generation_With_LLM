/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.assembly.ReadInfo;
import org.jcvi.jillion.core.Range;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ReadInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ReadInfo readInfo0 = null;
      try {
        readInfo0 = new ReadInfo((Range) null, (-1584));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * valid range can not be null
         */
      }
  }
}
