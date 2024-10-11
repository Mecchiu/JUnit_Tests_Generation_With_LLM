// Factorize.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Factorize {

    /**
     * Return list of prime factors of given integer in the order from smallest to largest.
     * Each of the factors should be listed number of times corresponding to how many times it appears in factorization.
     * Input number should be equal to the product of all factors
     *
     * > factorize(8)
     * [2, 2, 2]
     * > factorize(25)
     * [5, 5]
     * > factorize(70)
     * [2, 5, 7]
     * > factorize(2)
     * [2]
     * > factorize(4)
     * [2, 2]
     * > factorize(8)
     * [2, 2, 2]
     * > factorize(57)
     * [3, 19]
     * > factorize(3249)
     * [3, 3, 19, 19]
     * > factorize(185193)
     * [3, 3, 3, 19, 19, 19]
     * > factorize(20577)
     * [3, 19, 19, 19]
     * > factorize(18)
     * [2, 3, 3]
     */
    public static List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}

// FactorizeTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
    
    @Test
    void testFactorize8() {
        List<Integer> expected = Arrays.asList(2, 2, 2);
        List<Integer> actual = Factorize.factorize(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize25() {
        List<Integer> expected = Arrays.asList(5, 5);
        List<Integer> actual = Factorize.factorize(25);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize70() {
        List<Integer> expected = Arrays.asList(2, 5, 7);
        List<Integer> actual = Factorize.factorize(70);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize2() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = Factorize.factorize(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize4() {
        List<Integer> expected = Arrays.asList(2, 2);
        List<Integer> actual = Factorize.factorize(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize57() {
        List<Integer> expected = Arrays.asList(3, 19);
        List<Integer> actual = Factorize.factorize(57);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize3249() {
        List<Integer> expected = Arrays.asList(3, 3, 19, 19);
        List<Integer> actual = Factorize.factorize(3249);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize185193() {
        List<Integer> expected = Arrays.asList(3, 3, 3, 19, 19, 19);
        List<Integer> actual = Factorize.factorize(185193);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize20577() {
        List<Integer> expected = Arrays.asList(3, 19, 19, 19);
        List<Integer> actual = Factorize.factorize(20577);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFactorize18() {
        List<Integer> expected = Arrays.asList(2, 3, 3);
        List<Integer> actual = Factorize.factorize(18);
        assertEquals(expected, actual);
    }
}