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
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(run, runList.get(0));
	}
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
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.get(0));
	}
}

// PlotTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Plot}.
* It contains ten unit test cases for the {@link Plot#getRunList(int)} method.
*/
class PlotTest {
		
	/**
	* Test case for {@link Plot#getRunList(int)} method.
	*/
	@Test
	void testGetRunList() {
		Plot plot = new Plot();
		PlotRunList runList = new PlotRunList();
		plot.addRunList(runList);
		assertEquals(runList, plot.getRunList(0));
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *      It contains the x and y values of the data point,
 *      as well as the color and symbol to use when plotting
 *      the data point.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Returns the x value of this data point.
     *
     * @return The x value of this data point.
     */
    public double getX() {
        return x;
    }
}

// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getX()} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#getX()} method.
	*/
	@Test
	void testGetX() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
	}
}

// Plot.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a plot of data.  It contains
 *      a list of run lists.  Each run list contains a list
 *      of runs.  Each run contains a list of data points.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class Plot implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotRunList object at the specified position
     *  in this plot.
     *
     * @param index The index of the plot run list object to return.
     * @return The PlotRunList object at the specified position
     *           in this plot.
     */
    public PlotRunList getRunList(int index) {
        return (PlotRunList) data.get(index);
    }
}