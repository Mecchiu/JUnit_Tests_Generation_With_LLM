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
* It contains ten unit test cases for the {@link Map#getTileByIndex(int, int)} method.
*/
class MapTest {

	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex2() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(0, 1));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex3() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(1, 0));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex4() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(1, 1));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex5() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(0, -1));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex6() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(-1, 0));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex7() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(-1, -1));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex8() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(1, -1));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex9() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(-1, 1));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex10() {
		Map map = new Map();
		Tile tile = new Tile();
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(1, 2));
	}
}