/*
 * This file was automatically generated by EvoSuite
 */

package jahuwaldt.plot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jahuwaldt.plot.Triangle4Symbol;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Triangle4SymbolEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      triangle4Symbol0.generatePoints((-2016), (-2016));
      triangle4Symbol0.generatePoints((-1209), 198);
      assertEquals(8, triangle4Symbol0.getSize());
  }
}
