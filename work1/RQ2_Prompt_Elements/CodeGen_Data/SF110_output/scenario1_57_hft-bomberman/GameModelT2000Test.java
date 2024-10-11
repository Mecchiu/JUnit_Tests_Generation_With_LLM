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
public final static Logger log = Logger.getLogger(Getter.class);
		
		{
                players.add(new Player("F1", new Point(10, 5), new Point(5, 30)));
                players.add(new Player("F2", new Point(10, 60), new Point(60, 30)));
                players.add(new Player("F3", new Point(10, 120), new Point(250, 30)));
                players.add(new Player("A1", new Point(5, 5), new Point(5, 30)));
                players.add(new Player("B1", new Point(5, 60), new Point(60, 30)));
				players.add(new Player("B2", new Point(5, 120), new Point(250, 30)));
                players.add(new Player("A2", new Point(20, 5), new Point(5, 30)));
                players.add(new Player("B3", new Point(20, 60), new Point(60, 30)));
                players.add(new Player("A3", new Point(20, 120), new Point(250, 30)));
                players.add(new Player("B4", new Point(20, 240), new Point(5, 30)));
                players.add(new Player("B5", new Point(20, 400), new Point(5, 30)));
            }
        

        /**
	* Unit test for {@link GameModel#checkForWinner()} and {@link GameModel#GetWinner()}.
	*/
	@Test
	public void testCheckForWinner() {


		Vector<Player> players = new Vector<Player>(players);

		GameModel instance;
		
		{
			instance = new GameModel();
			players.add(new Player("F1", new Point(10, 5), new Point(5, 30)));
			players.add(new Player("F2", new Point(10, 60), new Point(60, 30)));
			players.add(new Player("F3", new Point(10, 120), new Point(250, 30)));
			players.add(new Player("A1", new Point(5, 5), new Point(5, 30)));
			players.add(new Player("B1", new Point(5, 60), new Point(60, 30)));
			players.add(new Player("B2", new Point(5, 120), new Point(250, 30)));
			players.add(new Player("A2", new Point(20, 5), new Point(5, 30)));
			players.add(new Player("B3", new Point(20, 60), new Point(60, 30)));
			players.add(new Player("A3", new Point(20, 120), new Point(250, 30)));
			players.add(new Player("B4", new Point(20, 240), new Point(5, 30)));
			players.add(new Player("B5", new Point(20, 400), new Point(5, 30)));
		}
		
		Object value;
		int winner;
		
		{
			instance.CheckForWin(players.get(0));

			value = RoundTimeOverMsg.checkIfTurn(players.get(0), players.get(1), players);
			if (value == null) {
				throw new AssertionError("Game does not win."); 
			}
			winner = value;
		}

		{
			instance.GetWinner(players);
			value = RoundTimeOverMsg.checkIfTurn(players.get(0), players.get(1), players);
			if (value == null) {
				throw new AssertionError("Game does not win."); 
			}
			winner = value;
		}
		
		// Check to see if all player are getting the same value
		assertEquals("Players are not of exactly equal value", new Integer(players.get(0).getId()), new Integer(players.get(1).getId()));

		// Check to see if all players are getting the same value
		assertEquals("Players and winner are not of exactly equal value", new Integer(winner), new Integer(players.get(0).getId()));

	}
}