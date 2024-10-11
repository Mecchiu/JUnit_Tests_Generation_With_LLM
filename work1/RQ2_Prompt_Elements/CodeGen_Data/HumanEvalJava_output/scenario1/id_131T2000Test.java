// DigitsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
// Digits.java
package scenario1;

class Digits {

    public static int digits(int n) {
        int res = 1;
        boolean hasOdd = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                res *= digit;
                hasOdd = true;
            }
            n /= 10;
        }
        return hasOdd? res : 0;
    }
}

// DigitsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
		
	/**
	* Unit test for {@link Digits#digits(int)} for a negative number.
	*/
	@Test
	void testDigitsNegative() {
		assertEquals(-1, Digits.digits(10));
	}

}
