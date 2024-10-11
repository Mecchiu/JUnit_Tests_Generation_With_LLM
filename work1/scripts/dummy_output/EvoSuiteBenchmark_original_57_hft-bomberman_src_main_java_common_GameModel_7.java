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
		public static final String GAME_MODEL = "GameModel";
		static final String PLAYER_TYPE_1="Player";
		static final String PLAYER_TYPE_2="Player";
		public void setUp(){
				logger.debug("Setup of GameModel class.");
		}
		@Test
		public void testCheckForWinner(){
			logger.info("Testing checkForWinner method of GameModel Class.");
			logger.debug("Testing the method of GameModel class has been set up");
			GameModel actualGameModel = new GameModel();
			assertEquals("Incorrect gameModel used for the checkForWinner.", actualGameModel,
					new GameModel().checkForWinner());
			logger.info("Finished test");
		}
		
	
}