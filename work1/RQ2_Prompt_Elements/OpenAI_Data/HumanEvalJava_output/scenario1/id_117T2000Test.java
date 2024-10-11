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
	// Test case 1: Test with empty string
			@Test
			void testSelectWords1() {
				String s = "";
				int n = 0;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, result);
			}
			
			// Test case 2: Test with string with no words
			@Test
			void testSelectWords2() {
				String s = "123";
				int n = 1;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, result);
			}
			
			// Test case 3: Test with string with one word
			@Test
			void testSelectWords3() {
				String s = "Hello";
				int n = 2;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, result);
			}
			
			// Test case 4: Test with string with multiple words and no words with n consonants
			@Test
			void testSelectWords4() {
				String s = "Hello World";
				int n = 3;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, result);
			}
			
			// Test case 5: Test with string with multiple words and one word with n consonants
			@Test
			void testSelectWords5() {
				String s = "Hello World";
				int n = 2;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				expected.add("Hello");
				assertEquals(expected, result);
			}
			
			// Test case 6: Test with string with multiple words and multiple words with n consonants
			@Test
			void testSelectWords6() {
				String s = "Hello World";
				int n = 1;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				expected.add("Hello");
				expected.add("World");
				assertEquals(expected, result);
			}
			
			// Test case 7: Test with string with multiple words and all words with n consonants
			@Test
			void testSelectWords7() {
				String s = "Hello World";
				int n = 5;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				expected.add("Hello");
				expected.add("World");
				assertEquals(expected, result);
			}
			
			// Test case 8: Test with string with multiple words and all words with n consonants
			@Test
			void testSelectWords8() {
				String s = "Hello World";
				int n = 6;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, result);
			}
			
			// Test case 9: Test with string with multiple words and all words with n consonants
			@Test
			void testSelectWords9() {
				String s = "Hello World";
				int n = 0;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				expected.add("Hello");
				expected.add("World");
				assertEquals(expected, result);
			}
			
			// Test case 10: Test with string with multiple words and all words with n consonants
			@Test
			void testSelectWords10() {
				String s = "Hello World";
				int n = -1;
				List<Object> result = SelectWords.selectWords(s, n);
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, result);
			}
}