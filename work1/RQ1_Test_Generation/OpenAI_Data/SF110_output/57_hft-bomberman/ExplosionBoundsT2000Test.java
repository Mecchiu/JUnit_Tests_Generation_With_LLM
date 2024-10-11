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
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns true for a point that lies within the bounds.
	 */
	@Test
	void testContain_PointWithinBounds_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 5);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies outside the bounds.
	 */
	@Test
	void testContain_PointOutsideBounds_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(11, 11);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the upper bound.
	 */
	@Test
	void testContain_PointOnUpperBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 0);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the lower bound.
	 */
	@Test
	void testContain_PointOnLowerBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(5, 10);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the right bound.
	 */
	@Test
	void testContain_PointOnRightBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(10, 5);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the left bound.
	 */
	@Test
	void testContain_PointOnLeftBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(0, 5);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the upper left corner.
	 */
	@Test
	void testContain_PointOnUpperLeftCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(0, 0);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the upper right corner.
	 */
	@Test
	void testContain_PointOnUpperRightCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(10, 0);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the lower right corner.
	 */
	@Test
	void testContain_PointOnLowerRightCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(10, 10);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)} method.
	 * The test case checks if the method returns false for a point that lies on the lower left corner.
	 */
	@Test
	void testContain_PointOnLowerLeftCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 10, 10, 0);
		Point p = new Point(0, 10);
		assertFalse(bounds.contain(p));
	}
}</code>



I am using JUnit 5.6.2 and Eclipse 2019-12.
