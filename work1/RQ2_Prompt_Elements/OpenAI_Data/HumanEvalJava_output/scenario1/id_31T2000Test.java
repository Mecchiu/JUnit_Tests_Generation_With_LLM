// IsPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
	// Test case 1: n = 0
			@Test
			void testIsPrime1() {
				assertFalse(IsPrime.isPrime(0));
			}
			
			// Test case 2: n = 1
			@Test
			void testIsPrime2() {
				assertFalse(IsPrime.isPrime(1));
			}
			
			// Test case 3: n = 2
			@Test
			void testIsPrime3() {
				assertTrue(IsPrime.isPrime(2));
			}
			
			// Test case 4: n = 3
			@Test
			void testIsPrime4() {
				assertTrue(IsPrime.isPrime(3));
			}
			
			// Test case 5: n = 4
			@Test
			void testIsPrime5() {
				assertFalse(IsPrime.isPrime(4));
			}
			
			// Test case 6: n = 5
			@Test
			void testIsPrime6() {
				assertTrue(IsPrime.isPrime(5));
			}
			
			// Test case 7: n = 6
			@Test
			void testIsPrime7() {
				assertFalse(IsPrime.isPrime(6));
			}
			
			// Test case 8: n = 7
			@Test
			void testIsPrime8() {
				assertTrue(IsPrime.isPrime(7));
			}
			
			// Test case 9: n = 8
			@Test
			void testIsPrime9() {
				assertFalse(IsPrime.isPrime(8));
			}
			
			// Test case 10: n = 9
			@Test
			void testIsPrime10() {
				assertFalse(IsPrime.isPrime(9));
			}
}