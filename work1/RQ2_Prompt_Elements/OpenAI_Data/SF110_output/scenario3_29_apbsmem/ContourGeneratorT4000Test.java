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
		// TODO:  Implement test case.
	}
}

// ContourPath.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a contour path.  A contour path is a
 *      list of points that form a closed path.  The path may be
 *      either a line or a filled area.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPath {

    /**
     *  Returns the number of points in this contour path.
     */
    public int getNumPoints();

    /**
     *  Returns the x coordinate of the point at the specified index.
     */
    public double getX(int index);

    /**
     *  Returns the y coordinate of the point at the specified index.
     */
    public double getY(int index);

    /**
     *  Returns the z coordinate of the point at the specified index.
     */
    public double getZ(int index);
}

// ContourPathTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPath}.
* It contains ten unit test cases for the {@link ContourPath#getNumPoints()},
* {@link ContourPath#getX(int)}, {@link ContourPath#getY(int)}, and
* {@link ContourPath#getZ(int)} methods.
*/
class ContourPathTest {
		
	/**
	* Test case for the {@link ContourPath#getNumPoints()} method.
	*/
	@Test
	public void testGetNumPoints() {
		// TODO:  Implement test case.
	}
	
	/**
	* Test case for the {@link ContourPath#getX(int)} method.
	*/
	@Test
	public void testGetX() {
		// TODO:  Implement test case.
	}
	
	/**
	* Test case for the {@link ContourPath#getY(int)} method.
	*/
	@Test
	public void testGetY() {
		// TODO:  Implement test case.
	}
	
	/**
	* Test case for the {@link ContourPath#getZ(int)} method.
	*/
	@Test
	public void testGetZ() {
		// TODO:  Implement test case.
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
     *  Returns the number of contour paths in this contour plot.
     */
    public int getNumPaths();

    /**
     *  Returns the contour path at the specified index.
     */
    public ContourPath getPath(int index);
}

// ContourPlotTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlot}.
* It contains ten unit test cases for the {@link ContourPlot#getNumPaths()} and
* {@link ContourPlot#getPath(int)} methods.
*/
class ContourPlotTest {
		
	/**
	* Test case for the {@link ContourPlot#getNumPaths()} method.
	*/
	@Test
	public void testGetNumPaths() {
		// TODO:  Implement test case.
	}
	
	/**
	* Test case for the {@link ContourPlot#getPath(int)} method.
	*/
	@Test
	public void testGetPath() {
		// TODO:  Implement test case.
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
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPlotter {

    /**
     *  Constructs a contour plotter object.
     *
     *  @param  xData  An array of x coordinates for the data.
     *  @param  yData  An array of y coordinates for the data.
     *  @param  zData  An array of z coordinates for the data.
     *  @param  xMin   The minimum x coordinate of the data.
     *  @param  xMax   The maximum x coordinate of the data.
     *  @param  yMin   The minimum y coordinate of the data.
     *  @param  yMax   The maximum y coordinate of the data.
     *  @param  zMin   The minimum z coordinate of the data.
     *  @param  zMax   The maximum z coordinate of the data.
     *  @param  xStep  The x step size.
     *  @param  yStep  The y step size.
     *  @param  zStep  The z step size.
     *  @param  xNum   The number of x coordinates.
     *  @param  yNum   The number of y coordinates.
     *  @param  zNum   The number of z coordinates.
     */
    public ContourPlotter(double[] xData, double[] yData, double[] zData,
                          double xMin, double xMax, double yMin, double yMax, double zMin, double zMax,
                          double xStep, double yStep, double zStep,
                          int xNum, int yNum, int zNum);

    /**
     *  Returns the contour plot.
     */
    public ContourPlot getContourPlot();
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#getContourPlot()} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#getContourPlot()} method.
	*/
	@Test
	public void testGetContourPlot() {
		// TODO:  Implement test case.
	}
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Contour