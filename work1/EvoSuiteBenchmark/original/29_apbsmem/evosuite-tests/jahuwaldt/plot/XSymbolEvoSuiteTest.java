/*
 * This file was automatically generated by EvoSuite
 */

package jahuwaldt.plot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jahuwaldt.plot.XSymbol;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XSymbolEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      assertEquals(8, xSymbol0.getSize());
  }
}
