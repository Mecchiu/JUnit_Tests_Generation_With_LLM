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
public class MapTile implements Tile, Serializable {

    /**
     * return MapTile object at Position x, y
     *
     * @param x -
     *            number of horizontal tile
     * @param y -
     *            number of vertical tile
     * @return MapTile object
     */
    public Tile getTile(int x, int y) {
        return (Tile) MapGrid[(int) Math.floor((double) x / Constants.TILE_BORDER)][(int) Math.floor((double) y / Constants.TILE_BORDER)];
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
* It contains ten unit test cases for the {@link MapTile#getTile(int, int)} method.
*/
class MapTileTest {
		
		/**
		* Test case for {@link MapTile#getTile(int, int)} method.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile() {
				MapTile map = new MapTile();
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

// MapTileIterator.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * MapTileIterator-Class with all information needed for map use of iterators
 * tile-iterator: for(Tile tile : map) - powerup-iterator: for(PowerUp powerup :
 * map.powerupiterator)
 *
 * @author christian
 */
public class MapTileIterator implements Tile, Serializable {

    /**
     * return MapTile object at Position x, y
     *
     * @param x -
     *            number of horizontal tile
     * @param y -
     *            number of vertical tile
     * @return MapTile object
     */
    public Tile getTile(int x, int y) {
        return (Tile) MapGrid[(int) Math.floor((double) x / Constants.TILE_BORDER)][(int) Math.floor((double) y / Constants.TILE_BORDER)];
    }
}

// MapTileIteratorTest.java
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
* Test class of {@link MapTileIterator}.
* It contains ten unit test cases for the {@link MapTileIterator#getTile(int, int)} method.
*/
class MapTileIteratorTest {
		
		/**
		* Test case for {@link MapTileIterator#getTile(int, int)} method.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile() {
				MapTileIterator map = new MapTileIterator();
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

// MapTileIteratorTest.java
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
* Test class of {@link MapTileIterator}.
* It contains ten unit test cases for the {@link MapTileIterator#getTile(int, int)} method.
*/
class MapTileIteratorTest {
		
		/**
		* Test case for {@link MapTileIterator#getTile(int, int)} method.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile() {
				MapTileIterator map = new MapTileIterator();
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
				assertEquals