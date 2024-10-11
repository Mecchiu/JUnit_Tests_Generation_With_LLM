// Map_0Test.java
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
* It contains one unit test case for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {
		
	/**
	 * Constructor.
	 */
	public Map_0Test() {}

	/**
	 * Test of getTileByIndex(int, int).
	 */
	@Test
	void testGetTileByIndexIntInt() {
		System.out.println("Test of getTile by index and inint");

		//System.out.println("MapName=" + Map.this);
		Map map = new Map();
		Vector vec = new Vector();
		Point point = new Point();
		Point point2 = new Point();

		map.setName("Test2");
		map.setVersion("Test2Version");
		map.setStartPoints(new Point[] { new Point(), new Point() });

		//map.setStartPoints(new Point[] { new Point(), new Point()
}
}