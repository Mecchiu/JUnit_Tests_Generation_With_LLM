/*
 * This file was automatically generated by EvoSuite
 */

package accessories.plugins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import accessories.plugins.ChangeNodeLevelAction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ChangeNodeLevelActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ChangeNodeLevelAction changeNodeLevelAction0 = new ChangeNodeLevelAction();
      assertNull(changeNodeLevelAction0.getName());
  }
}
