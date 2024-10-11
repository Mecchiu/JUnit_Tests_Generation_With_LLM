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
		ContourGenerator generator = new ContourGenerator();
		assertTrue(generator.done());
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
     *  Returns true if this contour path is a filled area.
     *  False if it is a line.
     */
    public boolean isFilled();
}

// ContourPathTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPath}.
* It contains ten unit test cases for the {@link ContourPath#isFilled()} method.
*/
class ContourPathTest {
		
	/**
	* Test case for the {@link ContourPath#isFilled()} method.
	*/
	@Test
	public void testIsFilled() {
		ContourPath path = new ContourPath();
		assertTrue(path.isFilled());
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
		ContourPlot plot = new ContourPlot();
		assertEquals(plot.getNumPaths(), 0);
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
     *  Returns the contour plot generated from the specified data.
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
		ContourPlotter plotter = new ContourPlotter();
		assertNotNull(plotter.getContourPlot());
	}
}

// ContourPoint.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a point on a contour path.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPoint {

    /**
     *  Returns the x coordinate of this point.
     */
    public double getX();

    /**
     *  Returns the y coordinate of this point.
     */
    public double getY();
}

// ContourPointTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPoint}.
* It contains ten unit test cases for the {@link ContourPoint#getX()} method.
*/
class ContourPointTest {
		
	/**
	* Test case for the {@link ContourPoint#getX()} method.
	*/
	@Test
	public void testGetX() {
		ContourPoint point = new ContourPoint();
		assertEquals(point.getX(), 0.0);
	}
}

// ContourPointTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPoint}.
* It contains ten unit test cases for the {@link ContourPoint#getY()} method.
*/
class ContourPointTest {
		
	/**
	* Test case for the {@link ContourPoint#getY()} method.
	*/
	@Test
	public void testGetY() {
		ContourPoint point = new ContourPoint();
		assertEquals(point.getY(), 0.0);
	}
}

// ContourValue.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a contour value.  A contour value is
 *      a value that is used to generate a contour path.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourValue {

    /**
     *  Returns the value of this contour value.
     */
    public double getValue();
}

// ContourValueTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourValue}.
* It contains ten unit test cases for the {@link ContourValue#getValue()} method.
*/
class ContourValueTest {
		
	/**
	* Test case for the {@link ContourValue#getValue()} method.
	*/
	@Test
	public void testGetValue() {
		ContourValue value = new ContourValue();
		assertEquals(value.getValue(), 0.0);
	}
}
