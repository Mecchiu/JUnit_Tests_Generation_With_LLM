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
		
	private Point pFromClient;

	@Test
	void test1() {
		assertTrue(pFromClient.x() <= 2);
		assertTrue(pFromClient.x() >= 0);
		assertTrue(pFromClient.y() <= 2);
		assertTrue(pFromClient.y() >= 0);
	}

	@Test
	void test2() {
		assertTrue(pFromClient.x() > 2);
		assertTrue(pFromClient.x() <= 0);
		assertTrue(pFromClient.y() > 2);
		assertTrue(pFromClient.y() <= 0);
	}

	@Test
	void test3() {
		assertTrue(pFromClient.x() < pFromClient.y());
		assertTrue(pFromClient.x() > pFromClient.y());
		assertTrue(pFromClient.x() <= pFromClient.y());
		assertTrue(pFromClient.x() > pFromClient.y());
		assertTrue(pFromClient.y() <= pFromClient.x());
		assertTrue(pFromClient.y() > pFromClient.x());
		assertTrue(pFromClient.x() == pFromClient.y());
	}
}