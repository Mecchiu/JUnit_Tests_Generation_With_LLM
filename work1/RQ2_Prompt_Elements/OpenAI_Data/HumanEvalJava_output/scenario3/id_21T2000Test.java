// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
	@Test
			void testRescaleToUnit() {
				List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
				List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit2() {
				List<Double> numbers = Arrays.asList(2.0, 49.9);
				List<Double> expected = Arrays.asList(0.0, 1.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit3() {
				List<Double> numbers = Arrays.asList(100.0, 49.9);
				List<Double> expected = Arrays.asList(1.0, 0.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit4() {
				List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
				List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit5() {
				List<Double> numbers = Arrays.asList(2.0, 1.0, 5.0, 3.0, 4.0);
				List<Double> expected = Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit6() {
				List<Double> numbers = Arrays.asList(12.0, 11.0, 15.0, 13.0, 14.0);
				List<Double> expected = Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit7() {
				List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
				List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit8() {
				List<Double> numbers = Arrays.asList(2.0, 49.9);
				List<Double> expected = Arrays.asList(0.0, 1.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit9() {
				List<Double> numbers = Arrays.asList(100.0, 49.9);
				List<Double> expected = Arrays.asList(1.0, 0.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
			
			@Test
			void testRescaleToUnit10() {
				List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
				List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
				List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
				assertEquals(expected, actual);
			}
}