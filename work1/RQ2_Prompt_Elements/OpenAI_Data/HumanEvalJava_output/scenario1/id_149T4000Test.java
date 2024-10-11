// SortedListSumTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

		/**
		* Test case 1.
		* The input list is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<String> lst = new ArrayList<String>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase2() {
				List<String> lst = new ArrayList<String>();
				lst.add("a");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase3() {
				List<String> lst = new ArrayList<String>();
				lst.add("ab");
				List<Object> expected = new ArrayList<Object>();
				expected.add("ab");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase4() {
				List<String> lst = new ArrayList<String>();
				lst.add("abc");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase5() {
				List<String> lst = new ArrayList<String>();
				lst.add("abcd");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase6() {
				List<String> lst = new ArrayList<String>();
				lst.add("a");
				lst.add("ab");
				lst.add("abc");
				lst.add("abcd");
				List<Object> expected = new ArrayList<Object>();
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase7() {
				List<String> lst = new ArrayList<String>();
				lst.add("ab");
				lst.add("a");
				lst.add("abc");
				lst.add("abcd");
				List<Object> expected = new ArrayList<Object>();
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase8() {
				List<String> lst = new ArrayList<String>();
				lst.add("ab");
				lst.add("abc");
				lst.add("a");
				lst.add("abcd");
				List<Object> expected = new ArrayList<Object>();
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase9() {
				List<String> lst = new ArrayList<String>();
				lst.add("ab");
				lst.add("abc");
				lst.add("abcd");
				lst.add("a");
				List<Object> expected = new ArrayList<Object>();
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input list contains only one element.
		* The expected result is an empty list.
		*/
		@Test
		void testCase10() {
				List<String> lst = new ArrayList<String>();
				lst.add("ab");
				lst.add("abc");
				lst.add("abcd");
				lst.add("a");
				lst.add("ab");
				lst.add("abc");
				lst.add("abcd");
				lst.add("a");
				List<Object> expected = new ArrayList<Object>();
				expected.add("ab");
				expected.add("ab");
				expected.add("abc");
				expected.add("abc");
				expected.add("abcd");
				expected.add("abcd");
				List<Object> actual = SortedListSum.sortedListSum(lst);
				assertEquals(expected, actual);
		}
}