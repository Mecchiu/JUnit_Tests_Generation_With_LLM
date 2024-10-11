// TriangleArea1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains one unit test case for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

    /**
     * Testing {@link TriangleArea1#triangleArea(int, int, int)} method.
     */
    @Test
	public void testTriangleArea() {
		assertEquals(-1.0, new TriangleArea1().triangleArea(200, 100, 200));
	}

}