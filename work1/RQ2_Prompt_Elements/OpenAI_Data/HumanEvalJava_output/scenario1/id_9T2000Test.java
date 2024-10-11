// RollingMaxTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> numbers = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with one element
			@Test
			void testOneElementList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with multiple elements
			@Test
			void testMultipleElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				numbers.add(3);
				numbers.add(8);
				numbers.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(5);
				expected.add(8);
				expected.add(8);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with negative elements
			@Test
			void testNegativeElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(-5);
				numbers.add(-3);
				numbers.add(-8);
				numbers.add(-2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(-5);
				expected.add(-3);
				expected.add(-3);
				expected.add(-2);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with decimal elements
			@Test
			void testDecimalElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5.5);
				numbers.add(3.3);
				numbers.add(8.8);
				numbers.add(2.2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5.5);
				expected.add(5.5);
				expected.add(8.8);
				expected.add(8.8);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with mixed elements
			@Test
			void testMixedElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				numbers.add(-3);
				numbers.add(8.8);
				numbers.add(-2.2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(5);
				expected.add(8.8);
				expected.add(8.8);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with null elements
			@Test
			void testNullElementsList() {
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
			
			// Test case 8: List with invalid elements
			@Test
			void testInvalidElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add("5");
				numbers.add("3");
				numbers.add("8");
				numbers.add("2");
				assertThrows(IllegalArgumentException.class, () -> RollingMax.rollingMax(numbers));
			}
			
			// Test case 9: List with large elements
			@Test
			void testLargeElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(500000000);
				numbers.add(300000000);
				numbers.add(800000000);
				numbers.add(200000000);
				List<Object> expected = new ArrayList<Object>();
				expected.add(500000000);
				expected.add(500000000);
				expected.add(800000000);
				expected.add(800000000);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with small elements
			@Test
			void testSmallElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(0.00000005);
				numbers.add(0.00000003);
				numbers.add(0.00000008);
				numbers.add(0.00000002);
				List<Object> expected = new ArrayList<Object>();
				expected.add(0.00000005);
				expected.add(0.00000005);
				expected.add(0.00000008);
				expected.add(0.00000008);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
			}
}