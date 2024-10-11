// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
private double input_xA;
		private double input_xB;
		private double output_xA;
		private double output_xB;
		private AxisLimitData  testOutput_xA = AxisLimitData_2.create(
				"output_xA", -1.0, 1, false, false);
		private AxisLimitData  testOutput_xB = AxisLimitData_2.create(
				"output_xB", 2.0, 1.0, false, true);
		private LinearAxisScale _this;

		private static double modfloor(double f, double t) {
				return f + ((t < 0.0)? modfloor(t, -1.0) : t);
		}

	/**
	* Setup of test class of {@link LinearAxisScale}.
	* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	public LinearAxisScale_3Test() {
		_this = new LinearAxisScale(_this, 
				new LinearAxis(new Vector2D(50,25),
						new Vector2D(30.0,20.0),
						new Vector2D(0.02,10.0),
						new Vector2D(0.01,5.0),
						new Vector2D(5.0,15.0,0.05),
						new Vector2D(0,1.0),
						new LineString(1,2,12)))
;
}


}
