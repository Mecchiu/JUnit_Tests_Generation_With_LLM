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

		private Logger logger = Logger.getLogger(ClientPlayerTest.class);
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns true if the player can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns false if the player can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns true if the player can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns false if the player can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns true if the player can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns false if the player can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns true if the player can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns false if the player can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns true if the player can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns false if the player can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()} method.
		* It tests if the method returns true if the player can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue6() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowlBombs();
				player.resetBowlBombs();
				player.setBowl