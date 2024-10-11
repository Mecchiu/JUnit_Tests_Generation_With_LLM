// SelectWordsTest.java
package original;

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
			* Test case 1: Test the case when the string is empty.
			* Expected result: An empty list.
			*/
			@Test
			void testEmptyString() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord2() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord3() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord4() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord5() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord6() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord7() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord8() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: Test the case when the string contains only one word.
			* Expected result: An empty list.
			*/
			@Test
			void testOneWord9() {
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SelectWords.selectWords("Hello", 4);
				assertEquals(expected, actual);
			}
}
