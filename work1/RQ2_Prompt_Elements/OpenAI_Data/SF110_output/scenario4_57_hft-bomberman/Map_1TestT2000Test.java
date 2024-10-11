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
* It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {

	/**
	 * Test case for {@link Map#getTile(int, int)}
	 * 
	 * @author Christian
	 */
	@Test
	void testGetTile() {
		Map map = new Map("");
		map.setArea(10, 10);
		map.setTile(0, 0, new Tile(TileType.WALL));
		map.setTile(1, 1, new Tile(TileType.WALL));
		map.setTile(2, 2, new Tile(TileType.WALL));
		map.setTile(3, 3, new Tile(TileType.WALL));
		map.setTile(4, 4, new Tile(TileType.WALL));
		map.setTile(5, 5, new Tile(TileType.WALL));
		map.setTile(6, 6, new Tile(TileType.WALL));
		map.setTile(7, 7, new Tile(TileType.WALL));
		map.setTile(8, 8, new Tile(TileType.WALL));
		map.setTile(9, 9, new Tile(TileType.WALL));
		
		assertEquals(TileType.WALL, map.getTile(0, 0).getType());
		assertEquals(TileType.WALL, map.getTile(1, 1).getType());
		assertEquals(TileType.WALL, map.getTile(2, 2).getType());
		assertEquals(TileType.WALL, map.getTile(3, 3).getType());
		assertEquals(TileType.WALL, map.getTile(4, 4).getType());
		assertEquals(TileType.WALL, map.getTile(5, 5).getType());
		assertEquals(TileType.WALL, map.getTile(6, 6).getType());
		assertEquals(TileType.WALL, map.getTile(7, 7).getType());
		assertEquals(TileType.WALL, map.getTile(8, 8).getType());
		assertEquals(TileType.WALL, map.getTile(9, 9).getType());
	}
}

// Map_2Test.java
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
class Map_2Test {
		
	/**
	 * Test case for {@link Map#getTileByIndex(int, int)}
	 * 
	 * @author Christian
	 */
	@Test
	void testGetTileByIndex() {
		Map map = new Map("");
		map.setArea(10, 10);
		map.setTileByIndex(0, 0, new Tile(TileType.WALL));
		map.setTileByIndex(1, 1, new Tile(TileType.WALL));
		map.setTileByIndex(2, 2, new Tile(TileType.WALL));
		map.setTileByIndex(3, 3, new Tile(TileType.WALL));
		map.setTileByIndex(4, 4, new Tile(TileType.WALL));
		map.setTileByIndex(5, 5, new Tile(TileType.WALL));
		map.setTileByIndex(6, 6, new Tile(TileType.WALL));
		map.setTileByIndex(7, 7, new Tile(TileType.WALL));
		map.setTileByIndex(8, 8, new Tile(TileType.WALL));
		map.setTileByIndex(9, 9, new Tile(TileType.WALL));
		
		assertEquals(TileType.WALL, map.getTileByIndex(0, 0).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(1, 1).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(2, 2).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(3, 3).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(4, 4).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(5, 5).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(6, 6).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(7, 7).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(8, 8).getType());
		assertEquals(TileType.WALL, map.getTileByIndex(9, 9).getType());
	}
}

// Map_3Test.java
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
* It contains ten unit test cases for the {@link Map#setTile(int, int, Tile)} method.
*/
class Map_3Test {
		
	/**
	 * Test case for {@link Map#setTile(int, int, Tile)}
	 * 
	 * @author Christian
	 */
	@Test
	void testSetTile() {
		Map map = new Map("");
		map.setArea(10, 10);
		map.setTile(0, 0, new Tile(TileType.WALL));
		map.setTile(1, 1, new Tile(TileType.WALL));
		map.setTile(2, 2, new Tile(TileType.WALL));
		map.setTile(3, 3, new Tile(TileType.WALL));
		map.setTile(4, 4, new Tile(TileType.WALL));
		map.setTile(5, 5, new Tile(TileType.WALL));
		map.setTile(6, 6, new Tile(TileType.WALL));
		map.setTile(7, 7, new Tile(TileType.WALL));
		map.setTile(8, 8, new Tile(TileType.WALL));
		map.setTile(9, 9, new Tile(TileType.WALL));
		
		assertEquals(TileType.WALL, map.getTile(0, 0).getType());
		assertEquals(TileType.WALL, map.getTile(1, 1).getType());
		assertEquals(TileType.WALL, map.getTile(2, 2).getType());
		assertEquals(TileType.WALL, map.getTile(3, 3).getType());
		assertEquals(TileType.WALL, map.getTile(4, 4).getType());
		assertEquals(TileType.WALL, map.getTile(5, 5).getType());
		assertEquals(TileType.WALL, map.getTile(6, 6).getType());
		assertEquals(TileType.WALL, map.getTile(7, 7).getType());
		assertEquals(TileType.WALL, map.getTile(8, 8).getType());
		assertEquals(TileType.WALL, map.getTile(9, 9).getType());
	}
}

// Map_4Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.