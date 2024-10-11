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
		private final double TOL = 1e-6;
		private final Object DATUM = new PlotData(new double[] {0, 1, 2}, new int[] {0, 0});
		private List dataList;

	public void setUp() {
	dataList = new LinkedList();
	dataList.add(DATUM);
	}

	@Test
    public void test() {
        PlotRunList runList = new PlotRunListImpl(dataList, new double[] {0, 1, 1, 1, 1, 2});
        assertEquals(2, runList.size());

        runList.setPlotSymbol(new PlotSymbolImpl(new int[]{0, 0, 0, 1, 1, 2, 2}, 0.0000001, 10.0, 2.0, 1.5));
        assertEquals("{1, 0; 0; 0; 0; 0; 0; 2; 2}", runList.get(0).getPlotSymbolString()); 

        try {
            runList.get(5);
            fail("Could not remove element");
        } catch (IndexOutOfBoundsException e){;}
	}
}