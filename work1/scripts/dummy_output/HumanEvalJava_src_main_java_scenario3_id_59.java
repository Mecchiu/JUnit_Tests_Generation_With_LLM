// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
			@Test
			void testLargestPrimeFactor1() {
				assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
			}
			
			@Test
			void testLargestPrimeFactor2() {
				assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
			}
			
			@Test
			void testLargestPrimeFactor3() {
				assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
			}
			
			@Test
			void testLargestPrimeFactor4() {
				assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
			}
			
			@Test
			void testLargestPrimeFactor5() {
				assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
			}
			
			@Test
			void testLargestPrimeFactor6() {
				assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
			}
			
			@Test
			void testLargestPrimeFactor7() {
				assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
			}
			
			@Test
			void testLargestPrimeFactor8() {
				assertEquals(3, LargestPrimeFactor.largestPrimeFactor(9));
			}
			
			@Test
			void testLargestPrimeFactor9() {
				assertEquals(5, LargestPrimeFactor.largestPrimeFactor(25));
			}
			
			@Test
			void testLargestPrimeFactor10() {
				assertEquals(7, LargestPrimeFactor.largestPrimeFactor(49));
			}
}