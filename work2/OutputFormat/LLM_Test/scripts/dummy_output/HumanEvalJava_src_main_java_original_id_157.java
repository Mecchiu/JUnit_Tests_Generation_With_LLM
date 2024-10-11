// RightAngleTriangleTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
			@Test
			void testRightAngleTriangle1() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(3, 4, 5);
				assertTrue(result);
			}

			@Test
			void testRightAngleTriangle2() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(1, 2, 3);
				assertFalse(result);
			}

			@Test
			void testRightAngleTriangle3() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(10, 6, 8);
				assertTrue(result);
			}

			@Test
			void testRightAngleTriangle4() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(2, 2, 2);
				assertFalse(result);
			}

			@Test
			void testRightAngleTriangle5() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(7, 24, 25);
				assertTrue(result);
			}

			@Test
			void testRightAngleTriangle6() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(10, 5, 7);
				assertFalse(result);
			}

			@Test
			void testRightAngleTriangle7() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(5, 12, 13);
				assertTrue(result);
			}

			@Test
			void testRightAngleTriangle8() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(15, 8, 17);
				assertTrue(result);
			}

			@Test
			void testRightAngleTriangle9() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(48, 55, 73);
				assertTrue(result);
			}

			@Test
			void testRightAngleTriangle10() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(1, 1, 1);
				assertFalse(result);
			}

			@Test
			void testRightAngleTriangle11() {
				Boolean result = RightAngleTriangle.rightAngleTriangle(2, 2, 10);
				assertFalse(result);
			}
}