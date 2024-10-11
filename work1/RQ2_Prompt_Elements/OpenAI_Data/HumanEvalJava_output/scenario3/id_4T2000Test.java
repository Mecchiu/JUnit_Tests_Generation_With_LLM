// MeanAbsoluteDeviationTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {
	// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Double> numbers = new ArrayList<>();
				Double expected = 0.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with list of one element
			@Test
			void testOneElementList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				Double expected = 0.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with list of two elements
			@Test
			void testTwoElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				Double expected = 0.5;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with list of three elements
			@Test
			void testThreeElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				Double expected = 0.6666666666666666;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with list of four elements
			@Test
			void testFourElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				Double expected = 1.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with list of five elements
			@Test
			void testFiveElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				Double expected = 1.2;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with list of negative elements
			@Test
			void testNegativeElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(-1.0);
				numbers.add(-2.0);
				numbers.add(-3.0);
				numbers.add(-4.0);
				numbers.add(-5.0);
				Double expected = 1.2;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with list of decimal elements
			@Test
			void testDecimalElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.5);
				numbers.add(2.5);
				numbers.add(3.5);
				numbers.add(4.5);
				numbers.add(5.5);
				Double expected = 1.2;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with list of duplicate elements
			@Test
			void testDuplicateElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(1.0);
				numbers.add(1.0);
				numbers.add(1.0);
				numbers.add(1.0);
				Double expected = 0.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with list of large elements
			@Test
			void testLargeElementsList() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1000000000.0);
				numbers.add(2000000000.0);
				numbers.add(3000000000.0);
				numbers.add(4000000000.0);
				numbers.add(5000000000.0);
				Double expected = 1000000000.0;
				Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
				assertEquals(expected, actual);
			}
}