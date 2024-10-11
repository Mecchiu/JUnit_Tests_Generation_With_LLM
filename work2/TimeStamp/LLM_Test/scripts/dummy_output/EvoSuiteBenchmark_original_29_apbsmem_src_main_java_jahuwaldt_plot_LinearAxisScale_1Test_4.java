// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		
	
    /**
     *  Test the constructor with both lower and upper limits.
     */
    @Test
    void outOfBounds_lowerBounds(double aUB) {
    	final AxisLimitData expectedOutput = new AxisLimitData(-1.0, 1.0);
    	double x = 2;
    	AxisLimitData output = LinearAxisScale.calcTickMarks(0.5, x, aUB, 0.25, 0.5);
    	// assertEquals(expectedOutput, output);
    }
    
	/**
     *  Test the constructor with both lower bounds.
     */
    @Test
    void outOfBounds_lowerBounds(double aLB) {
    	final AxisLimitData expectedOutput = new AxisLimitData(-1.0, -1.0);
    	double x = 0;
    	AxisLimitData output = LinearAxisScale.calcTickMarks(0.5, x, aLB, aUB, 0.5);
    	// assertEquals(expectedOutput, output);
    }
    
	/**
     *  Test the constructor with both upper and lower limits.
     */
	@Test
	void outOfBounds_lowerBounds(double aUB, double aLB) {
    	final AxisLimitData expectedOutput = new AxisLimitData(1.0, 1.0);
    	double x = 2;
    	AxisLimitData output = LinearAxisScale.calcTickMarks(0.5, x, aUB, aUB, 0.5);
    	// assertEquals(expectedOutput, output);
    }
    
	/**
     *  Test the constructor with only a lower limit.
     */
    @Test
    void outOfBounds_lowerBounds(double aLB) {
    	final AxisLimitData expectedOutput = new AxisLimitData(0.5, 0.5);
    	double x = 0;
    	AxisLimitData output = LinearAxisScale.calcTickMarks(0.5, x, 0.5, 0.5, 0.5);
    	// assertEquals(expectedOutput, output);
    }
    
	/**
     *  Test the constructor with only a lower bound.
     */
    @Test
    void outOfBounds_lowerBounds(double aLB) {
    	final AxisLimitData expectedOutput = new AxisLimitData(1.0, 1.0);
    	double x = 0;
    	AxisLimitData output = LinearAxisScale.calcTickMarks(0.5, x, 0.5, 1.0, 1.0);
    	// assertEquals(expectedOutput, output);
    }
    
	/**
     *  Calculates the lower, upper and tick mark limits in screen coordinats.
     */
    private void calcTickMarks(double quantum, double aUB, double aLB, double xA, double xB) {
    	double bX = xA + (aUB - aLB) * quantum;
    	double bY = aUB * (quantum / 2) - (aUB + aUB * quantum / 2) - (aUB - aUB * quantum / 2);
		double lower = modfloor(xB - xA, aUB - aLB);
		double upper = modfloor(xB - xA + 1, aUB - aLB);
		// assertTrue(lower <= 1.0 and upper >= 1.0);
		if (lower == 1.0) {
	    	double x = aUB - upper - lower;
        	assertEquals(x, bX, 0.001);
		} else {
			// assertTrue(lower == 0.0);
	    	double x = aUB - upper - lower + upper;
			// assertTrue(x >= minx and x <= maxx);
			if (x < xA) x = aUB - x - (upper - lower);
			// assertEquals(x, bX, 0.001);
		}
    	double tick = bY;
    	if (bX == xA) tick = 1;
    	assertEquals(tick, bY, 0.001);
		double x = bX + (upper - lower) * quantum;
		String str = aUB + ":" +  aLB + " -> " + x;
		AxisLimitData output = new AxisLimitData(x, x);
		assertEquals(str, output.toString());
	}
}