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
		* Test case 1.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void test1() {
			assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "defabc"));
		}
		
		/**
		* Test case 2.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void test2() {
			assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "abcdef"));
		}
		
		/**
		* Test case 3.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void test3() {
			assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "def"));
		}
		
		/**
		* Test case 4.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void test4() {
			assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "abc"));
		}
		
		/**
		* Test case 5.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void test5() {
			assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "cde"));
		}
		
		/**
		* Test case 6.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void test6() {
			assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "defg"));
		}
		
		/**
		* Test case 7.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void test7() {
			assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcd"));
		}
		
		/**
		* Test case 8.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void test8() {
			assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "defab"));
		}
		
		/**
		* Test case 9.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void test9() {
			assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcde"));
		}
		
		/**
		* Test case 10.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void test10() {
			assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "cdef"));
		}
}