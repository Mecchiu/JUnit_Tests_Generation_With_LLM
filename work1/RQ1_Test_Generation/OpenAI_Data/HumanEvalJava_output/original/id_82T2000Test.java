// PrimeLengthTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
	/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the case when the string length is a prime number.
			*/
			@Test
			void testPrimeLength() {
						assertTrue(PrimeLength.primeLength("Hello"));
						assertTrue(PrimeLength.primeLength("abcdcba"));
						assertTrue(PrimeLength.primeLength("kittens"));
						assertTrue(PrimeLength.primeLength("wow"));
						assertTrue(PrimeLength.primeLength("world"));
						assertTrue(PrimeLength.primeLength("MadaM"));
						assertTrue(PrimeLength.primeLength("Wow"));
						assertTrue(PrimeLength.primeLength("HI"));
						assertTrue(PrimeLength.primeLength("go"));
						assertTrue(PrimeLength.primeLength("Madam"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the case when the string length is not a prime number.
			*/
			@Test
			void testNotPrimeLength() {
						assertFalse(PrimeLength.primeLength("orange"));
						assertFalse(PrimeLength.primeLength("gogo"));
						assertFalse(PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
						assertFalse(PrimeLength.primeLength("M"));
						assertFalse(PrimeLength.primeLength("0"));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the case when the string is empty.
			*/
			@Test
			void testEmptyString() {
						assertFalse(PrimeLength.primeLength(""));
			}

			/**
			* Test case for the {@link PrimeLength#primeLength(String)} method.
			* It tests the case when the string contains only one character.
			*/
			@Test
			void testOneCharacter() {
						assertFalse(PrimeLength.primeLength("a"));
			}
}
