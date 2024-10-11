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

// PlotUtilities.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class contains a number of utility methods for
 *      working with plots.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotUtilities {

    /**
     *  Returns the minimum and maximum values of the data in the
     *  specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum values.
     *  @return An array containing the minimum and maximum values of the data in the
     *          specified run list.  The first element of the array is the minimum
     *          value and the second element is the maximum value.
     */
    public static double[] getMinMax(PlotRunList runList) {
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < runList.size(); i++) {
            PlotRun run = (PlotRun) runList.get(i);
            double[] minMax = getMinMax(run);
            if (minMax[0] < min)
                min = minMax[0];
            if (minMax[1] > max)
                max = minMax[1];
        }

        return new double[]{min, max};
    }

    /**
     *  Returns the minimum and maximum values of the data in the
     *  specified run.
     *
     *  @param  run  The run to search for the minimum and maximum values.
     *  @return An array containing the minimum and maximum values of the data in the
     *          specified run.  The first element of the array is the minimum
     *          value and the second element is the maximum value.
     */
    public static double[] getMinMax(PlotRun run) {
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < run.size(); i++) {
            PlotDatum datum = (PlotDatum) run.get(i);
            if (datum.getX() < min)
                min = datum.getX();
            if (datum.getX() > max)
                max = datum.getX();
        }

        return new double[]{min, max};
    }
}

// PlotUtilitiesTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotUtilities}.
* It contains ten unit test cases for the