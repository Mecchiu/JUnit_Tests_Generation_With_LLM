// SpecialFactorial.java
package scenario2;

class SpecialFactorial {

    /**
     * The Brazilian factorial is defined as:
     * brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
     * where n > 0
     *
     * The function will receive an integer as input and should return the special
     * factorial of this integer.
     */
    public static long specialFactorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= factorial(i);
        }
        return res;
    }

    private static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}

// SpecialFactorialTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
    
    @Test
    void testSpecialFactorialWithZero() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }
    
    @Test
    void testSpecialFactorialWithOne() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }
    
    @Test
    void testSpecialFactorialWithTwo() {
        assertEquals(2, SpecialFactorial.specialFactorial(2));
    }
    
    @Test
    void testSpecialFactorialWithThree() {
        assertEquals(12, SpecialFactorial.specialFactorial(3));
    }
    
    @Test
    void testSpecialFactorialWithFour() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
    }
    
    @Test
    void testSpecialFactorialWithFive() {
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
    }
    
    @Test
    void testSpecialFactorialWithSix() {
        assertEquals(24883200, SpecialFactorial.specialFactorial(6));
    }
    
    @Test
    void testSpecialFactorialWithSeven() {
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
    }
    
    @Test
    void testSpecialFactorialWithEight() {
        assertEquals(5230697472000L, SpecialFactorial.specialFactorial(8));
    }
    
    @Test
    void testSpecialFactorialWithNine() {
        assertEquals(20922789888000L, SpecialFactorial.specialFactorial(9));
    }
}