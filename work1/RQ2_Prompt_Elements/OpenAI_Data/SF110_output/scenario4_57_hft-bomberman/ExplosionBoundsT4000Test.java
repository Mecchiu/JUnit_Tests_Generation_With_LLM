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

	@Test
	void testContain() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 0, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 0, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 0, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
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
		
	@Test
	void testContain() {
		ExplosionBounds bounds = new ExplosionBounds(0, 0, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 0, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 0, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 0, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(0, 1, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertFalse(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 0, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertFalse(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 0, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 0, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.contain(new Point(1, 0)));
		assertFalse(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 1, 0);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertFalse(bounds.contain(new Point(1, 0)));
		assertTrue(bounds.contain(new Point(0, 1)));
		assertTrue(bounds.contain(new Point(-1, 0)));
		assertTrue(bounds.contain(new Point(0, -1)));
		
		bounds = new ExplosionBounds(1, 1, 1, 1);
		assertTrue(bounds.contain(new Point(0, 0)));
		assertTrue(bounds.cont