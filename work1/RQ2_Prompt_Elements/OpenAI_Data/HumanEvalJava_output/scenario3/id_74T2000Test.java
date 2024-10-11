// TotalMatchTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
	/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when both lists are empty.
			*/
			@Test
			void testTotalMatchEmptyLists() {
							List<Object> lst1 = List.of();
							List<Object> lst2 = List.of();
							List<Object> expected = List.of();
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when both lists have the same number of chars.
			*/
			@Test
			void testTotalMatchSameNumberOfChars() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hi", "hi");
							List<Object> expected = List.of("hi", "hi");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less number of chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListHasLessChars() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hi", "hi", "admin", "project");
							List<Object> expected = List.of("hi", "admin");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has more number of chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListHasMoreChars() {
							List<Object> lst1 = List.of("hi", "hi", "admin", "project");
							List<Object> lst2 = List.of("hi", "admin");
							List<Object> expected = List.of("hi", "hi", "admin", "project");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has the same number of chars as the second list.
			*/
			@Test
			void testTotalMatchFirstListHasSameNumberOfChars() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hI", "Hi");
							List<Object> expected = List.of("hI", "Hi");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has the same number of chars as the second list.
			*/
			@Test
			void testTotalMatchFirstListHasSameNumberOfChars2() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hI", "hi", "hi");
							List<Object> expected = List.of("hI", "hi", "hi");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less number of chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListHasLessChars2() {
							List<Object> lst1 = List.of("4");
							List<Object> lst2 = List.of("1", "2", "3", "4", "5");
							List<Object> expected = List.of("4");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less number of chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListHasLessChars3() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hI", "Hi");
							List<Object> expected = List.of("hI", "Hi");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less number of chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListHasLessChars4() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hI", "hi", "hi");
							List<Object> expected = List.of("hI", "hi", "hi");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less number of chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListHasLessChars5() {
							List<Object> lst1 = List.of("hi", "admin");
							List<Object> lst2 = List.of("hI", "hi", "hii");
							List<Object> expected = List.of("hi", "admin");
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list is empty.
			*/
			@Test
			void testTotalMatchFirstListIsEmpty() {
							List<Object> lst1 = List.of();
							List<Object> lst2 = List.of("this");
							List<Object> expected = List.of();
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the second list is empty.
			*/
			@Test
			void testTotalMatchSecondListIsEmpty() {
							List<Object> lst1 = List.of("this");
							List<Object> lst2 = List.of();
							List<Object> expected = List.of();
							List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
							assertEquals(expected, actual);
			}
}
