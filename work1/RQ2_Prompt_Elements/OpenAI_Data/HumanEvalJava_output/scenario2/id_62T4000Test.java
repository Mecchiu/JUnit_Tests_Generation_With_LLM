// DerivativeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

	/**
	 * Test case 1:
	 * Input: [1, 2, 3]
	 * Expected output: [2, 6]
	 */
	@Test
	void testDerivative1() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 2:
	 * Input: [1, 2, 3, 4]
	 * Expected output: [2, 6, 12]
	 */
	@Test
	void testDerivative2() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 3:
	 * Input: [1, 2, 3, 4, 5]
	 * Expected output: [2, 6, 12, 20]
	 */
	@Test
	void testDerivative3() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 4:
	 * Input: [1, 2, 3, 4, 5, 6]
	 * Expected output: [2, 6, 12, 20, 30]
	 */
	@Test
	void testDerivative4() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 5:
	 * Input: [1, 2, 3, 4, 5, 6, 7]
	 * Expected output: [2, 6, 12, 20, 30, 42]
	 */
	@Test
	void testDerivative5() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 6:
	 * Input: [1, 2, 3, 4, 5, 6, 7, 8]
	 * Expected output: [2, 6, 12, 20, 30, 42, 56]
	 */
	@Test
	void testDerivative6() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 7:
	 * Input: [1, 2, 3, 4, 5, 6, 7, 8, 9]
	 * Expected output: [2, 6, 12, 20, 30, 42, 56, 72]
	 */
	@Test
	void testDerivative7() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 8:
	 * Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	 * Expected output: [2, 6, 12, 20, 30, 42, 56, 72, 90]
	 */
	@Test
	void testDerivative8() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		expected.add(90);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 9:
	 * Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	 * Expected output: [2, 6, 12, 20, 30, 42, 56, 72, 90, 110]
	 */
	@Test
	void testDerivative9() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		expected.add(90);
		expected.add(110);
		assertEquals(expected, Derivative.derivative(input));
	}
	
	/**
	 * Test case 10:
	 * Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	 * Expected output: [2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132]
	 */
	@Test
	void testDerivative10() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		expected.add(90);
		expected.add(110);
		expected.add(132);
		assertEquals(expected, Derivative.derivative(input));
	}
}