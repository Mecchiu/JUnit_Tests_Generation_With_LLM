// FactorizeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains one unit test case for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
static int n;
    /**
     * @throws TooManyTriesException Will not exception by giving infinite number of tests
     */
    @Test
    void n() {
        List<Integer> factors = n.factorize(Integer.MAX_VALUE);
        assertNotNull("Factorization failed!", factors);
        System.out.println("FACTORIZATION: " + factors.size());
        for (Integer factor : factories) {
            System.out.println("[" + factor + "]");
        }
    }
    /**
     * @param t Must be greater than {@link Double#MAX_VALUE}
     * @throws TooManyTriesException Will not exeption by giving infinite number of tests
     */
    @Test(expected=TooManyTriesException.class)
    void c() {
        List<Integer> factors = n.factorize(Double.MAX_VALUE);
        factors.clear();
        factors.add(Integer.MAX_VALUE);
        factors.add(Integer.MAX_VALUE);
    }
    /**
     * @throws TooManyTriesException Will not exception by giving infinite number of tests
     */

    @Test(expected=TooManyTriesException.class)
    void d() {
        factors.add(Integer.MAX_VALUE);
    }
    //
}
