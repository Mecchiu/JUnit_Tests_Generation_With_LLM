/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.server.plugins.sac.mfwservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.server.plugins.sac.SACPlugin;
import fi.vtt.noen.mfw.bundle.server.plugins.sac.mfwservice.GetMFW;
import fi.vtt.noen.mfw.bundle.server.plugins.sac.mfwservice.SACMFWImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SACMFWImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SACMFWImpl sACMFWImpl0 = new SACMFWImpl((SACPlugin) null, (-51L));
      GetMFW getMFW0 = new GetMFW();
      // Undeclared exception!
      try {
        sACMFWImpl0.getMFW(getMFW0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Failed to get MFW information
         */
      }
  }
}
