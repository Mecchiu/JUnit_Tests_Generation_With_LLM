// FindClosestElementsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Double> numbers = new ArrayList<Double>();
				List<Double> expected = new ArrayList<Double>();
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with one element
			@Test
			void testOneElementList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(5.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(5.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with two elements
			@Test
			void testTwoElementsList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(5.0);
				numbers.add(10.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(5.0);
				expected.add(10.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with multiple elements and no duplicates
			@Test
			void testMultipleElementsNoDuplicatesList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(5.0);
				numbers.add(10.0);
				numbers.add(3.0);
				numbers.add(8.0);
				numbers.add(1.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(3.0);
				expected.add(5.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with multiple elements and duplicates
			@Test
			void testMultipleElementsWithDuplicatesList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(5.0);
				numbers.add(10.0);
				numbers.add(3.0);
				numbers.add(8.0);
				numbers.add(1.0);
				numbers.add(3.0);
				numbers.add(8.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(3.0);
				expected.add(3.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with negative elements
			@Test
			void testNegativeElementsList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(-5.0);
				numbers.add(-10.0);
				numbers.add(-3.0);
				numbers.add(-8.0);
				numbers.add(-1.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(-10.0);
				expected.add(-8.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with decimal elements
			@Test
			void testDecimalElementsList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(5.5);
				numbers.add(10.2);
				numbers.add(3.7);
				numbers.add(8.9);
				numbers.add(1.3);
				List<Double> expected = new ArrayList<Double>();
				expected.add(3.7);
				expected.add(5.5);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with large elements
			@Test
			void testLargeElementsList() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000