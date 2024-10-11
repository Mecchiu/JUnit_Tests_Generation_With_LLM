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
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex2() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex3() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex4() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex5() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex6() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex7() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex8() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex9() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex10() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
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

    public Tile getTileByIndex(int x, int y) {
        return (Tile) MapGrid[x][y];
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
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex2() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex3() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex4() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex5() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex6() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex7() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex8() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex9() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex10() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
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

    public Tile getTileByIndex(int x, int y) {
        return (Tile) MapGrid[x][y];
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
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex2() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex3() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex4() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex5() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex6() {
		Map map = new Map();
		Tile tile = new Tile(new Point(0, 0), TileType.WALL);
		map.MapGrid[0][0] = tile;
		assertEquals(tile, map.getTileByIndex(0, 0));
	}
	
	/**
	* Test case for {@link Map#getTileByIndex(int, int)} method.
	* It tests if the method returns the correct tile.
	*/
	@Test
	void testGetTileByIndex7() {
		Map map = new