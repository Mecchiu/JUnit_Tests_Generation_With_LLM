// IsMultiplyPrimeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {
			@Test
			void testIsMultiplyPrime() {
				// Test case 1
				int a = 2;
				Boolean result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 2
				a = 3;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 3
				a = 4;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 4
				a = 5;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 5
				a = 6;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 6
				a = 7;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 7
				a = 8;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 8
				a = 9;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 9
				a = 10;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 10
				a = 11;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
			}
}