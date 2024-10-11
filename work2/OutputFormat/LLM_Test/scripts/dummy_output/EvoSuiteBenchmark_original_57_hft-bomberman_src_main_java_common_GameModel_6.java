// GameModelTest.java
package common;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import messages.round.RoundTimeOverMsg;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameModel}.
* It contains one unit test case for the {@link GameModel#checkForWinner()} method.
*/
class GameModelTest {
		
	
	
	/**
	* The time of this GameModel
	*/
    final private long time;

    /**
     * @throws Exception
     *
     * Checks the correctness of this particular GameModel.
     */
    @Test
    void testCheckForWin() throws Exception {

    	/*
    	* First, reset GameModel time
    	* before we do anything else
		*/
    	logger.info("Start GameModel Test");
    	GameModel.time = 20000L;
        logger.info("Time of the game model - after reset");

        /*
        * Second we create the first GameModel for this test
        */
        /*
         * Reset time
        */
        logger.info("Reset GameModel time");
        time = 0L;

        /*
         * Now we create a GameModel for our first test
         * (We can't do this after our reset, but we can do
         * it here)
         */
    	logger.info("Creates GameModel for the first test");
        GameModel gameModel = new GameModel();

        /*
         * Next, we check if the check-for-winner method is called
         * by our GameModel after itself. If it is, we do something else here.
         * So if we call the check-for-winner() method again, we'll
         * end up in the second case.
         */
        /*
         * This is the actual method we test
         */
        boolean isTest = gameModel.checkForWinner();
		
    	/*
    	 * The time we did return this test result is always 100ms
    	 */
    	time = 100L;

        logger.info("After all setup, the result is: " + isTest);

    }
    
    /**
     * @param gameObjects - the list of GameObject we want to check
     */
    public void setGameObjects(HashMap<Integer, GameObject> gameObjects){
    	this.gameObjects= gameObjects;
    }
    
    @Test
    public void game() throws Exception {
    	
    	/*
    	* First, check if the game is over (if all gameObjects are GameObjects)
    	*/
    	logger.info("Check if Game is over");
    	GameModel.time = 1000000L;
        boolean isGameOver =! gameObjects.isEmpty();
    	if(isGameOver) {
    		logger.info("Game is over");
    		Vector<Player> players = gameObjects.keySet();
    		assertTrue(players.isEmpty());
    		logger.info("players is: {}", players);
    	}
    	/*
    	 * Second, we check that if we found a winner - we return true for all
    	 * tests
    	*/
    	logger.info("Check if we found a winner");
    	assertFalse(isGameOver);
    }
    
    /**
     * @param gameObjects : HashMap containing the GameObjects
     */
    public void setGameObjects(Vector<Player> players){
    	this.players= players;
    }

    public Vector<Player> getPlayers(){

    	return this.players;
    }

    public long getTime (){

    	return this.time;
    }

    public void setTime(long time){

    	this.time = time;
    }
}