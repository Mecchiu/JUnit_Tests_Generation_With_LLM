// TriangleAreaTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
	// Test case 1: a = 0, h = 0
			@Test
			void testTriangleArea1() {
				Double expected = 0.0;
				Double actual = TriangleArea.triangleArea(0, 0);
				assertEquals(expected, actual);
			}
			
			// Test case 2: a = 1, h = 1
			@Test
			void testTriangleArea2() {
				Double expected = 0.5;
				Double actual = TriangleArea.triangleArea(1, 1);
				assertEquals(expected, actual);
			}
			
			// Test case 3: a = 2, h = 2
			@Test
			void testTriangleArea3() {
				Double expected = 2.0;
				Double actual = TriangleArea.triangleArea(2, 2);
				assertEquals(expected, actual);
			}
			
			// Test case 4: a = 3, h = 3
			@Test
			void testTriangleArea4() {
				Double expected = 4.5;
				Double actual = TriangleArea.triangleArea(3, 3);
				assertEquals(expected, actual);
			}
			
			// Test case 5: a = 4, h = 4
			@Test
			void testTriangleArea5() {
				Double expected = 8.0;
				Double actual = TriangleArea.triangleArea(4, 4);
				assertEquals(expected, actual);
			}
			
			// Test case 6: a = 5, h = 5
			@Test
			void testTriangleArea6() {
				Double expected = 12.5;
				Double actual = TriangleArea.triangleArea(5, 5);
				assertEquals(expected, actual);
			}
			
			// Test case 7: a = 6, h = 6
			@Test
			void testTriangleArea7() {
				Double expected = 18.0;
				Double actual = TriangleArea.triangleArea(6, 6);
				assertEquals(expected, actual);
			}
			
			// Test case 8: a = 7, h = 7
			@Test
			void testTriangleArea8() {
				Double expected = 24.5;
				Double actual = TriangleArea.triangleArea(7, 7);
				assertEquals(expected, actual);
			}
			
			// Test case 9: a = 8, h = 8
			@Test
			void testTriangleArea9() {
				Double expected = 32.0;
				Double actual = TriangleArea.triangleArea(8, 8);
				assertEquals(expected, actual);
			}
			
			// Test case 10: a = 9, h = 9
			@Test
			void testTriangleArea10() {
				Double expected = 40.5;
				Double actual = TriangleArea.triangleArea(9, 9);
				assertEquals(expected, actual);
			}
}
