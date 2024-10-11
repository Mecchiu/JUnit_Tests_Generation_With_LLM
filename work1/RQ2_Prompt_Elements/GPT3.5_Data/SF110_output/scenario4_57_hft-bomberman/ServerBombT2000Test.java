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
* It contains ten unit test cases for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {
    
    @Test
    void testTick() {
        ServerGameSession session = new ServerGameSession();
        ServerBomb bomb = new ServerBomb(new Point(0, 0), session);
        assertFalse(bomb.tick());
        
        bomb.setTickFrames(0);
        assertTrue(bomb.tick());
        
        bomb.setTickFrames(-1);
        assertFalse(bomb.tick());
        
        bomb.setTickFrames(1);
        assertTrue(bomb.tick());
        
        bomb.setTickFrames(2);
        assertFalse(bomb.tick());
        
        bomb.setTickFrames(3);
        assertTrue(bomb.tick());
        
        bomb.setTickFrames(4);
        assertFalse(bomb.tick());
        
        bomb.setTickFrames(5);
        assertTrue(bomb.tick());
        
        bomb.setTickFrames(6);
        assertFalse(bomb.tick());
        
        bomb.setTickFrames(7);
        assertTrue(bomb.tick());
    }
}