/*
 * This file was automatically generated by EvoSuite
 */

package weka.classifiers.functions.neural;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import weka.classifiers.functions.neural.SigmoidUnit;

@RunWith(EvoSuiteRunner.class)
public class SigmoidUnitEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SigmoidUnit sigmoidUnit0 = new SigmoidUnit();
      String string0 = sigmoidUnit0.getRevision();
      assertNotNull(string0);
      assertEquals("8034", string0);
  }
}
