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
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns false when the round is null.
		*/
		@Test
		void testStepRound_roundIsNull_returnsFalse() {
				Game game = new Game();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns true when the round is not null.
		*/
		@Test
		void testStepRound_roundIsNotNull_returnsTrue() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				assertTrue(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns false when the round is null after the step.
		*/
		@Test
		void testStepRound_roundIsNullAfterStep_returnsFalse() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns true when the round is not null after the step.
		*/
		@Test
		void testStepRound_roundIsNotNullAfterStep_returnsTrue() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				assertTrue(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns false when the round is null after the step.
		*/
		@Test
		void testStepRound_roundIsNullAfterStep_returnsFalse2() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(null);
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns true when the round is not null after the step.
		*/
		@Test
		void testStepRound_roundIsNotNullAfterStep_returnsTrue2() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				assertTrue(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns false when the round is null after the step.
		*/
		@Test
		void testStepRound_roundIsNullAfterStep_returnsFalse3() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(null);
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns true when the round is not null after the step.
		*/
		@Test
		void testStepRound_roundIsNotNullAfterStep_returnsTrue3() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				assertTrue(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns false when the round is null after the step.
		*/
		@Test
		void testStepRound_roundIsNullAfterStep_returnsFalse4() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(null);
				game.stepRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns true when the round is not null after the step.
		*/
		@Test
		void testStepRound_roundIsNotNullAfterStep_returnsTrue4() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				assertTrue(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns false when the round is null after the step.
		*/
		@Test
		void testStepRound_roundIsNullAfterStep_returnsFalse5() {
				Game game = new Game();
				game.setRound(new Round(new ArrayList<Robot>(), new FrameBuilder(), new SimulationObserver()));
				game.stepRound();
				game.setRound(null);
				game.stepRound();
				game.stepRound();
				game.stepRound();
				assertFalse(game.stepRound());
		}
		
		/**
		* Test case for {@link Game#stepRound()} method.
		* This test case checks if the method returns true when the round is not null after the step.
		*/
		@Test
		void testStepRound_roundIsNotNullAfterStep_returnsTrue5() {
				Game game = new Game();
				game.setRound