// SelectWordsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

		/**
		* Test case 1.
		* The input string is null.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords(null, 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase2() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase3() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase4() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase5() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase6() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase7() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase8() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase9() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains only one word.
		* The expected result is an empty list.
		*/
		@Test
		void testCase10() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("word", 2);
				assertEquals(expected, actual);
		}
}