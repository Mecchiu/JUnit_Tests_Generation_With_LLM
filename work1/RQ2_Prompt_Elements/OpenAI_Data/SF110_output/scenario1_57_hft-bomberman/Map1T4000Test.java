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
		tile = map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER);
		assertEquals(1, tile.getX());
		assertEquals(1, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER * 2);
		assertEquals(2, tile.getX());
		assertEquals(2, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 3, Constants.TILE_BORDER * 3);
		assertEquals(3, tile.getX());
		assertEquals(3, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 4, Constants.TILE_BORDER * 4);
		assertEquals(4, tile.getX());
		assertEquals(4, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 5, Constants.TILE_BORDER * 5);
		assertEquals(5, tile.getX());
		assertEquals(5, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 6, Constants.TILE_BORDER * 6);
		assertEquals(6, tile.getX());
		assertEquals(6, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 7, Constants.TILE_BORDER * 7);
		assertEquals(7, tile.getX());
		assertEquals(7, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 8, Constants.TILE_BORDER * 8);
		assertEquals(8, tile.getX());
		assertEquals(8, tile.getY());
		tile = map.getTile(Constants.TILE_BORDER * 9, Constants.TILE_BORDER * 9);
		assertEquals(9, tile.getX());
		assertEquals(9, tile.getY());
	}
}