// SearchTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {
			/**
			* Test case 1: search([5, 5, 5, 5, 1]) == 1
			*/
			@Test
			void testCase1() {
				List<Integer> lst = List.of(5, 5, 5, 5, 1);
				assertEquals(1, Search.search(lst));
			}

			/**
			* Test case 2: search([4, 1, 4, 1, 4, 4]) == 4
			*/
			@Test
			void testCase2() {
				List<Integer> lst = List.of(4, 1, 4, 1, 4, 4);
				assertEquals(4, Search.search(lst));
			}

			/**
			* Test case 3: search([3, 3]) == -1
			*/
			@Test
			void testCase3() {
				List<Integer> lst = List.of(3, 3);
				assertEquals(-1, Search.search(lst));
			}

			/**
			* Test case 4: search([8, 8, 8, 8, 8, 8, 8, 8]) == 8
			*/
			@Test
			void testCase4() {
				List<Integer> lst = List.of(8, 8, 8, 8, 8, 8, 8, 8);
				assertEquals(8, Search.search(lst));
			}

			/**
			* Test case 5: search([2, 3, 3, 2, 2]) == 2
			*/
			@Test
			void testCase5() {
				List<Integer> lst = List.of(2, 3, 3, 2, 2);
				assertEquals(2, Search.search(lst));
			}

			/**
			* Test case 6: search([2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1]) == 1
			*/
			@Test
			void testCase6() {
				List<Integer> lst = List.of(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1);
				assertEquals(1, Search.search(lst));
			}

			/**
			* Test case 7: search([3, 2, 8, 2]) == 2
			*/
			@Test
			void testCase7() {
				List<Integer> lst = List.of(3, 2, 8, 2);
				assertEquals(2, Search.search(lst));
			}

			/**
			* Test case 8: search([6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10]) == 1
			*/
			@Test
			void testCase8() {
				List<Integer> lst = List.of(6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10);
				assertEquals(1, Search.search(lst));
			}

			/**
			* Test case 9: search([8, 8, 3, 6, 5, 6, 4]) == -1
			*/
			@Test
			void testCase9() {
				List<Integer> lst = List.of(8, 8, 3, 6, 5, 6, 4);
				assertEquals(-1, Search.search(lst));
			}

			/**
			* Test case 10: search([6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9]) == 1
			*/
			@Test
			void testCase10() {
				List<Integer> lst = List.of(6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9);
				assertEquals(1, Search.search(lst));
			}
}