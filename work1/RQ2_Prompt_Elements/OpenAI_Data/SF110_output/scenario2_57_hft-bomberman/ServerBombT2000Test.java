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
	 * The test case checks if the tick method returns true if the tickFrames are 0.
	 */
	@Test
	void testTick_tickFramesAre0_returnsTrue() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 0;
		assertTrue(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 1.
	 */
	@Test
	void testTick_tickFramesAre1_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 1;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 2.
	 */
	@Test
	void testTick_tickFramesAre2_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 2;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 3.
	 */
	@Test
	void testTick_tickFramesAre3_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 3;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 4.
	 */
	@Test
	void testTick_tickFramesAre4_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 4;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 5.
	 */
	@Test
	void testTick_tickFramesAre5_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 5;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 6.
	 */
	@Test
	void testTick_tickFramesAre6_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 6;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 7.
	 */
	@Test
	void testTick_tickFramesAre7_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 7;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 8.
	 */
	@Test
	void testTick_tickFramesAre8_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 8;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 9.
	 */
	@Test
	void testTick_tickFramesAre9_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 9;
		assertFalse(bomb.tick());
	}
}

// ServerBomb.java
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

/**
 * The Bomb Object of the Server. This Bomb ticks some times and then exploded.
 * Then it detects the player and the tile hits.
 *
 * @author Bj�rn, Steffen, Daniel
 */
public class ServerBomb extends Bomb {

    /**
     * handles the tick of the bomb
     *
     * @return
     */
    public boolean tick() {
        this.tickFrames--;
        if (tickFrames == 0) {
            return true;
        } else {
            return false;
        }
    }
}

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
	 * The test case checks if the tick method returns true if the tickFrames are 0.
	 */
	@Test
	void testTick_tickFramesAre0_returnsTrue() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 0;
		assertTrue(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 1.
	 */
	@Test
	void testTick_tickFramesAre1_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 1;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 2.
	 */
	@Test
	void testTick_tickFramesAre2_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 2;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 3.
	 */
	@Test
	void testTick_tickFramesAre3_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 3;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 * The test case checks if the tick method returns false if the tickFrames are 4.
	 */
	@Test
	void testTick_tickFramesAre4_returnsFalse() {
		ServerBomb bomb = new ServerBomb();
		bomb.tickFrames = 4;
		assertFalse(bomb.tick());
	}
	
	/**
	 * Test case for {@link ServerBomb#tick()} method.
	 *