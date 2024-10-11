// IncrListTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains one unit test case for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

    /**
     * Test method for {@link IncrList#incrList(List)}.
     * Verify that an {@link IncrList}
     * is correctly initialized properly after initializing the list.
     */
    @Test
    public void testIncrList() {
        // Default: 1
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        assertEquals(l, new IncrList().incrList(l));

        // Specified: 2
        List<Object> l1 = null;
        l1 = new ArrayList<Object>();
        l1.add(2);
        assertEquals(l1, new IncrList(2).incrList(l1));

        // Specified: 3
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        assertEquals(l2, new IncrList(3).incrList(l2));

		// Test with custom list.
        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(4);
        l3.add(1);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(5);
        assertEquals(list3,
                new IncrList(3).incrList(
                        new ArrayList<Integer>(
                                Collections.unmodifiableList(l3))));
    }
} 