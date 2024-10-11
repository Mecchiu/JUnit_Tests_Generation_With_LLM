// AddElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
	@Test
			void testAddElements1() {
				List<Integer> arr = List.of(1, -2, -3, 41, 57, 76, 87, 88, 99);
				int k = 3;
				int expected = -4;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements2() {
				List<Integer> arr = List.of(111, 121, 3, 4000, 5, 6);
				int k = 2;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements3() {
				List<Integer> arr = List.of(11, 21, 3, 90, 5, 6, 7, 8, 9);
				int k = 4;
				int expected = 125;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements4() {
				List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
				int k = 4;
				int expected = 24;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements5() {
				List<Integer> arr = List.of(1);
				int k = 1;
				int expected = 1;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements6() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int k = 9;
				int expected = 45;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements7() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int k = 1;
				int expected = 1;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements8() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int k = 2;
				int expected = 3;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements9() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int k = 3;
				int expected = 6;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}

			@Test
			void testAddElements10() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int k = 4;
				int expected = 10;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
			}
}
