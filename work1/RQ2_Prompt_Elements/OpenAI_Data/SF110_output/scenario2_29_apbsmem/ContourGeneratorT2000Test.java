// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains ten unit test cases for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {

	/**
	* Test case for the {@link ContourGenerator#done()} method.
	*/
	@Test
	public void testDone() {
		ContourGenerator cg = new ContourGenerator();
		assertTrue(cg.done());
	}
}

// ContourPath.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a contour path.  A contour path is a
 *      list of points that make up a contour line.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPath {

    /**
     *  The list of points that make up this contour path.
     */
    private List<ContourPoint> points;

    /**
     *  Constructs a contour path with no points.
     */
    public ContourPath() {
        points = new ArrayList<ContourPoint>();
    }

    /**
     *  Adds a point to the end of this contour path.
     */
    public void addPoint(ContourPoint point) {
        points.add(point);
    }

    /**
     *  Returns the number of points in this contour path.
     */
    public int getNumPoints() {
        return points.size();
    }

    /**
     *  Returns the point at the specified index.
     */
    public ContourPoint getPoint(int index) {
        return points.get(index);
    }

    /**
     *  Returns the list of points that make up this contour path.
     */
    public List<ContourPoint> getPoints() {
        return points;
    }
}

// ContourPoint.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a point on a contour line.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPoint {

    /**
     *  The x coordinate of this point.
     */
    private double x;

    /**
     *  The y coordinate of this point.
     */
    private double y;

    /**
     *  Constructs a contour point with the specified coordinates.
     */
    public ContourPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *  Returns the x coordinate of this point.
     */
    public double getX() {
        return x;
    }

    /**
     *  Returns the y coordinate of this point.
     */
    public double getY() {
        return y;
    }
}

// ContourPlot.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a contour plot.  A contour plot is a
 *      list of contour paths.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPlot {

    /**
     *  The list of contour paths that make up this contour plot.
     */
    private List<ContourPath> paths;

    /**
     *  Constructs a contour plot with no contour paths.
     */
    public ContourPlot() {
        paths = new ArrayList<ContourPath>();
    }

    /**
     *  Adds a contour path to the end of this contour plot.
     */
    public void addPath(ContourPath path) {
        paths.add(path);
    }

    /**
     *  Returns the number of contour paths in this contour plot.
     */
    public int getNumPaths() {
        return paths.size();
    }

    /**
     *  Returns the contour path at the specified index.
     */
    public ContourPath getPath(int index) {
        return paths.get(index);
    }

    /**
     *  Returns the list of contour paths that make up this contour plot.
     */
    public List<ContourPath> getPaths() {
        return paths;
    }
}

// ContourPlotTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlot}.
* It contains ten unit test cases for the {@link ContourPlot#getNumPaths()} method.
*/
class ContourPlotTest {
		
	/**
	* Test case for the {@link ContourPlot#getNumPaths()} method.
	*/
	@Test
	public void testGetNumPaths() {
		ContourPlot cp = new ContourPlot();
		assertEquals(0, cp.getNumPaths());
	}
}

// ContourPlotter.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that generates a contour plot from a set of gridded
 *      three dimensional data.
 *  </p>
 *
 *  <p> Based on contour_plot.c from NeXTcontour1.4 by Thomas H. Pulliam,
 *      pulliam@rft29.nas.nasa.gov, MS 202A-1 NASA Ames Research Center,
 *      Moffett Field, CA 94035.
 *      I don't know how the original Fortran code looked like or where it came from,
 *      other than that NeXTcontour1.4 is based on Pieter Bunings' PLOT3D package
 *      for Computational Fluid Dynamics.
 *  </p>
 *
 *  <p> Ported from C to Java by Joseph A. Huwaldt, November 16, 2000.  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPlotter {

    /**
     *  The number of contour levels to generate.
     */
    private int numLevels;

    /**
     *  The minimum value of the data.
     */
    private double minValue;

    /**
     *  The maximum value of the data.
     */
    private double maxValue;

    /**
     *  The minimum x coordinate of the data.
     */
    private double minX;

    /**
     *  The maximum x coordinate of the data.
     */
    private double maxX;

    /**
     *  The minimum y coordinate of the data.
     */
    private double minY;

    /**
     *  The maximum y coordinate of the data.
     */
    private double maxY;

    /**
     *  The number of x coordinates in the data.
     */
    private int numX;

    /**
     *  The number of y coordinates in the data.
     */
    private int numY;

    /**
     *  The data values.
     */
    private double[][] data;

    /**
     *  The contour levels.
     */
    private double[] levels;

    /**
     *  The contour plot.
     */
    private ContourPlot plot;

    /**
     *  Constructs a contour plotter with the specified data.
     */
    public ContourPlotter(double[][] data, double minX, double maxX, double minY, double maxY) {
        this.data = data;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        numX