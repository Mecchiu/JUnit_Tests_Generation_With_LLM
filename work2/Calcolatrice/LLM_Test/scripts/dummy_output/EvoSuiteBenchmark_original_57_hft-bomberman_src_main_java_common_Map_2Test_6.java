// Map_2Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {
		
    @Test
    public void testGetStartPoints() {

        Vector<Point> startPointVector = new Vector();

        GameBoard board = new GameBoard();
        board.setMapGrid(new Object[][]{{boardIdx(), 1},
                                      {boardIdx() + 1, boardIdx() + 1}});
        Player boardPlayer = new Player(board);

        boolean setStartPoints = true;

        for (int i = 0; i < 5; i++) {

			boolean success = boardPlayer.setStartPoints(startPointVector);

			assertEquals("check board.boardIdx", boardIdx(), board.boardIdx());

			assertTrue("no power up was added", success);

            startPointVector.clear();

            setStartPoints = true;
        }
}
}