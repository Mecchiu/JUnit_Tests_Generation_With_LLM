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