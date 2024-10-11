// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		// Debug flag.
    private static final boolean DEBUG = false;

    
	//	Object Under Test.
	private final double[] func_ = {-1.0, 1.0};
	//	Number of tick marks in the output Data
	private final int xtickMark_ = 3; 

	// Default object under test.
	LinearAxisScale output_;

	@Test
	void calcTickMarks_1() {
  double[] f = func_;
        output_ = new LinearAxisScale(f, -1.0, 1.0, xtickMark_);
	assertEquals(0l, output_.getLowerBound(), 0.0);
	assertEquals(0l, output_.getUpperBound(), 0.0);
  double[][] dta = output_.calcTickMarks(0.5, 0.0, 0.7, 0.0, new double[] {1.0, 0.0});
		assertTrue(DEBUG, dta[0].length == 1);
		assertTrue(DEBUG, dta[1].length == 2);
		assertTrue(DEBUG, dta[1][0] == 0.5);
  double[] df = new double[dta[0].length];
		for (int i = 0; i < dta.length; i++) {
			df[i] = dta[i][0];
		}
	assertEquals(0l, df[0], 0.0);
	assertEquals(0l, df[1], 0.0);
  double[][] dtf = output_.calcTickMarks(0.95, 0.0, 0.5, 0.0, new double[] {1.1, 0.0});
		assertTrue(DEBUG, dtf.length == 1);
		assertTrue(DEBUG, dtf[0].length == 2);
		assertTrue(DEBUG, dtf[0][0] == 0.8);
  double[] df2 = new double[dtf.length];
		for (int i = 0; i < dtf.length; i++) {
			df2[i] = dtf[i][0];
		}
	assertEquals(0l, df2[0], 0.0);
	assertEquals(0l, df2[1], 0.0);
  double[] ef = output_.calcEmissions(0.95, 0.0, 0.5, 0.0, new double[] {0.5, 0.0});
	assertEquals(0l, ef[0], 0.0);
	assertEquals(0l, ef[1], 0.0);
}
}