// RightAngleTriangleTest.java
package scenario1;

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
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
    }

    @Test
    void testRightAngleTriangle3() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void testRightAngleTriangle4() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(5, 12, 13));
    }

    @Test
    void testRightAngleTriangle5() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(6, 8, 10));
    }

    @Test
    void testRightAngleTriangle6() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(7, 24, 25));
    }

    @Test
    void testRightAngleTriangle7() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(8, 15, 17));
    }

    @Test
    void testRightAngleTriangle8() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(9, 10, 11));
    }

    @Test
    void testRightAngleTriangle9() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(20, 21, 22));
    }

    @Test
    void testRightAngleTriangle10() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(12, 16, 20));
    }
}