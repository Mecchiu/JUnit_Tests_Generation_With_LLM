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
@Test
		public void test() {
			GameModel m = GameModel.createGameModelWithSinglePlayer();
			Player p1 = m.createPlayer("Player");
			Player p2 = m.createPlayer("Player2");
			m.setPlayers(p1, p2);
			Collection<Player> players = m.getPlayers();
			assertEquals(2, players.size());
			assertTrue(players.contains(p1));
			assertTrue(players.contains(p2));
			
		}
	}