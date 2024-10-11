// TriangleArea1.java
package scenario3;

class TriangleArea1 {

    /**
     * * Given the lengths of the three sides of a triangle. Return the area of
     * the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1
     * Three sides make a valid triangle when the sum of any two sides is greater
     * than the third side.
     * Example:
     * triangle_area(3, 4, 5) == 6.00
     * triangle_area(1, 2, 10) == -1
     *
     * > triangleArea(3, 4, 5)
     * 6.0
     * > triangleArea(1, 2, 10)
     * -1
     * > triangleArea(4, 8, 5)
     * 8.18
     * > triangleArea(2, 2, 2)
     * 1.73
     * > triangleArea(1, 2, 3)
     * -1
     * > triangleArea(10, 5, 7)
     * 16.25
     * > triangleArea(2, 6, 3)
     * -1
     * > triangleArea(1, 1, 1)
     * 0.43
     * > triangleArea(2, 2, 10)
     * -1
     */
    public static double triangleArea(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return Math.round(area * 100.0) / 100.0;
        } else {
            return -1;
        }
    }
}

// TriangleArea1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains ten unit test cases for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {
    @Test
    void testTriangleArea1() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
    }

    @Test
    void testTriangleArea2() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 10));
    }

    @Test
    void testTriangleArea3() {
        assertEquals(8.18, TriangleArea1.triangleArea(4, 8, 5));
    }

    @Test
    void testTriangleArea4() {
        assertEquals(1.73, TriangleArea1.triangleArea(2, 2, 2));
    }

    @Test
    void testTriangleArea5() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
    }

    @Test
    void testTriangleArea6() {
        assertEquals(16.25, TriangleArea1.triangleArea(10, 5, 7));
    }

    @Test
    void testTriangleArea7() {
        assertEquals(-1, TriangleArea1.triangleArea(2, 6, 3));
    }

    @Test
    void testTriangleArea8() {
        assertEquals(0.43, TriangleArea1.triangleArea(1, 1, 1));
    }

    @Test
    void testTriangleArea9() {
        assertEquals(-1, TriangleArea1.triangleArea(2, 2, 10));
    }

    @Test
    void testTriangleArea10() {
        assertEquals(-1, TriangleArea1.triangleArea(0, 0, 0));
    }
}