/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameRound;
import client.ClientGameSession;
import client.view.GameCanvas;
import java.awt.Point;
import javax.swing.JSeparator;
import messages.round.PlayerStateMsg;
import org.junit.BeforeClass;
import server.ClientInfo;
import server.ServerGameRound;

@RunWith(EvoSuiteRunner.class)
public class PlayerStateMsgEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JSeparator jSeparator0 = new JSeparator();
      Point point0 = jSeparator0.getLocation();
      PlayerStateMsg playerStateMsg0 = null;
      try {
        playerStateMsg0 = new PlayerStateMsg(0, point0, point0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class messages.round.PlayerStateMsg
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JSeparator jSeparator0 = new JSeparator();
      Point point0 = jSeparator0.getLocation();
      PlayerStateMsg playerStateMsg0 = null;
      try {
        playerStateMsg0 = new PlayerStateMsg(0, point0, point0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class messages.round.PlayerStateMsg
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JSeparator jSeparator0 = new JSeparator();
      Point point0 = jSeparator0.getLocation();
      PlayerStateMsg playerStateMsg0 = null;
      try {
        playerStateMsg0 = new PlayerStateMsg(0, point0, point0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class messages.round.PlayerStateMsg
         */
      }
  }
}
