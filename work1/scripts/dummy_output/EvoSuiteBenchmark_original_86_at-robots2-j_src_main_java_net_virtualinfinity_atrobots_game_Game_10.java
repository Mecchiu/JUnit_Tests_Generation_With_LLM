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
		private final Map<RobotFactory, RobotScoreKeeper> scoreKeepersMap = new HashMap<RobotFactory, RobotScoreKeeper>();
		private final RobotFactory initialRobotFactory = RobotFactory.create();

	private Robot robot;

	private RobotFactory robotFactory;

	private int numberOfSubRoundNumber;

	private int round;


    private final List<SimulationObserver> observers = new LinkedList<SimulationObserver>();


	public GameTest() {
	}

    /**
     * Get the initial set of robots.
     *
     * @return the initial set of robots.
     */
    public List<RobotFactory> getRobots() {
        return observers.toArray(new RobotFactory[0]);
    }

    /**
     * Get the number of robots.
     *
     * @return the number of robots.
     */
    public int getNumberOfRobots() {
        return getRobots().length;
    }


    public RobotFactory getRobotFactory() {
		return initialRobotFactory;
	}


	public void setRobotFactory(RobotFactory robotFactory) {
		this.robotFactory = robotFactory;
	}


	public Robot getRobot() {
		return robot;
	}


	public RobotFactory getRobotFactory() {
		return robotFactory;
	}


	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public void resetCount() {
		this.numberOfSubRoundNumber = 1;
		this.robotFactory = initialRobotFactory;
	}


    public void roundOver() {
        assertNotNull("robot isn't initialized", robot);
        assertNotNull("robot factory isn't initialized", robotFactory);

        this.round = (Round) frameBuffer.next();

    }


    /**
     * Test the round.
     */
    @Test
    public void testAllEntrantRoundMethods() {

		RobotFactory randomRobotFactory = RobotFactory.create();

		for (int i = 1; i < getNumberOfRobots(); i++) {

			initialRobotFactory = randomRobotFactory;

			robot = createRobotFor(initialRobotFactory, i);
		}

		robot = null;
		getRobotFactory();

    }


    /**
     * Test the round by adding a round state.
     *
     * A new round is created.
     *
     * A new round is created.
     *
     * A new round is created.
     *
     * A new round is created.
     *
     * A new round is created.
     */
   @Test
    public void testSubRoundAddingNewRound() {
        for (int i = 1; i < getNumberOfRobots(); i++) {
            initialRobotFactory = RobotFactory.create();

            robot = createRobotFor(initialRobotFactory, i);
        }

        Game game;
        game = new Game(2);

        robotFactory = RobotFactory.create();
        robot = createRobotFor(robotFactory, 2);
        Game game2 = new Game(2);

        game.addRound(game2);
        game2 = new Game(2);
        game.addStep();

        game.addRound(game2);

    }


    /**
     * Test the round by adding a round state.
     *
     */
    @Test
	public void testSubRoundAddingNewRound() {
        for (int i = 1; i < getNumberOfRobots(); i++) {
            initialRobotFactory = RobotFactory.create();

            robot = createRobotFor(initialRobotFactory, i);
        }

        Game game;
        game = new Game(3);

        robotFactory = RobotFactory.create();
        robot = createRobotFor(robotFactory, 2);

        game.addRound(game);
        game = new Game(3);
        //game.addStep();

        game.addRound(game);

    }


	/**
	 * Test the round by adding a step method in the round state.
	 *
	 */
	@Test
    public void testSubRoundAddingStep() {
}
}