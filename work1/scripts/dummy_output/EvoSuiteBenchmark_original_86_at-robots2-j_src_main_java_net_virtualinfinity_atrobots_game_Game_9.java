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
		 
	public GameTest() {
	}
	
	@Test
	void gameOver() {
		assertFalse(roundState.isNewRound());
		assertTrue(roundState.isPreviousRound());
		assertEquals(roundNumber + 1, totalRounds - 1);
		assertTrue(roundState.isRoundEnd());
		assertFalse(roundState.isRoundStarted());
	}

	@Test
	void getPlayerRobots() {
		assertTrue(entrantId() > 0);
		assertNotNull(entrants.get(entrantId()));
	}

	@Test
	void getRobotForRobotId() {
		RobotFactory robFactory = MockRobotImpl::newRobotFactory;
		assertNotNull(robFactory);

		int robotId = 1234;
		Robot rob = robFactory.createRobot();
		int rtId = rob.getRobotId();

		String name = "some random name";
		Robot retRob = entries().getRobots().getRobot(rtId).getRobot(RobotFactory.getRobotId(name, RobotFactory.class));		
		MockGameState state = MockGameState.fromRobotId(retRob.getRobotId());
		assertNotNull(retRob);

		Set<Robot> setRetRob = entries().getEntrants().getEntity(name).getRobots().getRobots();
		assertEquals(1, setRetRob.size());
		Robot retRob2 = setRetRob.iterator().next();
		assertEquals(rtId, retRob2.getRobotId());
		assertNull(entrants.get(retRob2.getRobotId()).getRobot());

		listOfEntrant = entries().getEntrants().getEntrants();
		assertEquals(0, listOfEntrant.size());

		MockGameState state2 = MockGameState.fromRobotId(rtId);
		listOfEntrant2 = entries().listEntrants().getEntrants();
		assertTrue(listOfEntrant2.size() == 0);
		assertEquals(retRob, entries().getEntrants().getRobot(rtId).getRobot());
		assertEquals(state, entries().getEntrants().getRobot(rtId).getGameState().getGameState());
	}

	@Test
	void getEntrantForRobotId() {
		entrantId();
	}

	@Test
	void getRobotForEntrant() {
		Robot robot = MockRobotImpl::newRobotFactory.createRobot();
		entrants.add(robot);
		RobotFactory factory = MockRobotImpl::newRobotFactory;
		entrants.add(factory.createRobot());

		int rtId = robot.getRobotId();
		assertEquals(1, factory.getEntrants().getEntants().size());
		Robot retRob = entries().getEntants().getEntants().iterator().next();
		assertEquals(factory.getEntrants().getEntants().size().get(), 1);
		assertEquals(rtId, retRob.getRobotId());
		assertEquals(entrantId().get(), factory.getEntrants().getEntants().getEntid(rtId));
		assertEquals(getPlayerRobots().add(Retro.valueOf(entrantId(), "first")), entries().getEntrants().getEntants().getEntants());
		assertEquals(getPlayerRobots().add(Retro.valueOf(entrantId(), "second")), entries().getEntrants().getEntants().getEntants());
	}

	@Test
	void gameOverAndRoundDone() {
		gameOver();
		assertFalse(roundState.isRoundEnd());
	}

	private List<RobotFactory> entries() {
		return MockUtils.getEntrants().listEntants();
	}

	private List<RobotFactory> MockUtils = new MockListOfRobotFactory();

	/**
	 * Mock class of {@link ListOfEntrant}.
	 */
	public static class MockListOfEntrant {

		/**
		 * Entry mock.
		 */
		public Entry entry;

}
}