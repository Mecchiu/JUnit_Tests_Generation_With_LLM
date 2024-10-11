// FindMaxTest.java
package original;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list is null.
			*/
			@Test
			void testNullList() {
				List<String> words = null;
				String result = FindMax.findMax(words);
				assertNull(result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<String> words = new ArrayList<>();
				String result = FindMax.findMax(words);
				assertNull(result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains one element.
			*/
			@Test
			void testOneElementList() {
				List<String> words = new ArrayList<>();
				words.add("b");
				String result = FindMax.findMax(words);
				assertEquals("b", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains two elements.
			*/
			@Test
			void testTwoElementList() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("cba");
				String result = FindMax.findMax(words);
				assertEquals("abc", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains three elements.
			*/
			@Test
			void testThreeElementList() {
				List<String> words = new ArrayList<>();
				words.add("play");
				words.add("this");
				words.add("game");
				String result = FindMax.findMax(words);
				assertEquals("game", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains four elements.
			*/
			@Test
			void testFourElementList() {
				List<String> words = new ArrayList<>();
				words.add("we");
				words.add("are");
				words.add("gonna");
				words.add("rock");
				String result = FindMax.findMax(words);
				assertEquals("gonna", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains five elements.
			*/
			@Test
			void testFiveElementList() {
				List<String> words = new ArrayList<>();
				words.add("we");
				words.add("are");
				words.add("a");
				words.add("mad");
				words.add("nation");
				String result = FindMax.findMax(words);
				assertEquals("nation", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains six elements.
			*/
			@Test
			void testSixElementList() {
				List<String> words = new ArrayList<>();
				words.add("this");
				words.add("is");
				words.add("a");
				words.add("prrk");
				words.add("of");
				words.add("footbott");
				String result = FindMax.findMax(words);
				assertEquals("footbott", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains seven elements.
			*/
			@Test
			void testSevenElementList() {
				List<String> words = new ArrayList<>();
				words.add("name");
				words.add("of");
				words.add("string");
				words.add("enam");
				words.add("game");
				words.add("aaaaaaa");
				words.add("bb");
				String result = FindMax.findMax(words);
				assertEquals("aaaaaaa", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains eight elements.
			*/
			@Test
			void testEightElementList() {
				List<String> words = new ArrayList<>();
				words.add("name");
				words.add("of");
				words.add("string");
				words.add("enam");
				words.add("game");
				words.add("aaaaaaa");
				words.add("bb");
				words.add("cc");
				String result = FindMax.findMax(words);
				assertEquals("aaaaaaa", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains nine elements.
			*/
			@Test
			void testNineElementList() {
				List<String> words = new ArrayList<>();
				words.add("name");
				words.add("of");
				words.add("string");
				words.add("enam");
				words.add("game");
				words.add("aaaaaaa");
				words.add("bb");
				words.add("cc");
				words.add("play");
				String result = FindMax.findMax(words);
				assertEquals("aaaaaaa", result);
			}

			/**
			* Test case for {@link FindMax#findMax(List)}.
			* It tests the case when the input list contains ten elements.
			*/
			@Test
			void testTenElementList() {
				List<String> words = new ArrayList<>();
				words.add("name");
				words.add("of");
				words.add("string");
				words.add("enam");
				words.add("game");
				words.add("aaaaaaa");
				words.add("bb");
				words.add("cc");
				words.add("play");
				words.add("this");
				String result = FindMax.findMax(words);
				assertEquals("aaaaaaa", result);
			}
}