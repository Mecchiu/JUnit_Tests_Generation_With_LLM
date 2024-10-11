// IsPrimeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
			@Test
			void testIsPrime1() {
				assertFalse(IsPrime.isPrime(6));
			}
			
			@Test
			void testIsPrime2() {
				assertTrue(IsPrime.isPrime(101));
			}
			
			@Test
			void testIsPrime3() {
				assertTrue(IsPrime.isPrime(11));
			}
			
			@Test
			void testIsPrime4() {
				assertTrue(IsPrime.isPrime(13441));
			}
			
			@Test
			void testIsPrime5() {
				assertTrue(IsPrime.isPrime(61));
			}
			
			@Test
			void testIsPrime6() {
				assertFalse(IsPrime.isPrime(4));
			}
			
			@Test
			void testIsPrime7() {
				assertFalse(IsPrime.isPrime(1));
			}
			
			@Test
			void testIsPrime8() {
				assertTrue(IsPrime.isPrime(5));
			}
			
			@Test
			void testIsPrime9() {
				assertTrue(IsPrime.isPrime(11));
			}
			
			@Test
			void testIsPrime10() {
				assertTrue(IsPrime.isPrime(17));
			}
			
			@Test
			void testIsPrime11() {
				assertFalse(IsPrime.isPrime(85));
			}
			
			@Test
			void testIsPrime12() {
				assertFalse(IsPrime.isPrime(77));
			}
			
			@Test
			void testIsPrime13() {
				assertFalse(IsPrime.isPrime(255379));
			}
}