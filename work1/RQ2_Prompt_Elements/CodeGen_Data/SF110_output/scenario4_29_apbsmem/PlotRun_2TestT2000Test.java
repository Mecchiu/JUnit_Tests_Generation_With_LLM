// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {

	void test(final PlotRun run) {
		final Collection out = new ArrayList();
		final Set data = new HashSet();
		
		run.getItems().forEach(item -> {
			final double xValue = item.getX();
			final double yValue = item.getY();
			data.add(new Double(xValue*2));
			data.add(new Double(5.8*yValue));
			out.add(item);
		});
		
		run.remove(0);
		assertEquals(out.size(), data.size());
		
		for (final Object datumO : out) {
			final PlotDatum datum = (PlotDatum) datumO;
			final double xValue = datum.getX();
			final double yValue = datum.getY();
			final Collection<Double> values = new ArrayList();
			values.add(new Double(yValue*5));
			values.add(new Double(8*xValue));
			assertTrue(values.contains(Double.valueOf(5.8*xValue)));
			assertTrue(values.contains(Double.valueOf(8*yValue)));
			assertTrue(out.remove(datumO));
		}
	}


	@Test
	void test() {
		final PlotRun run = new PlotRun();
		run.remove(0);
		final Collection<Object> out = run.iterator();
		assertEquals(out.size(), 0);
		run.remove(2);
		assertEquals(out.size(), 0);
		run.add(2, new Object(new Double(3.4)));
		assertEquals(out.size(), 1);
		run.add(3, new Object(new Double(3.4)));
		assertEquals(out.size(), 1);
		run.remove(2);
		assertEquals(out.size(), 1);
		run.remove