// Maximum1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {
	@Test
			void testCase1() {
				List<Integer> arr = List.of(-3, -4, 5);
				int k = 3;
				List<Integer> expected = List.of(-4, -3, 5);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase2() {
				List<Integer> arr = List.of(4, -4, 4);
				int k = 2;
				List<Integer> expected = List.of(4, 4);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase3() {
				List<Integer> arr = List.of(-3, 2, 1, 2, -1, -2, 1);
				int k = 1;
				List<Integer> expected = List.of(2);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase4() {
				List<Integer> arr = List.of(123, -123, 20, 0, 1, 2, -3);
				int k = 3;
				List<Integer> expected = List.of(2, 20, 123);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase5() {
				List<Integer> arr = List.of(-123, 20, 0, 1, 2, -3);
				int k = 4;
				List<Integer> expected = List.of(0, 1, 2, 20);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase6() {
				List<Integer> arr = List.of(5, 15, 0, 3, -13, -8, 0);
				int k = 7;
				List<Integer> expected = List.of(-13, -8, 0, 0, 3, 5, 15);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase7() {
				List<Integer> arr = List.of(-1, 0, 2, 5, 3, -10);
				int k = 2;
				List<Integer> expected = List.of(3, 5);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase8() {
				List<Integer> arr = List.of(1, 0, 5, -7);
				int k = 1;
				List<Integer> expected = List.of(5);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase9() {
				List<Integer> arr = List.of(4, -4);
				int k = 2;
				List<Integer> expected = List.of(-4, 4);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase10() {
				List<Integer> arr = List.of(-10, 10);
				int k = 2;
				List<Integer> expected = List.of(-10, 10);
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testCase11() {
				List<Integer> arr = List.of(1, 2, 3, -23, 243, -400, 0);
				int k = 0;
				List<Integer> expected = List.of();
				List<Integer> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
}
