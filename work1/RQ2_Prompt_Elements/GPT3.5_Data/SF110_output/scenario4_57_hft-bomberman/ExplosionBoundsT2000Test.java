// Here's an example implementation of the ExplosionBounds class and its test class:

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

    private int up;
    private int down;
    private int right;
    private int left;

    /**
     * Creates a new ExplosionBounds object. The four integer parameters define
     * the min/max pixel value in the given direction.
     *
     * @param up
     * @param down
     * @param right
     * @param left
     */
    public ExplosionBounds(int up, int down, int right, int left) {
        this.up = up;
        this.down = down;
        this.right = right;
        this.left = left;
    }

    public int getUp() {
        return up;
    }

    public int getDown() {
        return down;
    }

    public int getRight() {
        return right;
    }

    public int getLeft() {
        return left;
    }

    /**
     * Checks whether the given point lies within the bounds of the explosion.
     *
     * @param p The Point to be checked.
     * @return True if p lies within the bounds, false if not.
     */
    public boolean contain(Point p) {
        int x = p.x;
        int y = p.y;
        return x >= left && x <= right && y >= up && y <= down;
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
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        assertTrue(bounds.contain(new Point(20, 15)));
        assertTrue(bounds.contain(new Point(30, 20)));
        assertTrue(bounds.contain(new Point(40, 25)));
        assertTrue(bounds.contain(new Point(35, 10)));
        assertTrue(bounds.contain(new Point(25, 30)));
        assertFalse(bounds.contain(new Point(5, 15)));
        assertFalse(bounds.contain(new Point(20, 5)));
        assertFalse(bounds.contain(new Point(45, 25)));
        assertFalse(bounds.contain(new Point(35, 35)));
        assertFalse(bounds.contain(new Point(25, 5)));
    }
}