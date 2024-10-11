// FindMaxTest.java
package scenario1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
	// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<String> words = new ArrayList<>();
				String result = FindMax.findMax(words);
				assertNull(result);
			}
			
			// Test case 2: Test with list containing one word
			@Test
			void testOneWord() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				String result = FindMax.findMax(words);
				assertEquals("hello", result);
			}
			
			// Test case 3: Test with list containing multiple words with unique characters
			@Test
			void testMultipleWordsUniqueChars() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				String result = FindMax.findMax(words);
				assertEquals("world", result);
			}
			
			// Test case 4: Test with list containing multiple words with same number of unique characters
			@Test
			void testMultipleWordsSameUniqueChars() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				String result = FindMax.findMax(words);
				assertEquals("code", result);
			}
			
			// Test case 5: Test with list containing multiple words with same number of unique characters and same first character
			@Test
			void testMultipleWordsSameUniqueCharsSameFirstChar() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				words.add("cat");
				String result = FindMax.findMax(words);
				assertEquals("cat", result);
			}
			
			// Test case 6: Test with list containing multiple words with same number of unique characters and same first character
			@Test
			void testMultipleWordsSameUniqueCharsSameFirstChar2() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				words.add("cat");
				words.add("dog");
				String result = FindMax.findMax(words);
				assertEquals("cat", result);
			}
			
			// Test case 7: Test with list containing multiple words with same number of unique characters and same first character
			@Test
			void testMultipleWordsSameUniqueCharsSameFirstChar3() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				words.add("cat");
				words.add("dog");
				words.add("apple");
				String result = FindMax.findMax(words);
				assertEquals("apple", result);
			}
			
			// Test case 8: Test with list containing multiple words with same number of unique characters and same first character
			@Test
			void testMultipleWordsSameUniqueCharsSameFirstChar4() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				words.add("cat");
				words.add("dog");
				words.add("apple");
				words.add("banana");
				String result = FindMax.findMax(words);
				assertEquals("apple", result);
			}
			
			// Test case 9: Test with list containing multiple words with same number of unique characters and same first character
			@Test
			void testMultipleWordsSameUniqueCharsSameFirstChar5() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				words.add("cat");
				words.add("dog");
				words.add("apple");
				words.add("banana");
				words.add("orange");
				String result = FindMax.findMax(words);
				assertEquals("apple", result);
			}
			
			// Test case 10: Test with list containing multiple words with same number of unique characters and same first character
			@Test
			void testMultipleWordsSameUniqueCharsSameFirstChar6() {
				List<String> words = new ArrayList<>();
				words.add("hello");
				words.add("world");
				words.add("java");
				words.add("code");
				words.add("cat");
				words.add("dog");
				words.add("apple");
				words.add("banana");
				words.add("orange");
				words.add("pear");
				String result = FindMax.findMax(words);
				assertEquals("apple", result);
			}
}