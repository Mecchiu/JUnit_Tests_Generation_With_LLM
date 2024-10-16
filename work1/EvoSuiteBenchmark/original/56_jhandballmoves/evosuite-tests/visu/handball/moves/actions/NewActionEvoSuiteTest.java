/*
 * This file was automatically generated by EvoSuite
 */

package visu.handball.moves.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoSuiteRunner.class)
public class NewActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewAction newAction0 = new NewAction(handballModel0);
      // Undeclared exception!
      try {
        newAction0.performAction();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
