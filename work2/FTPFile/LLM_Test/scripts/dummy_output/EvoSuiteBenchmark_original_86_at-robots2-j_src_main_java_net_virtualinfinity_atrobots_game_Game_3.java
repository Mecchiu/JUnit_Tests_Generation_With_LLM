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
		
	// Fields
	private final int[] ids;
	private final RobotFactory factory;
	private final RobotFactory secondFactory;

	/**
	 * Create a new test class.
	 */
	public GameTest() {
		this.ids = new int[]{0, 2};
		this.factory = RobotFactory.robotsRobot();
		this.secondFactory = RobotFactory.robotsRobot();
	}

	private RobotScore getFinalRobotScore(RobotFactory entrant) {
		Robot robot = new Robot(this.factory.randomize());
		return robot.getFinalRobotScore(entrant);
	}

	private final RobotFactory robotFactory = RobotFactory.robotsRobot();

	private int getEntrantId(Robot robot) {
		return this.ids[0], this.ids[1];
	}

	private Robot createRobot(RobotFactory robotFactory, int id) {
		return robotFactory.newRobot(id);
	}

	private Robot createRobot(RobotFactory robotFactory, int id, RobotEntry robotEntry) {
		return robotFactory.newRobot(id, robotEntry);
	}

	private Robot factoryRobot() {
		return this.secondFactory;
	}

	private Robot secondRobotFactory() {
		return this.factory;
	}

	/**
	 * Add a robot to the game. When this method is called, the robot factory will be setted as the robot Factory for
	 * all the entrantFactory.
	*/
	public void addRobot(RobotFactory entrantFactory) {
		entrantFactory.setRobotFactory(this.factory);
		this.factory.setRobotFactory(entrantFactory);
	}

	/**
	 * Reset robot factory.
	 */
	public void resetRobotFactory() {
		this.factory.resetRobotFactory();
	}

	/**
	 * Create an id for entrantFactory.
	 *
	 * @return the current id for entrantFactory.
	 */
	protected int getEntrantsUniqueId() {
		return 1;
	}

	// Tests

	/**
	 * Test that a Robot is created.
	 */
	@Test
	public void whenEntrantIdIsCreatedThenRobotCreated() {
		final RobotFactory fakeFactory = RobotFactory.robotsRobot();
		fakeFactory.setRobotFactory(System.nanoTime());
		this.addRobot(fakeFactory);
		Robot robot = this.factory.getRobot(getEntrantsUniqueId());
		assertSame(this.robotsRobotMock, this.robotsRobotMock.getRef(robot));
	}
}

/**
 * Robot Factory is used to create Robot instances. This class uses the internal array to store Robot objects.
 * It should not be modified.
 **/
class RobotsRobotMock extends Robot {

    private Robot robot;
	private RobotScore best = null;
	private synchronized RobotScore getBest() {
		return this.best == null? this.robot.getFinalRobotScore(System.nanoTime()) : this.best;
	}

	public RobotsRobotMock(int id, RobotEntry entry) {
	}

    public Robot initialize() {
        return this.robot;
    }

    public Robot getNextRobot() {
        this.best = this.getBest();
        return this.best == null? this.robot : null;
    }
}