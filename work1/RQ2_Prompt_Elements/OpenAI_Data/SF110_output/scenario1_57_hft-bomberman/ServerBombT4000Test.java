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
    private int roundTimeLeftLastUpdateDiff;
    private int roundTimeLeftLastUpdateDiffCounter;
    private int roundTimeLeftLastUpdateDiffCounterMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepDefault;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMin;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepMax;
    private int roundTimeLeftLastUpdateDiffCounterMaxStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStepStep;