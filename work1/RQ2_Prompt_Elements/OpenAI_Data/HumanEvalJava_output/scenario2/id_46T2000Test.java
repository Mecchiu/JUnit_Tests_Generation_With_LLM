// Fib4Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {
	/**
			* Test case for n = 0.
			*/
			@Test
			void testFib4_0() {
						assertEquals(0, Fib4.fib4(0));
			}

			/**
			* Test case for n = 1.
			*/
			@Test
			void testFib4_1() {
						assertEquals(0, Fib4.fib4(1));
			}

			/**
			* Test case for n = 2.
			*/
			@Test
			void testFib4_2() {
						assertEquals(2, Fib4.fib4(2));
			}

			/**
			* Test case for n = 3.
			*/
			@Test
			void testFib4_3() {
						assertEquals(0, Fib4.fib4(3));
			}

			/**
			* Test case for n = 4.
			*/
			@Test
			void testFib4_4() {
						assertEquals(2, Fib4.fib4(4));
			}

			/**
			* Test case for n = 5.
			*/
			@Test
			void testFib4_5() {
						assertEquals(4, Fib4.fib4(5));
			}

			/**
			* Test case for n = 6.
			*/
			@Test
			void testFib4_6() {
						assertEquals(6, Fib4.fib4(6));
			}

			/**
			* Test case for n = 7.
			*/
			@Test
			void testFib4_7() {
						assertEquals(12, Fib4.fib4(7));
			}

			/**
			* Test case for n = 8.
			*/
			@Test
			void testFib4_8() {
						assertEquals(22, Fib4.fib4(8));
			}

			/**
			* Test case for n = 9.
			*/
			@Test
			void testFib4_9() {
						assertEquals(40, Fib4.fib4(9));
			}
}
