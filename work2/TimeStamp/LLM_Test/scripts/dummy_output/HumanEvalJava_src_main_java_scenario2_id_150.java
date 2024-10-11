// XOrYTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
			// Test case 1: n = 1, x = 2, y = 3
			@Test
			void test1() {
				assertEquals(3, XOrY.xOrY(1, 2, 3));
			}
			
			// Test case 2: n = 2, x = 2, y = 3
			@Test
			void test2() {
				assertEquals(2, XOrY.xOrY(2, 2, 3));
			}
			
			// Test case 3: n = 3, x = 2, y = 3
			@Test
			void test3() {
				assertEquals(2, XOrY.xOrY(3, 2, 3));
			}
			
			// Test case 4: n = 4, x = 2, y = 3
			@Test
			void test4() {
				assertEquals(3, XOrY.xOrY(4, 2, 3));
			}
			
			// Test case 5: n = 5, x = 2, y = 3
			@Test
			void test5() {
				assertEquals(2, XOrY.xOrY(5, 2, 3));
			}
			
			// Test case 6: n = 6, x = 2, y = 3
			@Test
			void test6() {
				assertEquals(3, XOrY.xOrY(6, 2, 3));
			}
			
			// Test case 7: n = 7, x = 2, y = 3
			@Test
			void test7() {
				assertEquals(2, XOrY.xOrY(7, 2, 3));
			}
			
			// Test case 8: n = 8, x = 2, y = 3
			@Test
			void test8() {
				assertEquals(3, XOrY.xOrY(8, 2, 3));
			}
			
			// Test case 9: n = 9, x = 2, y = 3
			@Test
			void test9() {
				assertEquals(3, XOrY.xOrY(9, 2, 3));
			}
			
			// Test case 10: n = 10, x = 2, y = 3
			@Test
			void test10() {
				assertEquals(3, XOrY.xOrY(10, 2, 3));
			}
}