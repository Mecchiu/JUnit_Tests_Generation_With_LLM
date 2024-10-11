// SumToNTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
	@Test
			void testSumToN1() {
				assertEquals(1, SumToN.sumToN(1));
			}
			
			@Test
			void testSumToN2() {
				assertEquals(3, SumToN.sumToN(2));
			}
			
			@Test
			void testSumToN3() {
				assertEquals(6, SumToN.sumToN(3));
			}
			
			@Test
			void testSumToN4() {
				assertEquals(10, SumToN.sumToN(4));
			}
			
			@Test
			void testSumToN5() {
				assertEquals(15, SumToN.sumToN(5));
			}
			
			@Test
			void testSumToN6() {
				assertEquals(21, SumToN.sumToN(6));
			}
			
			@Test
			void testSumToN7() {
				assertEquals(28, SumToN.sumToN(7));
			}
			
			@Test
			void testSumToN8() {
				assertEquals(36, SumToN.sumToN(8));
			}
			
			@Test
			void testSumToN9() {
				assertEquals(45, SumToN.sumToN(9));
			}
			
			@Test
			void testSumToN10() {
				assertEquals(55, SumToN.sumToN(10));
			}
}