// SortedListSumTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains one unit test case for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

    /**
     * This class contains one unit test for the sortedListSum() method
     */
    @Test
    void test_sortedListSum() {
        assertEquals("Resulting list sizes: -", -8, SortedListSum.sortedListSum("abc").size());
    }
    
    /**
     * This class contains one unit test for the sortedListSum() method
     */
    @Test
    void test_sortedListSum_3() {
        assertEquals("Resulting list sizes: -", -8, SortedListSum.sortedListSum(new ArrayList<>("abc")).size());
    }

    /**
     * This class contains one unit test for the sortedListSum() method
     */
    @Test
    void test_sortedListSum_4() {
        assertEquals("Resulting list sizes: -", -8, SortedListSum.sortedListSum("abc", new ArrayList<>()).size());
    }

    /**
     * This class contains one unit test for the sortedListSum() method
     */
    @Test
    void test_sortedListSum_5() {
        assertEquals("Resulting list sizes: -", -8, SortedListSum.sortedListSum("abc", Collections.emptyList()).size());
    }
}
