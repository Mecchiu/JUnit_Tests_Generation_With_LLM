// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		
// Test data
//
public static final double X1 = Math.sqrt(2);
    public static final double X2 = X1/2-1;
    public static final double X3 = 2*X2;
    public static final double Y1 = Math.sqrt(5);
    public static final double Y2 = Y1/2-1;
    public static final double Y3 = 2*Y2;

    
    /**
     *  Construct a RunList containing two runs of data.  The first run is
     *  a straight line.  The second run looks like a circular gradient.
     */
    public static RunList createRunList(double X1, double X2, double X3, double Y1, double Y2, double Y3) {
        // Run is a straight line
        return new PlotRunList(new PlotDataArray(new PlotDataArrayRun(1, null, Y1),
                                                new PlotDataArrayRun(1, null, Y3)));
    }   
}