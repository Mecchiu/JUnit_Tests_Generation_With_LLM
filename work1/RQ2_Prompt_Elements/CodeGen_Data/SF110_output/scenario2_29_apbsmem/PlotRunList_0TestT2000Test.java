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
private static final double DELTA_BETWEEN_POINTS = 0.005;

	/**
   *  Tests if the {@link PlotRunList#size()} method returns the expected
   *  value.
   */


	@Test
	void test_size() {
		assertEquals(data.size(), size(), "+/-");
	}

	/**
   *  Test if the {@link PlotRunList#getRun(int)} returns the expected
   *  PlotRun object.
   */


	@Test
	void test_getRun() {

		assertNotNull(data.getRun(0).color);
		assertEquals(new Color(0, 255, 255), data.getRun(0).color);
	}

	/**
   *  Test if the {@link PlotRunList#appendRun(PlotRun)} inserts the
   *  {@link PlotRun} in this run list to the end of the list.
   */


	@Test
	void appendRun_insert() {

		PlotRun run_3 = new SimplePlotRun();
		data.setRun(0, run_3);
		assertEquals(data.getRun(0), run_3);
		assertTrue(data.size() > 0);
		data.appendRun(run_3);
		assertEquals(data.getRun(0), run_3);
		assertEquals(data.size(), 1);
	}

	/**
   *  Test if the {@link PlotRunList#removeRun(int)} deletes the
   *  {@link PlotRun} the specified run.
   */


	@Test
	void removeRun_deletion() {

		assertNull(data.removeRun(0));
		assertTrue(data.size() == 0);
		assertEquals(data.getRun(1), null);
	}

	/**
   *  Tests if the size() method changes the state of the objects in the
   *  run list.
   */


	@Test
	public void test_ensures() {

		Vector old_data = new Vector(data);

		data.setRun(0, null);
		Vector newval = new Vector(data);
		ListIterator it = newval.listIterator();
		while (it.hasNext()) {
			it.next();
			it.set(null);
		}
		assertEquals(old_data.size(), newval.size());
		assertFalse(newval.contains(old_data.firstElement()));
	}

	/**
   *  Create a copy of the run list and adds itself to it.
   */

	@Test
    public void test_add() {

		Vector old_data = new Vector(data);

        plot_1.setData(data);
        plot_1.addRun(data);
        Vector newval = new Vector(plot_1);


        ListIterator it = newval.listIterator();
        while (it.hasNext()) {
            it.next();
            it.set(null);
        }
		assertEquals(old_data.size(), newval.size());
		assertFalse(newval.contains(old_data.firstElement()));

	}

	private final static void show_run(Object object) {
		((PlotRun)object).show();
	}

	/**
   *  Create and show a simple plot using random data and adds it to the end of
   *  the run list.
   */

	@Test
	public void test_add_rnd_plot() {

		for(int i=0;i<100;i++) {
			Vector old_data = new Vector(data);
			for (int j = 0; j < 3; j++) {
				show_run(plot.addPlotRun((PlotRun)new SimplePlotRun()));
				PlotRun run_2 = plot.getPlotRun(1);
				assertNotNull(run_2);
			}
			for (int j = 0; j < 10; j++) {
				show_run(plot_1.addRun(new SimpleRun()));
			}
			Vector newval = new Vector(plot_1);
			ListIterator it = newval.listIterator();
			while (it.hasNext()) {
			it.next();
			it.set(null);
			}
			assertEquals(newval.size(), old_data.size());
			assertFalse(old_data.contains(newval.firstElement()));
		}
	}
}
