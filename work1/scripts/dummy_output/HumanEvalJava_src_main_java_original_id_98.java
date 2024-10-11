// CountUpperTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
			/**
			* Test case 1: Test the case when the input string is empty.
			* The expected result is 0.
			*/
			@Test
			void testEmptyString() {
						assertEquals(0, CountUpper.countUpper(""));
			}

			/**
			* Test case 2: Test the case when the input string contains only lowercase letters.
			* The expected result is 0.
			*/
			@Test
			void testLowercaseString() {
						assertEquals(0, CountUpper.countUpper("abcdefg"));
			}

			/**
			* Test case 3: Test the case when the input string contains only uppercase letters.
			* The expected result is 0.
			*/
			@Test
			void testUppercaseString() {
						assertEquals(0, CountUpper.countUpper("EEEE"));
			}

			/**
			* Test case 4: Test the case when the input string contains only vowels.
			* The expected result is 0.
			*/
			@Test
			void testVowelString() {
						assertEquals(0, CountUpper.countUpper("AEIOU"));
			}

			/**
			* Test case 5: Test the case when the input string contains only consonants.
			* The expected result is 0.
			*/
			@Test
			void testConsonantString() {
						assertEquals(0, CountUpper.countUpper("BCDFGH"));
			}

			/**
			* Test case 6: Test the case when the input string contains both uppercase and lowercase letters.
			* The expected result is 1.
			*/
			@Test
			void testMixedString() {
						assertEquals(1, CountUpper.countUpper("aBCdEf"));
			}

			/**
			* Test case 7: Test the case when the input string contains both vowels and consonants.
			* The expected result is 1.
			*/
			@Test
			void testMixedVowelConsonantString() {
						assertEquals(1, CountUpper.countUpper("aBCdEfG"));
			}

			/**
			* Test case 8: Test the case when the input string contains both uppercase and lowercase vowels.
			* The expected result is 1.
			*/
			@Test
			void testMixedVowelString() {
						assertEquals(1, CountUpper.countUpper("aBCdEfG"));
			}

			/**
			* Test case 9: Test the case when the input string contains both uppercase and lowercase consonants.
			* The expected result is 0.
			*/
			@Test
			void testMixedConsonantString() {
						assertEquals(0, CountUpper.countUpper("aBCdEfG"));
			}

			/**
			* Test case 10: Test the case when the input string contains both uppercase and lowercase vowels and consonants.
			* The expected result is 2.
			*/
			@Test
			void testMixedVowelConsonantString() {
						assertEquals(2, CountUpper.countUpper("aBCdEfGhIjKlMnOpQrStUvWxYz"));
			}
}