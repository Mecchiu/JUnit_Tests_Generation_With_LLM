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
	 * Test of contain method, of class ExplosionBounds.
	 */
	@Test
	void testContain() {
		System.out.println("contain");
		ExplosionBounds instance = new ExplosionBounds();
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		Point p = new Point(5, 5);
		boolean expResult = true;
		boolean result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(0, 0);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(10, 10);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(0, 10);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(10, 0);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(5, 0);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(5, 10);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(0, 5);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(10, 5);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(11, 5);
		expResult = false;
		result = instance.contain(p);
		assertEquals(expResult, result);
	}
}