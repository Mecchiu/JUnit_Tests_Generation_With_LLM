// HasCloseElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
			// Test case 1: hasCloseElements([1.0, 2.0, 3.0], 0.5) = false
			@Test
			void testHasCloseElements1() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0);
				Double threshold = 0.5;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}

			// Test case 2: hasCloseElements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3) = true
			@Test
			void testHasCloseElements2() {
				List<Double> numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
				Double threshold = 0.3;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}

			// Test case 3: hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3) = true
			@Test
			void testHasCloseElements3() {
				List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
				Double threshold = 0.3;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}

			// Test case 4: hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.05) = false
			@Test
			void testHasCloseElements4() {
				List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
				Double threshold = 0.05;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}

			// Test case 5: hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.95) = true
			@Test
			void testHasCloseElements5() {
				List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
				Double threshold = 0.95;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}

			// Test case 6: hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.8) = false
			@Test
			void testHasCloseElements6() {
				List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
				Double threshold = 0.8;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}

			// Test case 7: hasCloseElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0], 0.1) = true
			@Test
			void testHasCloseElements7() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
				Double threshold = 0.1;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}

			// Test case 8: hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 1.0) = true
			@Test
			void testHasCloseElements8() {
				List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}

			// Test case 9: hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 0.5) = false
			@Test
			void testHasCloseElements9() {
				List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
				Double threshold = 0.5;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}

			// Test case 10: hasCloseElements([1.0, 2.0, 3.0], 0.0) = false
			@Test
			void testHasCloseElements10() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0);
				Double threshold = 0.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}
}