// SpecialFactorialTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains one unit test case for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
// SpecialFactorial.java
package scenario3;

class SpecialFactorial {

    /**
     * The Brazilian factorial is defined as:
     * brazilian_factorial(n) = n! * (n-1)! * (n-2)! *... * 1!
     * where n > 0
     *
     * For example:
     * >>> specialFactorial(4)
     * 288
     *
     * The function will receive an integer as input and should return the special
     * factorial of this integer.
     *
     * > specialFactorial(4)
     * 288
     * > specialFactorial(5)
     * 34560
     * > specialFactorial(7)
     * 125411328000L
     * > specialFactorial(1)
     * 1
     */
    public static long specialFactorial(int n) {
    }
}

// SpecialFactorialTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains one unit test case for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
		
	@Test (expected = UnsupportedOperationException.class)
	public void SpecialFactorial_unsupported() {
		int a = 0; int b = 1;
		new SpecialFactorial().specialFactorial(a);
	}


	@Test
	public void testConstructor() {
	}
}


