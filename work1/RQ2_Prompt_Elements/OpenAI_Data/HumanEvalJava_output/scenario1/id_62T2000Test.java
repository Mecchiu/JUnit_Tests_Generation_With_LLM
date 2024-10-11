// DerivativeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
	// Test case 1
    @Test
    void testDerivative1() {
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
			// Test case 2
    @Test
    void testDerivative2() {
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
			// Test case 3
    @Test
    void testDerivative3() {
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
			// Test case 4
    @Test
    void testDerivative4() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(6);
        expected.add(12);
        expected.add(20);
        expected.add(30);
        expected.add(42);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
			// Test case 5
    @Test
    void testDerivative5() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(6);
        expected.add(12);
        expected.add(20);
        expected.add(30);
        expected.add(42);
        expected.add(56);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
			// Test case 6
    @Test
    void testDerivative6() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(6);
        expected.add(12);
        expected.add(20);
        expected.add(30);
        expected.add(42);
        expected.add(56);
        expected.add(72);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
			// Test case 7
    @Test
    void testDerivative7() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        xs.add(10);
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
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
			// Test case 8
    @Test
    void testDerivative8() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        xs.add(10);
        xs.add(11);
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
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
			// Test case 9
    @Test
    void testDerivative9() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        xs.add(10);
        xs.add(11);
        xs.add(12);
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
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
			// Test case 10
    @Test
    void testDerivative10() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        xs.add(10);
        xs.add(11);
        xs.add(12);
        xs.add(13);
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
        expected.add(156);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
}
