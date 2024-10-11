// PluckTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
			@Test
			void testPluck1() {
				List<Object> arr = List.of(4, 2, 3);
				List<Object> expected = List.of(2, 1);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck2() {
				List<Object> arr = List.of(1, 2, 3);
				List<Object> expected = List.of(2, 1);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck3() {
				List<Object> arr = List.of();
				List<Object> expected = List.of();
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck4() {
				List<Object> arr = List.of(5, 0, 3, 0, 4, 2);
				List<Object> expected = List.of(0, 1);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck5() {
				List<Object> arr = List.of(1, 2, 3, 0, 5, 3);
				List<Object> expected = List.of(0, 3);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck6() {
				List<Object> arr = List.of(5, 4, 8, 4, 8);
				List<Object> expected = List.of(4, 1);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck7() {
				List<Object> arr = List.of(7, 6, 7, 1);
				List<Object> expected = List.of(6, 1);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck8() {
				List<Object> arr = List.of(7, 9, 7, 1);
				List<Object> expected = List.of();
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck9() {
				List<Object> arr = List.of(0, 0, 0, 0, 0, 0);
				List<Object> expected = List.of(0, 0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			@Test
			void testPluck10() {
				List<Object> arr = List.of(1, 3, 5, 7, 9);
				List<Object> expected = List.of();
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}
}