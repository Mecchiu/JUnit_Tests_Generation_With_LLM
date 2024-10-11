// MapTest.java
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
* It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
*/
class MapTest {
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile() {
				Map map = new Map();
				Tile tile = map.getTile(0, 0);
				assertEquals(0, tile.getX());
				assertEquals(0, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER, 0);
				assertEquals(1, tile.getX());
				assertEquals(0, tile.getY());
				tile = map.getTile(0, Constants.TILE_BORDER);
				assertEquals(0, tile.getX());
				assertEquals(1, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER);
				assertEquals(1, tile.getX());
				assertEquals(1, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER / 2, Constants.TILE_BORDER / 2);
				assertEquals(0, tile.getX());
				assertEquals(0, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER / 2, Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
				assertEquals(0, tile.getX());
				assertEquals(1, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER + Constants.TILE_BORDER / 2, Constants.TILE_BORDER / 2);
				assertEquals(1, tile.getX());
				assertEquals(0, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER + Constants.TILE_BORDER / 2, Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
				assertEquals(1, tile.getX());
				assertEquals(1, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER * 2);
				assertEquals(2, tile.getX());
				assertEquals(2, tile.getY());
				tile = map.getTile(Constants.TILE_BORDER * 2 + 1, Constants.TILE_BORDER * 2 + 1);
				assertEquals(2, tile.getX());
				assertEquals(2, tile.getY());
		}
}