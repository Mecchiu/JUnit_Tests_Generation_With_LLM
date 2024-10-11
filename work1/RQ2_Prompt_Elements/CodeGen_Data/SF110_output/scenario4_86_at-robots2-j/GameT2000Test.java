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
		 * Get the simulation observer to use.
		 *
		 * @return the observer.
		 */
		private SimulationObserver getSimulationObserver() {
			throw new UnsupportedOperationException("Not yet implemented");
		}

    /**
     * Test that the given robot can be added and retracted successfully.
     *
     * @throws Exception thrown if test failed.
     */
    public void testRobotAddRobot() throws Exception {
        final Robot robot = RobotFactory.getInstance().createRobot();

        assertTrue("New robot should have a frame.", frameBuffer.addRobot(robot));

        Game game = new Game(10, 0.3f);

        game.stepRound();

        assertEquals("Wrong numero of robots added.", 20, game.getRobotCount());

        Game game2 = new Game(100, 0.3f);

        game2.stepRound();

        assertEquals("Wrong numero of robots added 2.", 30, game2.getRobotCount());

        assertEquals("Wrong robot ID.",
                    new Integer(1), game2.getRobot(new Integer(1).longValue()).getId());

        assertEquals("Wrong robot ID.",
                    new Integer(2), game2.getRobot(new Integer(2).longValue()).getId());

        final int lastRobotId = 10;

        game2.stepRound();

        assertEquals("Wrong robot ID if robot was already present.",
                     new Integer(1), game2.getRobot(new Integer(1).longValue()).getId());

        game2.stepRound();

        assertEquals("Wrong robot ID if robot had already been added.",
                     new Integer(2), game2.getRobot(new Integer(2).longValue()).getId());

        game2.stepRound();

        // Make the first robot be added.
        // Since the first robot was added by the previous round the last robot
        // ID is different.
        Robot robot2 = RobotFactory.getInstance().createRobot();

        assertNotEquals("New robot should have a frame.", frameBuffer.addRobot(robot), frameBuffer.addRobot(robot2));

        assertEquals("Wrong robot ID.",
                    new Integer(lastRobotId), game2.getRobot(new Integer(1).longValue()).getId());

        assertEquals("Wrong robot ID.",
                    new Integer(lastRobotId + 1), game2.getRobot(new Integer(2).longValue()).getId());
    }
}