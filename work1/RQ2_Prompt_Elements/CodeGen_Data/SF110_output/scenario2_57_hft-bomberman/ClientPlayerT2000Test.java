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
		 * Asserts whether can bowl bombs returns its value.
		 * @throws Exception
		 */
		@Test
	    public void canBowlBombs() throws Exception {
	        Point loc;

	        loc = new Point();
            assertEquals(false, new ClientPlayer().canBowlBombs());

            loc = new Point();
            assertEquals(false, new ClientPlayer(loc).canBowlBombs());
 
            loc = new Point();

            SoundPlayer.makeSound();
            ClientPlayer pc = new ClientPlayer(loc);
            assertEquals(true, pc.canBowlBombs());
	        SoundPlayer.makeSound();
            ClientPlayer pc2 = new ClientPlayer(loc);
            assertEquals(true, pc2.canBowlBombs());
	        SoundPlayer.makeSound();
            ClientPlayer pc3 = new ClientPlayer(loc);
            assertEquals(false, pc3.canBowlBombs());
	    }
	    
        private static final Logger logger = Logger.getLogger(Constants.class);
}
