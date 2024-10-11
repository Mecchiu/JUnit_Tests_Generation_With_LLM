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
		
	/**
	 *  Test constructor with initial data.
	 */
	@Test
	void constructor() {
		// test setup
		PlotRun run = new PlotRun();
		assertTrue("Missing data", (run.data!= null));
	}
	
	/**
	 *  Test add and remove data.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	void testAddRemove() {
		// test setup
		double[] x = new double[1];
		double[] xA = new double[1];
		x[0] = 7;
		// TODO test addition
		run.add(0, xA);
		xA[0] = 19;
		run.add(0, x);
		assertNotNull("Add operation returned null", run);
		run.remove(0);
	}
	
	/**
	*  Test add data to an existing run.
	*/
	@Test
	void testAdd() {
		// test setup
		double[] x = new double[2];
		double[] x1 = new double[1];
		double[] xA = new double[1];
		x[0] = 12D;
		xA[0] = 6D;
		
		run.add(0, x);
		
		x[0] = 23;
		
		run.add(0, x1);
		assertNotNull("Add operation returned null", run);
		run.remove(0);
		
		x[0] = 11D;
		run.add(0, x);
	}
}