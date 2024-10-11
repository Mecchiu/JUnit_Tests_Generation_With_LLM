// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {
		/**
		* Test of iterator method, of class Jahuwaldt.plot.PlotRun.
		*/
	@Test
	void iterator() {
		final double x = Math.random();
		final double y = Math.random();

		{
			// The object should never contain another PlotRun object.
			AbstractList run = new ArrayList();
			run.add(getClass().newInstance());
			assertTrue("run should contain other plotrun", run.iterator()==run.iterator());
		}

		{
			// The object should contain another PlotRun object.
			AbstractList run = new ArrayList();
			final List data = new ArrayList();
			run.addAll(data);
			assertTrue("run should contain one plot run", run.iterator()==run.iterator());
			// check that data is valid
			for (int i=0;i<run.size();i++) {
				final PlotDatum dataObj = (PlotDatum)run.get(i);
				final PlotData data_obj = dataObj.getData();
				assertTrue("check that data does not contain null", data_obj!= null);
			}
		}

}
}