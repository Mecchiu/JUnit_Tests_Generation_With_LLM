// RollingMaxTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {
			// Test case 1: Test with a list of integers
			@Test
			void testRollingMaxWithIntegers() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(3);
				expected.add(4);
				expected.add(4);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test with an empty list
			@Test
			void testRollingMaxWithEmptyList() {
				List<Object> numbers = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test with a list of integers in ascending order
			@Test
			void testRollingMaxWithIntegersInAscendingOrder() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test with a list of integers in descending order
			@Test
			void testRollingMaxWithIntegersInDescendingOrder() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(4);
				numbers.add(3);
				numbers.add(2);
				numbers.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(4);
				expected.add(4);
				expected.add(4);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test with a list of integers with duplicate elements
			@Test
			void testRollingMaxWithIntegersWithDuplicateElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(3);
				expected.add(4);
				expected.add(4);
				expected.add(4);
				expected.add(5);
				expected.add(5);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test with a list of integers with negative elements
			@Test
			void testRollingMaxWithIntegersWithNegativeElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(-1);
				numbers.add(-2);
				numbers.add(-3);
				numbers.add(-2);
				numbers.add(-3);
				numbers.add(-4);
				numbers.add(-2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(-1);
				expected.add(-1);
				expected.add(-1);
				expected.add(-1);
				expected.add(-1);
				expected.add(-1);
				expected.add(-1);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test with a list of integers with positive and negative elements
			@Test
			void testRollingMaxWithIntegersWithPositiveAndNegativeElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(-1);
				numbers.add(2);
				numbers.add(-3);
				numbers.add(2);
				numbers.add(-3);
				numbers.add(4);
				numbers.add(-2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(-1);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(4);
				expected.add(4);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test with a list of integers with zero elements
			@Test
			void testRollingMaxWithIntegersWithZeroElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(0);
				numbers.add(0);
				numbers.add(0);
				numbers.add(0);
				List<Object> expected = new ArrayList<Object>();
				expected.add(0);
				expected.add(0);
				expected.add(0);
				expected.add(0);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test with a list of integers with one element
			@Test
			void testRollingMaxWithIntegersWithOneElement() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test with a list of integers with null elements
			@Test
			void testRollingMaxWithIntegersWithNullElements() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(null);
				numbers.add(null);
				numbers.add(null);
				numbers.add(null);
				List<Object> expected = new ArrayList<Object>();
				expected.add(null);
				expected.add(null);
				expected.add(null);
				expected.add(null);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
}