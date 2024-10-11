// EvenOddCountTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
// EvenOddCount.java
package scenario2;

import java.util.Arrays;
import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     */
    public static List<Integer> evenOddCount(int num) {
        int even = 0;
        int odd = 0;
        if (num == 0) {
            even++;
        }
        while (num!= 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }
        return Arrays.asList(even, odd);
    }
}

// EvenOddCountTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		/**
		* Tests {@link EvenOddCount#evenOddCount(int)} method.
		* It is invoked with a null int.
		* The test throws an exception with a non-numeric string that matches
		* the expected result that means the expected error message is incorrect.
		*/
		@Test
		void testEvenOddCount(int num) {
			try {
				evenOddCount(null);
				fail("IllegalArgumentException should be thrown when int is null.");
			}
			catch (IllegalArgumentException e) {
				assertEquals("Invalid argument specified for int \"null\".", e.getMessage());
			}
				
			List<Integer> evenOdd = evenOddCount(num);
			assertNotNull((evenOdd == null)?(null):evenOdd);
		}
}
/*
 * List<Integer> evenOddCount(int num) { // This example runs the test
 * EvenOddCountTest.testEvenOddCount(num); }
*/
