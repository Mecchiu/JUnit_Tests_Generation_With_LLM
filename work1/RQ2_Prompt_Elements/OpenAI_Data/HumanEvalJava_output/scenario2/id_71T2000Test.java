// TriangleArea1Test.java
package scenario2;


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
				assertEquals(6.0, TriangleArea1.triangleArea(5, 4, 3));
			}

			@Test
			void testTriangleArea3() {
				assertEquals(6.0, TriangleArea1.triangleArea(3, 5, 4));
			}

			@Test
			void testTriangleArea4() {
				assertEquals(6.0, TriangleArea1.triangleArea(4, 3, 5));
			}

			@Test
			void testTriangleArea5() {
				assertEquals(6.0, TriangleArea1.triangleArea(4, 5, 3));
			}

			@Test
			void testTriangleArea6() {
				assertEquals(6.0, TriangleArea1.triangleArea(5, 3, 4));
			}

			@Test
			void testTriangleArea7() {
				assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
			}

			@Test
			void testTriangleArea8() {
				assertEquals(-1, TriangleArea1.triangleArea(1, 3, 2));
			}

			@Test
			void testTriangleArea9() {
				assertEquals(-1, TriangleArea1.triangleArea(3, 1, 2));
			}

			@Test
			void testTriangleArea10() {
				assertEquals(-1, TriangleArea1.triangleArea(3, 2, 1));
			}
		}
