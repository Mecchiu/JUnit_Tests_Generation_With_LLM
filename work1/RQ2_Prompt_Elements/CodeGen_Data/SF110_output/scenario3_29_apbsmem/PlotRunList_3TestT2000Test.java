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
static class DataList {
			String data1;
			Integer data2;
		}
    
    /**
     *  Constructor used by subclasses of the {@link PlotRunList} class.
     */
    public PlotRunList_3Test() {}

    /**
     * Test whether the {@link DataList#data1} field is set.
     */
    @Test
    public void test_setData1(){
        PlotRunList runList = new PlotRunList();

		runList.add(new DataList().data1 = "1", new Integer(1));

		assertEquals(1, runList.size());
	}

    // Tests the subclasses of the {@link PlotRunList} class.

    /**
	 * Tests implementation of the {@link java.util.Iterator#next()}
	 * method and tests methods to return in a single line, using the
	 * {@link Object#equals(java.lang.Object)} {@link java.lang.Object#equals(java.lang.Object)}
	 * method.
	 */
	@Test
	public void test_iterator_next() {
    	Iterator<PlotRunList> it = runList.iterator();
		
		assertTrue(it.hasNext());
		
		int i = 0;
		for (Run run : it)
			assertEquals(i + 1, run.size());
		
		it.next();
		
		i = 0;
		for (int k = 1; k < 10; k++)
			it.next();
	}
    }

// PlotRunList.java