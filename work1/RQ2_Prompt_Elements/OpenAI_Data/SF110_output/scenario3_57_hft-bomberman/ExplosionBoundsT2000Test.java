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
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies within the bounds.
	 */
	@Test
	void testContain_PointWithinBounds_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(0, 0);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns false for a point that lies outside the bounds.
	 */
	@Test
	void testContain_PointOutsideBounds_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(1, 1);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the upper bound.
	 */
	@Test
	void testContain_PointOnUpperBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(0, 1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the lower bound.
	 */
	@Test
	void testContain_PointOnLowerBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(0, -1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the left bound.
	 */
	@Test
	void testContain_PointOnLeftBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(-1, 0);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the right bound.
	 */
	@Test
	void testContain_PointOnRightBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(1, 0);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the upper left bound.
	 */
	@Test
	void testContain_PointOnUpperLeftBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(-1, 1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the upper right bound.
	 */
	@Test
	void testContain_PointOnUpperRightBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(1, 1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the lower left bound.
	 */
	@Test
	void testContain_PointOnLowerLeftBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(-1, -1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the lower right bound.
	 */
	@Test
	void testContain_PointOnLowerRightBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(1, -1);
		assertTrue(bounds.contain(p));
	}
}

// ExplosionBounds.java
package server;

import java.awt.Point;

/**
 * This class is used by the server to define the bounds of a bomb explosion.
 * It contains four integer fields indicating the min/max pixel value
 * in the given direction that is affected by the explosion. It further offers
 * a method to test if a given point lies within the defined bounds.
 *
 * @author Steffen
 */
public class ExplosionBounds {

    /**
     * Checks whether the given point lies within the bounds of the explosion.
     *
     * @param p The Point to be checked.
     * @return True if p lies within the bounds, false if not.
     */
    public boolean contain(Point p) {
        return p.x >= left && p.x <= right && p.y >= top && p.y <= bottom;
    }
}

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
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies within the bounds.
	 */
	@Test
	void testContain_PointWithinBounds_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(0, 0);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns false for a point that lies outside the bounds.
	 */
	@Test
	void testContain_PointOutsideBounds_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(1, 1);
		assertFalse(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the upper bound.
	 */
	@Test
	void testContain_PointOnUpperBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(0, 1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionBounds#contain(Point)}.
	 * It tests if the method returns true for a point that lies on the lower bound.
	 */
	@Test
	void testContain_PointOnLowerBound_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		Point p = new Point(0, -1);
		assertTrue(bounds.contain(p));
	}
	
	/**
	 * Test case for {@link ExplosionB