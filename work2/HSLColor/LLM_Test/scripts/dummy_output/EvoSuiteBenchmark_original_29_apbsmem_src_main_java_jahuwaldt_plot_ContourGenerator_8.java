// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains one unit test case for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {
		
    /**
     *  Runs the unit test case.
     */
    @Test
    public void test() {
        // create 3x3 gridded data
        double v1[] = {
          4.0,  8.0,  -6.0, -14.0,
          -8.0,  -4.0,  6.0,  10.0,
        };

        double p1[] = {
          2, 4, 8,
          3, 5, 7,
          6, 9, 10,
        };

        // create a set of 3D grids
        double v2[] = {
          1.0, 0.0, 5.0,
          1.0, 2.0, 4.0,
          1.0, 3.0, 5.0
        };
        double p2[] = {
          1.0, 0.0, 1.0,
          1.0, 0.0, 10.0,
          1.0, 0.0, 11.0
        };
        
        List<Double> vV = Arrays.asList(v1);
        List<Double> pV = Arrays.asList(p1);
        Collection<Double> vP = Arrays.asList(v2);

		// create an area map for plotting
        Map<Double,List<Double>> map = new LinkedHashMap<Double,List<Double>>();
        Map<Double,List<Double>> mapP = new LinkedHashMap<Double,List<Double>>();

        // make a new dataset that is different from the input dataset, set all axes
		// z = z1
		// y = y1
		// x = x1
		// y, z
        double z = 0.0;
        double y = 0.0;
        double x = 0.0;

		// create a new contour generator for plotting
        ContourGenerator cg = new ContourGenerator();
		
		// Create a new dataset based on the map created above, with the generated
		// contours set to all zeros at the (0,0) pixel location.
		// x = z
		// z = 0
        Collection<Double> zeroP = vP;

		// call the contour generator
        cg.init(vV, pV, false, 0.0, mapP, zeroP);
		    // the 3D data
        final double[] zz = {z};
        final double[] yyy = {y};
        final double[] xxx = {x};
        final double[] yyyy = {yyy};

	    // call the contour generator
        boolean success = cg.done();

        assertTrue("Generation failed", success);

		// check there are no contours on the XY plane
		assertFalse("Generated contours", cg.contours.contains(zz));

		// check the number of generated contours
        assertEquals("Wrong number of generated contours", 0, cg.contours.count());

		// check there are only generated contours
        assertFalse("Generated contours", cg.contours.contains(yyy));

        // check the number of generated contours
        assertEquals("Wrong number of generated contours", 0, cg.contours.count());

        // check the number of generated contours
        assertTrue("Generated contours", cg.contours.contains(xxx));

        // check the number of generated contours
        assertFalse("Generated contours", cg.contours.contains(yyy));

		// check the number of generated contours
        assertFalse("Generated contours", cg.contours.contains(xxxx));

	}

}