// RescaleToUnitTest.java
package scenario2;

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
	* Test case 1:
	* Input: [1, 2, 3, 4, 5]
	* Expected output: [0.0, 0.25, 0.5, 0.75, 1.0]
	*/
	@Test
	void testRescaleToUnit1() {
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
	* Test case 2:
	* Input: [1, 2, 3, 4, 5, 6]
	* Expected output: [0.0, 0.2, 0.4, 0.6, 0.8, 1.0]
	*/
	@Test
	void testRescaleToUnit2() {
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
	* Test case 3:
	* Input: [1, 2, 3, 4, 5, 6, 7]
	* Expected output: [0.0, 0.16666666666666666, 0.3333333333333333, 0.5, 0.6666666666666666, 0.8333333333333334, 1.0]
	*/
	@Test
	void testRescaleToUnit3() {
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
	* Test case 4:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8]
	* Expected output: [0.0, 0.14285714285714285, 0.2857142857142857, 0.42857142857142855, 0.5714285714285714, 0.7142857142857143, 0.8571428571428571, 1.0]
	*/
	@Test
	void testRescaleToUnit4() {
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
	* Test case 5:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9]
	* Expected output: [0.0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0]
	*/
	@Test
	void testRescaleToUnit5() {
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
	* Test case 6:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	* Expected output: [0.0, 0.1111111111111111, 0.2222222222222222, 0.3333333333333333, 0.4444444444444444, 0.5555555555555556, 0.6666666666666666, 0.7777777777777777, 0.8888888888888888, 1.0]
	*/
	@Test
	void testRescaleToUnit6() {
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
	
	/**
	* Test case 7:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	* Expected output: [0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0]
	*/
	@Test
	void testRescaleToUnit7() {
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
		expected.add(0.0);
		expected.add(0.1);
		expected.add(0.2);
		expected.add(0.3);
		expected.add(0.4);
		expected.add(0.5);
		expected.add(0.6);
		expected.add(0.7);
		expected.add(0.8);
		expected.add(0.9);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	* Expected output: [0.0, 0.09090909090909091, 0.18181818181818182, 0.2727272727272727, 0.36363636363636365, 0.4545454545454546, 0.5454545454545454, 0.6363636363636364, 0.7272727272727273, 0.8181818181818182, 0.9090909090909091, 1.0]
	*/
	@Test
	void testRescaleToUnit8() {
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
		expected.add(0.0);
		expected.add(0.09090909090909091);
		expected.add(0.18181818181818182);
		expected.add(0.2727272727272727);
		expected.add(0.36363636363636365);
		expected.add(0.4545454545454546);
		expected.add(0.5454545454545454);
		expected.add(0.6363636363636364);
		expected.add(0.7272727272727273);
		expected.add(0.8181818181818182);
		expected.add(0.9090909090909091);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
	* Expected output: [0.0, 0.07692307692307693, 0.15384615384615385, 0.23076923076923078, 0.3076923076923077, 0.38461538461538464, 0.46153846153846156, 0.5384615384615384, 0.6153846153846154, 0.6923076923076923, 0.7692307692307693, 0.8461538461538461, 1.0]
	*/
	@Test
	void testRescaleToUnit9() {
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
		expected.add(0.0);
		expected.add(0.07692307692307693);
		expected.add(0.15384615384615385);
		expected.add(0.23076923076923078);
		expected.add(0.3076923076923077);
		expected.add(0.38461538461538464);
		expected.add(0.46153846153846156);
		expected.add(0.5384615384615384);
		expected.add(0.6153846153846154);
		expected.add(0.6923076923076923);
		expected.add(0.7692307692307693);
		expected.add(0.8461538461538461);
		expected.add(1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
	* Expected output: [0.0, 0.07142857142857142, 0.14285714285714285, 0.21428571428571427, 0.2857142857142857, 0.35714285714285715, 0.42857142857142855, 0.5, 0.5714285714285714, 0.6428571428571429, 0.7142857142857143, 0.