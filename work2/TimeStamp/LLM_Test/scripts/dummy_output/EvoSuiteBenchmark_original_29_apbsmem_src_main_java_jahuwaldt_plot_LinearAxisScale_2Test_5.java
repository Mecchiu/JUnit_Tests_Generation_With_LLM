// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		CalcTickMarks calcTickMarks_1 = null;
		CalcTickMarks calcTickMarks_2 = null;
		AxisLimitData output_1 = null;
		AxisLimitData output_2 = null;
		TickMarkData tmd_1 = null;
		TickMarkData tmd_2 = null;

		/**
		* Test that lower and upper bounds are set correctly.
		* <p>
		* First, we create a scale on a test data set.  We set the lower
		* and upper bounds to be equal.  The result should be:
		* </p>
		* <p>
		*     The left value of the lower bound is the upper bound.
		*     The left value is equal to the value.
		* </p>
		* <p>
		*  Second, we calc the new upper bounds.  This should yield the correct
		*  lower and upper bounds.
		* </p>
		*/
		@Test
    public void testLowerBounds() {
		   //   calcTickMarks_1.calcTickMarks(xa,xb);
        double mod = (output_1.upperBounds() - output_1.lowerBounds()) / modceil((output_1.upperBounds() - output_1.lowerBounds()));
    			output_1 = calcTickMarks_1.findGoodLimits(mod,xa,xb);
    			output_2 = calcTickMarks_2.findGoodLimits(mod, xa, xb);
    			tmd_1 = output_1.tickMarkData();
    			tmd_2 = output_2.tickMarkData();

    			assertEquals(output_1.lowerBounds(),output_2.lowerBounds());
    			assertEquals(tmd_1.getLowerbound(), tmd_2.getLowerbound());
    			assertEquals(tmd_1.getPosition(),tmd_2.getPosition());
    		}

		/**
		* Test that when we set a lower bounds, the output
		* of the left and right side of the scaled axis should be
		* equal.  After that, we create two scale objects.  The left
		* scale should have the same limits.  The right scale
		* should use the lower bounds.  We test by this process.
		*/
		@Test
    public void testRIGHT() {
		   output_2.lowerBounds();
		   output_2.adjustForErrorBars(tmd_1,modceil(1.0, aUB), aUB, output_1);
    	      output_2.adjustForErrorBars(tmd_2, modceil(1.0, aUB), aUB, output_1);
    		 output_1 = calcTickMarks_2.findGoodLimits(output_1.upperBounds()-output_1.lowerBounds(),xb,xa);
    		 output_2 = calcTickMarks_2.findGoodLimits(output_2.upperBounds()-output_2.lowerBounds(), xb, xa);
    		 tmd_1 = output_1.tickMarkData();
    		 tmd_2 = output_2.tickMarkData();

    		 assertEquals(1.0, tmd_1.getLowerbound().getPosition(), 0.0);
    		 assertEquals(1.0, tmd_2.getLowerbound().getPosition(), 0.0);
    		 assertEquals(output_1.lowerBounds(), output_1.upperBounds(), 0.0);
    		 assertEquals(output_1.lowerBounds(), output_2.lowerBounds(), 0.0);
    		 assertEquals(tmd_1.getLowerbound(), tmd_2.getUpperbound(), 0.0);
    	}

}/**/