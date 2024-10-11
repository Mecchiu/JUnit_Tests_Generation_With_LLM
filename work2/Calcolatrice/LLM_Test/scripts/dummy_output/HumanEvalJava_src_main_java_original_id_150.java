// XOrYTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is a prime number.
			*/
			@Test
			void testPrimeNumber() {
				assertEquals(34, XOrY.xOrY(7, 34, 12));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is not a prime number.
			*/
			@Test
			void testNotPrimeNumber() {
				assertEquals(5, XOrY.xOrY(15, 8, 5));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is a prime number.
			*/
			@Test
			void testPrimeNumber2() {
				assertEquals(33, XOrY.xOrY(3, 33, 5212));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is a prime number.
			*/
			@Test
			void testPrimeNumber3() {
				assertEquals(3, XOrY.xOrY(1259, 3, 52));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is not a prime number.
			*/
			@Test
			void testNotPrimeNumber2() {
				assertEquals(-1, XOrY.xOrY(7919, -1, 12));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is not a prime number.
			*/
			@Test
			void testNotPrimeNumber3() {
				assertEquals(583, XOrY.xOrY(3609, 1245, 583));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is not a prime number.
			*/
			@Test
			void testNotPrimeNumber4() {
				assertEquals(129, XOrY.xOrY(91, 56, 129));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is not a prime number.
			*/
			@Test
			void testNotPrimeNumber5() {
				assertEquals(1234, XOrY.xOrY(6, 34, 1234));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is not a prime number.
			*/
			@Test
			void testNotPrimeNumber6() {
				assertEquals(0, XOrY.xOrY(1, 2, 0));
			}

			/**
			* Test case for {@link XOrY#xOrY(int, int, int)}.
			* It tests the case where n is a prime number.
			*/
			@Test
			void testPrimeNumber4() {
				assertEquals(2, XOrY.xOrY(2, 2, 0));
			}
}