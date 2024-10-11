// IsMultiplyPrimeTest.java
package scenario3;


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
				int a = 5;
				Boolean result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 2
				a = 30;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertTrue(result);
				
				// Test case 3
				a = 8;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertTrue(result);
				
				// Test case 4
				a = 10;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 5
				a = 125;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertTrue(result);
				
				// Test case 6
				a = 105;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertTrue(result);
				
				// Test case 7
				a = 126;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 8
				a = 729;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 9
				a = 891;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertFalse(result);
				
				// Test case 10
				a = 1001;
				result = IsMultiplyPrime.isMultiplyPrime(a);
				assertTrue(result);
			}
}
