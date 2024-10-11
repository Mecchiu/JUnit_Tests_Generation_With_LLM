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
final private static int TLE_SIZE = 20;
		final private static int TLE_TILE_X = 1;

		final private static int TLE_TILE_Y = 10;

	/*
   * (non-Javadoc)
   * 
   * @see java.lang.Test#setUp()
   */
    @Test
    public void setUp() throws Exception {
        try {
            final Map<Integer, MapTile> tiles = new Map<Integer, MapTile>();
            Map_0Test.tileInit(tiles, TLE_SIZE, TLE_TILE_X, TLE_TILE_Y);
            final int x = 8;
            final int y = 4;
            assertFalse(tiles.getTileByIndex(x, y).