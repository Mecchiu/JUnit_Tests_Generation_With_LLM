// RightAngleTriangle.java
package scenario3;

class RightAngleTriangle {

    /**
     * Given the lengths of the three sides of a triangle. Return True if the three
     * sides form a right-angled triangle, False otherwise.
     * A right-angled triangle is a triangle in which one angle is right angle or
     * 90 degree.
     * Example:
     * rightAngleTriangle(3, 4, 5) == True
     * rightAngleTriangle(1, 2, 3) == False
     *
     * > rightAngleTriangle(3, 4, 5)
     * true
     * > rightAngleTriangle(1, 2, 3)
     * false
     * > rightAngleTriangle(10, 6, 8)
     * true
     * > rightAngleTriangle(2, 2, 2)
     * false
     * > rightAngleTriangle(7, 24, 25)
     * true
     * > rightAngleTriangle(10, 5, 7)
     * false
     * > rightAngleTriangle(5, 12, 13)
     * true
     * > rightAngleTriangle(15, 8, 17)
     * true
     * > rightAngleTriangle(48, 55, 73)
     * true
     * > rightAngleTriangle(1, 1, 1)
     * false
     * > rightAngleTriangle(2, 2, 10)
     * false
     */
    public static Boolean rightAngleTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        return (sum - max) > max && (a * a + b * b + c * c - max * max) == max * max;
    }
}

// RightAngleTriangleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
    @Test
    void testRightAngleTriangle1() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
    }

    @Test
    void testRightAngleTriangle2() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void testRightAngleTriangle3() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(10, 6, 8));
    }

    @Test
    void testRightAngleTriangle4() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 2));
    }

    @Test
    void testRightAngleTriangle5() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(7, 24, 25));
    }

    @Test
    void testRightAngleTriangle6() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(10, 5, 7));
    }

    @Test
    void testRightAngleTriangle7() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 12, 13));
    }

    @Test
    void testRightAngleTriangle8() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(15, 8, 17));
    }

    @Test
    void testRightAngleTriangle9() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(48, 55, 73));
    }

    @Test
    void testRightAngleTriangle10() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 1, 1));
    }

    @Test
    void testRightAngleTriangle11() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 10));
    }
}