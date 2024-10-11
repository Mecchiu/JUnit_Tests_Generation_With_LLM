// TotalMatchTest.java
package original;

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
			* It tests the case when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListLessChars() {
				List<Object> lst1 = List.of("hi", "admin");
				List<Object> lst2 = List.of("hi", "hi", "admin", "project");
				List<Object> expected = List.of("hi", "admin");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has more chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListMoreChars() {
				List<Object> lst1 = List.of("hi", "admin", "project");
				List<Object> lst2 = List.of("hi", "hi", "admin");
				List<Object> expected = List.of("hi", "hi", "admin");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has the same number of chars as the second list.
			*/
			@Test
			void testTotalMatchFirstListSameNumberOfChars() {
				List<Object> lst1 = List.of("hi", "admin");
				List<Object> lst2 = List.of("hi", "hi", "admin");
				List<Object> expected = List.of("hi", "admin");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListLessChars2() {
				List<Object> lst1 = List.of("4");
				List<Object> lst2 = List.of("1", "2", "3", "4", "5");
				List<Object> expected = List.of("4");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has more chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListMoreChars2() {
				List<Object> lst1 = List.of("1", "2", "3", "4", "5");
				List<Object> lst2 = List.of("4");
				List<Object> expected = List.of("4");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has the same number of chars as the second list.
			*/
			@Test
			void testTotalMatchFirstListSameNumberOfChars2() {
				List<Object> lst1 = List.of("1", "2", "3", "4", "5");
				List<Object> lst2 = List.of("1", "2", "3", "4", "5");
				List<Object> expected = List.of("1", "2", "3", "4", "5");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListLessChars3() {
				List<Object> lst1 = List.of("hi", "admin");
				List<Object> lst2 = List.of("hI", "Hi");
				List<Object> expected = List.of("hI", "Hi");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has more chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListMoreChars3() {
				List<Object> lst1 = List.of("hI", "Hi");
				List<Object> lst2 = List.of("hi", "admin");
				List<Object> expected = List.of("hi", "admin");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has the same number of chars as the second list.
			*/
			@Test
			void testTotalMatchFirstListSameNumberOfChars3() {
				List<Object> lst1 = List.of("hI", "Hi");
				List<Object> lst2 = List.of("hI", "hi", "hi");
				List<Object> expected = List.of("hI", "hi", "hi");
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListLessChars4() {
				List<Object> lst1 = List.of();
				List<Object> lst2 = List.of("this");
				List<Object> expected = List.of();
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link TotalMatch#totalMatch(List, List)} method.
			* It tests the case when the first list has more chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListMoreChars4() {
				List<Object> lst1 = List.of("this");
				List<Object> lst2 = List.of();
				List<Object> expected = List.of();
				List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(expected, actual);
			}
}