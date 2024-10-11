// SumProductTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
			// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Object> numbers = new ArrayList<Object>();
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(0, result.get(0));
				assertEquals(1, result.get(1));
			}
			
			// Test case 2: Test with list containing one element
			@Test
			void testOneElementList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(5, result.get(0));
				assertEquals(5, result.get(1));
			}
			
			// Test case 3: Test with list containing two elements
			@Test
			void testTwoElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				numbers.add(10);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(15, result.get(0));
				assertEquals(50, result.get(1));
			}
			
			// Test case 4: Test with list containing three elements
			@Test
			void testThreeElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				numbers.add(10);
				numbers.add(15);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(30, result.get(0));
				assertEquals(750, result.get(1));
			}
			
			// Test case 5: Test with list containing negative elements
			@Test
			void testNegativeElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(-5);
				numbers.add(-10);
				numbers.add(-15);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(-30, result.get(0));
				assertEquals(-750, result.get(1));
			}
			
			// Test case 6: Test with list containing zero
			@Test
			void testZeroElementList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(0);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(0, result.get(0));
				assertEquals(0, result.get(1));
			}
			
			// Test case 7: Test with list containing decimal elements
			@Test
			void testDecimalElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5.5);
				numbers.add(10.5);
				numbers.add(15.5);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(31, result.get(0));
				assertEquals(900, result.get(1));
			}
			
			// Test case 8: Test with list containing string elements
			@Test
			void testStringElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add("5");
				numbers.add("10");
				numbers.add("15");
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(30, result.get(0));
				assertEquals(750, result.get(1));
			}
			
			// Test case 9: Test with list containing null elements
			@Test
			void testNullElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(null);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(0, result.get(0));
				assertEquals(1, result.get(1));
			}
			
			// Test case 10: Test with list containing different types of elements
			@Test
			void testDifferentTypesElementsList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(5);
				numbers.add("10");
				numbers.add(15.5);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(30, result.get(0));
				assertEquals(750, result.get(1));
			}
}