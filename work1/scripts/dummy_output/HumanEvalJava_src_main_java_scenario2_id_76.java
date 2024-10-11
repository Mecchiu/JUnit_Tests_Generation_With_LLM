// IsSimplePowerTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
			@Test
			void testIsSimplePower() {
				// Test case 1: x = 1, n = 1
				assertEquals(true, IsSimplePower.isSimplePower(1, 1));
				
				// Test case 2: x = 2, n = 1
				assertEquals(false, IsSimplePower.isSimplePower(2, 1));
				
				// Test case 3: x = 1, n = 2
				assertEquals(true, IsSimplePower.isSimplePower(1, 2));
				
				// Test case 4: x = 4, n = 2
				assertEquals(true, IsSimplePower.isSimplePower(4, 2));
				
				// Test case 5: x = 8, n = 2
				assertEquals(true, IsSimplePower.isSimplePower(8, 2));
				
				// Test case 6: x = 9, n = 2
				assertEquals(false, IsSimplePower.isSimplePower(9, 2));
				
				// Test case 7: x = 16, n = 2
				assertEquals(true, IsSimplePower.isSimplePower(16, 2));
				
				// Test case 8: x = 27, n = 3
				assertEquals(true, IsSimplePower.isSimplePower(27, 3));
				
				// Test case 9: x = 81, n = 3
				assertEquals(true, IsSimplePower.isSimplePower(81, 3));
				
				// Test case 10: x = 100, n = 3
				assertEquals(false, IsSimplePower.isSimplePower(100, 3));
			}
}