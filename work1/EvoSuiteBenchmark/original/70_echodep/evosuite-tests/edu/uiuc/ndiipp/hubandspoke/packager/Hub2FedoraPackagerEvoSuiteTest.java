/*
 * This file was automatically generated by EvoSuite
 */

package edu.uiuc.ndiipp.hubandspoke.packager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import edu.uiuc.ndiipp.hubandspoke.packager.Hub2FedoraPackager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Hub2FedoraPackagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Hub2FedoraPackager hub2FedoraPackager0 = null;
      try {
        hub2FedoraPackager0 = new Hub2FedoraPackager();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.Hub2FedoraPackager
         */
      }
  }
}
