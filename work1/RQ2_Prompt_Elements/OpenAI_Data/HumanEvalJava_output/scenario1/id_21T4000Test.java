// RescaleToUnitTest.java
package scenario1;

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
	* Test case 1.
	* The input list contains only one element.
	*/
	@Test
	void testRescaleToUnit_1() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only two elements.
	*/
	@Test
	void testRescaleToUnit_2() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only three elements.
	*/
	@Test
	void testRescaleToUnit_3() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.5);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only four elements.
	*/
	@Test
	void testRescaleToUnit_4() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.3333333333333333);
		expected.add(0.6666666666666666);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only five elements.
	*/
	@Test
	void testRescaleToUnit_5() {
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
	* Test case 6.
	* The input list contains only six elements.
	*/
	@Test
	void testRescaleToUnit_6() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.2);
		expected.add(0.4);
		expected.add(0.6);
		expected.add(0.8);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only seven elements.
	*/
	@Test
	void testRescaleToUnit_7() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(0.0);
		expected.add(0.16666666666666666);
		expected.add(0.3333333333333333);
		expected.add(0.5);
		expected.add(0.6666666666666666);
		expected.add(0.8333333333333334);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains only eight elements.
	*/
	@Test
	void testRescaleToUnit_8() {
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
		expected.add(0.0);
		expected.add(0.14285714285714285);
		expected.add(0.2857142857142857);
		expected.add(0.42857142857142855);
		expected.add(0.5714285714285714);
		expected.add(0.7142857142857143);
		expected.add(0.8571428571428571);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains only nine elements.
	*/
	@Test
	void testRescaleToUnit_9() {
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
		expected.add(0.0);
		expected.add(0.125);
		expected.add(0.25);
		expected.add(0.375);
		expected.add(0.5);
		expected.add(0.625);
		expected.add(0.75);
		expected.add(0.875);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains only ten elements.
	*/
	@Test
	void testRescaleToUnit_10() {
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
		expected.add(0.0);
		expected.add(0.1111111111111111);
		expected.add(0.2222222222222222);
		expected.add(0.3333333333333333);
		expected.add(0.4444444444444444);
		expected.add(0.5555555555555556);
		expected.add(0.6666666666666666);
		expected.add(0.7777777777777777);
		expected.add(0.8888888888888888);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
}