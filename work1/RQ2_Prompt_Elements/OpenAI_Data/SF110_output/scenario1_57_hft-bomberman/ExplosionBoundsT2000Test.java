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
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(15, 15);
		
		assertTrue(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies outside the bounds.
	*/
	@Test
	void testContain_PointOutsideBounds_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(25, 25);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the upper bound.
	*/
	@Test
	void testContain_PointOnUpperBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(15, 10);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the lower bound.
	*/
	@Test
	void testContain_PointOnLowerBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(15, 20);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the left bound.
	*/
	@Test
	void testContain_PointOnLeftBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(10, 15);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the right bound.
	*/
	@Test
	void testContain_PointOnRightBound_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(20, 15);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the upper left corner.
	*/
	@Test
	void testContain_PointOnUpperLeftCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(10, 10);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the upper right corner.
	*/
	@Test
	void testContain_PointOnUpperRightCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(20, 10);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the lower left corner.
	*/
	@Test
	void testContain_PointOnLowerLeftCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(10, 20);
		
		assertFalse(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies on the lower right corner.
	*/
	@Test
	void testContain_PointOnLowerRightCorner_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(20, 20);
		
		assertFalse(bounds.contain(p));
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
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns true for a point that lies within the bounds.
	*/
	@Test
	void testContain_PointWithinBounds_ReturnsTrue() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
		
		Point p = new Point(15, 15);
		
		assertTrue(bounds.contain(p));
	}
	
	/**
	* Test case for {@link ExplosionBounds#contain(Point)} method.
	* The test case checks if the method returns false for a point that lies outside the bounds.
	*/
	@Test
	void testContain_PointOutsideBounds_ReturnsFalse() {
		ExplosionBounds bounds = new ExplosionBounds();
		bounds.up = 10;
		bounds.down = 20;
		bounds.left = 10;
		bounds.right = 20;
