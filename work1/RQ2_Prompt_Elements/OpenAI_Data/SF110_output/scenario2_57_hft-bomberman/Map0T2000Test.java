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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
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
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(0, 2));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex9() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(2, 0));
	}
	
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex10() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(2, 2));
	}
}

// MapTile.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * MapTile-Class with all information needed for map use of iterators
 * tile-iterator: for(Tile tile : map) - powerup-iterator: for(PowerUp powerup :
 * map.powerupiterator)
 *
 * @author christian
 */
public class MapTile implements Serializable {

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
        return (Tile) MapGrid[x][y];
    }
}

// MapTileTest.java
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
* Test class of {@link MapTile}.
* It contains ten unit test cases for the {@link MapTile#getTileByIndex(int, int)} method.
*/
class MapTileTest {
		
	/**
	 * Test case for {@link MapTile#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex() {
		MapTile map = new MapTile();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	 * Test case for {@link MapTile#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex2() {
		MapTile map = new MapTile();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(0, 1));
	}
	
	/**
	 * Test case for {@link MapTile#getTileByIndex(int, int)}
	 * 
	 * @author christian
	 */
	@Test
	void testGetTileByIndex3() {
		MapTile map = new MapTile();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertNotEquals(tile, map.getTileByIndex(1, 0));
	}
	
