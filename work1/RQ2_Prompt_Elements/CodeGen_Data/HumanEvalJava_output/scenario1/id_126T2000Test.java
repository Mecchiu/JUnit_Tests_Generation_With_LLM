// IsSortedTest.java
package scenario1;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains one unit test case for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    @Test
    void testConstructor() {
            assertTrue(new IsSorted(new int[] {1, 2}).isSorted(new int[] {3, 2})
                    .equals(true));
            assertTrue(new IsSorted(new int[] {1, 2}).isSorted(new int[] {1, 3, 2, 3})
                           .equals(true));
            assertTrue(new IsSorted(new int[] {1, 2}).isSorted(new int[] {0, 3, 2, 3})
                           .equals(true));
            assertTrue(new IsSorted(new int[] {1, 2}).isSorted(new int[] {1, 3, 0, 2, 3})
                           .equals(false));
            assertTrue(new IsSorted(new int[] {1, 2}).isSorted(new int[] {0, 2, 3, 1, 3})
                           .equals(false));
            assertTrue(new IsSorted(new int[] {1, 2}).isSorted(new int[] {1, 3, 0, 2, 3, 1, 3})
                           .equals(false));
    }
    
    @Test
    void testGetList() {
            List<Integer> result = new IsSorted(new int[] {1, 2}).isSorted(new int[] {3, 2})
                   .getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>()).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>(), 2).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>(2), 2).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>(0), 2).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>(1), 2).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>(10, 2), 2).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
            result = new IsSorted(new int[] {1, 2}).isSorted(new HashMap<>(20, 2), 2).getList();
            assertTrue(result.size() == 1);
            assertTrue(result.get(0) == 3);
    }
}

