// IsMultiplyPrimeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {
			@Test
			void testIsMultiplyPrime1() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
			}
			
			@Test
			void testIsMultiplyPrime2() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
			}
			
			@Test
			void testIsMultiplyPrime3() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
			}
			
			@Test
			void testIsMultiplyPrime4() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
			}
			
			@Test
			void testIsMultiplyPrime5() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
			}
			
			@Test
			void testIsMultiplyPrime6() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
			}
			
			@Test
			void testIsMultiplyPrime7() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
			}
			
			@Test
			void testIsMultiplyPrime8() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
			}
			
			@Test
			void testIsMultiplyPrime9() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
			}
			
			@Test
			void testIsMultiplyPrime10() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
			}
}