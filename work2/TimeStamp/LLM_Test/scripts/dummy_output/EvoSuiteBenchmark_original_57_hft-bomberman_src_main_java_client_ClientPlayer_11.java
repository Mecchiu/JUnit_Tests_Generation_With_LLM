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
		
        /**
         * Creates a new Player.
         *
         * @param id
         *            The Player id
         */
        private Player initPlayer(int id) {
                return new ClientPlayer(new Point(Constants.WIDTH / 2, Constants.HEIGHT / 2), id);
        }

	/**
	 * Tests that a player can bowl bombs.
	 */
	@Test
        public void canBowlBombs() {
                Player player = initPlayer(1);
                // Notifies the player this methods will be called
                player.addObserver(new ClientObserver(player));

                assertTrue(player.canBowlBombs());

                Player.addBomber(new Player.PlayerObject(new Point(0, 0)), true);
                assertTrue(player.canBowlBombs());

                assertFalse(player.canBowlBombs());
        }

	/**
	 * Tests that the player can neither bowl bombs nor plant
	 */
	@Test
        public void canPlantBomb() {
                Player player = initPlayer(2);
                // Notifies the player this methods will be called
                player.addObserver(new ClientObserver(player));

                assertFalse(player.canPlantBomb());

                Player.addBomber(new Player.PlayerObject(new Point(0, 0)), true);
                assertTrue(player.canPlantBomb());

                assertFalse(player.canPlantBomb());
        }

	/**
	 * Tests that the player fails to plant boms
	 */
	@Test
        public void failsPlantBomb() {
                Player player = initPlayer(3);
                // Notifies the player this methods will be called
                player.addObserver(new ClientObserver(player));

                assertFalse(player.canPlantBomb());

                Player.addBomber(new Player.PlayerObject(new Point(0, 0)), true);
                assertFalse(player.canPlantBomb());

                assertTrue(player.canPlantBomb());
                assertTrue(player.getLastPlantingBombs()!= null);

                assertEquals(player.getLastPlantingBombs().get(0).getObject().x,
                     player.getBomberPos(1).getObject().x);
        }
}