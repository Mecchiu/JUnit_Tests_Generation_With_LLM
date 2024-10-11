// DerivativeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
// Derivative.java
package scenario3;

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
    }
}

// DerivativeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
		
	@Test
    public void example6() {
        Derivative xs[]= new Derivative[]{1};
        List<Object> res = Derivative.derivative(xs);
        for(int i=0;i<res.size();++i) assertTrue(((Integer)res.get(i)).intValue() >= 3);
    }
}