// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
	/**
			* Test case for an empty list.
			*/
			@Test
			void testEmptyList() {
						List<Object> lst = new ArrayList<>();
						assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for a list with one element.
			*/
			@Test
			void testOneElementList() {
						List<Object> lst = new ArrayList<>();
						lst.add(5);
						assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for a list with two elements.
			*/
			@Test
			void testTwoElementList() {
						List<Object> lst = new ArrayList<>();
						lst.add(1);
						lst.add(2);
						assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for a list with three elements.
			*/
			@Test
			void testThreeElementList() {
						List<Object> lst = new ArrayList<>();
						lst.add(1);
						lst.add(2);
						lst.add(3);
						assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for a list with four elements.
			*/
			@Test
			void testFourElementList() {
						List<Object> lst = new ArrayList<>();
						lst.add(1);
						lst.add(2);
						lst.add(3);
						lst.add(4);
						assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for a list with five elements.
			*/
			@Test
			void testFiveElementList() {
						List<Object> lst = new ArrayList<>();
						lst.add(1);
						lst.add(2);
						lst.add(3);
						lst.add(4);
						lst.add(5);
						assertTrue(IsSorted.isSorted(lst));
			}

			/**
			* Test case for a list with six elements.
			*/
			@Test
			void testSixElementList() {
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
			* Test case for a list with seven elements.
			*/
			@Test
			void testSevenElementList() {
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
			* Test case for a list with eight elements.
			*/
			@Test
			void testEightElementList() {
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
			* Test case for a list with nine elements.
			*/
			@Test
			void testNineElementList() {
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
			* Test case for a list with ten elements.
			*/
			@Test
			void testTenElementList() {
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
						lst.add(10);
						assertTrue(IsSorted.isSorted(lst));
			}
}
