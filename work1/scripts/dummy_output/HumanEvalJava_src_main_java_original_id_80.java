// IsHappyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
			/**
			* Test case 1: Test the case when the input string is "a".
			* The expected result is false.
			*/
			@Test
			void testIsHappy1() {
						assertFalse(IsHappy.isHappy("a"));
			}

			/**
			* Test case 2: Test the case when the input string is "aa".
			* The expected result is false.
			*/
			@Test
			void testIsHappy2() {
						assertFalse(IsHappy.isHappy("aa"));
			}

			/**
			* Test case 3: Test the case when the input string is "abcd".
			* The expected result is true.
			*/
			@Test
			void testIsHappy3() {
						assertTrue(IsHappy.isHappy("abcd"));
			}

			/**
			* Test case 4: Test the case when the input string is "aabb".
			* The expected result is false.
			*/
			@Test
			void testIsHappy4() {
						assertFalse(IsHappy.isHappy("aabb"));
			}

			/**
			* Test case 5: Test the case when the input string is "adb".
			* The expected result is true.
			*/
			@Test
			void testIsHappy5() {
						assertTrue(IsHappy.isHappy("adb"));
			}

			/**
			* Test case 6: Test the case when the input string is "xyy".
			* The expected result is false.
			*/
			@Test
			void testIsHappy6() {
						assertFalse(IsHappy.isHappy("xyy"));
			}

			/**
			* Test case 7: Test the case when the input string is "iopaxpoi".
			* The expected result is true.
			*/
			@Test
			void testIsHappy7() {
						assertTrue(IsHappy.isHappy("iopaxpoi"));
			}

			/**
			* Test case 8: Test the case when the input string is "iopaxioi".
			* The expected result is false.
			*/
			@Test
			void testIsHappy8() {
						assertFalse(IsHappy.isHappy("iopaxioi"));
			}

			/**
			* Test case 9: Test the case when the input string is "iopaxioi".
			* The expected result is false.
			*/
			@Test
			void testIsHappy9() {
						assertFalse(IsHappy.isHappy("iopaxioi"));
			}

			/**
			* Test case 10: Test the case when the input string is "iopaxioi".
			* The expected result is false.
			*/
			@Test
			void testIsHappy10() {
						assertFalse(IsHappy.isHappy("iopaxioi"));
			}
}