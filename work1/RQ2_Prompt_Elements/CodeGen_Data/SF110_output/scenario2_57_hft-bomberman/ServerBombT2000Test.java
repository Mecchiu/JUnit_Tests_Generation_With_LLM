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
         * This logger handles all the test runings to all of the tests.
         * So it is set to static here as it is set as parameter
         * of the tests at the different stages of the test.
         */
    private static final Logger logger = Logger.getLogger(ServerBombTest.class.getName());
    /**
* The logger handles all the test runings to the actual tests.
* So it is set to static here as it is set as parameter
* of the tests at the different stages of the test.
*/
    private static final Logger serverLogger = Logger.getLogger(ServerBombTest.class.getName());
    /**
    * This parameter is set to true for all the
    * tests of the server where this class might be run.
    */
    private static final boolean isRunning = false;
    /**
    * This parameter is set to true for all the
    * tests of the server where this class might be run.
    */
    private static final boolean onlyOneBossAvailable = false;
    /**
     * This parameter denotes which game of the server should be run.
    */
    private static final String TESTGAME = "TestGame";
    /**
     * This parameter denotes which game of the server should be run.
     * In this case the following conditions are met:
     * <ul>
     * <li> Only one bomber should be available and will be run </li>
     * <li> only one bomber should be available and will be run <br>
     *     </li>
     * </ul>
     */
    private static final String TESTGAME_BOOM = "TestGameBombBombTick";
	public ServerBombTest(boolean isRunning) {
		this.isRunning = isRunning;
	}

    @Test
    /**
    * Run the server to start the tests.
    */
    public void serverRunTest() {
        if (!isRunning) {
            throw new IllegalStateException("Test is running");
        }
    	/**
    	 * run the server and check to see all the game objects that should be run in this test
    	*/
        Server.getServer().playGame(TESTGAME, this);
        if (isRunning == false) {
            throw new IllegalStateException("Test is not running");
        }
        if (this.onlyOneBossAvailable == false) {
            throw new IllegalStateException("Test can only run a single bomber");
        }
        if (Server.getUserMap(TESTGAME_BOOM).size()!= 1) {
            throw new IllegalStateException("Test should only run a single bomb in this case");
        }
        if (Server.getUserMap(TESTGAME).size()!= 1) {
            throw new IllegalStateException("Test shouldn't be run the same game at the same time");
        }
        
    }
	
	@Test
	public void serverRunTest1() {
		if (!isRunning) {
			throw new IllegalStateException("Test is running");
			
		}
	}
	
}