// DerivativeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
// Derivative.java
package original;

import java.util.ArrayList;
import java.util.List;

class Derivative {

    /**
     * xs represent coefficients of a polynomial.
     * xs[0] + xs[1] * x + xs[2] * x^2 +....
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
    public static List<Object> derivative(List<Integer> xs) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(xs.get(i) * i);
        }
        return result;
    }
}

// DerivativeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
		/**
* Test of derivative with a single and integer parameters.
*/
    @Test
    public void testDerivativeOneAndInteger() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(12);
        expected.add(20);
        expected.add(16);
        expected.add(0);
        expected.add(1);
        expected.add(6);
		assertEquals(6, Derivative.derivative(expected));
    }
}
