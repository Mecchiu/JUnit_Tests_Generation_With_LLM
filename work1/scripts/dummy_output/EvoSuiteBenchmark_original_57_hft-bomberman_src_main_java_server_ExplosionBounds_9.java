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
		
	private static final ExplosionBounds BOUNDS = new ExplosionBounds();

    static void assertHit(Point hit, int value) {
        assertEquals(hit, BOUNDS.contain(hit));
    }

	static void assertNotHit(Point hit, int value) {
		assertFalse(BOUNDS.contain(hit));
	}

    /**
     * The test is run in this unit test case
     *
     * @throws Exception if any error occurs
     */
    @Test
    public void testContainTest() throws Exception {
         
	Point p1 = new Point(10, 20);
	Point p2 = new Point(10, 30);
	Point p3 = new Point(20, 30);
	Point p4 = new Point(20, 20);
	
	// Tests contain(p1, p2);
	assertHit(p1, BOUNDS.getUp());
	assertHit(p2, BOUNDS.getUp());
	assertHit(p3, BOUNDS.getUp());
	assertHit(p4, BOUNDS.getUp());
	assertNotHit(p2, BOUNDS.getUp());
	assertNotHit(p4, BOUNDS.getDown());

	// Tests contain(p1, p3);
	assertHit(p1, BOUNDS.getDown());
	assertHit(p3, BOUNDS.getDown());
	
	// Tests contain(p2, p3);
	assertHit(p2, BOUNDS.getDown());
	assertHit(p3, BOUNDS.getDown());
	
	// Tests contain(p1, p4);
	assertHit(p1, BOUNDS.getRight());
	assertHit(p4, BOUNDS.getRight());
	
	// Tests contain(p2, p4);
	assertHit(p2, BOUNDS.getRight());
	assertHit(p4, BOUNDS.getRight());
}
}