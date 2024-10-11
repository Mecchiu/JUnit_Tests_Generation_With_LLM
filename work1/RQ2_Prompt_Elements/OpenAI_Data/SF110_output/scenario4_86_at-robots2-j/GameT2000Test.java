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
* It contains ten unit test cases for the {@link Game#stepRound()} method.
*/
class GameTest {

		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns true if the round is not over.
		*/
		@Test
		void testStepRound() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				assertTrue(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound2() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound3() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound4() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound5() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound6() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound7() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound8() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound9() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case tests the {@link Game#stepRound()} method.
		* It checks if the method returns false if the round is over.
		*/
		@Test
		void testStepRound10() {
				Game game = new Game(1, new FrameBuilder());
				game.addEntrant(new RobotFactory());
				game.nextRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
}

// GameResult.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.RobotScore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Daniel Pitts
 */
public class GameResult {
    private final List<FinalRobotScore> finalScores = new ArrayList<FinalRobotScore>();

    public void addScore(RobotFactory entrant, RobotScore score) {
        finalScores.add(new FinalRobotScore(entrant, score));
    }

    public List<FinalRobotScore> getFinalScores() {
        return Collections.unmodifiableList(finalScores);
    }
}

// Round.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Daniel Pitts
 */
public class Round {
    private final List<Robot> robots = new ArrayList<Robot>();
    private final List<RobotScoreKeeper> scoreKeepers = new ArrayList<RobotScoreKeeper>();
    private final List<RobotFactory> entrants = new ArrayList<RobotFactory>();
    private final Arena arena;
    private final RoundState roundState;
    private final List<RoundListener> listeners = new ArrayList<RoundListener>();
    private final List<SimulationObserver> observers = new ArrayList<SimulationObserver>();
    private int nextRobotId;

    public Round(Arena arena, RoundState roundState) {
    }

    public void addEntrant(RobotFactory