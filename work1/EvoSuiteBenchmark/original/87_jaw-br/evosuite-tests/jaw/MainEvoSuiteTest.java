/*
 * This file was automatically generated by EvoSuite
 */

package jaw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jaw.Main;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MainEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Main main0 = null;
      try {
        main0 = new Main();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
