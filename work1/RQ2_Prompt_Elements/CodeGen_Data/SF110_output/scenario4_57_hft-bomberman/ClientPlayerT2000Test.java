// ClientPlayerTest.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPlayer}.
* It contains one unit test case for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {
/**
		 * Returns weather the player can bowl bombs by calling {@link #canBowlBombs()}
		 * 
		 * @return True of current player can bowl the other player's bombs
		 */
	private boolean canBePlayedByAnother() {
		return false;
	}

	/**
	 * Test case for canBowlBombs method.
	 */
	@Test
	void canBowlBombs() {
		ClientPlayer testPlayer = new ClientPlayer(new Point(), 14);
		assertFalse(canBePlayedByAnother());
		testPlayer.canBePlayedByAnother();
		assertFalse(canBePlayedByAnother());
		testPlayer.canBePlayedByAnother();
		assertTrue(canBePlayedByAnother());
	}

	/**
	 * Test case for addBombs method.
	 */
	@Test
	void addBombs() {
		ClientPlayer player = new ClientPlayer(new Point(), 1);
		assertEquals(0, player.addBombs());
		assertEquals(Integer.MAX_VALUE, player.addBombs());
		assertEquals(-1, player.addBombs());
		assertEquals(2, player.addBombs());
	}

	/**
	 * Test case for getBombs method.
	 */
	@Test
	void getBombs() {

		ClientPlayer player = new ClientPlayer(new Point(), 1);
		assertEquals(Integer.MAX_VALUE, player.getBombs());
		assertEquals(-1, player.getBombs());
		assertEquals(0, player.getBombs());
		assertEquals(0, player.getBombs());

		player = new ClientPlayer(new Point(), 101);
		assertEquals(Integer.MAX_VALUE, player.getBombs());
		assertEquals(-1, player.getBombs());
		assertEquals(0, player.getBombs());
		assertEquals(0, player.getBombs());
	}

	/**
	 * Test case for resetBombs method.
	 */
	@Test
	void resetBombs() {

		ClientPlayer player = new ClientPlayer(new Point(), 1);
		assertEquals(Integer.MAX_VALUE, player.getBombs());
		assertEquals(-1, player.getBombs());
		assertEquals(Integer.MAX_VALUE, player.getBombs());

		player = new ClientPlayer(new Point(), 100);
		assertEquals(Integer.MAX_VALUE, player.getBombs());
		assertEquals(-1, player.getBombs());
		assertEquals(Integer.MAX_VALUE, player.getBombs());
	}

	/**
	 * Test case for getBombPos method.
	 */
	@Test
	void getBombPos() {

		ClientPlayer player = new ClientPlayer(new Point(), 1);
		assertEquals(new Point(24, 20), player.getBombPos());
		assertEquals(new Point(24, 20), player.getBombPos());
	}

	/**
	 * Test case for getBombDiameter method.
	 */
	@Test
	void getBombDiameter() {

		assertEquals(5,  player.getBombDiameter());
	}

	/**
	 * Test case for setBombDiameter method.
	 */
	private static final int bombDiameter = 0;
		public  void setBombDiameter(int diameter) {
			bombDiameter = diameter;
		}
	
	/**
	* Test if player can successfully bowl a bomb
	*
	* @param player
	* @return true if can be placed on the player's position
	*/
	@Test
	public boolean canBowlBombs(Actor player) {

		return true;
	}

}
