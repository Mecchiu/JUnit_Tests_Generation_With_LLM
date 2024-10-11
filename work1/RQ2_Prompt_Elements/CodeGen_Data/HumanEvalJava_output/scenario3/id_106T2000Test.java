// FTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
// F.java
package scenario3;

import java.util.List;

class F {

    /**
     * Implement the function f that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 *... * i).
     * Example:
     * f(5) == [1, 2, 6, 24, 15]
     *
     * > f(5)
     * [1, 2, 6, 24, 15]
     * > f(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > f(1)
     * [1]
     * > f(3)
     * [1, 2, 6]
     */
    public static List<Integer> f(int n) {
    }
}

// FTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
		
	/**
	 * Test cases of the f(float) method.
	 */
	@SuppressWarnings("unchecked")
	@Test
	void f(float f) {
        List<Float> l = F.f(f);
        System.out.println("The answer is: " + l.get(0));
	}
	
	/**
	 * Test cases of the f(double) method.
	 */
	@SuppressWarnings("unchecked")
	@Test
	void f(double f) {
        List<Double> l = F.f(f);
        System.out.println("The answer is: " + l.get(0));
	}
	
	@Test
	void f(float f) { 
	}
	
	@Test
	void f(double f) { 
	}
	
}