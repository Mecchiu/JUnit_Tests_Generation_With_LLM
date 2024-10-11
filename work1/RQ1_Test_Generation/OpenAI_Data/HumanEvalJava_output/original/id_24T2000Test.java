// LargestDivisorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
	@Test
			void testLargestDivisor1() {
				assertEquals(5, LargestDivisor.largestDivisor(15));
			}
			
			@Test
			void testLargestDivisor2() {
				assertEquals(1, LargestDivisor.largestDivisor(3));
			}
			
			@Test
			void testLargestDivisor3() {
				assertEquals(1, LargestDivisor.largestDivisor(7));
			}
			
			@Test
			void testLargestDivisor4() {
				assertEquals(5, LargestDivisor.largestDivisor(10));
			}
			
			@Test
			void testLargestDivisor5() {
				assertEquals(50, LargestDivisor.largestDivisor(100));
			}
			
			@Test
			void testLargestDivisor6() {
				assertEquals(7, LargestDivisor.largestDivisor(49));
			}
			
			@Test
			void testLargestDivisor7() {
				assertEquals(1, LargestDivisor.largestDivisor(1));
			}
			
			@Test
			void testLargestDivisor8() {
				assertEquals(1, LargestDivisor.largestDivisor(2));
			}
			
			@Test
			void testLargestDivisor9() {
				assertEquals(1, LargestDivisor.largestDivisor(4));
			}
			
			@Test
			void testLargestDivisor10() {
				assertEquals(1, LargestDivisor.largestDivisor(5));
			}
}
