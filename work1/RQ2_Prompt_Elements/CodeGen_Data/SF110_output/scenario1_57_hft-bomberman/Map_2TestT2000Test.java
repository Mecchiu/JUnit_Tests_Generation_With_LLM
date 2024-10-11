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
		* @since v2.0.1
		* @param args
		*/
	@Test(expected = IllegalStateException.class)
	public void testEmptyMap_1() {
		Map map = new Map(2, 2);
		Tile tile1 = map.getStartPoint(2);
		assertTrue("Missing startpoint!", tile1.equals(new Point(0, 0)));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = IllegalStateException.class)
	public void testSmallerMap_1() {
		Map map = new Map(2, 2);
		assertThrows(IllegalStateException.class, () -> map.getStartPoint(1));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = IllegalStateException.class)
	public void testSmallerMap_2() {
		Map map = new Map(2, 2);
		assertThrows(IllegalStateException.class, () -> map.getStartPoint(3));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = IllegalStateException.class)
	public void testTooSmallerMap_1() {
		Map map = new Map(2, 2);
		Tile tile1 = map.getStartPoint(0);
		assertFalse("Can't find startpoint!", tile1.equals(new Point(1, 1)));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = IllegalStateException.class)
	public void testTooSmallerMap_2() {
		Map map = new Map(2, 2);
		Tile tile1 = map.getStartPoint(0);
		Tile tile2 = map.getStartPoint(0);
		assertFalse("Can't find startpoint!", tile1.equals(tile2));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = NoSuchElementException.class)
	public void testTooSmallerMap_3() {
		Map map = new Map(2, 2);
		assertThrows(NoSuchElementException.class, () -> map.getStartPoint(3));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = NoSuchElementException.class)
	public void testTooSmallerMap_4() {
		Tower tower = new Tower(2, 2);
		assertThrows(NoSuchElementException.class, () -> tower.getStartPoint(3));
	}

	/**
	* @since v2.0.1
	* @param args
	*/
	@Test(expected = NoSuchElementException.class)
	public void testTooSmallerMap_5() {
		Vector vector = new Vector();
		vector.add(new Point(0, 0));
		vector.add(new Point(2, 0));
		vector.add(new Point(0, 2));
		vector.add(new Point(2, 2));
		assertThrows(NoSuchElementException.class, () -> vector.getStartPoint(3));
	}

}