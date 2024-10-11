// Here's an example implementation of the ExplosionBoundsTest class:

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
        // Test case 1: Point is within bounds
        ExplosionBounds bounds = new ExplosionBounds(0, 10, 0, 10);
        Point p = new Point(5, 5);
        assertTrue(bounds.contain(p));

        // Test case 2: Point is outside bounds
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(15, 15);
        assertFalse(bounds.contain(p));

        // Test case 3: Point is on upper bound
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(5, 0);
        assertTrue(bounds.contain(p));

        // Test case 4: Point is on lower bound
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(5, 10);
        assertTrue(bounds.contain(p));

        // Test case 5: Point is on left bound
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(0, 5);
        assertTrue(bounds.contain(p));

        // Test case 6: Point is on right bound
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(10, 5);
        assertTrue(bounds.contain(p));

        // Test case 7: Point is on upper left corner
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(0, 0);
        assertTrue(bounds.contain(p));

        // Test case 8: Point is on upper right corner
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(10, 0);
        assertTrue(bounds.contain(p));

        // Test case 9: Point is on lower left corner
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(0, 10);
        assertTrue(bounds.contain(p));

        // Test case 10: Point is on lower right corner
        bounds = new ExplosionBounds(0, 10, 0, 10);
        p = new Point(10, 10);
        assertTrue(bounds.contain(p));
    }
}