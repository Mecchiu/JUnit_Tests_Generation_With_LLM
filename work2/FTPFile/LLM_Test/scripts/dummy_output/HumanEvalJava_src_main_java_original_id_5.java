// IntersperseTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {
			// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> numbers = new ArrayList<Object>();
				int delimiter = 4;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 2: List with one element
			@Test
			void testListWithOneElement() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				int delimiter = 4;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 3: List with two elements
			@Test
			void testListWithTwoElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				int delimiter = 4;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(4);
				expected.add(2);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 4: List with three elements
			@Test
			void testListWithThreeElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				int delimiter = 4;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(4);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 5: List with four elements
			@Test
			void testListWithFourElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				numbers.add(6);
				numbers.add(3);
				numbers.add(2);
				int delimiter = 8;
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(8);
				expected.add(6);
				expected.add(8);
				expected.add(3);
				expected.add(8);
				expected.add(2);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 6: List with five elements
			@Test
			void testListWithFiveElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(2);
				numbers.add(2);
				numbers.add(2);
				numbers.add(2);
				numbers.add(2);
				int delimiter = 2;
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 7: List with six elements
			@Test
			void testListWithSixElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				int delimiter = 7;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(7);
				expected.add(2);
				expected.add(7);
				expected.add(3);
				expected.add(7);
				expected.add(4);
				expected.add(7);
				expected.add(5);
				expected.add(7);
				expected.add(6);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 8: List with seven elements
			@Test
			void testListWithSevenElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				int delimiter = 8;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(8);
				expected.add(2);
				expected.add(8);
				expected.add(3);
				expected.add(8);
				expected.add(4);
				expected.add(8);
				expected.add(5);
				expected.add(8);
				expected.add(6);
				expected.add(8);
				expected.add(7);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 9: List with eight elements
			@Test
			void testListWithEightElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				numbers.add(8);
				int delimiter = 9;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(9);
				expected.add(2);
				expected.add(9);
				expected.add(3);
				expected.add(9);
				expected.add(4);
				expected.add(9);
				expected.add(5);
				expected.add(9);
				expected.add(6);
				expected.add(9);
				expected.add(7);
				expected.add(9);
				expected.add(8);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}

			// Test case 10: List with nine elements
			@Test
			void testListWithNineElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				numbers.add(8);
				numbers.add(9);
				int delimiter = 10;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(10);
				expected.add(2);
				expected.add(10);
				expected.add(3);
				expected.add(10);
				expected.add(4);
				expected.add(10);
				expected.add(5);
				expected.add(10);
				expected.add(6);
				expected.add(10);
				expected.add(7);
				expected.add(10);
				expected.add(8);
				expected.add(10);
				expected.add(9);
				List<Object> actual = Intersperse.intersperse(numbers, delimiter);
				assertEquals(expected, actual);
			}
}