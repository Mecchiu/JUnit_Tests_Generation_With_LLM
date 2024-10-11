// ByLengthTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains one unit test case for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {
// ByLength.java
package scenario3;

import java.util.List;

class ByLength {

    /**
     * * Given an array of integers, sort the integers that are between 1 and 9 inclusive,
     * reverse the resulting array, and then replace each digit by its corresponding name from
     * "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".
     *
     * For example:
     * arr = [2, 1, 1, 4, 5, 8, 2, 3]
     * -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8]
     * -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
     * return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     *
     * If the array is empty, return an empty array:
     * arr = []
     * return []
     *
     * If the array has any strange number ignore it:
     * arr = [1, -1, 55]
     * -> sort arr -> [-1, 1, 55]
     * -> reverse arr -> [55, 1, -1]
     * return = ['One']
     *
     * > byLength([2, 1, 1, 4, 5, 8, 2, 3])
     * ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     * > byLength([])
     * []
     * > byLength([1, -1, 55])
     * ["One"]
     * > byLength([1, -1, 3, 2])
     * ["Three", "Two", "One"]
     * > byLength([9, 4, 8])
     * ["Nine", "Eight", "Four"]
     */
    public static List<Object> byLength(List<Object> arr) {
    }
}

// ByLengthTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains one unit test case for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {
		
	private ByLengthTest() {
	}

    /**
     * Verifies the arguments values are well formed, throws {@link IllegalArgumentException},
     * if any value is illformed.
     */
    @Test
    public void testEmpty() {
    	ByLength.byLength(null);
        IllegalArgumentException exception = null;
        try {
            ByLength.byLength(new List());
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
    }
    
    /**
     * Verifies the arguments values are well formed, throws {@link IllegalArgumentException},
     * if any value is illformed.
     */
    @Test
    public void testNonEmpty() {
        assertNotNull(ByLength.byLength(new List()));
    }

}
