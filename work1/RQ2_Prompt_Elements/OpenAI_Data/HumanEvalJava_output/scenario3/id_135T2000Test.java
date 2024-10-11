// CanArrangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {
	@Test
			void testCanArrange1() {
				List<Object> arr = List.of(1, 2, 4, 3, 5);
				int expected = 3;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange2() {
				List<Object> arr = List.of(1, 2, 3);
				int expected = -1;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange3() {
				List<Object> arr = List.of(1, 2, 4, 5);
				int expected = -1;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange4() {
				List<Object> arr = List.of(1, 4, 2, 5, 6, 7, 8, 9, 10);
				int expected = 2;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange5() {
				List<Object> arr = List.of(4, 8, 5, 7, 3);
				int expected = 4;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange6() {
				List<Object> arr = List.of();
				int expected = -1;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange7() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				int expected = 8;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange8() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				int expected = 9;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange9() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
				int expected = 10;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testCanArrange10() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
				int expected = 11;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}
}
