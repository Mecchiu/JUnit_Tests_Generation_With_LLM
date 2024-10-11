// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
	@Test
			void testPrimeLength() {
				// Test case 1: Empty string
				assertFalse(PrimeLength.primeLength(""));
				
				// Test case 2: String with length 1
				assertFalse(PrimeLength.primeLength("a"));
				
				// Test case 3: String with length 2
				assertTrue(PrimeLength.primeLength("ab"));
				
				// Test case 4: String with length 3
				assertTrue(PrimeLength.primeLength("abc"));
				
				// Test case 5: String with length 4
				assertFalse(PrimeLength.primeLength("abcd"));
				
				// Test case 6: String with length 5
				assertTrue(PrimeLength.primeLength("abcde"));
				
				// Test case 7: String with length 6
				assertFalse(PrimeLength.primeLength("abcdef"));
				
				// Test case 8: String with length 7
				assertTrue(PrimeLength.primeLength("abcdefg"));
				
				// Test case 9: String with length 8
				assertFalse(PrimeLength.primeLength("abcdefgh"));
				
				// Test case 10: String with length 9
				assertFalse(PrimeLength.primeLength("abcdefghi"));
			}
}
