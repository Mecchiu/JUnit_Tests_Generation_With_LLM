// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {
		final static double EPSILON = 1e-10;

	/**
	* Verify that a PlotDatum object in a PlotRun is
	* well formed.
	*/
	@Test
	public void test2() {
		final double x1 = 0.0, y1 = 0.0;
		final double x2 = EPSILON, y2 = EPSILON;
		TestData testData = new TestData(x1, y1, 100.0, 100.0);
		PlotDatum testData2 =
	        new PlotDatum(x2, y2
	           , Color.red
	           , "Symbol1");
		assertTrue(Double.isInfinite(testData2.getX()));
		assertTrue(Double.isInfinite(testData2.getY()));
	}

	/**
	* Test of get method, of class PlotRun.
	*/
	@Test
	public void test3() {
		final double EPSILON = 10e-10;
		final double x1 = 0.0, y1 = 0.0;
		final double x2 = 1e-10, y2 = EPSILON;
		final PlotRun run = new PlotRun(new double[] {x1, y1,
	                x2, y2});
		final double expected = (x1 + x2 + x2) / 2;
		final double actual = run.getMinX();
		assertTrue(
	            Math.abs(expected) <
	        EPSILON * Math.sqrt(expected * expected),
		"Test 1.1.1 - " + Math.abs("expected " + expected + " was " + actual) +
	        ". Actual is " + actual);
	}
}