/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:58:10 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.CarRaceCollision;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CarRaceCollision_ESTest extends CarRaceCollision_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = CarRaceCollision.carRaceCollision((-467));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      CarRaceCollision.carRaceCollision(636);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = CarRaceCollision.carRaceCollision(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CarRaceCollision carRaceCollision0 = new CarRaceCollision();
  }
}
