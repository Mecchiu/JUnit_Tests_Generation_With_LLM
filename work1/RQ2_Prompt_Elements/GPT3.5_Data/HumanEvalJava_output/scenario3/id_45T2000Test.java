// TriangleArea.java
package scenario3;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
    
    @Test
    void testTriangleArea() {
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
    }
    
    @Test
    void testTriangleAreaWithZero() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 3));
        assertEquals(0.0, TriangleArea.triangleArea(5, 0));
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }
    
    @Test
    void testTriangleAreaWithNegativeValues() {
        assertEquals(-7.5, TriangleArea.triangleArea(-5, 3));
        assertEquals(-7.5, TriangleArea.triangleArea(5, -3));
        assertEquals(7.5, TriangleArea.triangleArea(-5, -3));
    }
    
    @Test
    void testTriangleAreaWithLargeValues() {
        assertEquals(500000000.0, TriangleArea.triangleArea(1000000000, 1));
        assertEquals(1000000000.0, TriangleArea.triangleArea(1000000000, 2));
        assertEquals(5000000000.0, TriangleArea.triangleArea(1000000000, 10));
    }
    
    @Test
    void testTriangleAreaWithDecimalValues() {
        assertEquals(3.75, TriangleArea.triangleArea(3, 2.5));
        assertEquals(1.5, TriangleArea.triangleArea(1, 3));
        assertEquals(0.5, TriangleArea.triangleArea(0.5, 2));
    }
    
    @Test
    void testTriangleAreaWithLargeDecimalValues() {
        assertEquals(500000000.0, TriangleArea.triangleArea(1000000000, 0.5));
        assertEquals(1000000000.0, TriangleArea.triangleArea(1000000000, 1.0));
        assertEquals(5000000000.0, TriangleArea.triangleArea(1000000000, 5.0));
    }
    
    @Test
    void testTriangleAreaWithMaxValues() {
        assertEquals(Double.MAX_VALUE, TriangleArea.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
    
    @Test
    void testTriangleAreaWithMinValues() {
        assertEquals(0.0, TriangleArea.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
    
    @Test
    void testTriangleAreaWithOneValueZero() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 5));
        assertEquals(0.0, TriangleArea.triangleArea(5, 0));
    }
}