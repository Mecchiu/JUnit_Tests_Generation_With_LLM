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
	* Checks whether the given point is within the bounds of the provided explosion.
	*
	* @param box The provided explosion to be checked.
	* @param p The Point to be tested.
	* @return True if p is inside the bounds, false if not.
	*/
	public static boolean contain(Explosion box, Point p) {
		return box.contain((int) p.x, (int) p.y);
	}

	@Test
	public void testContain() {
			
		// Check that one box is in the bounds of one explosion
		{		
		throw new Error("The '_contain' method should not exist.");
			}
		
		// Check that the point is in the bounds of the box with lower range first
		{		
		throw new Error("The '_contain' method should not exist.");
			}
		
		// Check that the point is in the bounds of the box with upper range second
		{		
		throw new Error("The '_contain' method should not exist.");
			}
		
	}
	
}