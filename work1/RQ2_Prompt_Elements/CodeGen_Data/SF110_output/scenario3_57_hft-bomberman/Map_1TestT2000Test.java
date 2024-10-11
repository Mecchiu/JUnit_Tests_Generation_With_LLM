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

	public Map_1Test(int expectedTile) {
		this.expectedTile = expectedTile;
	}

	/**
	 * It returns a Map with 1 tile and a tile size of one pixel
	 *
	 * @throws Exception -
	 *             if an exception occured while loading the Map class or it was not possible to load it.
	 */
	@Test
	public void test_Map() throws Exception {
		Map map = new Map("Map", 1, 1);
		Tile tile = map.getTile(0, 0);
		assertNotNull(tile);
		assertFalse(tile == map.getTile(0, 0));
		assertEquals(expectedTile == map.getTile(0, 0), false);
	}

	/**
	 * It returns a Map from a given String
	 *
	 * @throws Exception -
	 *             if an exception occured while loading the Map class or it was not possible to load it.
	 */
	@Test
	public void test_List() throws Exception {
		Map map = new Map("Map", "Tile", 3, 3);
		Vector<Tile> v = map.getTileList();
		assertEquals(v.size(), 1);
		Tile t = v.iterator().next();
		assertEquals(expectedTile, t.getTileNumber());
	}

	/**
	 * It returns iterator of Map tiles
	 *
	 * @throws Exception -
	 *             if an exception occured while loading the Map class or it was not possible to load it.
	 */
	@Test
	public void test_Iterator() throws Exception {
		Map map = new Map("Map", "Tile", 3, 3);
		Point pom = new Point(0, 0);
		Vector<Tile> v = map.getTileList();
		Iterator<Tile> tileIt = map.iterator(pom);
		assertTrue(tileIt.hasNext());
		tileIt.next();
		assertFalse(tileIt.hasNext());
		assertFalse(tileIt.hasNext());
	}

	private int expectedTile;

}

// Map_2Test.java
