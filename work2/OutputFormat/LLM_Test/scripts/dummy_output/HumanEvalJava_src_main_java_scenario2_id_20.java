// FindClosestElementsTest.java
package scenario2;

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
			// Test case 1: Test with a list of two numbers
			@Test
			void testFindClosestElementsWithTwoNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(1.0);
				expected.add(2.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 2: Test with a list of three numbers
			@Test
			void testFindClosestElementsWithThreeNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(2.0);
				expected.add(3.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 3: Test with a list of four numbers
			@Test
			void testFindClosestElementsWithFourNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(3.0);
				expected.add(4.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 4: Test with a list of five numbers
			@Test
			void testFindClosestElementsWithFiveNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(4.0);
				expected.add(5.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 5: Test with a list of six numbers
			@Test
			void testFindClosestElementsWithSixNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(5.0);
				expected.add(6.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 6: Test with a list of seven numbers
			@Test
			void testFindClosestElementsWithSevenNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(6.0);
				expected.add(7.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 7: Test with a list of eight numbers
			@Test
			void testFindClosestElementsWithEightNumbers() {
				List<Double> numbers = new ArrayList<Double>();
				numbers.add(1.0);
				numbers.add(2.0);
				numbers.add(3.0);
				numbers.add(4.0);
				numbers.add(5.0);
				numbers.add(6.0);
				numbers.add(7.0);
				numbers.add(8.0);
				List<Double> expected = new ArrayList<Double>();
				expected.add(7.0);
				expected.add(8.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 8: Test with a list of nine numbers
			@Test
			void testFindClosestElementsWithNineNumbers() {
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
				List<Double> expected = new ArrayList<Double>();
				expected.add(8.0);
				expected.add(9.0);
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 9: Test with a list of ten numbers
			@Test
			void testFindClosestElementsWithTenNumbers() {
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
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}

			// Test case 10: Test with a list of eleven numbers
			@Test
			void testFindClosestElementsWithElevenNumbers() {
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
				assertEquals(expected, FindClosestElements.findClosestElements(numbers));
			}
}