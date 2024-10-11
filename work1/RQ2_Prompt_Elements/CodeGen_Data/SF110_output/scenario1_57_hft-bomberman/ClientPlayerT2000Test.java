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

	private static Logger LOG = Logger.getLogger( ClientPlayerTest.class);
	
	@Test
	public void canBowlBombsShouldReturnTrue() {
	    
	    ClientPlayer cPlayer = new ClientPlayer( null);
        cPlayer.bowlBombs = false;
		assertFalse(cPlayer.canBowlBombs());
		cPlayer.bowlBombs = true;
		assertTrue(cPlayer.canBowlBombs());
	}
    
    @Test
	public void bowlBombsNotifyObservers() {
	    
	    ClientPlayer cPlayer = new ClientPlayer( null);
        cPlayer.bowlBombs = false;
		
		cPlayer.bowlBombs = true;
		cPlayer.bowlBombs = false;
		
		assertFalse(cPlayer.bowlBombs);
        cPlayer.bowlBombs = false;
        cPlayer.bowlBombs = true;
		
		assertTrue(cPlayer.bowlBombs);
	}
}