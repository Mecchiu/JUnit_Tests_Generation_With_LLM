// SumToNTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
	// Test case 1: n = 0
			@Test
			void testSumToN1() {
				int n = 0;
				int expected = 0;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 2: n = 1
			@Test
			void testSumToN2() {
				int n = 1;
				int expected = 1;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 3: n = 5
			@Test
			void testSumToN3() {
				int n = 5;
				int expected = 15;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 4: n = 10
			@Test
			void testSumToN4() {
				int n = 10;
				int expected = 55;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 5: n = -1
			@Test
			void testSumToN5() {
				int n = -1;
				int expected = 0;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 6: n = 100
			@Test
			void testSumToN6() {
				int n = 100;
				int expected = 5050;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 7: n = 1000
			@Test
			void testSumToN7() {
				int n = 1000;
				int expected = 500500;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 8: n = 10000
			@Test
			void testSumToN8() {
				int n = 10000;
				int expected = 50005000;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 9: n = 100000
			@Test
			void testSumToN9() {
				int n = 100000;
				int expected = 5000050000;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
			
			// Test case 10: n = 1000000
			@Test
			void testSumToN10() {
				int n = 1000000;
				int expected = 500000500000;
				int actual = SumToN.sumToN(n);
				assertEquals(expected, actual);
			}
}