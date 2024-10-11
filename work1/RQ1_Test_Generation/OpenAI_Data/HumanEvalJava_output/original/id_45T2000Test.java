// TriangleAreaTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
	// Test case 1: a = 5, h = 3
			@Test
			void testTriangleArea1() {
				assertEquals(7.5, TriangleArea.triangleArea(5, 3));
			}
			
			// Test case 2: a = 2, h = 2
			@Test
			void testTriangleArea2() {
				assertEquals(2.0, TriangleArea.triangleArea(2, 2));
			}
			
			// Test case 3: a = 10, h = 8
			@Test
			void testTriangleArea3() {
				assertEquals(40.0, TriangleArea.triangleArea(10, 8));
			}
			
			// Test case 4: a = 0, h = 0
			@Test
			void testTriangleArea4() {
				assertEquals(0.0, TriangleArea.triangleArea(0, 0));
			}
			
			// Test case 5: a = 1, h = 1
			@Test
			void testTriangleArea5() {
				assertEquals(0.5, TriangleArea.triangleArea(1, 1));
			}
			
			// Test case 6: a = 2, h = 4
			@Test
			void testTriangleArea6() {
				assertEquals(4.0, TriangleArea.triangleArea(2, 4));
			}
			
			// Test case 7: a = 3, h = 6
			@Test
			void testTriangleArea7() {
				assertEquals(9.0, TriangleArea.triangleArea(3, 6));
			}
			
			// Test case 8: a = 4, h = 8
			@Test
			void testTriangleArea8() {
				assertEquals(16.0, TriangleArea.triangleArea(4, 8));
			}
			
			// Test case 9: a = 5, h = 10
			@Test
			void testTriangleArea9() {
				assertEquals(25.0, TriangleArea.triangleArea(5, 10));
			}
			
			// Test case 10: a = 6, h = 12
			@Test
			void testTriangleArea10() {
				assertEquals(36.0, TriangleArea.triangleArea(6, 12));
			}
}