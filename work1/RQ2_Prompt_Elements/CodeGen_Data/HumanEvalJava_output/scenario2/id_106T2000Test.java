// FTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
// F.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class F {

    /**
     * Implement the function f that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 *... * i).
     */
    public static List<Integer> f(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// FTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
		
	@Test
	void f() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		assertEquals("The factorial of size 1", 31, list.f(1));
	}

		@Test
		void f3() {
			List<Integer> list = null;
			list.add(11);
			list.add(22);
			assertEquals("The sum of numbers", 32, list.f(3));
		}

		@Test
		void f4() {
			List<Integer> list = null;
			list.add(11);
			list.add(22);
			assertEquals("The sum of 3 and 5", 24, list.f(4));
		}
}
