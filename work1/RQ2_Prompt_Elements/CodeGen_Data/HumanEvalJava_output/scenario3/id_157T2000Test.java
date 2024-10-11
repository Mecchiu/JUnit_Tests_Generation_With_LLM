// RightAngleTriangleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains one unit test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
/**
		 * Unit test for {@link RightAngleTriangle#rightAngleTriangle(int, int, int)}.
		 */
		@Test
		public void testRightAngleTriangle() {
						RightAngleTriangle Test = new RightAngleTriangle();
						Boolean result = Test.rightAngleTriangle(1, 1, 1);

						assertTrue(result);

		}
}
