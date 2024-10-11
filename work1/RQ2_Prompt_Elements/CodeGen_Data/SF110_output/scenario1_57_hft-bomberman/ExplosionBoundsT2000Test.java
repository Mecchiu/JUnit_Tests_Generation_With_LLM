// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains one unit test case for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {

	/**
	* This class is a unit test of {@link ExplosionBounds}.
	* It is designed to catch bugs during unit testing.
  */
    @Test
    void canContainPoint() {
    	Point p = new Point(5, 5);

    	p.y = 10;
		assertFalse("A point with y set to a non-numeric value should be refused", p.contain(p));
			
		p.y = -5; // This is equivalent to p.miny = 0 and p.maxy = 2.
		assertFalse("A point with y set to a numeric value should be refused", p.contain(p));
		
		p.y = 2.1; // Since this isn't an integer, 0.1 should still be considered "not within range".
		assertTrue("A point which needs to be within range values should be accepted", p.contain(p));
		
		p.y = 0.5;
		assertTrue("A point should not be checked if y has a zeroden value", p.contain(p)); // Even though 2y == zeros should not be checked
    } 
 
}