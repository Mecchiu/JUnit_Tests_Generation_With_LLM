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
		
	@Test
	void testGameModelCheckForWinner1() {
        
        try {

            GameModel gameModel = new GameModel();
            gameModel.checkForWinner();
        
            assertEquals("invalid value returned", 0, gameModel.checkForWinner());
                
        } catch (final Exception e) {
            
            final StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            logger.error(sw.toString(), e);

        }

		}
	/**
	 * Test class of {@link GameModel#update()}.
	 *
	 */
	@Test
	void testGameModelUpdate() {

        try {

			/**
			 * TODO - make sure that the game has no objects.
			 */
			final GameModel gameModel = new GameModel();

			gameModel.update();

			/**
			 * TODO - make sure that we have no game, no player1 and no player2.
			 */
			assertTrue("Game not finished", gameModel.getTime() >= Constants.time);

		} catch (final Exception e) {

			logger.error("Fault: " + e.getMessage());

			e.printStackTrace();
		}

		}
	/**
	 * Test class of {@link GameModel#checkForWinner()}.
	 *
	 */
	@Test
	void testGameModelCheckForWinner() {

		final int[] playerIds = {10, 11, 12, 13, 14, 15, 16, 17};
		final long[] playerTime = {18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L};
		final String[] unitType = {Constant.POSSIBLE_BOWSER, Constant.UNKNOWN, Constant.POSSIBLE_SHIP, Constant.UNKNOWN};

		final boolean[] result = {false, false, false, false};
}
}