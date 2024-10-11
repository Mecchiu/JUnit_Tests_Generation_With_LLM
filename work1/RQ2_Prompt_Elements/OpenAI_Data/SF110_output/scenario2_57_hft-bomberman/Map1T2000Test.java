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
		* Test case 1 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile1() {
				Map map = new Map();
				Tile tile = map.getTile(0, 0);
				assertEquals(0, tile.getX());
				assertEquals(0, tile.getY());
		}
		
		/**
		* Test case 2 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile2() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER, 0);
				assertEquals(0, tile.getX());
				assertEquals(0, tile.getY());
		}
		
		/**
		* Test case 3 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile3() {
				Map map = new Map();
				Tile tile = map.getTile(0, Constants.TILE_BORDER);
				assertEquals(0, tile.getX());
				assertEquals(0, tile.getY());
		}
		
		/**
		* Test case 4 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile4() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER);
				assertEquals(0, tile.getX());
				assertEquals(0, tile.getY());
		}
		
		/**
		* Test case 5 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile5() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER * 2, 0);
				assertEquals(Constants.TILE_BORDER, tile.getX());
				assertEquals(0, tile.getY());
		}
		
		/**
		* Test case 6 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile6() {
				Map map = new Map();
				Tile tile = map.getTile(0, Constants.TILE_BORDER * 2);
				assertEquals(0, tile.getX());
				assertEquals(Constants.TILE_BORDER, tile.getY());
		}
		
		/**
		* Test case 7 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile7() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER * 2);
				assertEquals(Constants.TILE_BORDER, tile.getX());
				assertEquals(Constants.TILE_BORDER, tile.getY());
		}
		
		/**
		* Test case 8 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile8() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER);
				assertEquals(Constants.TILE_BORDER, tile.getX());
				assertEquals(0, tile.getY());
		}
		
		/**
		* Test case 9 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile9() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER * 2);
				assertEquals(0, tile.getX());
				assertEquals(Constants.TILE_BORDER, tile.getY());
		}
		
		/**
		* Test case 10 for {@link Map#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile10() {
				Map map = new Map();
				Tile tile = map.getTile(Constants.TILE_BORDER * 3, Constants.TILE_BORDER * 3);
				assertEquals(Constants.TILE_BORDER * 2, tile.getX());
				assertEquals(Constants.TILE_BORDER * 2, tile.getY());
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
		* Test case 1 for {@link MapTile#getTile(int, int)}.
		* It tests if the method returns the correct tile for the given coordinates.
		*/
		@Test
		void testGetTile1() {
				MapTile mapTile = new MapTile();
				Tile tile = mapTile.getTile(0, 0);
	