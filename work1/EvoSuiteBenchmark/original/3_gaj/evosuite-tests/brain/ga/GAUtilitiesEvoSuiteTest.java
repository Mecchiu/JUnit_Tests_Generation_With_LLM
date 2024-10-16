/*
 * This file was automatically generated by EvoSuite
 */

package brain.ga;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import brain.ga.GAUtilities;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GAUtilitiesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GAUtilities gAUtilities0 = new GAUtilities();
      assertNotNull(gAUtilities0);
  }

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = GAUtilities.flipCoin((-1.0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = GAUtilities.nextPos(1);
      assertEquals(1, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = GAUtilities.nextPos(1805);
      assertEquals(1, int0);
  }
}
