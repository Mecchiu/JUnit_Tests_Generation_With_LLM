// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		private static final double dR = 25.0;
	static final double TICK_MARK_SIZE = 100.0;
	
	private boolean debug = false;

	@Test
	public void test_constructor() {
		LinearAxisScale obj = new LinearAxisScale(dR);
		assertEquals(dR, obj.getUpperBound(), 1e-10);
		assertEquals(dR, obj.getLowerBound(), 1e-10);
	}
	
	// TODO: implement the following test.  It verifies the parameters that are passed to
	// the constructor are correct.  The input object is used for testing.
		/**
		 *
		private double modceil(double f, double t) {
			return MathExt.mod(f, t);
		}
		*/
	@Test
	public void test_modceius() {
		LinearAxisScale obj = new LinearAxisScale(dR);
		double modceiS, modceiL;
		int xD, xE;
	
		for (xD = 0; xD < 100; xD++) {
			xE = modceiL = modceiS = modfloor(modcei(TICK_MARK_SIZE), xE);
			double xF, yF;

			// xE = 100.0,
			// modceiL == 10.0
			// modceiS = 100.0
			// modfloor(modcei(5.0, xE), xF)
			// xF = 100.0
			double fxF = modceiF(xE - 2) + 1;
			double yF = modfloor(modcei(xF - 5.0, xE));
			obj.calcTickMarks(0.0, xE, xE, fxF, yF);
			xF = xE + 2;
			double fxF2 = modfloor(modcei(modceiS, xF), xE);
			yF = modfloor(modcei(modceiL, xF), xE);
			assertEquals(xxD(fxF), xxD(fxF2));
			assertEquals(yyD(fxF), yyD(fxF2));
		}
			
	}

	// TODO: Test the performance of computing the upper and lower bounds with large data points.
	
}