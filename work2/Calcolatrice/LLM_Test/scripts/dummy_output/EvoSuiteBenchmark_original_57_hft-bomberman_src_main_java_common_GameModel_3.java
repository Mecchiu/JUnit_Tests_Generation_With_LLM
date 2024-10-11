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
		
    protected static Logger logger = Logger.getLogger(GameModelTest.class);

    /**
     * One unit test for {@link #checkForWinner()}.
     */
    public void testCheckForWinner() {
        logger.info("Test checkForWinner()");
        /*
         * It shouldn't throw an exception even if it does. Since the test will fail 
         * if it doesn't throw, it won't be an instance of it's superclass, i.e. {@link ClassCastException}
         */
        new GameModel().checkForWinner();
        assertFalse(new GameModel().getTurn().equals(new Turn("DIE", new Point())));
        new GameModel().checkForWinner();
        assertFalse(new GameModel().getTurn().equals(new Turn("TIE", new Point())));
        // GameModelTest.testGameModelSetGameMode();
        new GameModel().checkForWinner();
        assertEquals("DIE", new Turn("DIE", new Point()).toString());
        new GameModel().checkForWinner();
    }

    /**
     * One unit test for {@link #getGameType()}.
     */
    public void testGetGameType() {
        logger.info("Test getGameType()");
        assertEquals('D', new Turn("DIE", new Point()).getGameType());
        assertEquals('T', new Turn("TIE", new Point()).getGameType());
        assertEquals('N', new Turn("NOK", new Point()).getGameType());
        assertEquals('R', new Turn("ROK", new Point()).getGameType());
        assertEquals('Q', new Turn("SEI", new Point()).getGameType());
        assertEquals('S', new Turn("ZEP", new Point()).getGameType());
        assertEquals('P', new Turn("AUE", new Point()).getGameType());
        assertEquals('K', new Turn("CHE", new Point()).getGameType());
        assertEquals('C', new Turn("SE", new Point()).getGameType());
        assertEquals('D', new Turn("DE", new Point()).getGameType());
    }

    /**
     * One unit test for {@link #checkForWinner(boolean)}
     *
     * @throws java.lang.ClassCastException
     */
    public void testCheckForWinnerOnBooleanWithCorrectResult() {
        logger.info("Test checkForWinner(boolean)");
        int result = new Turn("NOK", new Point()).checkForWinner(false);
        assertTrue(result > 0);
        result = new Turn("SEI", new Point()).checkForWinner(true);
        assertFalse(result > 0);
        result = new Turn("AUE", new Point()).checkForWinner(true);
        assertFalse(result > 0);
        result = new Turn("CHE", new Point()).checkForWinner(true);
        assertFalse(result > 0);
        result = new Turn("A", new Point()).checkForWinner(true);
        assertFalse(result > 0);
        result = new Turn("DIE", new Point()).checkForWinner(false);
        assertFalse(result > 0);
        // GameModelTest.testGameModelSetGameMode();
        result = new Turn("K", new Point()).checkForWinner(false);
        assertFalse(result > 0);
        result = new Turn("D", new Point()).checkForWinner(true);
        assertTrue(result > 0);
    }


    /**
     * One unit test for {@link GameModel#checkForWinner(boolean)}
     *
     * @throws java.lang.ClassCastException
     */
    public void testCheckForWinnerOnBooleanOnMissedState() {
        logger.info("Test checkForWinner(boolean)'onMissedState'");
        int result = new Turn("ROK", new Point()).checkForWinner(true);
        assertEquals(0, result);
        result = new Turn("ROK", new Point()).checkForWinner(false);
        assertEquals(0, result);
        result = new Turn("DOK", new Point()).checkForWinner(false);
        assertFalse(result == 0);
        result = new Turn("DOK", new Point()).checkForWinner(true);
        assertTrue(result == 0);
    }


    /**
     * One unit test for {@link GameModel#getRoundFinished()}
     */
    public void testRoundFinished() {
        assertTrue(new Turn("NOK").getRoundFinished().equals(new Turn("NOK", new Point())));
    }

    /**
     * One unit test for {@link GameModel#getRoundCompleted()}
     */
    public void testRoundCompleted() {
        assertTrue(new Turn("NOK", new Point()).getRoundCompleted().equals(new Turn("NOK", new Point())));
    }

    /**
     * Unit test for {@link GameModel#addGameObject(int, GameObject)}.
     */
    public void testGameModelAddGameObject() {
        int id = 1;
        GameObject gameObject = new GameObject(id, "D");
        GameModelTest.addGameObject(id, gameObject);
        gameObject = new GameObject(id, "T");
        GameModelTest.addGameObject(id, gameObject);
        gameObject = new GameObject(id, "N");
        GameModelTest.addGameObject(id, gameObject);
        gameObject = new GameObject(id, "R");
        GameModelTest.addGameObject(id, gameObject);
        gameObject = new GameObject(id, "D");
        GameModelTest.addGameObject(id, gameObject);
        // gameModelTest.update();
    }

    /**
     * The test case for this example is in {@link GameModelTest}.java
     */
    public void update() {
    }

    private static class Turn {

        private static final int K = 48;
        private static final int D = 65;
        private static final int N = 47;
        private static final int R = 63;

        private final int gameId;
}
}