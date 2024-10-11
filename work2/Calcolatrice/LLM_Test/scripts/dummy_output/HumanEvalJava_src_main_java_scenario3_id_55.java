// FibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains ten unit test cases for the {@link Fib#fib(int)} method.
*/
class FibTest {
			@Test
			void testFib() {
				assertEquals(55, Fib.fib(10));
			}
			
			@Test
			void testFib1() {
				assertEquals(1, Fib.fib(1));
			}
			
			@Test
			void testFib2() {
				assertEquals(21, Fib.fib(8));
			}
			
			@Test
			void testFib3() {
				assertEquals(89, Fib.fib(11));
			}
			
			@Test
			void testFib4() {
				assertEquals(144, Fib.fib(12));
			}
			
			@Test
			void testFib5() {
				assertEquals(0, Fib.fib(0));
			}
			
			@Test
			void testFib6() {
				assertEquals(1, Fib.fib(2));
			}
			
			@Test
			void testFib7() {
				assertEquals(2, Fib.fib(3));
			}
			
			@Test
			void testFib8() {
				assertEquals(3, Fib.fib(4));
			}
			
			@Test
			void testFib9() {
				assertEquals(5, Fib.fib(5));
			}
			
			@Test
			void testFib10() {
				assertEquals(8, Fib.fib(6));
			}
}