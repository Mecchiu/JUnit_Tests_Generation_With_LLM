// FilterBySubstringTest.java
package original;

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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns an empty list when the input list is empty.
		*/
		@Test
		void testEmptyList() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns an empty list when the input list is empty.
		*/
		@Test
		void testEmptyList2() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "john");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement2() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "john");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement3() {
				List<Object> input = new ArrayList<Object>();
				input.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "xxx");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement4() {
				List<Object> input = new ArrayList<Object>();
				input.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "xx");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement5() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "run");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement6() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "trumpet");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement7() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "prune");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement8() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "gruesome");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement9() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "trumpet");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement10() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "prune");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement11() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "gruesome");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement12() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "trumpet");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement13() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "prune");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement14() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "gruesome");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement15() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "trumpet");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement16() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "prune");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement17() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "gruesome");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement18() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "trumpet");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement19() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "prune");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement20() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "gruesome");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement21() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "trumpet");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains only one element.
		*/
		@Test
		void testOneElement22() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "prune");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {