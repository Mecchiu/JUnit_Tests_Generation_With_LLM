// IncrListTest.java
package scenario1;

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
     * The <tt>tolerance</tt> argument to the {@link IncrList#incrList(List)}.
     */
    private final static double tolerance = 1e-6;

    /**
     * Constructor.
     * @throws Exception if an unexpected error occurs.
     */
    @Test
    public void constructorTolerance() throws Exception {
        IncrList instance = new IncrList();
        assertTrue("instance is not null", instance!= null);
    }
	

    /**
    * Returns the index of a given item, i.e. if the given item can be found
    * inside the list in order to iterate over the list.
    */
    private int indexOf(List<Object> list, Object o) {
        int result = -1;
        for (int i = 0; i < o.toString().length(); i++) {
            Object itemValue = list.get(i);
            if (itemValue.equals(o)) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Test
    public void incrListTest1() {
        ArrayList<Object> l = new ArrayList<Object>();
        l.add(new Integer(4));
        l.add(new Integer(6));
        l.add(new Integer(8));
        assertEquals(8, l.size());
        List<Object> result = new IncrList().incrList(l);
        assertEquals(2, result.size());
        assertEquals(4, indexOf(l, new Integer(4)));
        assertEquals(4, indexOf(l, new Integer(6)));
        assertEquals(8, indexOf(l, new Integer(8)));
    }

	@Test
    public void incrListTest2() {
        ArrayList<Object> l = new ArrayList<Object>();
        l.add(new Integer(4));
        l.add(new Integer(6));
        l.add(new Integer(8));
        assertEquals(8, l.size());
        List<Object> result = new IncrList().incrList(l);
        assertEquals(5, result.size());
        assertEquals(4, indexOf(l, new Integer(4)));
        assertEquals(4, indexOf(l, new Integer(6)));
        assertEquals(8, indexOf(l, new Integer(8)));
    }
}

// IncrListTest.java