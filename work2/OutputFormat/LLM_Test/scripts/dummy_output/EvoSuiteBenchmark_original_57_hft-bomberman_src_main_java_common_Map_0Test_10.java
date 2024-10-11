// Map_0Test.java
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
* It contains one unit test case for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {
		
		private static final String TAG = Map_0Test.class.getName();
    
    /**
     * Test method for
     * {@link Map#getTile(int, int)}.
     *
     * @return -
     */
    @Test
    public final void testGettile0() {
            // Setups parameters
            Point point = new Point(0, 15);
            
            Vector<Tile> tiles = new Vector<Tile>();
            for (int x = 0; x < 15 &&!point.equals(mapGetTile0(point.x, point.y)); x++) {
                Tile tile = new Tile(x, 15);
                tiles.add(tile);
            }
            
}
}