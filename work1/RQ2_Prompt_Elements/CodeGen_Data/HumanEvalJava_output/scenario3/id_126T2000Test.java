// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains one unit test case for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    /**
     * Test that {@link IsSorted#isSorted(List)} returns {@code true}.
     */
    @Test
    void isSortedTrue() {
        {
            List<Object> lst = new ArrayList<Object>(0);
            lst.add(1);
            lst.add(2);
            lst.add(3);
            lst.add(4);
            lst.add(5);
            lst.add(6);
            lst.add(7);
            lst.add(8);
            List<Object> expected = new ArrayList<Object>();
            expected.add(1);
            expected.add(2);
            expected.add(3);
            expected.add(4);
            expected.add(5);
            expected.add(6);
            expected.add(7);
            expected.add(8);
            assertTrue(isSorted(lst).equals(expected));
        }
        {
            List<Object> lst = new ArrayList<Object>(0);
            lst.add(1);
            lst.add(2);
            lst.add(4);
            lst.add(5);
            lst.add(6);
            lst.add(7);
            lst.add(8);
            List<Object> expected = new ArrayList<Object>();
            expected.add(1);
            expected.add(5);
            expected.add(6);
            expected.add(7);
            expected.add(4);
            expected.add(2);
            expected.add(1);
            expected.add(6);
            expected.add(8);
            assertTrue(isSorted(lst).equals(expected));
        }
        {
            List<Object> lst = new ArrayList<Object>(0);
            lst.add(3);
            lst.add(2);
            lst.add(5);
            lst.add(4);
            lst.add(7);
            lst.add(8);
            List<Object> expected = new ArrayList<Object>();
            expected.clear();
            expected.add(3);
            expected.add(2);
            expected.add(5);
            expected.add(4);
            expected.add(7);
            expected.add(8);
            expected.add(1);
            expected.add(2);
            expected.add(6);
            expected.add(3);
            expected.add(5);
            expected.add(4);
            expected.add(7);
            expected.add(8);
            assertTrue(isSorted(lst).equals(expected));
        }
    }

    /**
     * Test {@link List#remove(int) remove(int)}; {@code this} is always equal to
     * {@code this}; all other parameters are not.
     */
    @Test
    void remove() {
        List<Object> lst = new ArrayList<Object>();
        assertNotEquals(lst, this);
        lst.remove(2);
        assertEquals(lst, this);
        lst.remove(3);
        assertEquals(lst, this);
        lst.remove(1);
        assertEquals(lst, this);
    }
}