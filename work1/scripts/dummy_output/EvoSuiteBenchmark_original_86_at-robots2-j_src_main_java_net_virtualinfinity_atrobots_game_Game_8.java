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
		 * Test {@link Game#stepRound()}.
		 */
		@Test
		void testStepRound() {
			final Game game = new Game(3000000);
			final RobotFactory player = RobotFactory.createPlayer("a");
			game.addEntrant(player);
			game.addEntrant(player);
			final RobotFactory car = RobotFactory.createCar("b");
			final RobotFactory horse = RobotFactory.createHorse("c");
			game.addEntrant(horse);
			final RobotFactory horseTurtle = RobotFactory.createHorse("t");
			// the one game object
			final RobotFactory rob = RobotFactory.createRobot("d1");
}
}