// MeanAbsoluteDeviationTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {

	@Test
	void testMeanAbsoluteDeviation() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation2() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation5() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation6() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation8() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation9() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMeanAbsoluteDeviation10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0);
		Double expected = 1.0;
		Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
		assertEquals(expected, actual);
	}
}