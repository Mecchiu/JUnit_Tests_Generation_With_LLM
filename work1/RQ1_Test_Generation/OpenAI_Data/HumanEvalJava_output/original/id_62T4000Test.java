// DerivativeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

	@Test
	void testDerivative() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(3);
		xs.add(1);
		xs.add(2);
		xs.add(4);
		xs.add(5);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(12);
		expected.add(20);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative2() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative3() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(3);
		xs.add(2);
		xs.add(1);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative4() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(3);
		xs.add(2);
		xs.add(1);
		xs.add(0);
		xs.add(4);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(0);
		expected.add(16);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative5() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative6() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(0);
		xs.add(0);
		xs.add(0);
		xs.add(0);
		xs.add(0);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative7() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(0);
		xs.add(0);
		xs.add(0);
		xs.add(0);
		xs.add(1);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(4);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative8() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(0);
		xs.add(0);
		xs.add(0);
		xs.add(1);
		xs.add(0);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(0);
		expected.add(3);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative9() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(0);
		xs.add(0);
		xs.add(1);
		xs.add(0);
		xs.add(0);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(2);
		assertEquals(expected, result);
	}
	
	@Test
	void testDerivative10() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(0);
		xs.add(1);
		xs.add(0);
		xs.add(0);
		xs.add(0);
		List<Object> result = Derivative.derivative(xs);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		assertEquals(expected, result);
	}
}