// TriangleAreaTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
	// Test case 1: a = 0, h = 0
    @Test
    void testTriangleArea1() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }

    // Test case 2: a = 1, h = 0
    @Test
    void testTriangleArea2() {
        assertEquals(0.0, TriangleArea.triangleArea(1, 0));
    }

    // Test case 3: a = 0, h = 1
    @Test
    void testTriangleArea3() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 1));
    }

    // Test case 4: a = 1, h = 1
    @Test
    void testTriangleArea4() {
        assertEquals(0.5, TriangleArea.triangleArea(1, 1));
    }

    // Test case 5: a = 2, h = 1
    @Test
    void testTriangleArea5() {
        assertEquals(1.0, TriangleArea.triangleArea(2, 1));
    }

    // Test case 6: a = 1, h = 2
    @Test
    void testTriangleArea6() {
        assertEquals(1.0, TriangleArea.triangleArea(1, 2));
    }

    // Test case 7: a = 2, h = 2
    @Test
    void testTriangleArea7() {
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
    }

    // Test case 8: a = 3, h = 2
    @Test
    void testTriangleArea8() {
        assertEquals(3.0, TriangleArea.triangleArea(3, 2));
    }

    // Test case 9: a = 2, h = 3
    @Test
    void testTriangleArea9() {
        assertEquals(3.0, TriangleArea.triangleArea(2, 3));
    }

    // Test case 10: a = 3, h = 3
    @Test
    void testTriangleArea10() {
        assertEquals(4.5, TriangleArea.triangleArea(3, 3));
    }
}
