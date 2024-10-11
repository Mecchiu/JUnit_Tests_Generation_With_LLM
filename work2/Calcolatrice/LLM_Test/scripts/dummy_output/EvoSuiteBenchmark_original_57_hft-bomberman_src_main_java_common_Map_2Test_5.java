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
		
	private final Map map;
	
	/**
	 * Creates map with or without Tile objects
	 * 
	 * @param xmlFile
	 */
	public Map_2Test(String xmlFile) {
		map = new Map(xmlFile);
	}
	
	/**
	 * create a start-point for start-of-game
	 */
	public Point getStartPoint(int playerNo) {
		assertTrue(playerNo > 1);
		Point point = new Point(0, 0);
		return point;
	}
	
	@Test
	public void testGetStartPoints() {
		Point[] points = map.getStartPoints();
		assertTrue(points.length > 0);
	}
	
	/**
	 * Returns array of start-points
	 */
}