// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
			/**
			* Test case for the first prime Fibonacci number.
			*/
			@Test
			void testPrimeFib1() {
						assertEquals(2, PrimeFib.primeFib(1));
			}

			/**
			* Test case for the second prime Fibonacci number.
			*/
			@Test
			void testPrimeFib2() {
						assertEquals(3, PrimeFib.primeFib(2));
			}

			/**
			* Test case for the third prime Fibonacci number.
			*/
			@Test
			void testPrimeFib3() {
						assertEquals(5, PrimeFib.primeFib(3));
			}

			/**
			* Test case for the fourth prime Fibonacci number.
			*/
			@Test
			void testPrimeFib4() {
						assertEquals(13, PrimeFib.primeFib(4));
			}

			/**
			* Test case for the fifth prime Fibonacci number.
			*/
			@Test
			void testPrimeFib5() {
						assertEquals(89, PrimeFib.primeFib(5));
			}

			/**
			* Test case for the sixth prime Fibonacci number.
			*/
			@Test
			void testPrimeFib6() {
						assertEquals(233, PrimeFib.primeFib(6));
			}

			/**
			* Test case for the seventh prime Fibonacci number.
			*/
			@Test
			void testPrimeFib7() {
						assertEquals(1597, PrimeFib.primeFib(7));
			}

			/**
			* Test case for the eighth prime Fibonacci number.
			*/
			@Test
			void testPrimeFib8() {
						assertEquals(28657, PrimeFib.primeFib(8));
			}

			/**
			* Test case for the ninth prime Fibonacci number.
			*/
			@Test
			void testPrimeFib9() {
						assertEquals(514229, PrimeFib.primeFib(9));
			}

			/**
			* Test case for the tenth prime Fibonacci number.
			*/
			@Test
			void testPrimeFib10() {
						assertEquals(433494437, PrimeFib.primeFib(10));
			}
}