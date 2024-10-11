// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunListTest {

	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize() {
		PlotRunList runList = new PlotRunList();
		assertEquals(0, runList.size());
		
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(1, runList.size());
		
		runList.add(run);
		assertEquals(2, runList.size());
		
		runList.add(run);
		assertEquals(3, runList.size());
		
		runList.add(run);
		assertEquals(4, runList.size());
		
		runList.add(run);
		assertEquals(5, runList.size());
		
		runList.add(run);
		assertEquals(6, runList.size());
		
		runList.add(run);
		assertEquals(7, runList.size());
		
		runList.add(run);
		assertEquals(8, runList.size());
		
		runList.add(run);
		assertEquals(9, runList.size());
		
		runList.add(run);
		assertEquals(10, runList.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		
		run.add(datum);
		assertEquals(2, run.size());
		
		run.add(datum);
		assertEquals(3, run.size());
		
		run.add(datum);
		assertEquals(4, run.size());
		
		run.add(datum);
		assertEquals(5, run.size());
		
		run.add(datum);
		assertEquals(6, run.size());
		
		run.add(datum);
		assertEquals(7, run.size());
		
		run.add(datum);
		assertEquals(8, run.size());
		
		run.add(datum);
		assertEquals(9, run.size());
		
		run.add(datum);
		assertEquals(10, run.size());
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
* It contains ten unit test cases for the {@link Plot#getRunList()} method.
*/
class PlotTest {
		
	/**
	* Test case for {@link Plot#getRunList()}.
	*/
	@Test
	void testGetRunList() {
		Plot plot = new Plot();
		assertEquals(0, plot.getRunList().size());
		
		PlotRun run = new PlotRun();
		plot.addRun(run);
		assertEquals(1, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(2, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(3, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(4, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(5, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(6, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(7, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(8, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(9, plot.getRunList().size());
		
		plot.addRun(run);
		assertEquals(10, plot.getRunList().size());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *      It contains the x and y values of the data point,
 *      as well as the color to use when drawing the data point.
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
	* Test case for {@link PlotDatum#getX()}.
	*/
	@Test
	void testGetX() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(1.0, datum.getX());
		
		datum = new PlotDatum(2.0, 2.0);
		assertEquals(2.0, datum.getX());
		
		datum = new PlotDatum(3.0, 2.0);
		assertEquals(3.0, datum.getX());
		
		datum = new PlotDatum(4.0, 2.0);
		assertEquals(4.0, datum.getX());
		
		datum = new PlotDatum(5.0, 2.0);
		assertEquals(5.0, datum.getX());
		
		datum = new PlotDatum(6.0, 2.0);
		assertEquals(6.0, datum.getX());
		
		datum = new PlotDatum(7.0, 2.0);
		assertEquals(7.0, datum.getX());
		
		datum = new PlotDatum(8.0, 2.0);
		assertEquals(8.0, datum.getX());
		
		datum = new PlotDatum(9.0, 2.0);
		assertEquals(9.0, datum.getX());
		
		datum = new PlotDatum(10.0, 2.0);
		assertEquals(10.0, datum.getX());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *      It contains the x and y values of the data point,
 *      as well as the color to use when drawing the data point.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Returns the y value of this data point.
     *
     * @return The y value of this data point.
     */
    public double getY() {
        return y;
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
* It contains ten unit test cases for the {@link PlotDatum#getY()} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#getY()}.
	*/
	@Test
	void testGetY() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(2.0, datum.getY());
		
		datum = new PlotDatum(1.0, 3.0);
		assertEquals(3.0, datum.getY());
		
		datum = new PlotDatum(1.0, 4.0);
		assertEquals(4.0, datum.getY());
		
		datum = new PlotDatum(1.0, 5.0);
		assertEquals(5.0, datum.getY());
		
		datum = new PlotDatum(1.0, 6.0);
		assertEquals(6.0, datum.getY());
		
		datum = new PlotDatum(1.0, 7.0);
		assertEquals(7.0, datum.getY());
		
		datum = new PlotDatum(1.0, 8.0);
		assertEquals(8.0, datum.getY());
		
		datum = new PlotDatum(1.0, 9.0);
		assertEquals(9.0, datum.getY());
		
		datum = new PlotDatum(1.0, 10.0);
		assertEquals(10.0, datum.getY());
		
		datum = new PlotDatum(1.0, 11.0);
		assertEquals(11.0, datum.getY());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *      It contains the x and y values of the data point,
 *      as well as the color to use when drawing the data point.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Returns the color of this data point.
     *
     * @return The color of this data point.
     */
    public Color getColor() {
        return color;
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
* It contains ten unit test cases for the {@link PlotDatum#getColor()} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#getColor()}.
	*/
	@Test
	void testGetColor() {
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		assertEquals(Color.black, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.red);
		assertEquals(Color.red, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.green);
		assertEquals(Color.green, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.blue);
		assertEquals(Color.blue, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.cyan);
		assertEquals(Color.cyan, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.magenta);
		assertEquals(Color.magenta, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.yellow);
		assertEquals(Color.yellow, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.orange);
		assertEquals(Color.orange, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.pink);
		assertEquals(Color.pink, datum.getColor());
		
		datum = new PlotDatum(1.0, 2.0, Color.white);
		assertEquals(Color.white, datum.getColor());
	}
}

// PlotDatum.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single data point in a plot.
 *      It contains the x and y values of the data point,
 *      as well as the color to use when drawing the data point.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotDatum implements Cloneable, java.io.Serializable {

    /**
     *  Returns a clone of this object.
     *
     * @return A clone of this object.
     */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
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
* It contains ten unit test cases for the {@link PlotDatum#clone()} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void