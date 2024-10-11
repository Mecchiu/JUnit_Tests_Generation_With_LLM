// TriangleArea1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains ten unit test cases for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {
	// Test case 1: Negative side length
    @Test
    void testTriangleArea1() {
        assertEquals(-1, TriangleArea1.triangleArea(-1, 2, 3));
    }

    // Test case 2: Negative side length
    @Test
    void testTriangleArea2() {
        assertEquals(-1, TriangleArea1.triangleArea(1, -2, 3));
    }

    // Test case 3: Negative side length
    @Test
    void testTriangleArea3() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, -3));
    }

    // Test case 4: Zero side length
    @Test
    void testTriangleArea4() {
        assertEquals(-1, TriangleArea1.triangleArea(0, 2, 3));
    }

    // Test case 5: Zero side length
    @Test
    void testTriangleArea5() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 0, 3));
    }

    // Test case 6: Zero side length
    @Test
    void testTriangleArea6() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 0));
    }

    // Test case 7: Impossible triangle
    @Test
    void testTriangleArea7() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
    }

    // Test case 8: Impossible triangle
    @Test
    void testTriangleArea8() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 3, 2));
    }

    // Test case 9: Impossible triangle
    @Test
    void testTriangleArea9() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 1, 2));
    }

    // Test case 10: Valid triangle
    @Test
    void testTriangleArea10() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
    }
}
