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
		
	ClientPlayerTest() {
	}

	/**
	 * Test of canBowlBombs method, of class ClientPlayer.
	 */
	@Test
	public void testCanBowlBombs(){
		ClientPlayer instance = new ClientPlayer(new Point(10,10), 10);
		boolean result = instance.canBowlBombs();
		assertTrue("Should return true", result);
	}

	/**
	 * Test of createBomb method, of class ClientPlayer.
	 */
	@Test
	public void testCreateBomb(){
		ClientPlayer instance = new ClientPlayer(new Point(10,10), 10);
		SoundPlayer sound = new SoundPlayer();
		boolean result = sound.play(Constants.CLIENT_START_BUMPMOON);
		assertTrue("Should return true", result);
		// create bomb
		boolean result1 = instance.createBomb();
		assertTrue("Should return true", result1);
		// find player on that location
		boolean result2 = instance.findOpponent(new Point(1,1));
		assertTrue("Should return true", result2);
		// create bomb again
		result1 = instance.createBomb();
		assertTrue("Should return false", result1);
		sound = new SoundPlayer();
		boolean result3 = sound.play(Constants.CLIENT_START_BOMB);
		assertTrue("Should return false", result3);
	}

	/**
	 * Test of getBomb method, of class ClientPlayer.
	 */
	@Test
	public void testGetBomb(){
		ClientPlayer instance = new ClientPlayer(new Point(0,0), 10);
		SoundPlayer sound = new SoundPlayer();
		boolean result = sound.play(Constants.CLIENT_START_BOMB);
		assertTrue("Should return true", result);
		boolean result1 = instance.getBomb();
		assertTrue("Should return false", result1);
		boolean result2 = instance.getBomb();
		assertFalse("Should return false", result2);
		result1 = instance.getBomb();
		assertTrue("Should return true", result1);
		sound = new SoundPlayer();
		boolean result3 = sound.play(Constants.CLIENT_STOP_BOMB);
		assertTrue("Should return false", result3);
	}

	/**
	 * Test of playBoom method, of class ClientPlayer.
	 */
	@Test
	public void testPlayBoom(){
		ClientPlayer instance = new ClientPlayer(new Point(0,0), 10);
		SoundPlayer sound = new SoundPlayer();
		instance.playBoom();
		boolean result3 = sound.play(Constants.CLIENT_BAMB);
		assertTrue("Should return false", result3);
		sound = new SoundPlayer();
		boolean result2 = sound.play(Constants.CLIENT_BOMB);
		assertTrue("Should return true", result2);
	}

	/**
	 * Test of stopBoom method, of class ClientPlayer.
	 */
	@Test
	public void testStopBoom(){
		ClientPlayer instance = new ClientPlayer(new Point(0,0), 10);
		SoundPlayer sound = new SoundPlayer();
		instance.playBoom();
		instance.playBoom();
		boolean result2 = sound.play(Constants.CLIENT_BAMB);
		assertTrue("Should return true", result2);
		sound = new SoundPlayer();
		boolean result3 = sound.play(Constants.CLIENT_BOMB);
		assertTrue("Should return false", result3);
		instance.stopBoom();
		boolean result32 = sound.play(Constants.CLIENT_BAMO);
		assertFalse("Should return true", result32);
	}
}