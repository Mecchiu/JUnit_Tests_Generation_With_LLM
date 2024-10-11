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
		private final int id1;
		private final int id2;
		private final int id3;
		private final int time;

	@Test
	public void TestAllCases(){

		id1 = 1;
		id2 = 2;
		id3 = 3;

		GameModel game = new GameModel();
		game.addGameObject(id1, new Bomb());
		game.addGameObject(id2, new Bomb());
		game.addGameObject(id3, new Bomb());
		game.addGameObject(id3, new Bomb());
		
		Collection<GameObject> all = game.getPlayers();
		assertNotNull(all);

		all = game.getPlayers();
		assertNotNull(all);

		all = game.getPlayers();
		assertNotNull(all);

		all = game.getPlayers();
		assertNotNull(all);
	}

	/**
	* Test method for {@link GameModel#checkForWinner()}.
	*/
	@Test
	public void test() {
		assertEquals(checkForWinner(), 0);
	}

	/**
	* Test method for {@link GameModel#setTime(long)}.
	*/
	@Test
	public void testSetTime(){

		GameModel game = new GameModel();
		game.setTime(500);
		assertEquals(checkForWinner(), 0);
		game.setTime(1);
		assertEquals(checkForWinner(), 0);
		
		game = new GameModel();
		game.setTime(500);
		assertEquals(checkForWinner(), 0);
		game.setTime(1);
		assertEquals(checkForWinner(), 0);

		game = new GameModel();
		game.setTime(1000);
		assertEquals(checkForWinner(), 0);
		game.setTime(1);
		assertEquals(checkForWinner(), 1);

		game = new GameModel();
		game.setTime(500);
		assertEquals(checkForWinner(), 0);
		game.setTime(500);
		assertEquals(checkForWinner(), 0);

		game = new GameModel();
		game.setTime(1000);
		assertEquals(checkForWinner(), 0);
		game.setTime(500);
		assertEquals(checkForWinner(), 1);

		time = 500;
		game = new GameModel();
		game.setTime(1000);
		assertEquals(checkForWinner(), 0);
		game.setTime(500);
		assertEquals(checkForWinner(), 1);

		time = 1000;
		game = new GameModel();
		game.setTime(500);
		assertEquals(checkForWinner(), 0);
		game.setTime(1000);
		assertEquals(checkForWinner(), 1);

		time = 0;
		game = new GameModel();
		game.setTime(500);
		assertEquals(checkForWinner(), 1);
		game.setTime(1000);
		assertEquals(checkForWinner(), 0);

	}

    /**
     * @param players
     *            the players to add
     * @return a map with the players, keys are player IDs and values objects.
     */
    protected HashMap<Integer, Player> addPlayers(Collection<Player> players) {
        HashMap<Integer, Player> output = new HashMap<Integer, Player>(players.size());
        for (Player p : players){
            output.put(p.getId(), p);
        }
        return output;
    }
	/**
	 * @param game
	 */
    protected void addGameObject(int game, GameObject object) {
        gameObjects.put(game, object);
        players.add(new Player(object.getId()));
    }
}