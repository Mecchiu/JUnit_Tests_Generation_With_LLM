// FibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains ten unit test cases for the {@link Fib#fib(int)} method.
*/
class FibTest {
	// Test case 1
			@Test
			void testFib1() {
				int result = Fib.fib(0);
				assertEquals(0, result);
			}
			
			// Test case 2
			@Test
			void testFib2() {
				int result = Fib.fib(1);
				assertEquals(1, result);
			}
			
			// Test case 3
			@Test
			void testFib3() {
				int result = Fib.fib(2);
				assertEquals(1, result);
			}
			
			// Test case 4
			@Test
			void testFib4() {
				int result = Fib.fib(3);
				assertEquals(2, result);
			}
			
			// Test case 5
			@Test
			void testFib5() {
				int result = Fib.fib(4);
				assertEquals(3, result);
			}
			
			// Test case 6
			@Test
			void testFib6() {
				int result = Fib.fib(5);
				assertEquals(5, result);
			}
			
			// Test case 7
			@Test
			void testFib7() {
				int result = Fib.fib(6);
				assertEquals(8, result);
			}
			
			// Test case 8
			@Test
			void testFib8() {
				int result = Fib.fib(7);
				assertEquals(13, result);
			}
			
			// Test case 9
			@Test
			void testFib9() {
				int result = Fib.fib(8);
				assertEquals(21, result);
			}
			
			// Test case 10
			@Test
			void testFib10() {
				int result = Fib.fib(9);
				assertEquals(34, result);
			}
}