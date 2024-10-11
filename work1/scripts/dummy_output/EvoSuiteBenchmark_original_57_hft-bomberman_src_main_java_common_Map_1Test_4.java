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
		/**
		 * Test method for {@link Map#getTile(int, int)}.
		 */
		@Test
		public void testGetTile() {
			Tile tile = new MapTile(1, 1, 0);
			assertEquals(tile, Map.getTile(0, 0));
			tile = new MapTile(2, 2, 13);
			assertEquals(tile, Map.getTile(5, 5));
			tile = new MapTile(13, 2, 5);
			assertEquals(tile, Map.getTile(5, 5));
		}

		/**
		 * Test method for {@link Map#getTile(int, int)}.
		 */
		@Test
		public void testGetTileEnd() {
}
}