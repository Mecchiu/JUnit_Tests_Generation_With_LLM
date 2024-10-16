/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameRound;
import messages.round.RoundStateMsg;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RoundStateMsgEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RoundStateMsg roundStateMsg0 = new RoundStateMsg(2043);
      // Undeclared exception!
      try {
        roundStateMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unknown RoundStateMsg type: 2043
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RoundStateMsg roundStateMsg0 = new RoundStateMsg(1);
      // Undeclared exception!
      try {
        roundStateMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class client.gui.StartFrame
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RoundStateMsg roundStateMsg0 = new RoundStateMsg(2);
      // Undeclared exception!
      try {
        roundStateMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
