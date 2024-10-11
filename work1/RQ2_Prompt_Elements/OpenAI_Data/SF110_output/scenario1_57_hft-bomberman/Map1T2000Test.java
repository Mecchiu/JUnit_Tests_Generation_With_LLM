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
	* Test case for {@link Map#getTile(int, int)}
	*
	* @author christian
	*/
	@Test
	void testGetTile() {
		Map map = new Map();
		Tile tile = map.getTile(0, 0);
		assertEquals(tile.getX(), 0);
		assertEquals(tile.getY(), 0);
		tile = map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER);
		assertEquals(tile.getX(), Constants.TILE_BORDER);
		assertEquals(tile.getY(), Constants.TILE_BORDER);
		tile = map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER * 2);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 2);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 2);
		tile = map.getTile(Constants.TILE_BORDER * 3, Constants.TILE_BORDER * 3);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 3);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 3);
		tile = map.getTile(Constants.TILE_BORDER * 4, Constants.TILE_BORDER * 4);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 4);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 4);
		tile = map.getTile(Constants.TILE_BORDER * 5, Constants.TILE_BORDER * 5);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 5);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 5);
		tile = map.getTile(Constants.TILE_BORDER * 6, Constants.TILE_BORDER * 6);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 6);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 6);
		tile = map.getTile(Constants.TILE_BORDER * 7, Constants.TILE_BORDER * 7);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 7);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 7);
		tile = map.getTile(Constants.TILE_BORDER * 8, Constants.TILE_BORDER * 8);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 8);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 8);
		tile = map.getTile(Constants.TILE_BORDER * 9, Constants.TILE_BORDER * 9);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 9);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 9);
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

    public Tile getTile(int x, int y) {
        return (Tile) MapGrid[(int) Math.floor((double) x / Constants.TILE_BORDER)][(int) Math.floor((double) y / Constants.TILE_BORDER)];
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
* It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
*/
class MapTest {
		
	/**
	* Test case for {@link Map#getTile(int, int)}
	*
	* @author christian
	*/
	@Test
	void testGetTile() {
		Map map = new Map();
		Tile tile = map.getTile(0, 0);
		assertEquals(tile.getX(), 0);
		assertEquals(tile.getY(), 0);
		tile = map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER);
		assertEquals(tile.getX(), Constants.TILE_BORDER);
		assertEquals(tile.getY(), Constants.TILE_BORDER);
		tile = map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER * 2);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 2);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 2);
		tile = map.getTile(Constants.TILE_BORDER * 3, Constants.TILE_BORDER * 3);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 3);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 3);
		tile = map.getTile(Constants.TILE_BORDER * 4, Constants.TILE_BORDER * 4);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 4);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 4);
		tile = map.getTile(Constants.TILE_BORDER * 5, Constants.TILE_BORDER * 5);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 5);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 5);
		tile = map.getTile(Constants.TILE_BORDER * 6, Constants.TILE_BORDER * 6);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 6);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 6);
		tile = map.getTile(Constants.TILE_BORDER * 7, Constants.TILE_BORDER * 7);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 7);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 7);
		tile = map.getTile(Constants.TILE_BORDER * 8, Constants.TILE_BORDER * 8);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 8);
		assertEquals(tile.getY(), Constants.TILE_BORDER * 8);
		tile = map.getTile(Constants.TILE_BORDER * 9, Constants.TILE_BORDER * 9);
		assertEquals(tile.getX(), Constants.TILE_BORDER * 9);
		assertEquals(tile