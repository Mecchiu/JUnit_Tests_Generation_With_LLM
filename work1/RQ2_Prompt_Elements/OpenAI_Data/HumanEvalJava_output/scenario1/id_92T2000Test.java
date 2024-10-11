// AnyIntTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
	// Test case 1: x = 1, y = 2, z = 3
			@Test
			void test1() {
				Boolean result = AnyInt.anyInt(1, 2, 3);
				assertFalse(result);
			}
			
			// Test case 2: x = 1, y = 2, z = 4
			@Test
			void test2() {
				Boolean result = AnyInt.anyInt(1, 2, 4);
				assertFalse(result);
			}
			
			// Test case 3: x = 1, y = 2, z = 5
			@Test
			void test3() {
				Boolean result = AnyInt.anyInt(1, 2, 5);
				assertFalse(result);
			}
			
			// Test case 4: x = 1, y = 2, z = 6
			@Test
			void test4() {
				Boolean result = AnyInt.anyInt(1, 2, 6);
				assertTrue(result);
			}
			
			// Test case 5: x = 1, y = 2, z = 7
			@Test
			void test5() {
				Boolean result = AnyInt.anyInt(1, 2, 7);
				assertFalse(result);
			}
			
			// Test case 6: x = 1, y = 2, z = 8
			@Test
			void test6() {
				Boolean result = AnyInt.anyInt(1, 2, 8);
				assertFalse(result);
			}
			
			// Test case 7: x = 1, y = 2, z = 9
			@Test
			void test7() {
				Boolean result = AnyInt.anyInt(1, 2, 9);
				assertFalse(result);
			}
			
			// Test case 8: x = 1, y = 2, z = 10
			@Test
			void test8() {
				Boolean result = AnyInt.anyInt(1, 2, 10);
				assertTrue(result);
			}
			
			// Test case 9: x = 1, y = 2, z = 11
			@Test
			void test9() {
				Boolean result = AnyInt.anyInt(1, 2, 11);
				assertFalse(result);
			}
			
			// Test case 10: x = 1, y = 2, z = 12
			@Test
			void test10() {
				Boolean result = AnyInt.anyInt(1, 2, 12);
				assertFalse(result);
			}
}
