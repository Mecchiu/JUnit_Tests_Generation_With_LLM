// ByLengthTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {
			@Test
			void testByLength() {
				List<Object> arr = Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3);
				List<Object> expected = Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthEmpty() {
				List<Object> arr = Arrays.asList();
				List<Object> expected = Arrays.asList();
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthStrangeNumber() {
				List<Object> arr = Arrays.asList(1, -1, 55);
				List<Object> expected = Arrays.asList("One");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthNegativeNumber() {
				List<Object> arr = Arrays.asList(1, -1, 3, 2);
				List<Object> expected = Arrays.asList("Three", "Two", "One");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthSingleDigit() {
				List<Object> arr = Arrays.asList(9, 4, 8);
				List<Object> expected = Arrays.asList("Nine", "Eight", "Four");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthMultipleDigits() {
				List<Object> arr = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
				List<Object> expected = Arrays.asList("Nineteen", "Eighteen", "Seventeen", "Sixteen", "Fifteen", "Fourteen", "Thirteen", "Twelve", "Eleven", "Ten");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthDuplicateDigits() {
				List<Object> arr = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
				List<Object> expected = Arrays.asList("One", "One", "One", "One", "One", "One", "One", "One", "One", "One");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthAllDigits() {
				List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthAllDigitsReverse() {
				List<Object> arr = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
				List<Object> expected = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
				assertEquals(expected, ByLength.byLength(arr));
			}

			@Test
			void testByLengthAllDigitsRandomOrder() {
				List<Object> arr = Arrays.asList(5, 1, 9, 2, 8, 3, 7, 4, 6);
				List<Object> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
				assertEquals(expected, ByLength.byLength(arr));
			}
}