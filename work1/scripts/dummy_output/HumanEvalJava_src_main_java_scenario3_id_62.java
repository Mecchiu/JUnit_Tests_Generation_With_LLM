// DerivativeTest.java
package scenario3;

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
        List<Integer> xs = List.of(3, 1, 2, 4, 5);
        List<Integer> expected = List.of(1, 4, 12, 20);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testDerivative2() {
        List<Integer> xs = List.of(1, 2, 3);
        List<Integer> expected = List.of(2, 6);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testDerivative3() {
        List<Integer> xs = List.of(3, 2, 1);
        List<Integer> expected = List.of(2, 2);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testDerivative4() {
        List<Integer> xs = List.of(3, 2, 1, 0, 4);
        List<Integer> expected = List.of(2, 2, 0, 16);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testDerivative5() {
        List<Integer> xs = List.of(1);
        List<Integer> expected = List.of();
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testDerivative6() {
        List<Integer> xs = List.of(0, 0, 0, 0, 0);
        List<Integer> expected = List.of(0, 0, 0, 0);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testDerivative7() {
        List<Integer> xs = List.of(1, 1, 1, 1, 1);
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testDerivative8() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expected = List.of(2, 6, 12, 20, 30, 42, 56, 72);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testDerivative9() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testDerivative10() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90, 110);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
}