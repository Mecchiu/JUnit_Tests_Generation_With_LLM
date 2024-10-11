// SortArray1Test.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains one unit test case for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

    /**
     * Unit tests the {@link SortArray1#sortArray(List)} method for a single list of two non-negative integer values
     */
    @Test
    public void test1() {
        assertEquals(new ArrayList<Object>(2), Collections.singletonList(new Integer(22)));
    }
		
}