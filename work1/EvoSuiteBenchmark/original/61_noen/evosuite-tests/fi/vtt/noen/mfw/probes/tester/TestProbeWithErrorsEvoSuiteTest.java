/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.probes.tester;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.probes.tester.TestProbeWithErrors;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestProbeWithErrorsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TestProbeWithErrors testProbeWithErrors0 = null;
      try {
        testProbeWithErrors0 = new TestProbeWithErrors();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class fi.vtt.noen.mfw.probes.tester.TestProbeWithErrors
         */
      }
  }
}
