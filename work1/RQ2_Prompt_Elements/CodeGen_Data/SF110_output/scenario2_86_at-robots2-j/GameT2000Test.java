// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains one unit test case for the {@link Game#stepRound()} method.
*/
class GameTest {
// Game.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;

/**
 * This class coordinates rounds, entrants, and the simulation frame buffer.
 *
 * @author Daniel Pitts
 */
public class Game implements RoundListener {

    /**
     * Execute one step in the simulation.
     */
    public synchronized boolean stepRound() {
        if (round == null) {
            return false;
        }
        getRound().step();
        return round!= null;
    }
}

// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains one unit test case for the {@link Game#stepRound()} method.
*/
class GameTest {
		/**
		* This test class is derived from {@link Game} and is executed like
		* an unit test.
		* Each unit test in this class corresponds to a {@link Robot} created
		* by a RobotFactory.
		*/
	
        @Test
        void round() {
            Game rd = null;
            Robot r = RobotFactory.robotNew();

            List<Robot> robots = new ArrayList<>();
            robots.add(r);

            rd = new Game();
            rd.append(robots);
            rd.addRoundListener(new RoundListener() {


                
                
                
                /**
                 * Run step of round
                 */

                
                @Override
                protected boolean roundStep(SimulationObserver sim) {
                    round = r;
                    roundState = RoundState.RUNNING;
                    return true;
                }

            });
            int nRound = 0;
            for (int n = rd.getRoundStartFrame() - 1; n > 0; n--) {
                r = rd.getRound(n);
                                                        
                r.getRobotScore().getScoreKeeper().addKeeper(6);
                r.executeRobotStep();
                sim.getWorld().reset();

                nRound++;
                if (nRound > 1) {
                    break;
                }
            }
            rd.step();

            if (nRound > 1) {
                fail("failed to step through the game.");
            }
//            System.out.println("Done");
            assertTrue(rd.getRoundState()==RoundState.RUNNING);
        }
}
