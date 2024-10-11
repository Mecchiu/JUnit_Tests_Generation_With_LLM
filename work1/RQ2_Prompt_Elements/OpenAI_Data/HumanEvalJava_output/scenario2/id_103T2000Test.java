// RoundedAvgTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
	/**
			* Test case 1: n = 1, m = 10
			* Expected output: 0b1011
			*/
			@Test
			void test1() {
						assertEquals("0b1011", RoundedAvg.roundedAvg(1, 10));
			}

			/**
			* Test case 2: n = 5, m = 10
			* Expected output: 0b1100
			*/
			@Test
			void test2() {
						assertEquals("0b1100", RoundedAvg.roundedAvg(5, 10));
			}

			/**
			* Test case 3: n = 1, m = 1
			* Expected output: 0b1
			*/
			@Test
			void test3() {
						assertEquals("0b1", RoundedAvg.roundedAvg(1, 1));
			}

			/**
			* Test case 4: n = 1, m = 2
			* Expected output: 0b1
			*/
			@Test
			void test4() {
						assertEquals("0b1", RoundedAvg.roundedAvg(1, 2));
			}

			/**
			* Test case 5: n = 1, m = 3
			* Expected output: 0b10
			*/
			@Test
			void test5() {
						assertEquals("0b10", RoundedAvg.roundedAvg(1, 3));
			}

			/**
			* Test case 6: n = 1, m = 4
			* Expected output: 0b10
			*/
			@Test
			void test6() {
						assertEquals("0b10", RoundedAvg.roundedAvg(1, 4));
			}

			/**
			* Test case 7: n = 1, m = 5
			* Expected output: 0b11
			*/
			@Test
			void test7() {
						assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
			}

			/**
			* Test case 8: n = 1, m = 6
			* Expected output: 0b11
			*/
			@Test
			void test8() {
						assertEquals("0b11", RoundedAvg.roundedAvg(1, 6));
			}

			/**
			* Test case 9: n = 1, m = 7
			* Expected output: 0b11
			*/
			@Test
			void test9() {
						assertEquals("0b11", RoundedAvg.roundedAvg(1, 7));
			}

			/**
			* Test case 10: n = 1, m = 8
			* Expected output: 0b11
			*/
			@Test
			void test10() {
						assertEquals("0b11", RoundedAvg.roundedAvg(1, 8));
			}
}
