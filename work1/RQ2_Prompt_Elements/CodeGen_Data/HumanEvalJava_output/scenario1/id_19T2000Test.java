// SortNumbersTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains one unit test case for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
private static final String[] string = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zoo", ""};

    private SortNumbersTest() {
    }
    
    @Test
    void test_sortNumbers_withNull() {
        
        assertEquals("[0, 3, 2, 1, 0, 1, 2, 0, 3, 2, 1, 0]", sortNumbers(Arrays.asList(null)));
    }
}
