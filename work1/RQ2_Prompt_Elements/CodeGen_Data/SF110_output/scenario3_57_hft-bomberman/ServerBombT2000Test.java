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

    /**
    * Test unit test for {@link ServerBomb#tick()}. This method tests the behavior of the
    * {@link ServerBomb} when it is expected to be triggered at some later point within the world.
    * It test the case where only one tile can be found, and the bomb is triggered by another player.
    *
    * @throws DBException
    */
    @Test
    void tickTest() throws DBException {
        try {
            ServerBomb serverBomb = new ServerBomb();

            // The server should execute the method for every round which is done
            //   so that the server can detect player & tile hits.
            // The server can do so several times and
            //   it will try to find the bombs with a tile which is the tile we want
            serverBomb.tick();

            // There is a bug that causes the server to do so a lot of time
            //   but that is very rare
            final int N_TIME_LEAVES = 10;
            int i = 0;
            Collection<Point> points = new Vector<Point>();
            while(points.size() < Constants.MAX_POINTS || i < N_TIME_LEAVES){
                i++;
                try {
                    points = serverBomb.detect(GameObject.getActive(Constants.PLAYER_TILE), points);
                } catch (DBException e) {
                    // We hit a bug
                    Logger.getRootLogger().error("Fatal Error occured while getting the bomb with tile: "+Constants.PLAYER_TILE);    
                    assertTrue(false) : "Error occured while getting the bomb with tile: "+Constants.PLAYER_TILE;
                }
            }

            // The client is telling us there are no tiles to collide with.
            assertFalse("There should be no tile to collide with", points.isEmpty());
        } catch(DBException dbe) {
            Logger.getRootLogger().error("Could not detect the bombs with the tile: " + Constants.PLAYER_TILE +" and the player: "+Constants.PLAYER, dbe);
            assertTrue(false);
        }
    }
}
