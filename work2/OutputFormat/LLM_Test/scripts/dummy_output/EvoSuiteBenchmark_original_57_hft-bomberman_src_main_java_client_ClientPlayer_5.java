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
		Logger logger = Logger.getLogger(ClientPlayerTest.class);
		Point startingPoint = new Point(2, 2);
		int bombDiameter = Constants.BOMB_DIAMETER;

		/**
		* Basic test for {@link ClientPlayer#canBowlBombs()}.
		*/
		@Test
		void Test() {
			// Create player A and Player (Player B)
			ClientPlayer playerA, playerB;
			playerA = new ClientPlayer(startingPoint, 4);
			playerB = new ClientPlayer(startingPoint, 5);

			// Notify about Player A's breath
			playerA.breathe();

			// Make 3 bombs and 2 bombs each topleft of their own position
			playerB.plantBombs();
			playerB.plantBombs();
			playerB.plantBombs();

			// Return true; check if A should allow player B to plant another bomb
			assertTrue(playerA.canBowlBombs());

			// Reset bomb diameter
			playerA.resetBombDiameter();
			assertFalse(playerA.canBowlBombs());

			// Update player and notify again
			playerA.resetBombDiameter();
			assertTrue(playerA.canBowlBombs());

			// Now set the player to try to plant an already depleted bomb
			playerA.plantBombExploded();

			// Return false; check if this player cannot have one and 1 more bomb planted
			assertFalse(playerA.canBowlBombs());
		}

		/**
		* Creates a bomb and sets its position to (0, 0).
		*/
		public void createBomb(ClientPlayer player) {
			// Create the bomb
			int x;
			int y;
			BombsPlanted bombsPlanted = new BombsPlanted();
			logger.debug(String.valueOf(bombsPlanted));
			for (y = 0; y < bombDiameter; y++) {
				x = y < player.getBombDiameter()? 0 : bombDiameter - player.getBombDiameter();
				player.addBombAt(new Point(x, y));
				logger.debug(String.valueOf(x), String.valueOf(y));
				// Wait a second to see if the bomb can get placed
				// And if not return
				try {
					Thread.sleep(1000);
				} catch (java.lang.InterruptedException e) {
				}
			}
		}
}