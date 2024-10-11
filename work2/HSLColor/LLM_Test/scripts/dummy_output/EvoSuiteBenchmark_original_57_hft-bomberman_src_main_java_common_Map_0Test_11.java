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
		
	private Vector<Tile> TileList = new Vector<Tile>();

    @Test
    void getTileByIndexTest() {
        // getTileByIndex(0,0)
        Tile tile = Map.getTileByIndex(0, 0);
        assertNotNull(tile);
        assertEquals("tile not equals", 0, tile.getX());
        assertEquals("tile not equals", 0, tile.getY());
        assertNotNull(tile);
        // getTileByIndex(-1,-1)
        Tile tile1 = Map.getTileByIndex(-1, -1);
        assertNotNull(tile1);
        assertEquals("Tile not equals", -1, tile1.getX());
}
}