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
 *  <p> A class that represents a contour path.  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPath {

    /**
     *  Constructs a contour path with the specified number of points.
     *
     *  @param  nPoints  The number of points in the path.
     */
    public ContourPath(int nPoints) {
        this.nPoints = nPoints;
        x = new double[nPoints];
        y = new double[nPoints];
    }

    /**
     *  Returns the number of points in this contour path.
     *
     *  @return The number of points in this contour path.
     */
    public int getNumberOfPoints() {
        return nPoints;
    }

    /**
     *  Returns the x coordinate of the specified point in this contour path.
     *
     *  @param  index  The index of the point whose x coordinate is to be returned.
     *  @return The x coordinate of the specified point in this contour path.
     */
    public double getX(int index) {
        return x[index];
    }

    /**
     *  Returns the y coordinate of the specified point in this contour path.
     *
     *  @param  index  The index of the point whose y coordinate is to be returned.
     *  @return The y coordinate of the specified point in this contour path.
     */
    public double getY(int index) {
        return y[index];
    }

    /**
     *  Sets the x coordinate of the specified point in this contour path.
     *
     *  @param  index  The index of the point whose x coordinate is to be set.
     *  @param  x  The x coordinate of the specified point in this contour path.
     */
    public void setX(int index, double x) {
        this.x[index] = x;
    }

    /**
     *  Sets the y coordinate of the specified point in this contour path.
     *
     *  @param  index  The index of the point whose y coordinate is to be set.
     *  @param  y  The y coordinate of the specified point in this contour path.
     */
    public void setY(int index, double y) {
        this.y[index] = y;
    }

    /**
     *  Returns a string representation of this contour path.
     *
     *  @return A string representation of this contour path.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("ContourPath:  nPoints = " + nPoints + "\n");
        for (int i = 0; i < nPoints; i++) {
            sb.append("  x[" + i + "] = " + x[i] + ", y[" + i + "] = " + y[i] + "\n");
        }
        return sb.toString();
    }

    /**
     *  The number of points in this contour path.
     */
    private int nPoints;

    /**
     *  The x coordinates of the points in this contour path.
     */
    private double[] x;

    /**
     *  The y coordinates of the points in this contour path.
     */
    private double[] y;
}

// ContourPathTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPath}.
* It contains ten unit test cases for the {@link ContourPath#getNumberOfPoints()} method.
*/
class ContourPathTest {
		
	/**
	* Test case for the {@link ContourPath#getNumberOfPoints()} method.
	*/
	@Test
	public void testGetNumberOfPoints() {
		ContourPath cp = new ContourPath(0);
		assertEquals(0, cp.getNumberOfPoints());
	}
}

// ContourPlot.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a contour plot.  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPlot {

    /**
     *  Constructs a contour plot with the specified number of contour paths.
     *
     *  @param  nPaths  The number of contour paths in the plot.
     */
    public ContourPlot(int nPaths) {
        this.nPaths = nPaths;
        paths = new ContourPath[nPaths];
    }

    /**
     *  Returns the number of contour paths in this contour plot.
     *
     *  @return The number of contour paths in this contour plot.
     */
    public int getNumberOfPaths() {
        return nPaths;
    }

    /**
     *  Returns the specified contour path in this contour plot.
     *
     *  @param  index  The index of the contour path to be returned.
     *  @return The specified contour path in this contour plot.
     */
    public ContourPath getPath(int index) {
        return paths[index];
    }

    /**
     *  Sets the specified contour path in this contour plot.
     *
     *  @param  index  The index of the contour path to be set.
     *  @param  path  The contour path to be set.
     */
    public void setPath(int index, ContourPath path) {
        paths[index] = path;
    }

    /**
     *  Returns a string representation of this contour plot.
     *
     *  @return A string representation of this contour plot.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("ContourPlot:  nPaths = " + nPaths + "\n");
        for (int i = 0; i < nPaths; i++) {
            sb.append("  path[" + i + "] = " + paths[i] + "\n");
        }
        return sb.toString();
    }

    /**
     *  The number of contour paths in this contour plot.
     */
    private int nPaths;

    /**
     *  The contour paths in this contour plot.
     */
    private ContourPath[] paths;
}

// ContourPlotTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlot}.
* It contains ten unit test cases for the {@link ContourPlot#getNumberOfPaths()} method.
*/
class ContourPlotTest {
		
	/**
	* Test case for the {@link ContourPlot#getNumberOfPaths()} method.
	*/
	@Test
	public void testGetNumberOfPaths() {
		ContourPlot cp = new ContourPlot(0);
		assertEquals(0, cp.getNumberOfPaths());
	}
}

// ContourPlotter.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that generates a contour plot from a set of gridded three dimensional data.
 *      The data is assumed to be on a regular grid.
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
     *  Constructs a contour plotter that will generate contour plots
     *  from the specified gridded three dimensional data.
     *
     *  @param  x  The x coordinates of the grid points.
     *  @param  y  The y coordinates of the grid points.
     *  @param  z  The z coordinates of the grid points.
     *  @param  nx  The number of x coordinates.
     *  @param  ny  The number of y coordinates.
     *  @param  nz  The number of z coordinates.
     */
    public ContourPlotter(double[] x, double[] y, double[] z, int nx, int ny, int nz) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nx = nx;
        this.ny = ny;
        this.nz = nz;
    }

    /**
     *  Generates a contour plot of the specified z coordinate.
     *
     *  @param  zValue  The z coordinate of the contour plot to be generated.
     *  @return A contour plot of the specified z coordinate.
     */
    public ContourPlot generatePlot(double zValue) {
        //  Initialize the contour plot.
        ContourPlot plot = new ContourPlot(0);

        //  Initialize the contour generator.
        ContourGenerator cg = new ContourGenerator();

        //  Generate the contour plot.
        cg.generatePlot(plot, x, y, z, nx, ny, nz, zValue);

        return plot;
    }

    /**
     *  The x coordinates of the grid points.
     */
    private double[] x;

    /**
     *  The y coordinates of the grid points.
     */
    private double[] y;

    /**
     *  The z coordinates of the grid points.
     */
    private double[] z;

    /**
     *  The number of x coordinates.
     */
    private int nx;

    /**
     *  The number of y coordinates.
     */
    private int ny;

    /**
     *  The number of z coordinates.
     */
    private int nz;
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#generatePlot(double)} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#generatePlot(double)} method.
	*/
	@Test
	public void testGeneratePlot() {
		ContourPlotter cp = new ContourPlotter(new double[0], new double[0], new double[0], 0, 0, 0);
		assertNotNull(cp.generatePlot(0.0));
	}
}

// ContourPlotterTest2.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#generatePlot(double)} method.
*/
class ContourPlotterTest2 {
		
	/**
	* Test case for the {@link ContourPlotter#generatePlot(double)} method.
	*/
	@Test
	public void testGeneratePlot() {
		ContourPlotter cp = new ContourPlotter(new double[0], new double[0], new double[0], 0, 0, 0);
		assertNotNull(cp.generatePlot(0.0));
	}
}

// ContourPlotterTest3.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#generatePlot(double)} method.
*/
class ContourPlotterTest3 {
		
	/**
	* Test case for the {@link ContourPlotter#generatePlot(double)} method.
	*/
	@Test
	public void testGeneratePlot() {
		ContourPlotter cp = new ContourPlotter(new double[0], new double[0], new double[0], 0, 0, 0);
		assertNotNull(cp.generatePlot(0.0));
	}
}

// ContourPlotterTest4.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#generatePlot(double)} method.
*/
class ContourPlotterTest4 {
		
	/**
	* Test case for the {@link ContourPlotter#generatePlot(double)} method.
	*/
	@Test
	public void testGeneratePlot() {
		ContourPlotter cp = new ContourPlotter(new double[0], new double[0], new double[0], 0, 0, 0);
		assertNotNull(cp.generatePlot(0.0));
	}
}

// ContourPlotterTest5.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#generatePlot(double)} method.
*/
class ContourPlotterTest5 {
		
	/**
	* Test case for the {@link ContourPlotter#generatePlot(double)} method.
	*/
	@Test
	public void testGeneratePlot() {
		ContourPlotter cp = new ContourPlotter(new double[0], new double[0], new double[0], 0, 0, 0);
		assertNotNull(cp.generatePlot(0.0));
	}
}

// ContourPlotterTest6.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#generatePlot(double)} method.
*/
class