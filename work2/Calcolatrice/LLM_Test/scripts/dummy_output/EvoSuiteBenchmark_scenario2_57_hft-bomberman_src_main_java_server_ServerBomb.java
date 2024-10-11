// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains ten unit test cases for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {
		
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns true if the tickFrames is 0.
	 */
	@Test
	void testTick_tickFramesIs0_returnsTrue() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 0;
		
		assertTrue(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 1.
	 */
	@Test
	void testTick_tickFramesIs1_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 1;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 2.
	 */
	@Test
	void testTick_tickFramesIs2_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 2;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 3.
	 */
	@Test
	void testTick_tickFramesIs3_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 3;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 4.
	 */
	@Test
	void testTick_tickFramesIs4_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 4;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 5.
	 */
	@Test
	void testTick_tickFramesIs5_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 5;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 6.
	 */
	@Test
	void testTick_tickFramesIs6_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 6;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 7.
	 */
	@Test
	void testTick_tickFramesIs7_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 7;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 8.
	 */
	@Test
	void testTick_tickFramesIs8_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 8;
		
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the method returns false if the tickFrames is 9.
	 */
	@Test
	void testTick_tickFramesIs9_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 9;
		
		assertFalse(bomb.tick());
	}
}