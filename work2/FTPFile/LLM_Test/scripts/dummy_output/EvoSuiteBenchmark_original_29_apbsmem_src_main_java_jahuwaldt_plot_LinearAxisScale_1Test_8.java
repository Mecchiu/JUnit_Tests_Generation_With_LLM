// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		
    
    @Test
    void defaultLowerBounds() {
        
        LinearAxisScale scale = new LinearAxisScale();
        
        assertEquals(0.0, scale.lowerBounds());
    	assertSame(scale, scale.upperBounds());
    }

    @Test
    void calcGoodMinMax() {
        
        LinearAxisScale scale = new LinearAxisScale();

        // Lower bounds:
        double xLB = 10.0;
        double xUB;
        if (xLB == 0.0) {
            xUB = 1.0;
        }
        else {
            xUB = xLB + 1.0;
        }
        
        // Lower bounds:
        AxisLimitData output = scale.calcTickMarks(1.0, xLB, xUB, 0.0, 10.0);
        
        double pdLB = output.getLowerBound(0);
        assertEquals(xLB, pdLB);
        double pdUB = output.getLowerBound(1);
        assertEquals(xUB, pdUB);

        // Upper bounds:
        xUB = -1.0;
        if (xUB == 0.0) {
            xLB = 1.0;
        }
        else {
            xLB = xUB;
        }
        
        // Upper bounds:
        output = scale.calcTickMarks(1.0, xUB, xLB, 10.0, 8.0);
        
        pdUB = output.getUpperBound(0);
        assertEquals(xUB, pdUB);
        pdLB = output.getUpperBound(1);
        assertEquals(xLB, pdLB);
        
    }

    @Test
    void calcGoodMinMaxDefault() {

        LinearAxisScale scale = new LinearAxisScale();
        
        // Lower bounds
        double xLB = 10.0;
        double xUB;
        if (xLB == 0.0) {
            xUB = 1.0;
        }
        else {
            xUB = xLB + 1.0;
        }

        // Lower boundaries
        AxisLimitData output = scale.calcTickMarks(1.0, xLB, xUB, 0.0, 10.0);
        
        double pdLB = output.getLowerBound(0);
        assertEquals(xLB, pdLB);
        double pdUB = output.getLowerBound(1);
        assertEquals(xUB, pdUB);

        // Upper bounds
        xUB = -1.0;
        if (xUB == 0.0) {
            xLB = 1.0;
        }
        else {
            xLB = xUB;
        }

        // Upper boundaries
        output = scale.calcTickMarks(1.0, xUB, xLB, 10.0, 8.0);

        double pdLB = output.getUpperBound(0);
        assertEquals(xUB, pdLB);
        double pdUB = output.getUpperBound(1);
        assertEquals(xLB, pdUB);

    }

    @Test
    void calcGoodMinMaxWrong() {

        LinearAxisScale scale = new LinearAxisScale();

        // Lower bounds
        double xLB = 10.0;
        double xUB;
        if (xLB == 0.0) {
            xUB = 1.0;
        }
        else {
            xUB = xLB + 1.0;
        }

        // lower boundaries should return the wrong value
}
}