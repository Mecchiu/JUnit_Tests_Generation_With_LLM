// ConcatenateTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains one unit test case for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    /**
     * Array of strings to be concatenated.
     */
    private final String[] input = new String[]{"x", "y", "z"};


    /**
	 * Concatenate a single string to a multi-string string.
	 */
    @Test
    void test1() {
        List<Object> list = Arrays.asList(input);
		assertEquals(Arrays.toString(input), concatenate(list));
    }

    /**
	 * Concatenate two multi-strings into single multi-string.
	 */
    @Test
    void test2() {
        List<Object> list1 = Arrays.asList("a", "b");
		List<Object> list2 = Arrays.asList("x", "y");
        assertEquals(Arrays.toString("x"), concatenate(list1, list2));
    }
}
