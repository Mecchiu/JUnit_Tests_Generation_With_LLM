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
	 * @throws java.lang.AssertionError
	 * System.out.println("Error message!");
	 */
	@Test
	public void getTileByIndexTest() {
		// Test for method getTileByIndex(int, int)
		// Assert.assertEquals("getTileByIndex: return value does not match expected",
		// "EmptyTile", getTileByIndex(1, 2));
		Map map = new Map(":/maps/Map_0.xml");
		assertSame(map, map.getTileByIndex(0, 0));
	}

	/**
	 * @throws java.lang.AssertionError
	 * System.out.println("Error message!");
	 */
}