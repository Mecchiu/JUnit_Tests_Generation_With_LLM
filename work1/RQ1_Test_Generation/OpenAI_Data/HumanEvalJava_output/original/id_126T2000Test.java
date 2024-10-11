// IsSortedTest.java
package original;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
	/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> lst = new ArrayList<>();
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has only one element.
			*/
			@Test
			void testOneElementList() {
				List<Object> lst = new ArrayList<>();
				lst.add(5);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has two elements and they are sorted.
			*/
			@Test
			void testTwoElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has two elements and they are not sorted.
			*/
			@Test
			void testTwoElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(2);
				lst.add(1);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has three elements and they are sorted.
			*/
			@Test
			void testThreeElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has three elements and they are not sorted.
			*/
			@Test
			void testThreeElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(3);
				lst.add(2);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has four elements and they are sorted.
			*/
			@Test
			void testFourElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has four elements and they are not sorted.
			*/
			@Test
			void testFourElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(4);
				lst.add(3);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has five elements and they are sorted.
			*/
			@Test
			void testFiveElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has five elements and they are not sorted.
			*/
			@Test
			void testFiveElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(5);
				lst.add(4);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has six elements and they are sorted.
			*/
			@Test
			void testSixElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has six elements and they are not sorted.
			*/
			@Test
			void testSixElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(6);
				lst.add(5);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has seven elements and they are sorted.
			*/
			@Test
			void testSevenElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				lst.add(7);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has seven elements and they are not sorted.
			*/
			@Test
			void testSevenElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(7);
				lst.add(6);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has eight elements and they are sorted.
			*/
			@Test
			void testEightElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				lst.add(7);
				lst.add(8);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has eight elements and they are not sorted.
			*/
			@Test
			void testEightElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				lst.add(8);
				lst.add(7);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has nine elements and they are sorted.
			*/
			@Test
			void testNineElementListSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				lst.add(7);
				lst.add(8);
				lst.add(9);
				assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has nine elements and they are not sorted.
			*/
			@Test
			void testNineElementListNotSorted() {
				List<Object> lst = new ArrayList<>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				lst.add(7);
				lst.add(9);
				lst.add(8);
				assertFalse(IsSorted.isSorted(lst));
			}

			/**
			* Test case for {@link IsSorted#isSorted(List)}.
			* It tests the case when the list has ten elements and they are sorted.
			*/
			@Test
			void testTenElementListSorted() {
				List<Object> lst =