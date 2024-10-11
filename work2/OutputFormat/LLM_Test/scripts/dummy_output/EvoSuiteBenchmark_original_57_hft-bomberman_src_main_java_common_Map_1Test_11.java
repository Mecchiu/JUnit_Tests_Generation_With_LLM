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
		private Map map;

		public Map_1Test(Map map) {
			this.map = map;
		}

		@Test
		void getTileByIndexTest() {
			Tile tile = map.getTileByIndex(10, 10);
			assertTrue(tile!= null);
			assertTrue(tile.getTileType() == TileType.WALL);
			assertTrue(tile.getName().equals("Wall"));
		}

		@Test
		void getTile_2dTest() {
			assertTrue(map.getTile(10, 10, TileType.WALL)!= null);
			assertTrue(map.getTile(20, 50, TileType.WALL)!= null);
}
}