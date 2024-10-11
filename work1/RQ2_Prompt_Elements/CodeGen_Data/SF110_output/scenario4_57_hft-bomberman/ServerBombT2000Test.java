// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains one unit test case for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {

    public ServerBombTest() {
    }

    @Test
    public void testTickingBomb() {
        ServerBomb serverBomb = new ServerBomb(new Point(2.5f,2.5f), new GameSession(null, null, null));	
        serverBomb.move();
        serverBomb.updateWithCollisionCheck(new Vector());
        Point topLeft = serverBomb.getTopLeft();
        assertFalse("Top Left corner has incorrect position", topLeft.equals(new Point(5.5f,5.5f)));
        int tickFrames = serverBomb.tickFrames;
        ServerBomb serverBomb2 = getExplosionBounds(new Vector());
        serverBomb2.tick();
        assertTrue("Bomb Explosion has not been fired", serverBomb2.hasExploded());
        int fire = serverBomb2.getNumberOfFireBombs();
        assertTrue("The bomb fired no bombs", fire > 0);
        
        ServerGameSession session2 = getExplosionBounds(new Vector());
        session2 = sendServerBombExploded(session2);
        System.out.println("Server Bomb Test - Expected Explosion with "+tickFrames+" ticks. Actual: "+ session2.getExplodedBy());
        serverBomb2 = getExplosionBounds(new Vector());
        serverBomb2.tick();

    }
    
    /**
     * TESTS FUNCTION: ServerBomb.java
     * A class with a test to see if 
     * the bomb fires the right number of bombs.
     */
    /**
        @Test
     */
    @Test
    public void testServerBombFireBOMBs() {
        System.out.println("Server Bomb Test");
        ServerGameSession session = new GameSession(null, null, null);
        ServerBomb serverBomb = new ServerBomb(new Point(2.5f,2.5f), session);
        serverBomb.move();
        assertEquals("Server Bomb fire has wrong number of bombs", session.getBombs(),1);
       
        assertEquals("Server Bomb fires wrong number of bombs", session.getBombs(), 1);
        
        serverBomb.explode(session);
        assertEquals("Server Bomb fires wrong number of Bombs", session.getBombs(), session.getExplodedBy().size());
        assertEquals("Server Explosion fire has wrong number of Bombs", session.getExplodedBy(),1);
        serverBomb.tick();
        assertEquals("Server Bomb Fire has wrong number of Bombs", session.getBombs(),2);
        
        
    }
    
    @Test
    public void returnNoBombs() {
            //ServerBombTest
            ServerBomb serverBomb = new ServerBomb(new Point(2.5f,2.5f), new Vector());
            assertTrue("ServerBomb.returnNoBombs has no bombs",serverBomb.returnNoBombs());
            //ServerBomb
            ServerBomb serverBomb2 = new ServerBomb(new Point(2.5f,2.5f), new GameSession());
            assertEquals("ServerBomb.returnNoBombs has wrong number of bombs",0,serverBomb2.returnNoBombs());
            
    }
    
    /**
     * Test class of {@link ServerExplosion}.
     * It is used for testing the creation of the bomb with
     * the proper height and width.
     */
   private class ServerExplosion extends Explosion
    {
        /**
         * Constructor
         *
         * @param tile tile
         * @param player
         */
        public ServerExplosion(Tile tile, Player player)
        {
            super(tile, player);
        }
        
        /**
         * Return the explosion class for this container
         *
         * @return class
         */
        @Override
        public Class<? extends Explosion> classAt(Point topRight)
        {
            return ServerExplosion.class;
        }
    }
    
    
    /**
       * Returns the top right point (in tile position) of the tile with the largest tile size
       * at the server to which the explosion shall be placed in game
       *
       * @return the top right tile
       */
       public Point getTopRight() {
             return ServerExplosion.getTopRight(getTile());
       }

        
    /**
       * Returns randomy from server.org.
       * Server Bomb is a binary bomb that randomly destroys the board.
       *
       * @return a random number
       *
     */
   public static int getRandomNumber() {
        return DBServiceFactory.getServer().getRandomNumber();
    }

    
}
