// SortThirdTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains one unit test case for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

    /**
    * This test cases shows how to use the {@link SortThird#sortThird(List)#size()} method to determine the size of its list.
    */
    @Test
    void testThatSizeIsSorted() {
        List list = new ArrayList();
        Collections.addAll(list, 0, 1, 2, 3, 4, 5, 6, 7);
        assertEquals(17, list.size());
        Integer[] indices = ListUtils.toIntArray(list,"");
        assertSame(47, indices[0]);
        assertEquals(6, list.size());
        for (int i = 0; i < indices.length; i++) {
            assertSame(47, indices[i]);
            ListUtils.addAll(list, indices[i]);
        }
    }

    /**
    * This test cases shows how to use the {@link SortThird#sortThird(List)#size} method to determine the minimum number of elements for the list.
    */
    @Test
    void testSizeIsMin() {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 0, 1, 2, 3, 4, 5, 6, 7);
        assertEquals(0, list.size());
        list = new ArrayList();
        Collections.addAll(list, 0, 1, 2, 3, 4, 5, 6, 7);
        assertEquals(4, list.size());
        for (int k = 0; k < list.size(); k++) {
            assertTrue(list.get(k) == list.get(0));
        }
        assertSame(7, list.size());

        // Add all elements in the list
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.removeAll(list);
        assertEquals(7, list.size());
        
        // Add all elements in the list from this point
        list.addAll(Collections.nCopies(list.size() * 2, list.get(0)));
        list.addAll(Collections.nCopies(list.size() * 2, list.get(1)));
        list.removeAll(list);
        assertEquals(7, list.size());
        for (int k = 0; k < list.size() * 2; k++) {
            assertTrue(list.get(k) == list.get(0));
        }
        
        // Check that the default max/min values are used
        list = new ArrayList();
        list.addAll(Collections.nCopies(list.size() * 2, list.get(0)));
        list.addAll(Collections.nCopies(list.size() * 2, list.get(1)));
        Collections.addAll(list, Collections.nCopies(list.size() * 2, 1, 19));
        list = new ArrayList(list);
        assertEquals(17, list.size());
    }
}
