// UniqueDigitsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {
	@Test
			void testCase1() {
				List<Integer> input = List.of(15, 33, 1422, 1);
				List<Integer> expected = List.of(1, 15, 33);
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase2() {
				List<Integer> input = List.of(152, 323, 1422, 10);
				List<Integer> expected = List.of();
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase3() {
				List<Integer> input = List.of(12345, 2033, 111, 151);
				List<Integer> expected = List.of(111, 151);
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase4() {
				List<Integer> input = List.of(135, 103, 31);
				List<Integer> expected = List.of(31, 135);
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase5() {
				List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Integer> expected = List.of(1, 3, 5, 7, 9);
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase6() {
				List<Integer> input = List.of(2, 4, 6, 8, 10);
				List<Integer> expected = List.of();
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase7() {
				List<Integer> input = List.of(0, 2, 4, 6, 8, 10);
				List<Integer> expected = List.of();
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase8() {
				List<Integer> input = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
				List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase9() {
				List<Integer> input = List.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
				List<Integer> expected = List.of();
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			@Test
			void testCase10() {
				List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Integer> expected = List.of(1, 3, 5, 7, 9);
				List<Integer> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}
}
