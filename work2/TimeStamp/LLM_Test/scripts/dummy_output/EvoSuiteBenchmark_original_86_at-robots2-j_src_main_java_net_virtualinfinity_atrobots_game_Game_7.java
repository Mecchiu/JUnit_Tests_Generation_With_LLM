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
	 * A unit test case for {@link Game#stepRound()}
	 */
	@Test
    public void testStepRound() {
        //
    }
	
	/**
	 * Make a Game instance for testing.
	 */
	public Game createInstance() {
	return new Game();
	}

    /**
     * Construct a game object.
     * <p>
     * By default, it uses a frame builder that is a {@link FrameBuilderFactory}
     * instance.
     * 
     * @return the game instance
     */
    public Game getInstance() {
        return createInstance();
    }

    /**
     * The game instance created for tests. 
     * <p>
     * @return the game instance
     */
    public Game getRoot() {
        return createInstance();
    }

    @Test
    public void setRoot() {
        Game game = getRoot();
        assertSame(game.getMaxProcessorSpeed(), getMaxProcessorSpeed());
        assertSame(game.getEntrants(), Collections.synchronizedList(entrants));
    }

    public int getMaxProcessorSpeed() {
        return maxProcessorSpeed;
    }

    public List<RobotFactory> getEntrants() {
        return entrants;
    }
    
    public int getMaxGameEntrants() {
        return maxGameEntrants;
    }

    /**
     * The entrants for a new game instance.
     * <p>
     * <p>
     * @return the new list of entrants
     */
    public List<RobotFactory> getEntrantsForNewGame() {
        List<RobotFactory> result = new ArrayList<RobotFactory>();
        result.add(RobotFactory.SIMULATOR);
        entrants.clear();
        entrants.add(RobotFactory.ENTRANT);
        entrants.add(RobotFactory.ROBOT);
        entrants.add(RobotFactory.TIMED);
        return Collections.synchronizedList(entrants);
    }

    /**
     * A list of robots available for the new thread.
     * <p>
     * @return the list of robots available for the new thread
     */
    public List<Robot> getRobotAvailableForNewThread() {
        List<Robot> robots = new ArrayList<Robot>();
        robots.add(RobotFactory.TIMED.getRobot());
        robots.add(RobotFactory.SIMULATOR.getRobot());
        robots.add(RobotFactory.ENTRANT.getRobot());
        robots.add(RobotFactory.ROBOT.getRobot());
        return robots;
    }

    /**
     * The score keeper to use for the new game.
     * <p>
     * @return the score keeper to use for the new game
     */
    public RobotScoreKeeper getScoreKeeperForNewGame() {
        return RobotScoreKeeper.getNewInstance();
    }

    /**
     * The best robot for the new round.
     * <p>
     * @return one of the best robots in the new round.
     */
    public Robot getBestRobotForNewRound() {
        Robot bestRobot = RobotFactory.ROBOT.getRobot();
        int bestCount = 0;
        Robot bestRobot1 = RobotFactory.TIMED.getRobot();
        int count = 1;
        Robot bestRobot2 = RobotFactory.SIMULATOR.getRobot();
        while (count < 10 && bestRobot1.getId() == bestRobot2.getId()) {
            bestRobot1 = RobotFactory.ROBOT.getRobot();
            count++;
        }
        while (count < 10 && bestRobot2.getId() == bestRobot1.getId()) {
            bestRobot2 = RobotFactory.ROBOT.getRobot();
            count++;
        }
}
}