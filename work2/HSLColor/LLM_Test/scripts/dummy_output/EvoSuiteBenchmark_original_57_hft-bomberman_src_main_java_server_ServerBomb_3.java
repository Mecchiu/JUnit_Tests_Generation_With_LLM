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
     * Empty default constructor for the test, used by JUnit and JUnit Jupiter testing. 
     */
    ServerBombTest() {
        // empty constructor
    }
	
    /**
     * A unit test to test {@link ServerBomb#tick()}
     */
    @Test
    public void tickTest() {
        // create a service and initialize it
    	DBGameUser ud = new DBServiceFactory.Instance().NewGameUser("Default", "Default", "Default");
    	Collection<GameObject> gos = ud.GetGameServerUsers(ServerBomb.class.getName());
    	
        DBGameObject go = gos.iterator().next();
        
        // check if a gameObject is hit
        boolean result = go.GetBombExploded(ServerBomb.class.getName())!=null;
        
        // check if the gameObject hit its bomb
        boolean result2 = go.GetBombExploding(ServerBomb.class.getName(), go).tick();
        
        // check if the gameObject hit some tiles
        assertTrue(result2);
        
        result = go.GetBombExploding(ServerBomb.class.getName(), go).explodesrightnow();
        
        // check if the gameObject did not hit any tile
        assertFalse("hit", result);
    }
}