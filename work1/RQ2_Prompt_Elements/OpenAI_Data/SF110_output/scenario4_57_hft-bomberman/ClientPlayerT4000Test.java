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
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue6() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse6() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue7() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse7() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue8() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse8() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue9() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse9() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue10() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse10() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
}

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
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can't bowl bombs.
		*/
		@Test
		void testCanBowlBombsFalse5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		* Test case for {@link ClientPlayer#canBowlBombs()}.
		* The test case tests the method with a player that can bowl bombs.
		*/
		@Test
		void testCanBowlBombsTrue6() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player