// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
			@Test
			void testSumToN1() {
				assertEquals(15, SumToN.sumToN(5));
			}
			
			@Test
			void testSumToN2() {
				assertEquals(55, SumToN.sumToN(10));
			}
			
			@Test
			void testSumToN3() {
				assertEquals(1, SumToN.sumToN(1));
			}
			
			@Test
			void testSumToN4() {
				assertEquals(21, SumToN.sumToN(6));
			}
			
			@Test
			void testSumToN5() {
				assertEquals(66, SumToN.sumToN(11));
			}
			
			@Test
			void testSumToN6() {
				assertEquals(465, SumToN.sumToN(30));
			}
			
			@Test
			void testSumToN7() {
				assertEquals(5050, SumToN.sumToN(100));
			}
			
			@Test
			void testSumToN8() {
				assertEquals(0, SumToN.sumToN(0));
			}
			
			@Test
			void testSumToN9() {
				assertEquals(3, SumToN.sumToN(2));
			}
			
			@Test
			void testSumToN10() {
				assertEquals(153, SumToN.sumToN(17));
			}
}