// SmallestChangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
	@Test
			void testSmallestChange1() {
				List<Integer> arr = List.of(1, 2, 3, 5, 4, 7, 9, 6);
				int expected = 4;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange2() {
				List<Integer> arr = List.of(1, 2, 3, 4, 3, 2, 2);
				int expected = 1;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange3() {
				List<Integer> arr = List.of(1, 2, 3, 2, 1);
				int expected = 0;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange4() {
				List<Integer> arr = List.of(1, 4, 2);
				int expected = 1;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange5() {
				List<Integer> arr = List.of(1, 4, 4, 2);
				int expected = 1;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange6() {
				List<Integer> arr = List.of(1, 2, 3, 2, 1);
				int expected = 0;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange7() {
				List<Integer> arr = List.of(3, 1, 1, 3);
				int expected = 0;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange8() {
				List<Integer> arr = List.of(1);
				int expected = 0;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange9() {
				List<Integer> arr = List.of(0, 1);
				int expected = 1;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testSmallestChange10() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int expected = 4;
				int actual = SmallestChange.smallestChange(arr);
				assertEquals(expected, actual);
			}
}