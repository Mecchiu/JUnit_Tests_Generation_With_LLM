// TotalMatchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
	/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the first list when the two lists have the same number of chars.
			*/
			@Test
			void testTotalMatchSameLength() {
				List<Object> lst1 = List.of("a", "b", "c");
				List<Object> lst2 = List.of("d", "e", "f");
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst1, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the first list when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListLess() {
				List<Object> lst1 = List.of("a", "b", "c");
				List<Object> lst2 = List.of("d", "e", "f", "g");
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst1, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the second list when the second list has less chars than the first list.
			*/
			@Test
			void testTotalMatchSecondListLess() {
				List<Object> lst1 = List.of("a", "b", "c", "d");
				List<Object> lst2 = List.of("e", "f", "g");
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst2, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the first list when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListEmpty() {
				List<Object> lst1 = List.of();
				List<Object> lst2 = List.of("e", "f", "g");
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst1, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the second list when the second list has less chars than the first list.
			*/
			@Test
			void testTotalMatchSecondListEmpty() {
				List<Object> lst1 = List.of("a", "b", "c", "d");
				List<Object> lst2 = List.of();
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst2, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the first list when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListNull() {
				List<Object> lst1 = null;
				List<Object> lst2 = List.of("e", "f", "g");
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst1, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the second list when the second list has less chars than the first list.
			*/
			@Test
			void testTotalMatchSecondListNull() {
				List<Object> lst1 = List.of("a", "b", "c", "d");
				List<Object> lst2 = null;
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst2, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the first list when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListNullAndSecondListEmpty() {
				List<Object> lst1 = null;
				List<Object> lst2 = List.of();
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst1, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the second list when the second list has less chars than the first list.
			*/
			@Test
			void testTotalMatchSecondListNullAndFirstListEmpty() {
				List<Object> lst1 = List.of();
				List<Object> lst2 = null;
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst2, result);
			}

			/**
			* Test case for the method {@link TotalMatch#totalMatch(List, List)}.
			* It checks if the method returns the first list when the first list has less chars than the second list.
			*/
			@Test
			void testTotalMatchFirstListNullAndSecondListNull() {
				List<Object> lst1 = null;
				List<Object> lst2 = null;
				List<Object> result = TotalMatch.totalMatch(lst1, lst2);
				assertEquals(lst1, result);
			}
}
