// SpecialFactorialTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains one unit test case for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
// SpecialFactorial.java
package scenario2;

class SpecialFactorial {

    /**
     * The Brazilian factorial is defined as:
     * brazilian_factorial(n) = n! * (n-1)! * (n-2)! *... * 1!
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
* It contains one unit test case for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
		/**
     * Unit test to check the special factorial for n >=0.
     */
    @Test
    void test_specialFactorial_for_n_0() {
        double f = SpecialFactorial.specialFactorial(0);
        System.out.println(f);
        assertEquals(Double.longBitsToDouble(0xFFFFFFFFFFFFFFFFL) * 100000.0, f, 0.00001, 0.0001);
    }
}

// Main
class Main{

    /**
     * This method is used to display or run a test suite.
     */
	@Test
    void test_simple (){
        int[] data = new int[(int) 10];
        for (int i = 0; i < (int) data.length; i++){
            data[i] = i;
        }
        for (int n = 1; n <= 10; n++) {
            int[] expected = SpecialFactorial.specialFactorial(n).toIntArray();
            long actual = SpecialFactorial.generalisation(data, n);
            assertEquals(expected, actual, 0);
        }
    }
}