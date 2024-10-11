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
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(0, 0);
		assertEquals(tile.getX(), 0);
		assertEquals(tile.getY(), 0);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex2() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(1, 1);
		assertEquals(tile.getX(), 1);
		assertEquals(tile.getY(), 1);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex3() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(2, 2);
		assertEquals(tile.getX(), 2);
		assertEquals(tile.getY(), 2);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex4() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(3, 3);
		assertEquals(tile.getX(), 3);
		assertEquals(tile.getY(), 3);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex5() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(4, 4);
		assertEquals(tile.getX(), 4);
		assertEquals(tile.getY(), 4);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex6() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(5, 5);
		assertEquals(tile.getX(), 5);
		assertEquals(tile.getY(), 5);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex7() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(6, 6);
		assertEquals(tile.getX(), 6);
		assertEquals(tile.getY(), 6);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex8() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(7, 7);
		assertEquals(tile.getX(), 7);
		assertEquals(tile.getY(), 7);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex9() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(8, 8);
		assertEquals(tile.getX(), 8);
		assertEquals(tile.getY(), 8);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex10() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(9, 9);
		assertEquals(tile.getX(), 9);
		assertEquals(tile.getY(), 9);
	}
}

// Map.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * Map-Class with all information needed for map use of iterators tile-iterator:
 * for(Tile tile : map) - powerup-iterator: for(PowerUp powerup :
 * map.powerupiterator)
 *
 * @author christian
 */
public class Map implements Iterable<Tile>, Serializable {

    /**
     * return MapTile object at Index x, y
     *
     * @param x -
     *            number of horizontal tile
     * @param y -
     *            number of vertical tile
     * @return MapTile object
     */
    public Tile getTileByIndex(int x, int y) {
        return tiles[x][y];
    }
}

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
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(0, 0);
		assertEquals(tile.getX(), 0);
		assertEquals(tile.getY(), 0);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex2() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(1, 1);
		assertEquals(tile.getX(), 1);
		assertEquals(tile.getY(), 1);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex3() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(2, 2);
		assertEquals(tile.getX(), 2);
		assertEquals(tile.getY(), 2);
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @result The method returns the correct tile.
	 */
	@Test
	void testGetTileByIndex4() {
		Map map = new Map();
		Tile tile = map.getTileByIndex(3, 3);
		assertEquals(tile.getX(), 3);
		assertEquals(tile.getY(), 3);
	}
	
	/**
