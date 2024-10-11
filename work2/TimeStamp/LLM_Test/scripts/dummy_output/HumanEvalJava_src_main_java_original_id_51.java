// RemoveVowelsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "abcdef".
			*/
			@Test
			void testRemoveVowels1() {
						String input = "abcdef";
						String expected = "bcdf";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "aaaaa".
			*/
			@Test
			void testRemoveVowels2() {
						String input = "aaaaa";
						String expected = "";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "aaBAA".
			*/
			@Test
			void testRemoveVowels3() {
						String input = "aaBAA";
						String expected = "B";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "zbcd".
			*/
			@Test
			void testRemoveVowels4() {
						String input = "zbcd";
						String expected = "zbcd";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "".
			*/
			@Test
			void testRemoveVowels5() {
						String input = "";
						String expected = "";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "abcdef\nghijklm".
			*/
			@Test
			void testRemoveVowels6() {
						String input = "abcdef\nghijklm";
						String expected = "bcdf\nghjklm";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "fedcba".
			*/
			@Test
			void testRemoveVowels7() {
						String input = "fedcba";
						String expected = "fdcb";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "eeeee".
			*/
			@Test
			void testRemoveVowels8() {
						String input = "eeeee";
						String expected = "";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "acBAA".
			*/
			@Test
			void testRemoveVowels9() {
						String input = "acBAA";
						String expected = "cB";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link RemoveVowels#removeVowels(String)} method.
			* It tests the case when the input string is "EcBOO".
			*/
			@Test
			void testRemoveVowels10() {
						String input = "EcBOO";
						String expected = "cB";
						String actual = RemoveVowels.removeVowels(input);
						assertEquals(expected, actual);
			}
}