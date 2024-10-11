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

// ServerGame.java
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
 * The Game Object of the Server. This Game contains the players, the bombs and
 * the tiles.
 *
 * @author Bj�rn, Steffen, Daniel
 */
public class ServerGame {

    /**
     * the logger
     */
    private static final Logger logger = Logger.getLogger(ServerGame.class);
    /**
     * the players
     */
    private Vector<Player> players;
    /**
     * the bombs
     */
    private Vector<Bomb> bombs;
    /**
     * the tiles
     */
    private Tile[][] tiles;
    /**
     * the powerups
     */
    private Vector<PowerUp> powerups;
    /**
     * the game id
     */
    private int gameId;
    /**
     * the game name
     */
    private String gameName;
    /**
     * the game password
     */
    private String gamePassword;
    /**
     * the game status
     */
    private int gameStatus;
    /**
     * the game type
     */
    private int gameType;
    /**
     * the game map
     */
    private int gameMap;
    /**
     * the game round
     */
    private int gameRound;
    /**
     * the game round status
     */
    private int gameRoundStatus;
    /**
     * the game round time
     */
    private int gameRoundTime;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeft;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast2;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast3;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast4;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast5;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast6;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast7;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast8;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast9;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast10;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast11;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast12;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast13;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast14;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast15;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast16;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast17;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast18;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast19;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast20;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast21;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast22;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast23;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast24;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast25;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast26;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast27;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast28;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast29;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast30;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast31;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast32;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast33;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast34;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast35;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast36;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast37;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast38;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast39;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast40;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast41;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast42;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast43;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast44;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast45;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast46;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast47;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast48;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast49;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast50;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast51;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast52;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast53;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast54;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast55;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast56;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast57;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast58;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast59;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast60;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast61;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast62;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast63;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast64;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast65;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast66;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast67;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast68;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast69;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast70;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast71;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast72;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast73;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast74;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast75;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast76;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast77;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast78;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast79;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast80;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast81;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast82;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast83;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast84;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast85;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast86;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast87;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast88;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast89;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast90;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast91;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast92;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast93;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast94;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast95;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast96;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast97;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast98;
    /**
     * the game round time left
     */
    private int gameRoundTimeLeftLast99;
    /**
     * the game round time