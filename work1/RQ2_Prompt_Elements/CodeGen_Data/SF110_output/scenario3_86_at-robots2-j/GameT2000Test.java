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

    private final RobotFactory robotFactory;
    final SimulatedGame game;

    /**
     * Default Constructor.
     *
     * @param game The {@link Game} object which holds the robot factory.
     */
    public GameTest(final SimulatedGame game) {
	this.robotFactory = game.getRobotFactory();
	this.game = game;
    }
	
    /**
     * Tests {@link Game#stepRound()} method.
     */
    @Test
    public void testStepRound() {
      game.stepRound();
    }

    /**
     * Tests the {@link #stepRound()} method.
     */
    @Test
    public void testStepRound() {
        Assert.assertFalse(game.stepRound());
    }
    /**
     * Tests the {@link #stepRound()} method.
     */
    @Test
    public void testStepRound() {
        game.stepRound();
    }

    private static Robot makeRobot(Map<String, Object> parameters) {
	return robotFactory.makeRobot("test", parameters);	
    }
}

// Unit Test Class for the robot and game object of the class Game.
class UnitRobotEntity extends Robot {

    private Robot robot;

    public UnitRobotEntity(Map<String, Object> parameters) {
	super(parameters);
    }

    @Override
    public Robot compute() {
	return robot;
    }
}