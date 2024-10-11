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
	 * @result The method returns the correct start point for player 1.
	 */
	@Test
	void testGetStartPoint1() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(1);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 2.
	 */
	@Test
	void testGetStartPoint2() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(2);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 3.
	 */
	@Test
	void testGetStartPoint3() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(3);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 4.
	 */
	@Test
	void testGetStartPoint4() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(4);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 5.
	 */
	@Test
	void testGetStartPoint5() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(5);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 6.
	 */
	@Test
	void testGetStartPoint6() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(6);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 7.
	 */
	@Test
	void testGetStartPoint7() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(7);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 8.
	 */
	@Test
	void testGetStartPoint8() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(8);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 9.
	 */
	@Test
	void testGetStartPoint9() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(9);
		assertEquals(new Point(1,1), startPoint);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)}
	 * 
	 * @result The method returns the correct start point for player 10.
	 */
	@Test
	void testGetStartPoint10() {
		Map map = new Map();
		Point startPoint = map.getStartPoint(10);
		assertEquals(new Point(1,1), startPoint);
	}
}