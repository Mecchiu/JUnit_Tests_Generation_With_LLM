// RightAngleTriangleTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains one unit test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {

    /**
     * Test of rightAngleTriangleWithException method, of class RightAngleTriangle.
     */
    @Test
    void testRightAngleTriangleWithException()throws java.lang.IndexOutOfBoundsException{
        System.out.println("RightAngleTriangleTest.testRightAngleTriangleWithException");
        Integer a = new Integer(0);
        Integer b = new Integer(0);
        Integer c = new Integer(1);
        try {
            RightAngleTriangle.rightAngleTriangle(a.intValue(), b.intValue(), c.intValue());
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Passed");
        }

    }
}

