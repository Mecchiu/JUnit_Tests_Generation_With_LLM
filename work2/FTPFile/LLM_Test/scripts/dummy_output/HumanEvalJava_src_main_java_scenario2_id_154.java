// CycpatternCheckTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
			/**
			* Test case 1: Test for empty string
			* Input: a = "", b = ""
			* Expected output: false
			*/
			@Test
			void testEmptyString() {
				String a = "";
				String b = "";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertFalse(result);
			}

			/**
			* Test case 2: Test for null string
			* Input: a = null, b = null
			* Expected output: false
			*/
			@Test
			void testNullString() {
				String a = null;
				String b = null;
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertFalse(result);
			}

			/**
			* Test case 3: Test for string with only one character
			* Input: a = "a", b = "a"
			* Expected output: true
			*/
			@Test
			void testOneCharString() {
				String a = "a";
				String b = "a";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertTrue(result);
			}

			/**
			* Test case 4: Test for string with only one character
			* Input: a = "a", b = "b"
			* Expected output: false
			*/
			@Test
			void testOneCharString2() {
				String a = "a";
				String b = "b";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertFalse(result);
			}

			/**
			* Test case 5: Test for string with only one character
			* Input: a = "ab", b = "a"
			* Expected output: true
			*/
			@Test
			void testOneCharString3() {
				String a = "ab";
				String b = "a";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertTrue(result);
			}

			/**
			* Test case 6: Test for string with only one character
			* Input: a = "ab", b = "b"
			* Expected output: true
			*/
			@Test
			void testOneCharString4() {
				String a = "ab";
				String b = "b";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertTrue(result);
			}

			/**
			* Test case 7: Test for string with only one character
			* Input: a = "ab", b = "c"
			* Expected output: false
			*/
			@Test
			void testOneCharString5() {
				String a = "ab";
				String b = "c";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertFalse(result);
			}

			/**
			* Test case 8: Test for string with only one character
			* Input: a = "ab", b = "ba"
			* Expected output: true
			*/
			@Test
			void testOneCharString6() {
				String a = "ab";
				String b = "ba";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertTrue(result);
			}

			/**
			* Test case 9: Test for string with only one character
			* Input: a = "ab", b = "ab"
			* Expected output: true
			*/
			@Test
			void testOneCharString7() {
				String a = "ab";
				String b = "ab";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertTrue(result);
			}

			/**
			* Test case 10: Test for string with only one character
			* Input: a = "ab", b = "ba"
			* Expected output: true
			*/
			@Test
			void testOneCharString8() {
				String a = "ab";
				String b = "ba";
				Boolean result = CycpatternCheck.cycpatternCheck(a, b);
				assertTrue(result);
			}
}