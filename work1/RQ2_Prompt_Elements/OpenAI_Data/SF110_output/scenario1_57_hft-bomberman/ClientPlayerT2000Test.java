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
* It contains ten unit test cases for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {

	/**
	* Test case 1 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can bowl bombs.
	*/
	@Test
	void testCanBowlBombs1() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(true);
		assertTrue(player.canBowlBombs());
	}
	
	/**
	* Test case 2 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can not bowl bombs.
	*/
	@Test
	void testCanBowlBombs2() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(false);
		assertFalse(player.canBowlBombs());
	}
	
	/**
	* Test case 3 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can bowl bombs.
	*/
	@Test
	void testCanBowlBombs3() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(true);
		assertTrue(player.canBowlBombs());
	}
	
	/**
	* Test case 4 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can not bowl bombs.
	*/
	@Test
	void testCanBowlBombs4() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(false);
		assertFalse(player.canBowlBombs());
	}
	
	/**
	* Test case 5 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can bowl bombs.
	*/
	@Test
	void testCanBowlBombs5() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(true);
		assertTrue(player.canBowlBombs());
	}
	
	/**
	* Test case 6 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can not bowl bombs.
	*/
	@Test
	void testCanBowlBombs6() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(false);
		assertFalse(player.canBowlBombs());
	}
	
	/**
	* Test case 7 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can bowl bombs.
	*/
	@Test
	void testCanBowlBombs7() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(true);
		assertTrue(player.canBowlBombs());
	}
	
	/**
	* Test case 8 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can not bowl bombs.
	*/
	@Test
	void testCanBowlBombs8() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(false);
		assertFalse(player.canBowlBombs());
	}
	
	/**
	* Test case 9 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can bowl bombs.
	*/
	@Test
	void testCanBowlBombs9() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(true);
		assertTrue(player.canBowlBombs());
	}
	
	/**
	* Test case 10 for {@link ClientPlayer#canBowlBombs()}.
	* This test case tests the method with a player that can not bowl bombs.
	*/
	@Test
	void testCanBowlBombs10() {
		ClientPlayer player = new ClientPlayer();
		player.setBowlBombs(false);
		assertFalse(player.canBowlBombs());
	}
}