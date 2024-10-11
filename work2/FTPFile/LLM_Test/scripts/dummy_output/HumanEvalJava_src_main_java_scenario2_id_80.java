// IsHappyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
			/**
			* Test case 1: Test an empty string.
			* The expected result is false.
			*/
			@Test
			void testEmptyString() {
						assertFalse(IsHappy.isHappy(""));
			}

			/**
			* Test case 2: Test a string with length 1.
			* The expected result is false.
			*/
			@Test
			void testStringLength1() {
						assertFalse(IsHappy.isHappy("a"));
			}

			/**
			* Test case 3: Test a string with length 2.
			* The expected result is false.
			*/
			@Test
			void testStringLength2() {
						assertFalse(IsHappy.isHappy("ab"));
			}

			/**
			* Test case 4: Test a string with length 3 and all distinct letters.
			* The expected result is true.
			*/
			@Test
			void testStringLength3Distinct() {
						assertTrue(IsHappy.isHappy("abc"));
			}

			/**
			* Test case 5: Test a string with length 3 and two consecutive letters.
			* The expected result is false.
			*/
			@Test
			void testStringLength3Consecutive() {
						assertFalse(IsHappy.isHappy("aba"));
			}

			/**
			* Test case 6: Test a string with length 4 and all distinct letters.
			* The expected result is true.
			*/
			@Test
			void testStringLength4Distinct() {
						assertTrue(IsHappy.isHappy("abcd"));
			}

			/**
			* Test case 7: Test a string with length 4 and two consecutive letters.
			* The expected result is false.
			*/
			@Test
			void testStringLength4Consecutive() {
						assertFalse(IsHappy.isHappy("abba"));
			}

			/**
			* Test case 8: Test a string with length 5 and all distinct letters.
			* The expected result is true.
			*/
			@Test
			void testStringLength5Distinct() {
						assertTrue(IsHappy.isHappy("abcde"));
			}

			/**
			* Test case 9: Test a string with length 5 and two consecutive letters.
			* The expected result is false.
			*/
			@Test
			void testStringLength5Consecutive() {
						assertFalse(IsHappy.isHappy("ababa"));
			}

			/**
			* Test case 10: Test a string with length 6 and all distinct letters.
			* The expected result is true.
			*/
			@Test
			void testStringLength6Distinct() {
						assertTrue(IsHappy.isHappy("abcdef"));
			}
}