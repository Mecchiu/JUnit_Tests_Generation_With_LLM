// PrimeLengthTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
	/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "Hello".
			*/
			@Test
			void testPrimeLength1() {
						assertTrue(PrimeLength.primeLength("Hello"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "abcdcba".
			*/
			@Test
			void testPrimeLength2() {
						assertTrue(PrimeLength.primeLength("abcdcba"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "kittens".
			*/
			@Test
			void testPrimeLength3() {
						assertTrue(PrimeLength.primeLength("kittens"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "orange".
			*/
			@Test
			void testPrimeLength4() {
						assertFalse(PrimeLength.primeLength("orange"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "wow".
			*/
			@Test
			void testPrimeLength5() {
						assertTrue(PrimeLength.primeLength("wow"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "world".
			*/
			@Test
			void testPrimeLength6() {
						assertTrue(PrimeLength.primeLength("world"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "MadaM".
			*/
			@Test
			void testPrimeLength7() {
						assertTrue(PrimeLength.primeLength("MadaM"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "Wow".
			*/
			@Test
			void testPrimeLength8() {
						assertTrue(PrimeLength.primeLength("Wow"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the empty string.
			*/
			@Test
			void testPrimeLength9() {
						assertFalse(PrimeLength.primeLength(""));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "HI".
			*/
			@Test
			void testPrimeLength10() {
						assertTrue(PrimeLength.primeLength("HI"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "go".
			*/
			@Test
			void testPrimeLength11() {
						assertTrue(PrimeLength.primeLength("go"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "gogo".
			*/
			@Test
			void testPrimeLength12() {
						assertFalse(PrimeLength.primeLength("gogo"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "aaaaaaaaaaaaaaa".
			*/
			@Test
			void testPrimeLength13() {
						assertFalse(PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "Madam".
			*/
			@Test
			void testPrimeLength14() {
						assertTrue(PrimeLength.primeLength("Madam"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "M".
			*/
			@Test
			void testPrimeLength15() {
						assertFalse(PrimeLength.primeLength("M"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the method with the string "0".
			*/
			@Test
			void testPrimeLength16() {
						assertFalse(PrimeLength.primeLength("0"));
			}
}
