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
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {
/**
* Initialization of Map
* @throws Exception -
*/
	@Test
	void initTest() throws Exception {
			/**
* Create map with one unit test test
*/
		Map map = new Map();
                System.out.println(map.getStartPoint(1));
		map.setMaxPlayers(10);
		assertEquals("No point1", new Point(1, 1), map.getStartPoint(1));
		int i = 0;
		for(Tile tile : map) {
			System.out.println(tile);
			assertTrue("Tile must start here", i == 0);
			i++;
			if (i == 5) {
				break;
			}
		}
		assertEquals("No point2", new Point(1, 1), map.getStart