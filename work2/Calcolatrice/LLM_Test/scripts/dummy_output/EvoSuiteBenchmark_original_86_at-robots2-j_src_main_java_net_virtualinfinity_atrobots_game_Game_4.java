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
		
    private final int roundNumber;
    
    private final RobotFactory rotarionFactory;
    
    private final RobotFactory victorFactory;
	
    private final FrameBuilder frameBuffer;
	
    private final List<RobotFactory> entrants = new ArrayList<RobotFactory>();

    public GameTest(int roundNumber, RobotFactory rotarionFactory, RobotFactory victorFactory, FrameBuilder frameBuffer, List<RobotFactory> entrants) {
    	this.roundNumber = roundNumber;
    	this.rotarionFactory = rotarionFactory;
    	this.victorFactory = victorFactory;
    	this.frameBuffer = frameBuffer;
    	this.entrants = entrants;
    }
    
    /**
     * Tear down the game.
     */
    public void tearDown() {
        throw new IllegalStateException("Game not started.");
	}

    public Robot getVictor() {
        return getVictor(roundNumber);
    }
	
    protected Robot getVictor(int roundNumber) {
        return victorFactory.create(roundNumber).create();
	}

    public RobotFactory getRotorFactory() {
    	return rotarionFactory;
    }
	
    /**
     * Get the current round.
     *
     * @return the current round.
     */
    public synchronized Round getRound() {
        return new Round(0, frameBuffer, roundNumber, frameBuffer.getStartTime());
    }
	
    public synchronized int getTotalRounds() {
        return totalRounds;
    }
		
    public synchronized int getMaxProcessorSpeed() {
        return maxProcessorSpeed;
    }

    /**
     * Get the current round.
     *
     * @param roundNumber the current round
     * @return the current round's processor speed
     */
    public synchronized int getProcessorSpeed(int roundNumber) {
        return frameBuffer.getProcessorSpeed(roundNumber);
    }

	/**
	 * Create a Robot for the given entrant.
	 *
	 * @param entrant the entrant
	 * @return the created Robot
	 */
    protected Robot createRobotFor(RobotFactory entrant) {
    	entrants.add(entrant);
        return rotarionFactory.create(roundNumber).create();
	}
	
	/**
	 * Gets the next entrant id
	 *
	 * @return the next entrant id
	 */
    protected int getNextEntrantId() {
        return nextEntrantId++;
    }

    /**
     * Get the robot score keeper
     *
     * @return the score keeper
     */
    protected RobotScoreKeeper getRobotScoreKeeper() {
        return scoreKeepers.get(roparionFactory);
    }
	
    /**
     * Get the robot
     *
     * @return the robot
     */
    protected Robot getRobot() {
        return frameBuffer.getRobot();
	}
	
    /**
     * Get the current robot score
     * @return current robot score
     */
    protected RobotScore getRobotScore() {
        return getRobot().getRobotScore();
    }
	
    /**
     * Check if Robot is the winner
     * @return is winner
     */
    protected boolean isWinner() {
        if (entrants.size() == this.getTotalRounds()) {
            Set<RobotFactory> winners = new HashSet<RobotFactory>();
			robotScoreKeeper = new RobotScoreKeeper(getRobotScore());
            for (RobotFactory entrant : entrants) {
                if (!robotScoreKeeper.isWinner(entrant)) {
                    winners.add(entrant);
                }
			}
            return winners.size() == 1;
        } else {
            return false;
        }
	}

	/**
	* @return the current robot score
	*/
	protected RobotScore getFinalRobotScore() {
		return getFinalRobotScore(rotorFactory);
	}

	/**
	* @return The robot's score
	*/
    public RobotScore getRobotScore(RobotFactory robotFactory) {
}
}