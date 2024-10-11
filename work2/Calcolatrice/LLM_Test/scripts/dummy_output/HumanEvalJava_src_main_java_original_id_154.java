// CycpatternCheckTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
			/**
			* Test case 1: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: False
			*/
			@Test
			void test1() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcd", "abd"));
			}

			/**
			* Test case 2: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: True
			*/
			@Test
			void test2() {
				assertTrue(CycpatternCheck.cycpatternCheck("hello", "ell"));
			}

			/**
			* Test case 3: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: False
			*/
			@Test
			void test3() {
				assertFalse(CycpatternCheck.cycpatternCheck("whassup", "psus"));
			}

			/**
			* Test case 4: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: True
			*/
			@Test
			void test4() {
				assertTrue(CycpatternCheck.cycpatternCheck("abab", "baa"));
			}

			/**
			* Test case 5: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: False
			*/
			@Test
			void test5() {
				assertFalse(CycpatternCheck.cycpatternCheck("efef", "eeff"));
			}

			/**
			* Test case 6: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: True
			*/
			@Test
			void test6() {
				assertTrue(CycpatternCheck.cycpatternCheck("himenss", "simen"));
			}

			/**
			* Test case 7: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: False
			*/
			@Test
			void test7() {
				assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
			}

			/**
			* Test case 8: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: True
			*/
			@Test
			void test8() {
				assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
			}

			/**
			* Test case 9: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: False
			*/
			@Test
			void test9() {
				assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
			}

			/**
			* Test case 10: Test if the second word or any of its rotations is a substring in the first word.
			* Expected output: True
			*/
			@Test
			void test10() {
				assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
			}
}