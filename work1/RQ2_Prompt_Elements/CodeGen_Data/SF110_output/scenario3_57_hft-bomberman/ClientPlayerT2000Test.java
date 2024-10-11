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

    private static final Logger LOG = Logger.getLogger(ClientPlayerTest.class);
    
    /**
     * Test method for {@link ClientPlayer#canBowlBombs()}.
     * Checks if {@link ClientPlayer} can bowl bombs for the expected amount.
     */
    @Test
    public void testCanBowlBombs() {
        ClientPlayer player = getInstance(Constants.CLIENT_PLAYER);
        
		boolean bowlBombs = player.canBowlBombs();
		assertTrue(bowlBombs);
    }
		
    /**
     * Test method for {@link ClientPlayer#getOpponent()}.
     * Checks a player who doesn't have a opponent has the player opped on his state.
     */
    @Test
    public void testGetOpponent() {
        ClientPlayer player = new ClientPlayer();
        ClientPlayer opp = player.getOpponent();
        assertNull(opp);
    }

	/**
	 * Returns number of battles the player has.
	 *
	 * @return number battles
	 */
    @Test
    public void testNumberOfBattles() {
        ClientPlayer player = new ClientPlayer();
        int battleCount = player.numberOfBattles().intValue();
        assertEquals("Wrong battle count", 10, battleCount);
    }
}
// End ClientPlayerTest.java
