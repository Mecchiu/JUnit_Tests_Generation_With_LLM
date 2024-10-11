// SpecialfilterTest.java
package scenario1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> nums = Arrays.asList();
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with one element that is less than 10
			@Test
			void testOneElementLessThan10() {
				List<Object> nums = Arrays.asList(5);
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with one element that is equal to 10
			@Test
			void testOneElementEqualTo10() {
				List<Object> nums = Arrays.asList(10);
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with one element that is greater than 10 but does not have odd digits at the beginning and end
			@Test
			void testOneElementGreaterThan10NoOddDigits() {
				List<Object> nums = Arrays.asList(12);
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with one element that is greater than 10 and has odd digits at the beginning and end
			@Test
			void testOneElementGreaterThan10WithOddDigits() {
				List<Object> nums = Arrays.asList(15);
				int expected = 1;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with multiple elements, all less than 10
			@Test
			void testMultipleElementsAllLessThan10() {
				List<Object> nums = Arrays.asList(5, 7, 9);
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with multiple elements, some less than 10 and some greater than 10 but none with odd digits at the beginning and end
			@Test
			void testMultipleElementsSomeLessThan10SomeGreaterThan10NoOddDigits() {
				List<Object> nums = Arrays.asList(5, 12, 14);
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with multiple elements, some less than 10 and some greater than 10 with odd digits at the beginning and end
			@Test
			void testMultipleElementsSomeLessThan10SomeGreaterThan10WithOddDigits() {
				List<Object> nums = Arrays.asList(5, 15, 17);
				int expected = 2;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with multiple elements, all greater than 10 but none with odd digits at the beginning and end
			@Test
			void testMultipleElementsAllGreaterThan10NoOddDigits() {
				List<Object> nums = Arrays.asList(12, 14, 16);
				int expected = 0;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with multiple elements, all greater than 10 with odd digits at the beginning and end
			@Test
			void testMultipleElementsAllGreaterThan10WithOddDigits() {
				List<Object> nums = Arrays.asList(15, 17, 19);
				int expected = 3;
				int actual = Specialfilter.specialfilter(nums);
				assertEquals(expected, actual);
			}
}