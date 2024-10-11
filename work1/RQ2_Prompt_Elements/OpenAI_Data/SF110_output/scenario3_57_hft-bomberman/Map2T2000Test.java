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
* It contains ten unit test cases for the {@link Map#getStartPoint(int)} method.
*/
class MapTest {

	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint() {
		Map map = new Map();
		Point point = map.getStartPoint(1);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint2() {
		Map map = new Map();
		Point point = map.getStartPoint(2);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint3() {
		Map map = new Map();
		Point point = map.getStartPoint(3);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint4() {
		Map map = new Map();
		Point point = map.getStartPoint(4);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint5() {
		Map map = new Map();
		Point point = map.getStartPoint(5);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint6() {
		Map map = new Map();
		Point point = map.getStartPoint(6);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint7() {
		Map map = new Map();
		Point point = map.getStartPoint(7);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint8() {
		Map map = new Map();
		Point point = map.getStartPoint(8);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint9() {
		Map map = new Map();
		Point point = map.getStartPoint(9);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the coordinates of the start point of the player.
	 */
	@Test
	void testGetStartPoint10() {
		Map map = new Map();
		Point point = map.getStartPoint(10);
		assertEquals(point.x, 1);
		assertEquals(point.y, 1);
	}
}