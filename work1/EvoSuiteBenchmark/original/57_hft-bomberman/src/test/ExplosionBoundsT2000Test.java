```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Point;

class ExplosionBoundsTest {

    @Test
    void testContain_PointInsideBounds_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point insidePoint = new Point(30, 30);
        assertTrue(bounds.contain(insidePoint));
    }

    @Test
    void testContain_PointOutsideBounds_ReturnsFalse() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point outsidePoint = new Point(70, 70);
        assertFalse(bounds.contain(outsidePoint));
    }

    @Test
    void testContain_PointOnUpperBound_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point upperBoundPoint = new Point(30, 10);
        assertTrue(bounds.contain(upperBoundPoint));
    }

    @Test
    void testContain_PointOnLowerBound_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point lowerBoundPoint = new Point(30, 50);
        assertTrue(bounds.contain(lowerBoundPoint));
    }

    @Test
    void testContain_PointOnRightBound_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point rightBoundPoint = new Point(60, 30);
        assertTrue(bounds.contain(rightBoundPoint));
    }

    @Test
    void testContain_PointOnLeftBound_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point leftBoundPoint = new Point(20, 30);
        assertTrue(bounds.contain(leftBoundPoint));
    }

    @Test
    void testContain_PointOnUpperRightCorner_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point upperRightCornerPoint = new Point(60, 10);
        assertTrue(bounds.contain(upperRightCornerPoint));
    }

    @Test
    void testContain_PointOnUpperLeftCorner_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point upperLeftCornerPoint = new Point(20, 10);
        assertTrue(bounds.contain(upperLeftCornerPoint));
    }

    @Test
    void testContain_PointOnLowerRightCorner_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point lowerRightCornerPoint = new Point(60, 50);
        assertTrue(bounds.contain(lowerRightCornerPoint));
    }

    @Test
    void testContain_PointOnLowerLeftCorner_ReturnsTrue() {
        ExplosionBounds bounds = new ExplosionBounds(10, 50, 60, 20);
        Point lowerLeftCornerPoint = new Point(20, 50);
        assertTrue(bounds.contain(lowerLeftCornerPoint));
    }
}
```
