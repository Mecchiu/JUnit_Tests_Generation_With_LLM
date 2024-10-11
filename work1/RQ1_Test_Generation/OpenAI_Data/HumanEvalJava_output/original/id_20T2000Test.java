// FindClosestElementsTest.java
package original;

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
	// Test case 1: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements1() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.9);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(2.2);
				List<Double> expected = new ArrayList<Double>();
				expected.add(3.9);
				expected.add(4.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements2() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(5.9);
				numbers.add(4.0);
				numbers.add(5.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(5.0);
				expected.add(5.9);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements3() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(2.2);
				List<Double> expected = new ArrayList<Double>();
				expected.add(2.0);
				expected.add(2.2);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements4() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(2.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(2.0);
				expected.add(2.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements5() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.1);
				numbers.add(2.2);
				numbers.add(3.1);
				numbers.add(4.1);
				numbers.add(5.1);
				List<Double> expected = new ArrayList<Double>();
				expected.add(2.2);
				expected.add(3.1);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements6() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				numbers.add(9.0);
				numbers.add(10.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(9.0);
				expected.add(10.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements7() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				numbers.add(9.0);
				numbers.add(10.0);
				numbers.add(11.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(10.0);
				expected.add(11.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements8() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				numbers.add(9.0);
				numbers.add(10.0);
				numbers.add(11.0);
				numbers.add(12.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(11.0);
				expected.add(12.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements9() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				numbers.add(9.0);
				numbers.add(10.0);
				numbers.add(11.0);
				numbers.add(12.0);
				numbers.add(13.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(12.0);
				expected.add(13.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test with a list of numbers that has length at least two.
			@Test
			void testFindClosestElements10() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				numbers.add(9.0);
				numbers.add(10.0);
				numbers.add(11.0);
				numbers.add(12.0);
				numbers.add(13.0);
				numbers.add(14.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(13.0);
				expected.add(14.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				Collections.sort(actual);
				assertEquals(expected, actual);
			}
}
