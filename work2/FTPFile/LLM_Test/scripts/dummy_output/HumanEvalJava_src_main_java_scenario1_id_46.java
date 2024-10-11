// Fib4Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {
			// Test case 1
			@Test
			void testFib4_1() {
				int n = 0;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 2
			@Test
			void testFib4_2() {
				int n = 1;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 3
			@Test
			void testFib4_3() {
				int n = 2;
				int expected = 2;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 4
			@Test
			void testFib4_4() {
				int n = 3;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 5
			@Test
			void testFib4_5() {
				int n = 4;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 6
			@Test
			void testFib4_6() {
				int n = 5;
				int expected = 4;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 7
			@Test
			void testFib4_7() {
				int n = 6;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 8
			@Test
			void testFib4_8() {
				int n = 7;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 9
			@Test
			void testFib4_9() {
				int n = 8;
				int expected = 8;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
			
			// Test case 10
			@Test
			void testFib4_10() {
				int n = 9;
				int expected = 0;
				int actual = Fib4.fib4(n);
				assertEquals(expected, actual);
			}
}