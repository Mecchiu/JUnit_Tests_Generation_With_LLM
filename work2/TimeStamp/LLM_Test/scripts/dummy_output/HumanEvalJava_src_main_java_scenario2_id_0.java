// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
			// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Double> numbers = new ArrayList<>();
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}
			
			// Test case 2: List with one element
			@Test
			void testOneElement() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertFalse(result);
			}
			
			// Test case 3: List with two elements
			@Test
			void testTwoElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 4: List with three elements
			@Test
			void testThreeElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 5: List with four elements
			@Test
			void testFourElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 6: List with five elements
			@Test
			void testFiveElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 7: List with six elements
			@Test
			void testSixElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 8: List with seven elements
			@Test
			void testSevenElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 9: List with eight elements
			@Test
			void testEightElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
			
			// Test case 10: List with nine elements
			@Test
			void testNineElements() {
				List<Double> numbers = new ArrayList<>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				numbers.add(9.0);
				Double threshold = 1.0;
				Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				assertTrue(result);
			}
}