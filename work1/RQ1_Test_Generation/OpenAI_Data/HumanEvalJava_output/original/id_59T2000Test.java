// LargestPrimeFactorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
	@Test
			void test1() {
				assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
			}
			
			@Test
			void test2() {
				assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
			}
			
			@Test
			void test3() {
				assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
			}
			
			@Test
			void test4() {
				assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
			}
			
			@Test
			void test5() {
				assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
			}
			
			@Test
			void test6() {
				assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
			}
			
			@Test
			void test7() {
				assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
			}
			
			@Test
			void test8() {
				assertEquals(3, LargestPrimeFactor.largestPrimeFactor(3));
			}
			
			@Test
			void test9() {
				assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
			}
			
			@Test
			void test10() {
				assertEquals(7, LargestPrimeFactor.largestPrimeFactor(7));
			}
}