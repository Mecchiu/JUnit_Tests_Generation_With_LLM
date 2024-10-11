// TriangleAreaTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
			// Test case 1
    @Test
    void testTriangleArea1() {
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
    }

    // Test case 2
    @Test
    void testTriangleArea2() {
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
    }

    // Test case 3
    @Test
    void testTriangleArea3() {
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
    }

    // Test case 4
    @Test
    void testTriangleArea4() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }

    // Test case 5
    @Test
    void testTriangleArea5() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 5));
    }

    // Test case 6
    @Test
    void testTriangleArea6() {
        assertEquals(0.0, TriangleArea.triangleArea(5, 0));
    }

    // Test case 7
    @Test
    void testTriangleArea7() {
        assertEquals(0.0, TriangleArea.triangleArea(-5, 3));
    }

    // Test case 8
    @Test
    void testTriangleArea8() {
        assertEquals(0.0, TriangleArea.triangleArea(5, -3));
    }

    // Test case 9
    @Test
    void testTriangleArea9() {
        assertEquals(0.0, TriangleArea.triangleArea(-5, -3));
    }

    // Test case 10
    @Test
    void testTriangleArea10() {
        assertEquals(0.0, TriangleArea.triangleArea(5, 3));
    }
}