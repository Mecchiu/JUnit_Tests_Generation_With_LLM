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
		
    private GameTest() {
    }

	/**
	 * Test of stepRound method, of class Game instance.
	 */
	@Test
	public void testStepRound() {
        System.out.println("stepRound");

		Game instance = new Game();
		instance.setRound(instance.roundState);

		// Check that it's not running
		assertNotEquals(instance.roundState, null);
		assertNotEquals(instance.roundState.getNumFrames(), 0);

		// Simulate the round
		instance.stepRound();

		// Check that it's running
		assertEquals(instance.roundState, instance.roundState.nextRound());
	}

	/**
	 * Test of onRoundEnd method, of class Game instance.
	 */
	@Test
	public void testOnRoundEnd() {
        System.out.println("onRoundEnd");

		Game instance = new Game();
		instance.setRound(instance.roundState);

		// Simulate the round
		instance.stepRound();
	}

	/**
	 * Test of isRunning method, of class Game instance.
	 */
	@Test
	public void testIsRunning() {
		System.out.println("isRunning");

		Game instance = new Game();

		assertFalse(instance.isRunning());

		instance.setRound(instance.roundState);

		// Simulate the round
		boolean r = instance.stepRound();

		assertTrue(r);
	}

	/**
	 * Test of render method, of class Game instance.
	 */
	@Test
	public void testRender() {
        System.out.println("render");

		Game instance = new Game();
		instance.setRound(instance.roundState);

		instance.stepRound();
		instance.stepRound();

		// Simulate the round
		instance.onRoundEnd();

		Map<RobotFactory, RobotScoreKeeper> resultKeep = new IdentityHashMap<RobotFactory, RobotScoreKeeper>();

		for (RobotFactory robotFactory : instance.entrants) {
			Robot robot = RobotFactory.getDefaultRobot(
					robotFactory);
			RobotScore robotScore = RobotFactory.getDefaultRobotScore(
					robotFactory);

			double score = RobotFactory.getDefaultRobotScore(
					robotFactory).compute();

			resultKeep.put(robotFactory, new RobotScoreKeeper(robot, score));
		}

		// Do the rendering
		instance.render(resultKeep);

		// Check that every robot was tracked properly
		for (RobotFactory robotFactory : instance.entrants) {
			assertNotNull(instance.scoreKeepers.get(robotFactory));
		}
	}

	/**
	 * Make a robot for the given type of entrant
	 *
	 * @param entrant the entry.
	 * @param id      the id for the robot.
	 * @return the robot.
	 */
	protected Robot createRobotFor(RobotFactory entrant, int id) {
		return RobotFactory.getDefaultRobot(entrant, id);
	}

	/**
	 * Make a robot for the given entry
	 *
	 * @param entry the entrant.
	 * @return the robot.
	 */
	protected Robot createRobotFor(RobotFactory entry) {
		return RobotFactory.getDefaultRobot(entry);
	}

	/**
	 * Make a robot for the given entrant and get their score.
	 *
	 * @param entrant the entry.
	 * @return the robot.
	 */
	protected Robot createRobotFor(RobotFactory entrant) {
		return RobotFactory.getDefaultRobot(entrant);
	}

	/**
	 * Get the current robot score
	 *
	 * @return the current robot score
	 */
	protected RobotScore getFinalRobotScore(RobotFactory entrant) {
		return RobotFactory.getDefaultRobotScore(entrant);
	}

	/**
	 * Get the current robot score
	 *
	 * @return the current robot score
	 */
	protected RobotScore getFinalRobotScore(RobotFactory entrant, int id) {
		return RobotFactory.getDefaultRobotScore(entrant, id);
	}
}