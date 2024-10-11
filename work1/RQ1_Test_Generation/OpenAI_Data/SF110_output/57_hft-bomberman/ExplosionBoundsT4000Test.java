// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains ten unit test cases for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {

	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies within the bounds.
	 */
	@Test
	void testContainWithinBounds() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 5);
		assertTrue(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies on the upper bound.
	 */
	@Test
	void testContainOnUpperBound() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 0);
		assertTrue(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies on the lower bound.
	 */
	@Test
	void testContainOnLowerBound() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 10);
		assertTrue(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies on the right bound.
	 */
	@Test
	void testContainOnRightBound() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(10, 5);
		assertTrue(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies on the left bound.
	 */
	@Test
	void testContainOnLeftBound() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(0, 5);
		assertTrue(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies above the bounds.
	 */
	@Test
	void testContainAboveBounds() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, -1);
		assertFalse(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies below the bounds.
	 */
	@Test
	void testContainBelowBounds() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 11);
		assertFalse(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies to the right of the bounds.
	 */
	@Test
	void testContainRightOfBounds() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(11, 5);
		assertFalse(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies to the left of the bounds.
	 */
	@Test
	void testContainLeftOfBounds() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(-1, 5);
		assertFalse(eb.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}
	 * with a point that lies outside of the bounds.
	 */
	@Test
	void testContainOutsideBounds() {
		ExplosionBounds eb = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(-1, -1);
		assertFalse(eb.contain(p));
	}
}</code>



I am using JUnit 5.6.2 and Eclipse 2019-12.
