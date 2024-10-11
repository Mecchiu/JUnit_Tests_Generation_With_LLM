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
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 1.
	* The expected result is that the method returns true.
	*/
	@Test
	void testTick1() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(1);
		assertTrue(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 2.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick2() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(2);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 3.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick3() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(3);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 4.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick4() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(4);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 5.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick5() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(5);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 6.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick6() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(6);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 7.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick7() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(7);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 8.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick8() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(8);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 9.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick9() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(9);
		assertFalse(bomb.tick());
	}
	
	/**
	* Test case for {@link ServerBomb#tick()}.
	* The test case tests the tick method with a bomb that has a tickFrames value of 10.
	* The expected result is that the method returns false.
	*/
	@Test
	void testTick10() {
		ServerBomb bomb = new ServerBomb();
		bomb.setTickFrames(10);
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
 * The Game Object of the Server. This Game contains the players, the bombs, the
 * tiles and the powerups.
 *
 * @author Bj�rn, Steffen, Daniel
 */
public class ServerGame {

    private static final Logger log = Logger.getLogger(ServerGame.class);
    private Vector<ServerPlayer> players;
    private Vector<ServerBomb> bombs;
    private Vector<Tile> tiles;
    private Vector<PowerUp> powerups;
    private int gameId;
    private int roundId;
    private int roundNumber;
    private int roundTime;
    private int roundTimeLeft;
    private int roundTimeLeftLastUpdate;
    private int roundTimeLeftLastUpdateClient;
    private int roundTimeLeftLastUpdateServer;
    private int roundTimeLeftLastUpdateServerClient;
    private int roundTimeLeftLastUpdateClientServer;
    private int roundTimeLeftLastUpdateServerServer;
    private int roundTimeLeftLastUpdateClientClient;
    private int roundTimeLeftLastUpdateServerClientClient;
    private int roundTimeLeftLastUpdateClientServerClient;
    private int roundTimeLeftLastUpdateServerServerClient;
    private int roundTimeLeftLastUpdateClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClientClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerServerClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientClientClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateServerClientClientClientClientClientClientClientClientClientClient;
    private int roundTimeLeftLastUpdateClientServerClientClientClientClientClientClient