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
		 * Test case for the {@link #test} method.
		 *
		 * @throws NullPointerException  if either attribute is null.
		*/
	@Test
	    public void test() {
		final PlotRun p = new PlotRun();

		final double[] x = new double[] { 1.1, 2.1, 3.1 };
		final double[] y = new double[] { 4.2, 5.2, 6.2 };
		final PlotSymbol symbol = new PlotSymbol("PlotSymbolTest");

		p.add(0, new PlotDatum(x, Color.blue, symbol));
		p.add(1, new PlotDatum(y, Color.blue, symbol));
		p.add(2, new PlotDatum(x, Color.red, symbol));
		p.add(3, new PlotDatum(y, Color.gray));
		p.add(4, new PlotDatum(x, null, symbol));
		p.add(5, new PlotDatum(y, null, symbol));

		p.setMinX(1.1);
		p.setMaxX(2.1);
		p.setMinY(1.1);
		p.setMaxY(2.1);

		final Iterator f = p.iterator();
		final PlotDatum s = (PlotDatum) f.next();

		assertEquals(1.1, s.x(), 0.01);
		assertEquals(1.1, s.y(), 0.01);
		assertFalse(f.hasNext());
	}

	/**
	 * Make a Clone of a PlotRun object.
	 *
	 * @return a clone of this object.
	 */
	@org.junit.jupiter.api.Disabled
	public Object clone() {
}
}