// SplitWordsTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

		/**
		* Test case 1.
		* The input string contains a space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase1() {
				String txt = "Hello World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase2() {
				String txt = "Hello,World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains a space and a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase3() {
				String txt = "Hello, World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains a comma and a space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase4() {
				String txt = "Hello ,World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains a space and a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase5() {
				String txt = "Hello World,Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains a comma and a space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase6() {
				String txt = "Hello,World,Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains a space and a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase7() {
				String txt = "Hello, World, Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains a comma and a space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase8() {
				String txt = "Hello ,World ,Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains no space or comma.
		* The expected result is the number of odd letters.
		*/
		@Test
		void testCase9() {
				String txt = "HelloWorld";
				Object expected = 3;
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains no space or comma.
		* The expected result is the number of odd letters.
		*/
		@Test
		void testCase10() {
				String txt = "HelloWorldHello";
				Object expected = 6;
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
}