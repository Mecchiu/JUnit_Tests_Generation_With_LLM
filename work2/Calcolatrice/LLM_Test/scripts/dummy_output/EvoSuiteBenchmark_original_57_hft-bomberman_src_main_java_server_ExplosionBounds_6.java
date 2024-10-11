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
		
	@Test
	void contains(Point p) {
		assertTrue(new ExplosionBounds(0, 0, 0, 0)
				.contain(p));
		assertTrue(new ExplosionBounds(0, 0, 0, 0,
				new Rectangle(0, 0, 4, 4))
				.contain(p));

		assertFalse(new ExplosionBounds(1, 1, 1, 1)
				.contain(p));
		assertFalse(new ExplosionBounds(1, 1, 2, 1)
				.contain(p));
	}

	@Test
	void checkDown() {
		assertTrue(new ExplosionBounds(0, 0, 0, 0).checkDown());
		assertFalse(new ExplosionBounds(0, 0, 0, 0, false).checkDown());
	}

	@Test
	void checkRight() {
		assertTrue(new ExplosionBounds(0, 0, 0, 0).checkRight());
		assertFalse(new ExplosionBounds(0, 0, 0, 0, false).checkRight());
	}

	@Test
	void checkLeft() {
		assertTrue(new ExplosionBounds(0, 0, 0, 0).checkLeft());
		assertFalse(new ExplosionBounds(0, 0, 0, 0, false).checkLeft());
	}

	@Test
	void testGetCenterOfMass() {
		assertEquals(new Point(1, 0), new ExplosionBounds(1, 0, 0, 0).getCenterOfMass());
		assertEquals(new Point(0, 1), new ExplosionBounds(0, 1, 0, 0).getCenterOfMass());
		assertEquals(new Point(0, 0), new ExplosionBounds(0, 0, 0, 0).getCenterOfMass());

		assertEquals(new Point(0, 0), new ExplosionBounds()
				.setUp(-3, -5, -2).getCenterOfMass());
		assertEquals(new Point(0, -1), new ExplosionBounds()
				.setUp(-6, -7, -5).getCenterOfMass());
		assertEquals(new Point(-3, -2), new ExplosionBounds()
				.setUp(-1, -2, -4).getCenterOfMass());
		assertEquals(new Point(-2, -5), new ExplosionBounds()
				.setDown(-4, -5, -1).getCenterOfMass());
		assertEquals(new Point(-4, 4), new ExplosionBounds()
				.setDown(-8, 6, -2).getCenterOfMass());
		assertEquals(new Point(-6, 7), new ExplosionBounds()
				.setDown(-1, 2, 1).getCenterOfMass());
	}
}