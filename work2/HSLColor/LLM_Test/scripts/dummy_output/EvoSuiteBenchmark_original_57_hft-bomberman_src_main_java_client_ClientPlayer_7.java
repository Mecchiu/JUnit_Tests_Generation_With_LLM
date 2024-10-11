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
		
    @Test
    public void testCanBowlBombs() {
        ClientPlayer player = new ClientPlayer(new Point(10, 10), "Bob");
        boolean canBowlBombs = player.canBowlBombs();
        assertFalse(canBowlBombs);
    }

    @Test
    public void testBowlBombs() {
        ClientPlayer player = new ClientPlayer(new Point(10, 10), "Bob");
        player.brealize();
        int count = player.getMaxBombs();
        boolean canBowlBombs = false;
        
        // add a random-position to the player
        for(int i = 0; i < count; i++)
        {            
            double x = (double) (Math.random() * Constants.BOARD_WIDTH);
            double y = (double) (Math.random() * Constants.BOARD_HEIGHT);
            Actor a = new Point(x, y);
            logger.debug("Adding " + a + "\n");
            player.add(a, player.getNextBounceVector(x, y));
            logger.debug(a + "\n");
           
        }
        
        assertTrue(canBowlBombs);
    }

    @Test
    public void testPlantBomb() {
        ClientPlayer player = new ClientPlayer(new Point(10, 10), "Bob");
        player.brealize();
        Bubble b = player.getMaxBombs() + 1;
        boolean canPlantBomb = false;
        player.bounce(b);
        player.placeBomb(b);
        player.bounce(b);
        player.placeBomb(b);
        player.bombplanted();
        b = player.getNextBounceVector(1, 1.5);
        player.placeBomb(b, 5.5);

        assertTrue(canPlantBomb);
        logger.debug(String.format("Trying to plant a bomb at (%d, %d)\n", b.getX(), b.getY()));
        player.reset();
        int count = player.getBombsPlanted();
        //TODO need to see if count is different 
        canPlantBomb = false;
        player.bounce(b);
        player.placeBomb(b);
        player.bounce(b);
        player.placeBomb(b);
        player.bombplanted();
        b = player.getNextBounceVector(1, 1.5);
        player.placeBomb(b, 5.5);

        assertEquals(count, player.getBombsPlanted());
        canPlantBomb = false;
        b = player.getPlantedBomb();
        player.placeBomb(b);
        player.placeBomb(b);
        player.reset();
        assertEquals(player.getPlannedMoveVector()[0], b);
        assertEquals(player.getPlannedMoveVector()[1], b);
        
        //TODO need to see if count is different 
        // canPlantBomb = true;

    }
}