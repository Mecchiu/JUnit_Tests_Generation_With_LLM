// Derivative.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Derivative {

    /**
     * xs represent coefficients of a polynomial.
     * xs[0] + xs[1] * x + xs[2] * x^2 + ....
     * Return derivative of this polynomial in the same form.
     *
     * > derivative([3, 1, 2, 4, 5])
     * [1, 4, 12, 20]
     * > derivative([1, 2, 3])
     * [2, 6]
     * > derivative([3, 2, 1])
     * [2, 2]
     * > derivative([3, 2, 1, 0, 4])
     * [2, 2, 0, 16]
     * > derivative([1])
     * []
     */
    public static List<Integer> derivative(List<Integer> xs) {
        List<Integer> result = new ArrayList<>();
        int n = xs.size();
        if (n == 1) {
            return result;
        }
        for (int i = 1; i < n; i++) {
            result.add(xs.get(i) * i);
        }
        return result;
    }
}

// DerivativeTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

    @Test
    void testDerivative1() {
        List<Integer> xs = Arrays.asList(3, 1, 2, 4, 5);
        List<Integer> expected = Arrays.asList(1, 4, 12, 20);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative2() {
        List<Integer> xs = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 6);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative3() {
        List<Integer> xs = Arrays.asList(3, 2, 1);
        List<Integer> expected = Arrays.asList(2, 2);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative4() {
        List<Integer> xs = Arrays.asList(3, 2, 1, 0, 4);
        List<Integer> expected = Arrays.asList(2, 2, 0, 16);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative5() {
        List<Integer> xs = Arrays.asList(1);
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative6() {
        List<Integer> xs = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative7() {
        List<Integer> xs = Arrays.asList(1, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative8() {
        List<Integer> xs = Arrays.asList(0, 0, 0, 0, 1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 4);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative9() {
        List<Integer> xs = Arrays.asList(0, 0, 0, 1, 0);
        List<Integer> expected = Arrays.asList(0, 0, 3, 0);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative10() {
        List<Integer> xs = Arrays.asList(0, 0, 1, 0, 0);
        List<Integer> expected = Arrays.asList(0, 2, 0, 0);
        List<Integer> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
}