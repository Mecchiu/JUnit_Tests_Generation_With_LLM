// RightAngleTriangleTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
	// Test case 1
    @Test
    void testRightAngleTriangle1() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(3, 4, 5);
        assertTrue(result);
    }

    // Test case 2
    @Test
    void testRightAngleTriangle2() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(5, 3, 4);
        assertTrue(result);
    }

    // Test case 3
    @Test
    void testRightAngleTriangle3() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(4, 5, 3);
        assertTrue(result);
    }

    // Test case 4
    @Test
    void testRightAngleTriangle4() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(3, 3, 3);
        assertFalse(result);
    }

    // Test case 5
    @Test
    void testRightAngleTriangle5() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(3, 3, 5);
        assertFalse(result);
    }

    // Test case 6
    @Test
    void testRightAngleTriangle6() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(3, 5, 3);
        assertFalse(result);
    }

    // Test case 7
    @Test
    void testRightAngleTriangle7() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(5, 3, 3);
        assertFalse(result);
    }

    // Test case 8
    @Test
    void testRightAngleTriangle8() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(3, 4, 6);
        assertFalse(result);
    }

    // Test case 9
    @Test
    void testRightAngleTriangle9() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(3, 6, 4);
        assertFalse(result);
    }

    // Test case 10
    @Test
    void testRightAngleTriangle10() {
        Boolean result = RightAngleTriangle.rightAngleTriangle(6, 3, 4);
        assertFalse(result);
    }
}
