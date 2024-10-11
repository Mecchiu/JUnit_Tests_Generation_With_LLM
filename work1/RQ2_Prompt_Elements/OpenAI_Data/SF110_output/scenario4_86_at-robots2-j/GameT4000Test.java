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
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver() {
				Game game = new Game(1);
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is not over after the first round.
		*/
		@Test
		public void testGameNotOver() {
				Game game = new Game(2);
				game.nextRound();
				game.stepRound();
				assertFalse(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is not over after the second round.
		*/
		@Test
		public void testGameNotOver2() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertFalse(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the third round.
		*/
		@Test
		public void testGameOver2() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver3() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver4() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver5() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver6() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver7() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver8() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver9() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
		
		/**
		* Test case for {@link Game#stepRound()}.
		* This test case checks if the game is over after the last round.
		*/
		@Test
		public void testGameOver10() {
				Game game = new Game(3);
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				game.nextRound();
				game.stepRound();
				assertTrue(game.isGameOver());
		}
}

// GameResult.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.RobotScore;
import java.util.*;

/**
 * @author Daniel Pitts
 */
public class GameResult {
    private final List<FinalRobotScore> finalScores = new ArrayList<FinalRobotScore>();

    public GameResult(List<RobotScore> scores) {
    }

    public List<FinalRobotScore> getFinalScores();

    public RobotFactory getWinner();
}

// GameResultTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.RobotScore;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameResult}.
* It contains ten unit test cases for the {@link GameResult#getFinalScores()} method.
*/
class GameResultTest {
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull2() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull3() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull4() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull5() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull6() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull7() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull8() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull9() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
		
		/**
		* Test case for {@link GameResult#getFinalScores()}.
		* This test case checks if the game result is not null.
		*/
		@Test
		public void testGameResultNotNull10() {
				GameResult gameResult = new GameResult(new ArrayList<RobotScore>());
				assertNotNull(gameResult);
		}
}

// Round.java
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

/**
 * @author Daniel Pitts
 */
public class Round {
    private final RoundState roundState;

    private final List<Robot> robots = new ArrayList<Robot>();

    private final List<RobotScoreKeeper> scoreKeepers = new ArrayList<RobotScoreKeeper>();

    private final List<SimulationObserver> observers = new ArrayList<SimulationObserver>();

    private final List<RobotFactory> entrants = new ArrayList<RobotFactory>();

    private final int roundNumber;

    private final int maxProcessorSpeed;

    private final FrameBuilder frameBuffer;

    public Round(int roundNumber, int maxProcessorSpeed, FrameBuilder frameBuffer) {
    }

    public void addEntrant(RobotFactory entrant);

    public void addSimulationObserver(SimulationObserver observer);

    public void removeSimulationObserver(SimulationObserver observer);

    public boolean stepRound();

    public void roundOver();

    public int getRoundNumber();

    public int getMaxProcessorSpeed();

    public List<RobotScore> getScores();

    public List<RobotFactory> getEntrants();

    public List<Robot> getRobots();

    public RoundState getRoundState();
}

// RoundListener.java
package net.virtualinfinity.atrobots.game;

/**
 * @author Daniel Pitts
 */
public interface RoundListener {
    void roundOver();
}

// RoundTest.java
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
* Test class of {@link Round}.
* It contains ten unit test cases for the {@link Round#stepRound()} method.
*/
class RoundTest {
		
		/**
		* Test case for {@link Round#stepRound()}.
		* This test case checks if the round is not null.
		*/
		@Test
		public void testRoundNotNull() {
				Round round = new Round(1, 5, new FrameBuilder());
				assertNotNull(round);
		}
		
		/**
		* Test case for {@link Round#stepRound()}.
		* This test case checks if the round is not