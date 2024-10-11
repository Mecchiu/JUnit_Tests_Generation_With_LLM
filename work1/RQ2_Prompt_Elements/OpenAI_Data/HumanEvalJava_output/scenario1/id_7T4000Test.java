// FilterBySubstringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

		/**
		* Test case 1.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return an empty list
		* when the input list is empty.
		*/
		@Test
		void testCase1() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return an empty list
		* when the input list contains only null values.
		*/
		@Test
		void testCase2() {
				List<Object> input = new ArrayList<Object>();
				input.add(null);
				input.add(null);
				input.add(null);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return an empty list
		* when the input list contains only empty strings.
		*/
		@Test
		void testCase3() {
				List<Object> input = new ArrayList<Object>();
				input.add("");
				input.add("");
				input.add("");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return an empty list
		* when the input list contains only strings that do not contain the substring.
		*/
		@Test
		void testCase4() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("string2");
				input.add("string3");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return a list
		* containing only the strings that contain the substring.
		*/
		@Test
		void testCase5() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("substring");
				input.add("string3");
				List<Object> expected = new ArrayList<Object>();
				expected.add("substring");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return a list
		* containing only the strings that contain the substring.
		*/
		@Test
		void testCase6() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("substring");
				input.add("string3");
				input.add("substring");
				List<Object> expected = new ArrayList<Object>();
				expected.add("substring");
				expected.add("substring");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return a list
		* containing only the strings that contain the substring.
		*/
		@Test
		void testCase7() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("substring");
				input.add("string3");
				input.add("substring");
				input.add("string5");
				List<Object> expected = new ArrayList<Object>();
				expected.add("substring");
				expected.add("substring");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return a list
		* containing only the strings that contain the substring.
		*/
		@Test
		void testCase8() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("substring");
				input.add("string3");
				input.add("substring");
				input.add("string5");
				input.add("substring");
				List<Object> expected = new ArrayList<Object>();
				expected.add("substring");
				expected.add("substring");
				expected.add("substring");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return a list
		* containing only the strings that contain the substring.
		*/
		@Test
		void testCase9() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("substring");
				input.add("string3");
				input.add("substring");
				input.add("string5");
				input.add("substring");
				input.add("string7");
				List<Object> expected = new ArrayList<Object>();
				expected.add("substring");
				expected.add("substring");
				expected.add("substring");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The method {@link FilterBySubstring#filterBySubstring(List, String)} should return a list
		* containing only the strings that contain the substring.
		*/
		@Test
		void testCase10() {
				List<Object> input = new ArrayList<Object>();
				input.add("string1");
				input.add("substring");
				input.add("string3");
				input.add("substring");
				input.add("string5");
				input.add("substring");
				input.add("string7");
				input.add("substring");
				List<Object> expected = new ArrayList<Object>();
				expected.add("substring");
				expected.add("substring");
				expected.add("substring");
				expected.add("substring");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "substring");
				assertEquals(expected, actual);
		}
}