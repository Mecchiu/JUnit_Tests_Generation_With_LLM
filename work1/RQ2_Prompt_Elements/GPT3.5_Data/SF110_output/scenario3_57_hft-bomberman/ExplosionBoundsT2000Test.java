// Here's an example implementation of the ExplosionBounds class and its test class:

// ExplosionBounds.java
package server;

import java.awt.Point;

public class ExplosionBounds {

    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public ExplosionBounds(int minX, int maxX, int minY, int maxY) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    public boolean contain(Point p) {
        return p.x >= minX && p.x <= maxX && p.y >= minY && p.y <= maxY;
    }
}

// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExplosionBoundsTest {

    @Test
    void testContain() {
        ExplosionBounds bounds = new ExplosionBounds(0, 10, 0, 10);
        assertTrue(bounds.contain(new Point(5, 5)));
        assertTrue(bounds.contain(new Point(0, 0)));
        assertTrue(bounds.contain(new Point(10, 10)));
        assertFalse(bounds.contain(new Point(-1, 5)));
        assertFalse(bounds.contain(new Point(5, -1)));
        assertFalse(bounds.contain(new Point(11, 5)));
        assertFalse(bounds.contain(new Point(5, 11)));
        assertFalse(bounds.contain(new Point(11, 11)));
        assertFalse(bounds.contain(new Point(-1, -1)));
        assertFalse(bounds.contain(new Point(11, 11)));
    }
}