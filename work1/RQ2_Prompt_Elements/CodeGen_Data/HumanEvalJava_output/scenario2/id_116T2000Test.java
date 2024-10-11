// SortArrayTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains one unit test case for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
/**
		* Test case for {@link SortArray#sortArray(List)}.
		*/
    @Test
    public void sortArray() {
        // ArrayList class used by the tests.
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(0);
        List<Integer> sorted = SortArray.sortArray(testList);
        testList.remove(testList.size() - 1);
        assertEquals(sorted.get(sorted.size() - 1), testList.get(sorted.size() - 1));
    }
}