// MeanAbsoluteDeviationTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {
			// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Double> numbers = List.of();
				Double expected = 0.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 2: List with one element
			@Test
			void testOneElementList() {
				List<Double> numbers = List.of(1.0);
				Double expected = 0.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 3: List with two elements
			@Test
			void testTwoElementsList() {
				List<Double> numbers = List.of(1.0, 2.0);
				Double expected = 0.5;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 4: List with three elements
			@Test
			void testThreeElementsList() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0);
				Double expected = 0.6666666666666666;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 5: List with four elements
			@Test
			void testFourElementsList() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
				Double expected = 1.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 6: List with five elements
			@Test
			void testFiveElementsList() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
				Double expected = 1.2;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 7: List with negative elements
			@Test
			void testNegativeElementsList() {
				List<Double> numbers = List.of(-1.0, -2.0, -3.0, -4.0, -5.0);
				Double expected = 1.2;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 8: List with positive and negative elements
			@Test
			void testPositiveAndNegativeElementsList() {
				List<Double> numbers = List.of(-1.0, 2.0, -3.0, 4.0, -5.0);
				Double expected = 2.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 9: List with decimal elements
			@Test
			void testDecimalElementsList() {
				List<Double> numbers = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
				Double expected = 1.32;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 10: List with large elements
			@Test
			void testLargeElementsList() {
				List<Double> numbers = List.of(1000000000.0, 2000000000.0, 3000000000.0, 4000000000.0, 5000000000.0);
				Double expected = 1000000000.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}
}