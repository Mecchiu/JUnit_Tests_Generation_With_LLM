// RemoveDuplicatesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {
	// Test case 1: Test with a list of integers that contains duplicates.
			@Test
			void testRemoveDuplicatesWithDuplicates() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(2);
				numbers.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				expected.add(4);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with an empty list.
			@Test
			void testRemoveDuplicatesWithEmptyList() {
				List<Object> numbers = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with a list of integers that does not contain duplicates.
			@Test
			void testRemoveDuplicatesWithoutDuplicates() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of integers that contains duplicates at the beginning.
			@Test
			void testRemoveDuplicatesWithDuplicatesAtBeginning() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of integers that contains duplicates at the end.
			@Test
			void testRemoveDuplicatesWithDuplicatesAtEnd() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with a list of integers that contains duplicates in the middle.
			@Test
			void testRemoveDuplicatesWithDuplicatesInMiddle() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(3);
				numbers.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(4);
				expected.add(5);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of integers that contains only duplicates.
			@Test
			void testRemoveDuplicatesWithOnlyDuplicates() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(1);
				numbers.add(1);
				numbers.add(1);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of integers that contains duplicates and negative numbers.
			@Test
			void testRemoveDuplicatesWithDuplicatesAndNegativeNumbers() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(-1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(2);
				numbers.add(4);
				numbers.add(-1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(3);
				expected.add(4);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of integers that contains duplicates and zero.
			@Test
			void testRemoveDuplicatesWithDuplicatesAndZero() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(0);
				numbers.add(2);
				numbers.add(3);
				numbers.add(2);
				numbers.add(4);
				numbers.add(0);
				List<Object> expected = new ArrayList<Object>();
				expected.add(3);
				expected.add(4);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of integers that contains duplicates and positive numbers.
			@Test
			void testRemoveDuplicatesWithDuplicatesAndPositiveNumbers() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(2);
				numbers.add(4);
				numbers.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(3);
				expected.add(4);
				List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
				assertEquals(expected, actual);
			}
}
