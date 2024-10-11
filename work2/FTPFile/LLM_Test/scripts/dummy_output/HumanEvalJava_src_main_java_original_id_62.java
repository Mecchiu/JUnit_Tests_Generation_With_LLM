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
			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 4.
			*/
			@Test
			void testDerivative1() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(3);
						xs.add(1);
						xs.add(2);
						xs.add(4);
						xs.add(5);
						List<Object> expected = new ArrayList<Object>();
						expected.add(1);
						expected.add(4);
						expected.add(12);
						expected.add(20);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 2.
			*/
			@Test
			void testDerivative2() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						xs.add(2);
						xs.add(3);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(6);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 2.
			*/
			@Test
			void testDerivative3() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(3);
						xs.add(2);
						xs.add(1);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(2);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 4.
			*/
			@Test
			void testDerivative4() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(3);
						xs.add(2);
						xs.add(1);
						xs.add(0);
						xs.add(4);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(2);
						expected.add(0);
						expected.add(16);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 0.
			*/
			@Test
			void testDerivative5() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						List<Object> expected = new ArrayList<Object>();
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 1.
			*/
			@Test
			void testDerivative6() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						xs.add(2);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 1.
			*/
			@Test
			void testDerivative7() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						xs.add(2);
						xs.add(3);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(6);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 1.
			*/
			@Test
			void testDerivative8() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						xs.add(2);
						xs.add(3);
						xs.add(4);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(6);
						expected.add(12);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 1.
			*/
			@Test
			void testDerivative9() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						xs.add(2);
						xs.add(3);
						xs.add(4);
						xs.add(5);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(6);
						expected.add(12);
						expected.add(20);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Derivative#derivative(List)} method.
			* It tests the method with a polynomial of degree 1.
			*/
			@Test
			void testDerivative10() {
						List<Integer> xs = new ArrayList<Integer>();
						xs.add(1);
						xs.add(2);
						xs.add(3);
						xs.add(4);
						xs.add(5);
						xs.add(6);
						List<Object> expected = new ArrayList<Object>();
						expected.add(2);
						expected.add(6);
						expected.add(12);
						expected.add(20);
						expected.add(30);
						List<Object> actual = Derivative.derivative(xs);
						assertEquals(expected, actual);
			}
}