/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.probes.tester;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.probes.tester.TestProbe2;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestProbe2EvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TestProbe2 testProbe2_0 = null;
      try {
        testProbe2_0 = new TestProbe2();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class fi.vtt.noen.mfw.probes.tester.TestProbe2
         */
      }
  }
}
