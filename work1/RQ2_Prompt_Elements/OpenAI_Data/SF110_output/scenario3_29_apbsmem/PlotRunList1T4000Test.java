// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunListTest {

	/**
	* Test case for {@link PlotRunList#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRunList runList = new PlotRunList();
		assertEquals(0, runList.size());
		
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(1, runList.size());
		
		PlotRun run2 = new PlotRun();
		runList.add(run2);
		assertEquals(2, runList.size());
		
		assertEquals(run, runList.get(0));
		assertEquals(run2, runList.get(1));
	}
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot datum object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index);
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run.add(datum2);
		assertEquals(2, run.size());
		
		assertEquals(datum, run.get(0));
		assertEquals(datum2, run.get(1));
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#PlotDatum(double, double)} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#PlotDatum(double, double)} method.
	*/
	@Test
	void testPlotDatum() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		assertEquals(2.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Constructs a new PlotDatum object with the specified
     *  x and y values.
     *
     *  @param  x  The x value of the data point.
     *  @param  y  The y value of the data point.
     */
    public PlotDatum(double x, double y);
}

// PlotDatumTest.java
package jahuwald