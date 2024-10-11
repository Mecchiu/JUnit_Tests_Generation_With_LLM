// TriangleAreaTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains one unit test case for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
/**
	 * Contains one unit test case for {@link TriangleArea#triangleArea(int, int)}.
	 */
	@Test
	public void testTriangleArea() {
		int a = 1;
		int h = 4;
		double expected = triangleArea(a, h);
		Double result = TriangleArea.triangleArea(a, h);
		assertEquals(expected, result, 0.0000001); // (0.0000001 = 0.00001 * 2 = 0.001 * 4)
	}
}