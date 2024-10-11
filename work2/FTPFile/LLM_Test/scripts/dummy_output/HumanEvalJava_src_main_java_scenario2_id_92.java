// AnyIntTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
			@Test
			void testAnyInt() {
				// Test case 1: x = 1, y = 2, z = 3
				// Expected result: false
				assertFalse(AnyInt.anyInt(1, 2, 3));
				
				// Test case 2: x = 1, y = 2, z = 3.0
				// Expected result: false
				assertFalse(AnyInt.anyInt(1, 2, 3.0));
				
				// Test case 3: x = 1, y = 2.0, z = 3
				// Expected result: false
				assertFalse(AnyInt.anyInt(1, 2.0, 3));
				
				// Test case 4: x = 1.0, y = 2, z = 3
				// Expected result: false
				assertFalse(AnyInt.anyInt(1.0, 2, 3));
				
				// Test case 5: x = 1, y = 2, z = 3
				// Expected result: true
				assertTrue(AnyInt.anyInt(1, 2, 3));
				
				// Test case 6: x = 1, y = 3, z = 2
				// Expected result: true
				assertTrue(AnyInt.anyInt(1, 3, 2));
				
				// Test case 7: x = 2, y = 1, z = 3
				// Expected result: true
				assertTrue(AnyInt.anyInt(2, 1, 3));
				
				// Test case 8: x = 2, y = 3, z = 1
				// Expected result: true
				assertTrue(AnyInt.anyInt(2, 3, 1));
				
				// Test case 9: x = 3, y = 1, z = 2
				// Expected result: true
				assertTrue(AnyInt.anyInt(3, 1, 2));
				
				// Test case 10: x = 3, y = 2, z = 1
				// Expected result: true
				assertTrue(AnyInt.anyInt(3, 2, 1));
			}
}