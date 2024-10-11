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
		
	private static final Logger mylog = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * The method "test". It runs the "test".
	 *
	 */
	@Test
    @Timeout(300)
    void test() {
		
		
    	/*
		* @see common.Actor#beforePlayerTurn()
		*/
		Point pos = new Point(Constants.BOTTOM_LOWER_GRAVELED_WONDER);

		Player player = new Player(pos, 50);

		Action action;
		
		// Make an action that causes the player to play with a bomb.
		action = new AddAction(12, 12);

		// The action will not be executed until the moveVector is changed by the user.
		final Point posWithBounds = player.computePlannedMove(action, null);
		
		try {
			for (int i = 0; i < Constants.MAX_BOMBS*2; i = i + 1) {
				// First check if the player has planted the bomb.
				if (mylog.isDebugEnabled()) {
					mylog.debug("Planned bomb "+i+" placed on position "+posWithBounds);
				}

				if (player.bowlBombs) {
					if (mylog.isDebugEnabled()) {
						mylog.debug("Player is bowls");
					}

					assertTrue(pos.toString().contains(Integer.toString(i)));
					
					player.plainedBombExploded();
					System.out.println("Player exploded!");
					return;
				}

				if (!player.canPlainBombs()) {
					player.plainedBombExploded();
					continue;
				}
				player.plainedBombExploded();
				mylog.debug("Player tried to plant a bomb but successfully. This is a failure!");
				return;
			}
        
			if(player.getMaxBombs() == 0) {
				System.out.println("There are no other bombs to plaint");
				player.plainedBombExploded();
				continue;        

			} else {
				assertTrue("You can't plant one bomb from this player's position.", player.canPlainBombs());
				player.plainedBombExploded();
				return;
			}

			player.bombDiameter = 10;
			player.maxBombs = 20;

			// The test is successful if we reach this step.
			assertTrue("Could not place a bomb.", player.canPlainBombs());
			player.plainedBombExploded();
		} catch(Throwable t) {
			System.out.println("Failed to place the bomb!");
			addErrorMessage(t);
			logger.error("Could not place the bomb.");
		}

		// Check if the player can play with the bomb.
		pos = new Point(Constants.TOP_UPPER_GRAVELED_WONDER);
        
    	player = new Player(pos, 100);

		// The "move" is in this case position.
   			Action action1 = new AddAction(12, 13);

   			Action action2 = new AddAction(19, 1);

   			Action action3 = new AddAction(5, 1);
		
		
		if(player.bowlBombs) {
			if (mylog.isDebugEnabled()) {
				mylog.debug("Player is bowls");
			}
			
			assertTrue(pos.toString().contains(Integer.toString(12)) && pos.toString().contains(Integer.toString(13)));
			
			player.plainedBombExploded();
    		
			System.out.println("Player exploded!");
			return;
		}
        
        
    	player = new Player(new Point(Constants.BOTTOM_UPPER_GRAVELED_WONDER), 100);

		if (mylog.isDebugEnabled()) {
			mylog.debug("Player is topped out");
		}

		player.bowlBombs = true;
		player.bombDiameter = 10;
		player.maxBombs = 30;

		if (mylog.isDebugEnabled()) {
			mylog.debug("Player starts playing!");
		}
		

		player = new Player(new Point(Constants.BOTTOM_UPPER_GRAVELED_WONDER), 100);
		
		System.out.println("\nFailed to play a bomb!");
		
		player.bowlBombs = false;

		System.out.println("\nPlayer played the bomb!");
		
		player.plainedBombExploded();
		
		assertTrue(player.canPlainBombs());
		return;

	}

    /**
	 * Adds the provided message to the log.
	 *
	 * @param t
	 *            The message to log.
	 */
	protected void addErrorMessage(Throwable t) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(Constants.ERROR +  "\n");
		buffer.append(t.toString());
}
}