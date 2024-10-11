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
	public void testSize() {
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
	public void testSize() {
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
	public void testGetRunList() {
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
     *  Returns the minimum and maximum values of the x-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   x-axis values.
     *  @return An array containing the minimum and maximum x-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getXRange(PlotRunList runList) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            for (int i = 0; i < nRuns; ++i) {
                PlotRun run = (PlotRun) runList.get(i);
                int nData = run.size();
                for (int j = 0; j < nData; ++j) {
                    PlotDatum datum = (PlotDatum) run.get(j);
                    double x = datum.getX();
                    if (x < min)
                        min = x;
                    if (x > max)
                        max = x;
                }
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the y-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   y-axis values.
     *  @return An array containing the minimum and maximum y-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getYRange(PlotRunList runList) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            for (int i = 0; i < nRuns; ++i) {
                PlotRun run = (PlotRun) runList.get(i);
                int nData = run.size();
                for (int j = 0; j < nData; ++j) {
                    PlotDatum datum = (PlotDatum) run.get(j);
                    double y = datum.getY();
                    if (y < min)
                        min = y;
                    if (y > max)
                        max = y;
                }
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the x-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   x-axis values.
     *  @return An array containing the minimum and maximum x-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getXRange(PlotRunList runList, int runIndex) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            PlotRun run = (PlotRun) runList.get(runIndex);
            int nData = run.size();
            for (int j = 0; j < nData; ++j) {
                PlotDatum datum = (PlotDatum) run.get(j);
                double x = datum.getX();
                if (x < min)
                    min = x;
                if (x > max)
                    max = x;
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the y-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   y-axis values.
     *  @return An array containing the minimum and maximum y-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getYRange(PlotRunList runList, int runIndex) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            PlotRun run = (PlotRun) runList.get(runIndex);
            int nData = run.size();
            for (int j = 0; j < nData; ++j) {
                PlotDatum datum = (PlotDatum) run.get(j);
                double y = datum.getY();
                if (y < min)
                    min = y;
                if (y > max)
                    max = y;
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the x-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   x-axis values.
     *  @return An array containing the minimum and maximum x-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getXRange(PlotRunList runList, int runIndex, int startIndex, int endIndex) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            PlotRun run = (PlotRun) runList.get(runIndex);
            int nData = run.size();
            for (int j = startIndex; j < endIndex; ++j) {
                PlotDatum datum = (PlotDatum) run.get(j);
                double x = datum.getX();
                if (x < min)
                    min = x;
                if (x > max)
                    max = x;
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the y-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   y-axis values.
     *  @return An array containing the minimum and maximum y-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getYRange(PlotRunList runList, int runIndex, int startIndex, int endIndex) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            PlotRun run = (PlotRun) runList.get(runIndex);
            int nData = run.size();
            for (int j = startIndex; j < endIndex; ++j) {
                PlotDatum datum = (PlotDatum) run.get(j);
                double y = datum.getY();
                if (y < min)
                    min = y;
                if (y > max)
                    max = y;
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the x-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   x-axis values.
     *  @return An array containing the minimum and maximum x-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getXRange(PlotRunList runList, int[] runIndices) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            for (int i = 0; i < runIndices.length; ++i) {
                PlotRun run = (PlotRun) runList.get(runIndices[i]);
                int nData = run.size();
                for (int j = 0; j < nData; ++j) {
                    PlotDatum datum = (PlotDatum) run.get(j);
                    double x = datum.getX();
                    if (x < min)
                        min = x;
                    if (x > max)
                        max = x;
                }
            }
            result = new double[2];
            result[0] = min;
            result[1] = max;
        }
        return result;
    }

    /**
     *  Returns the minimum and maximum values of the y-axis data
     *  in the specified run list.
     *
     *  @param  runList  The run list to search for the minimum and maximum
     *                   y-axis values.
     *  @return An array containing the minimum and maximum y-axis values
     *          in the specified run list.  If the run list is empty,
     *          then null is returned.
     */
    public static double[] getYRange(PlotRunList runList, int[] runIndices) {
        double[] result = null;
        int nRuns = runList.size();
        if (nRuns > 0) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            for (int i = 0; i < runIndices.length; ++i) {