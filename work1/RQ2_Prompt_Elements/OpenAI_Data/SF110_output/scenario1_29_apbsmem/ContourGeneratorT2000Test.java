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
 *  <p> A class