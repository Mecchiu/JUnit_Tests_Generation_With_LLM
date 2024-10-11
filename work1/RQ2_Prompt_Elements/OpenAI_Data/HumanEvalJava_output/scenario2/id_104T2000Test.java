// UniqueDigitsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {
	// Test case 1: Test with empty list
			@Test
			void testUniqueDigitsWithEmptyList() {
				List<Integer> input = new ArrayList<Integer>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with list of one element
			@Test
			void testUniqueDigitsWithOneElement() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with list of two elements
			@Test
			void testUniqueDigitsWithTwoElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with list of three elements
			@Test
			void testUniqueDigitsWithThreeElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with list of four elements
			@Test
			void testUniqueDigitsWithFourElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with list of five elements
			@Test
			void testUniqueDigitsWithFiveElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with list of six elements
			@Test
			void testUniqueDigitsWithSixElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with list of seven elements
			@Test
			void testUniqueDigitsWithSevenElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with list of eight elements
			@Test
			void testUniqueDigitsWithEightElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with list of nine elements
			@Test
			void testUniqueDigitsWithNineElements() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				input.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				expected.add(9);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}
		}
