// GameModelTest.java
package common;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import messages.round.RoundTimeOverMsg;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameModel}.
* It contains one unit test case for the {@link GameModel#checkForWinner()} method.
*/
class GameModelTest {
		
	private final static Logger logger = Logger.getLogger(GameModelTest.class);
	private GameModel gameModel;

    /**
     * @throws Exception
     */
    public GameModelTest() throws Exception {
    	this.gameModel = new GameModel();
    }
    
    
	/**
	 * Test the {@link GameModel#checkForWinner()}, of this class
	 */
	@Test
	public void testROUND_GameModelCheckForWinner() throws Exception {
        logger.info("Starting");

        
        // Game Objects:
        Point pointOne = new Point(4, 4);
        Point pointTwo = new Point(3, 5);
        Point pointThree = new Point(-5, 5);

        Player playerOne = new Player(pointOne, "TestPlayer1");
        Player playerTwo = new Player(pointTwo, "");
        Player playerThree = new Player(pointThree, "TestPlayer3");

        GameObject gameObjectForOne = new GameObject("1", 1);
        Collection<GameObject> gameObjects = new Vector<GameObject>();
        gameObjects.add(gameObjectForOne);
        gameModel.addGameObject(gameObjectForOne, playerOne);
        gameModel.addGameObject(gameObjectForOne, playerTwo);
        gameModel.addGameObject(gameObjectForOne, playerThree);

        gameModel.addPlayer(playerOne);

        GameModelChecker checker = new GameModelChecker(gameModel);
        
        // gameModel.update();
        // Time
        // System.out.println(checker.getRoundTime());
        assertEquals(checker.getRoundTime(), 6);
        
        // checkPlayer won a round in first 2 rounds
        
    }
	
	/**
	 * Test a bad case of changing the name (players), time and bombs for all players
	 */
	@Test
	public void badCaseTestCase() throws Exception {
		logger.info("Starting");
		
		Player player1 = new Player(new Point(10, 10), "player1");
		Player player2 = new Player(new Point(10, 10), "player2");
		Player player3 = new Player(new Point(10, 10), "player3");
		
		Vector<Player> playersTemp= new Vector<Player>();
		playersTemp.add(player1);
		playersTemp.add(player2);
		playersTemp.add(player3);

		// check players to be still same after changing name
		assertEquals((playersTemp).size(), (playersTemp).size());
		playersTemp.get(0).saveName("new_player_name");
		
		// check players to be different after change
		playersTemp.get(1).saveName("new_player_name");
		assertEquals(playersTemp.size(), 6);
		playersTemp.remove(1);
		assertEquals(playersTemp.size(), 3);
		playersTemp.remove(2);
		assertEquals(playersTemp.size(), 2);
		playersTemp.remove(playersTemp.size()-1);
		assertEquals(playersTemp.size(), 2);
		playersTemp.remove(0);

	}
	
	protected Map<Integer, Set<Player>> scoreMap = new HashMap<Integer, Set<Player>>();
	public Player getPlayerOne() {
		return players.get(0);
	}
	public Player getPlayerTwo() {
		return players.get(1);
	}
	public Player getPlayerThree() {
		return players.get(2);
	}

	@Test
	public void testScore() throws Exception {
		logger.info("Starting");
		
		Score scoreOne = new Score(10, 10, 50);
		Score scoreTwo = new Score(60, 30, 70);
		
		Set<Player> players = new HashSet<Player>();
		players.add(getPlayerOne());
		players.add(getPlayerTwo());
		players.add(getPlayerThree());

//		// players.add(getPlayer());

//		players.add(getPlayerOne());
//		players.add(getPlayerOne());
//		players.add(getPlayerTwo());
//		players.add(getPlayerTwo());
//		players.add(getPlayerThree());		
//		players.add(getPlayerOne());
//		// players.add(getPlayerOne());
//		players.add(getPlayerTwo());
//		players.add(getPlayerOne());
//
//		players.add(getPlayerTwo());
//		players.remove(getPlayerOne());
//		players.remove(getPlayerOne());
//		// players.add(getPlayerTwo());

//		players.add(getPlayerThree());
//		players.add(getPlayerTwo());
//		players.add(getPlayerTwo());
//		players.add(getPlayerOne());
//		players.add(getPlayerTwo());
//		players.add(getPlayerOne());
//		players.remove(getPlayerOne());

		scoreMap.put(scoreOne.getId(), players);
		players.add(scoreTwo.getId());
		scoreMap.put(scoreTwo.getId(), players);

		scoreOne.score = 120;
		scoreMap.put(scoreOne.getId(), players);

		scoreTwo.score = 60;
		scoreMap.put(scoreTwo.getId(), players);
		
		scoreOne.score = 50;
		scoreMap.put(scoreOne.getId(), players);

		logger.debug("ScoreMap: " + scoreMap);

		// update scoreMap
		players.get(players.size()-1).score = 150;
		logger.info("updated: " + players.size());
}
}