// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
			@Test
			void testIsEqualToSumEven() {
				// Test case 1
				int n = 4;
				Boolean result = IsEqualToSumEven.isEqualToSumEven(n);
				assertFalse(result);
				
				// Test case 2
				n = 6;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertFalse(result);
				
				// Test case 3
				n = 8;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertTrue(result);
				
				// Test case 4
				n = 10;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertTrue(result);
				
				// Test case 5
				n = 11;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertFalse(result);
				
				// Test case 6
				n = 12;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertTrue(result);
				
				// Test case 7
				n = 13;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertFalse(result);
				
				// Test case 8
				n = 16;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertTrue(result);
				
				// Test case 9
				n = 18;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertTrue(result);
				
				// Test case 10
				n = 20;
				result = IsEqualToSumEven.isEqualToSumEven(n);
				assertTrue(result);
			}
}