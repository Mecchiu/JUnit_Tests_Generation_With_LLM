// Map_1Test.java
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
* It contains one unit test case for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {
		private String imageSetString;

    /**
     * Constructor of Map_1
                * Creates Map object with default size 20
     *
     * @throws Exception in case of error
     */
    public Map_1Test() throws NullPointerException,
            Exception {
        this.imageSetString = "testimage8";
    }

    /**
     * get tile at given coordinates on the map
     *
     * @param x -
     *            number of horizontal (x)
     * @param y -
     *            number of vertical (y)
     * @return
     * @throws NoSuchElementException in case there is not tile at given coordinates
     */
    public Tile getTileByIndex(int x, int y)
            throws NoSuchElementException {

}
}