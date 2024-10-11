// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {
		// Create some objects.
		private PlotDatum[] data = null;
		private PlotSymbol symbol = null;
		private PlotRunList runList;

		/**
		* This method is used to make an object suitable for
		* cloning or generating test reports.  The purpose of
		* this method is to ensure that PlotRun objects
		* are properly cloned and that the objects used are
		* in fact clones of the respective PlotRuns
		* (or null, for zero-length data list).
		*  
		* @param  _data  An object whose PlotDatum objects are to be cloned.
		*/
		static PlotRunList_0Test makeClone(PlotRun[] _data) {
			return new PlotRunList_0Test(new PlotDatum[_data.length],
					new PlotSymbol(_data[0].getPlotSymbol().getSymbol()),
					new PlotRunList(_data));
		}

		/**
		*  Create a PlotRunList from an array of PlotDatum objects.
		*
		*  @param  data  An array of PlotDatum objects to be converted to 
		*               PlotRun objects.
		*  @return  An empty PlotRunList object created with the given
		*                   data.
		*  @throws  ClassCastException - if the specified element is not a
		*                   PlotDatum type object.
		*/
		static PlotRunList_0Test makeCopiedFrom(PlotDatum[] data) {
			assertNotNull("Data objects cannot be null", data);
			return makeClone(new PlotRunList(data));
		}

// Test Method
	@Test
	public void testAll() {	
		// Create the data array first with a null array.
		runList = new PlotRunList(null);
		// Remove elements from the data array.
		int count = runList.size();
		for (int i = 1; i <= count; i++) {
			runList.remove(i);
		}
		// Check the number of objects.
		assertEquals("Number of runs", 0,runList.size());
		// Check the zero-length data list.
		assertEquals("Run list has 0 size", 0,runList.size());
		// Test cloning of lists.
}
}