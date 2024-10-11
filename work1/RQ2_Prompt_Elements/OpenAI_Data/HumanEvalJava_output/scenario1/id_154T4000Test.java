// CycpatternCheckTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

		/**
		* Test case 1.
		* The method should return true if the pattern is present in the string.
		*/
		@Test
		void testCase1() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcabcabc", "abc"));
		}
		
		/**
		* Test case 2.
		* The method should return false if the pattern is not present in the string.
		*/
		@Test
		void testCase2() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcabcabc", "abcd"));
		}
		
		/**
		* Test case 3.
		* The method should return true if the pattern is present in the string.
		*/
		@Test
		void testCase3() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcabcabc", "abcabc"));
		}
		
		/**
		* Test case 4.
		* The method should return false if the pattern is not present in the string.
		*/
		@Test
		void testCase4() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcabcabc", "abcdabcd"));
		}
		
		/**
		* Test case 5.
		* The method should return true if the pattern is present in the string.
		*/
		@Test
		void testCase5() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcabcabc", "abcabcabc"));
		}
		
		/**
		* Test case 6.
		* The method should return false if the pattern is not present in the string.
		*/
		@Test
		void testCase6() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcabcabc", "abcdabcdabcd"));
		}
		
		/**
		* Test case 7.
		* The method should return true if the pattern is present in the string.
		*/
		@Test
		void testCase7() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcabcabc", "abcabcabcabc"));
		}
		
		/**
		* Test case 8.
		* The method should return false if the pattern is not present in the string.
		*/
		@Test
		void testCase8() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcabcabc", "abcdabcdabcdabcd"));
		}
		
		/**
		* Test case 9.
		* The method should return true if the pattern is present in the string.
		*/
		@Test
		void testCase9() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcabcabc", "abcabcabcabcabc"));
		}
		
		/**
		* Test case 10.
		* The method should return false if the pattern is not present in the string.
		*/
		@Test
		void testCase10() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcabcabc", "abcdabcdabcdabcdabcd"));
		}
}