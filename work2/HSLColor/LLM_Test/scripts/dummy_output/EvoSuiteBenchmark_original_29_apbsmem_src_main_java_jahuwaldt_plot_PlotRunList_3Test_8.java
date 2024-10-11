// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		
    /**
     * Test {@link PlotRunList#iterator()} for a non-empty list.
     *
     * @param data  An ArrayList containing the data to test the iterator method.
     */
	@Test
    public void run_iterator_data(ArrayList data) {

        assertNotNull("The iterator returned null.  Please report this message.",
                      data.iterator());
        assertTrue("The number of runs returned from the iterator is incorrect.", data.size() > 0);
        assertTrue("The index is incorrect.", data.get(0) instanceof PlotRun);
    }
    
    /**
     * Return one array element at the specified position
     * in the list.
     *
     * @param index   The index of the run to return.
     *
     * @return A PlotRun object
     *
     * @throws ClassCastException - if the specified index is not a valid index.
     */
    public Object run_get(int index) throws ClassCastException {
        return ((ArrayList) get(index)).get(0);
    }
	@Test
    public void run_size() throws ClassCastException {

        assertEquals("Size of the result of size()", 0, run_size());
    }

}