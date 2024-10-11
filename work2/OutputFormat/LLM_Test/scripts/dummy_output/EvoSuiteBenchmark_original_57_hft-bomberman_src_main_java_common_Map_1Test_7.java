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
		
	@Test
	public void test_GetTile_1() {
		
		//test for invalid args
		boolean valid = false;
		try {
			
			//test for invalid tile size
			Map.getTile(0, 1);
			valid = false;
		} catch (NullPointerException npe) {
			valid = true;
		}
		
		assertTrue(valid);
		
//		//test valid tile
//		valid = false;
//		Rectangle r = new Rectangle();
//		Point p1 = new Point(1, 1);
//		Point p2 = new Point(2, 1);
//		Tile tile = new Tile(r, p1.x, p1.y);
//		Point p3 = new Point(1, 2);
}
}