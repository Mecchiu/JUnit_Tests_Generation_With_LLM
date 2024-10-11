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
		* @author christian
		*/
		@Test
		void testGetTile() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(0, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(0, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(1, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(1, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(2, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(2, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(3, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(3, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(4, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(4, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(5, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(5, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(6, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(6, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(7, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(7, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(8, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(8, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(9, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(9, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(10, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(10, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(11, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(11, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(12, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(12, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(13, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(13, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(14, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(14, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(15, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(15, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(16, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(16, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(17, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(17, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(18, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(18, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(19, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(19, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(20, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(20, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(21, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(21, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(22, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(22, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(23, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(23, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(24, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(24, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(25, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(25, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(26, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(26, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(27, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(27, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(28, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(28, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.