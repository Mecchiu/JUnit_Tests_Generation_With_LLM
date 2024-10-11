// RescaleToUnitTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.25);
		expected.add(0.5);
		expected.add(0.75);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit2() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(2.0);
		numbers.add(49.9);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit3() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(100.0);
		numbers.add(49.9);
		List<Double> expected = new ArrayList<Double>();
		expected.add(1.0);
		expected.add(0.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit4() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.25);
		expected.add(0.5);
		expected.add(0.75);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit5() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(2.0);
		numbers.add(1.0);
		numbers.add(5.0);
		numbers.add(3.0);
		numbers.add(4.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.25);
		expected.add(0.0);
		expected.add(1.0);
		expected.add(0.5);
		expected.add(0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit6() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(12.0);
		numbers.add(11.0);
		numbers.add(15.0);
		numbers.add(13.0);
		numbers.add(14.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.25);
		expected.add(0.0);
		expected.add(1.0);
		expected.add(0.5);
		expected.add(0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit7() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.25);
		expected.add(0.5);
		expected.add(0.75);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit8() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(2.0);
		numbers.add(1.0);
		numbers.add(5.0);
		numbers.add(3.0);
		numbers.add(4.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.25);
		expected.add(0.0);
		expected.add(1.0);
		expected.add(0.5);
		expected.add(0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit9() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(12.0);
		numbers.add(11.0);
		numbers.add(15.0);
		numbers.add(13.0);
		numbers.add(14.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.25);
		expected.add(0.0);
		expected.add(1.0);
		expected.add(0.5);
		expected.add(0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RescaleToUnit#rescaleToUnit(List)} method.
	* It tests the method with a list of numbers of at least two elements.
	* The smallest number will become 0 and the largest will become 1.
	*/
	@Test
	void testRescaleToUnit10() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.25);
		expected.add(0.5);
		expected.add(0.75);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
}