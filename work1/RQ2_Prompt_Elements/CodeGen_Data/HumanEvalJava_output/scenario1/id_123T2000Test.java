// GetOddCollatzTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains one unit test case for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
// GetOddCollatz.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GetOddCollatz {

    public static List<Integer> getOddCollatz(int n) {
        List<Integer> result = new ArrayList<Integer>();
        while (n!= 1) {
            if (n % 2 == 1) {
                result.add(n);
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.add(1);
        Collections.sort(result);
        return result;
    }
}

// GetOddCollatzTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains one unit test case for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
		
    int testNumber = 1;
    
    /** Basic test of the method. */
    @Test
    void testBasic() {
        int[] testArray = {1,8,13,26,47};
        GetOddCollatz getOddCollatz = new GetOddCollatz();
        List<Integer> oddCollatz = getOddCollatz.getOddCollatz(testArray);
        String evenCollatzString = evenCollatz.toString();
        String oddCollatzString = oddCollatz.toString();
        assertTrue("test number is " + testNumber, evenCollatzString.equalsIgnoreCase(oddCollatzString));
        assertEquals("test number is " + testNumber, testArray.length, oddCollatz.size());
    }

	/**
	 * Method to test the class.
	 */
	@Test
    public void testToString() {
        int[] testArray = {3, 8, 13, 26, 47};
        GetOddCollatz getOddCollatz = new GetOddCollatz();
        List<Integer> oddCollatz = getOddCollatz.getOddCollatz(testArray);
		//testString = oddCollatz.toString();
        String evenCollatzString = oddCollatz.toString();
        assertTrue("test number is " + testNumber, evenCollatzString.equalsIgnoreCase(testString));
    }


}
