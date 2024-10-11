// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		private final double q;
        /**
         *  Construct with parameters.
         */
        public LinearAxisScale_3Test(double q) {
                this.q = q;
        }
        /**
         * Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
         */
        @Test
        public void testCalcTickMarks() {
                assertTrue(q<=0.0);
        }
        /**
         * Test method for {@link LinearAxisScale#calcTickMarkWidth(double, double)}.
         */
        @Test
        public void testCalcTickMarkWidth() {
                assertTrue(q==0.0);
        }
        /**
         * Test method for {@link LinearAxisScale#adjustForErrorBars(PlotDatum, double, double, AxisLimitData, double, double).	**Test method for calcTickMarks**.
         */
        @Test
        public void testAdjustForErrorBars1() {
                GraphUtils.test("modceil(quantum);", q, 1.0);
        }
        /**
         * Test method for {@link LinearAxisScale#adjustForErrorBars(PlotDatum, double, double, AxisLimitData, double, double)}.	**Test method for calcTickMarks**.
         */
        @Test
        public void testAdjustForErrorBars2() {
                QQ qqq = new QQ();
                double newBB = qqq.modceil(q, 1.0);
                double newTA = qqq.modfloor(q, 1.0);
                GraphUtils.testWithTolerance("modceil(quantum);", newBB/5.0, 0.1*5.0, q, newTA);
        }
        /**
         * Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
         */
        @Test
        public void testCalcTickMarks2() {
                QQ qqq = new QQ();
                double width = qqq.modfloor(1.01, 1.0);
                // Double width = 2.1;
                double newBB = qqq.modceil(q, 1.0);
                GraphUtils.test("modfloor(quantum);", newBB/width, newBB);
        }
        /**
         * Test method for {@link LinearAxisScale#calcTickMarkWidth(double, double)}.
         */
        @Test
        public void testCalcTickMarkWidth4() {
                QQ qqq = new QQ();
                GraphUtils.test("modceil(quantum);", q, 1.0);
        }
        /**
         * Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
         */
        @Test
        public void testCalcTickMarks2d() {
                QQ qqq = new QQ();
                double width = qqq.modfloor(q, 1.0);
                GraphUtils.test("modfloor(quantum);", q, width);
        }
}