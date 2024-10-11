// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {

	private void runTest() {
		PlotRunList m = new PlotRunList();
		
		int maxValue = 10;
		
		// Set the max value for the test run
		m.setMaxValue(maxValue);
		
		List list = new ArrayList();
		
		list.add(new PlotDatum(1));
		
		list.add(new PlotDatum(maxValue));
		
		// Create a run list of data
		PlotRunList test = new PlotRunList(list);
				
		// Run the run list
		assertEquals(maxValue, test.remove(0).value());
	}
    
    /**
     * Test of {@link PlotRunList#getMaxValue()}
     * @throws Exception
     */
    @Test
    public void testGetMaxValue() throws Exception {
    	runTest();
    }

    /**
     * Test of {@link PlotRunList#add(PlotDatum)}.
     * @throws Exception
     */
    @Test
    public void testAdd_plotDatum() throws Throwable {
    	runTest();
    }

    /**
     * Test of {@link PlotRunList#size()}
     * @throws Exception
     */
    @Test
    public void testSize() throws Throwable {
    	runTest();
    }
	
}

