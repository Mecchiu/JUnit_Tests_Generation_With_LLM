// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
private final LinearAxisScale theAxis1 = new LinearAxisScale("Axis1", 100,.7, 10.6, 30., 0., 0.);
		private final LinearAxisScale theAxis2 = new LinearAxisScale("Axis2", 100,.7, 10.6, 30., 0., 0.);
		private final LinearAxisScale theAxis3 = new LinearAxisScale("Axis3", 100,.7, 10.6, 30., 0., 0.);

		/**
		 *  Tests the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method with no parameters. 
		 */
		@Test
                public void testCalcTickMarks() {
                        theAxis1.calcTickMarks(25, 0, 0, 0, 0.);
                }

		/**
		 *  Tests the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method with unit quantum for the axis with size {@literal 2}.
		 *
		 * <p>Note that since the unit is square, the exact results of this unit test are irrelevant
		 * for this implementation.  See <i>Rendering of an American Chart</i> <em>by Bob Hutchy</em> for more information.</p>
		 */
		@Test
		public void testCalcTickMarks_2() {
                        theAxis2.calcTickMarks(25, 0, 0, 0, 0.);
                }

		/**
		 *  Tests the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method with unit quintum for the axis with size {@literal 3}.
		 *
		 * <p>Note that the unit is diagonal, so the exact results of this unit test are irrelevant
		 * for this implementation.  See <i>Rendering of an American Chart</i> <em>by Bob Hutchy</em> for more information.</p>
		 */
		@Test
		public void testCalcTickMarks_3() {
                        theAxis3.calcTickMarks(25, 0, 0, 0, 0.);
                }
}
