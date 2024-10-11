// TriangleAreaTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains one unit test case for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {

    /**
     * Test method of {@link TriangleArea#triangleArea(int, int)}.
     */
    @Test
    public void testTriangleArea() {
        //SystemProperties systemProperties = new SystemProperties();
       System.out.println(TriangleArea.triangleArea(10, 10));
    }
}