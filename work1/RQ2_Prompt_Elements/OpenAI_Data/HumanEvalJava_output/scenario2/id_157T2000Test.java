// RightAngleTriangleTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
	@Test
			void testRightAngleTriangle() {
				// Test case 1
				assertEquals(true, RightAngleTriangle.rightAngleTriangle(3, 4, 5));
				// Test case 2
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(3, 4, 6));
				// Test case 3
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(3, 4, 4));
				// Test case 4
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(3, 3, 3));
				// Test case 5
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(3, 3, 5));
				// Test case 6
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(3, 5, 3));
				// Test case 7
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(5, 3, 3));
				// Test case 8
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(3, 5, 5));
				// Test case 9
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(5, 3, 5));
				// Test case 10
				assertEquals(false, RightAngleTriangle.rightAngleTriangle(5, 5, 3));
			}
		}
