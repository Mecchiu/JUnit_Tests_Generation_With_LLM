// IsSimplePowerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
			// Test case 1: x = 1, n = 1
			@Test
			void testIsSimplePower1() {
				Boolean result = IsSimplePower.isSimplePower(1, 1);
				assertTrue(result);
			}
			
			// Test case 2: x = 2, n = 1
			@Test
			void testIsSimplePower2() {
				Boolean result = IsSimplePower.isSimplePower(2, 1);
				assertFalse(result);
			}
			
			// Test case 3: x = 1, n = 2
			@Test
			void testIsSimplePower3() {
				Boolean result = IsSimplePower.isSimplePower(1, 2);
				assertTrue(result);
			}
			
			// Test case 4: x = 4, n = 2
			@Test
			void testIsSimplePower4() {
				Boolean result = IsSimplePower.isSimplePower(4, 2);
				assertTrue(result);
			}
			
			// Test case 5: x = 8, n = 2
			@Test
			void testIsSimplePower5() {
				Boolean result = IsSimplePower.isSimplePower(8, 2);
				assertTrue(result);
			}
			
			// Test case 6: x = 9, n = 2
			@Test
			void testIsSimplePower6() {
				Boolean result = IsSimplePower.isSimplePower(9, 2);
				assertFalse(result);
			}
			
			// Test case 7: x = 16, n = 2
			@Test
			void testIsSimplePower7() {
				Boolean result = IsSimplePower.isSimplePower(16, 2);
				assertTrue(result);
			}
			
			// Test case 8: x = 27, n = 3
			@Test
			void testIsSimplePower8() {
				Boolean result = IsSimplePower.isSimplePower(27, 3);
				assertTrue(result);
			}
			
			// Test case 9: x = 64, n = 4
			@Test
			void testIsSimplePower9() {
				Boolean result = IsSimplePower.isSimplePower(64, 4);
				assertTrue(result);
			}
			
			// Test case 10: x = 125, n = 5
			@Test
			void testIsSimplePower10() {
				Boolean result = IsSimplePower.isSimplePower(125, 5);
				assertTrue(result);
			}
}