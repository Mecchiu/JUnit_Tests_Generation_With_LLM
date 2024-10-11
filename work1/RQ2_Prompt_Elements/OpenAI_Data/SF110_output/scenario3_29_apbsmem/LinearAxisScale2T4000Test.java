// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScaleTest {

	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits1() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 0.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(0.0, result.getUpperBound(), 0.0);
		assertEquals(0.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits2() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 1.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(1.0, result.getUpperBound(), 0.0);
		assertEquals(0.1, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits3() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 2.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(2.0, result.getUpperBound(), 0.0);
		assertEquals(0.2, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits4() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 5.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(5.0, result.getUpperBound(), 0.0);
		assertEquals(1.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits5() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 10.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(10.0, result.getUpperBound(), 0.0);
		assertEquals(2.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits6() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 20.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(20.0, result.getUpperBound(), 0.0);
		assertEquals(5.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits7() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 50.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(50.0, result.getUpperBound(), 0.0);
		assertEquals(10.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits8() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 100.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(100.0, result.getUpperBound(), 0.0);
		assertEquals(20.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits9() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 200.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(200.0, result.getUpperBound(), 0.0);
		assertEquals(50.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits10() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 500.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(500.0, result.getUpperBound(), 0.0);
		assertEquals(100.0, result.getTickSpacing(), 0.0);
	}
	
}

// LogAxisScale.java
package jahuwaldt.plot;

/**
 *  <p> This object provides logarithmic scaling for plot axes.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public class LogAxisScale extends Object implements PlotAxisScale {

    /**
     *  Method that returns an AxisLimitData object that contains
     *  the preferred axis limits and tick mark spacing for the
     *  specified range of data values for this logarithmic axis scale.
     *
     * @param aLB The lower bounds of the data plotted on this axis.
     * @param aUB The upper bounds of the data plotted on this axis.
     */
    public AxisLimitData findGoodLimits(double aLB, double aUB);
}

// LogAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogAxisScale}.
* It contains ten unit test cases for the {@link LogAxisScale#findGoodLimits(double, double)} method.
*/
class LogAxisScaleTest {
		
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits1() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 0.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(0.0, result.getUpperBound(), 0.0);
		assertEquals(0.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits2() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 1.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(1.0, result.getUpperBound(), 0.0);
		assertEquals(0.1, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits3() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 2.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(2.0, result.getUpperBound(), 0.0);
		assertEquals(0.2, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits4() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 5.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(5.0, result.getUpperBound(), 0.0);
		assertEquals(1.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits5() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 10.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(10.0, result.getUpperBound(), 0.0);
		assertEquals(2.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits6() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 20.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(20.0, result.getUpperBound(), 0.0);
		assertEquals(5.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits7() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 50.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(50.0, result.getUpperBound(), 0.0);
		assertEquals(10.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits8() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 100.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(100.0, result.getUpperBound(), 0.0);
		assertEquals(20.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits9() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 200.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(200.0, result.getUpperBound(), 0.0);
		assertEquals(50.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits10() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 500.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(500.0, result.getUpperBound(), 0.0);
		assertEquals(100.0, result.getTickSpacing(), 0.0);
	}
	
}

// PlotAxis.java
package jahuwaldt.plot;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *  <p> This class represents a plot axis.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public class PlotAxis extends Object {

    /**
     *  The default axis label font.
     */
    public static final Font DEFAULT_LABEL_FONT = new Font("SansSerif", Font.PLAIN, 12);

    /**
     *  The default axis tick label font.
     */
    public static final Font DEFAULT_TICK_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_LABEL_COLOR = Color.black;

    /**
     *  The default axis tick label color.
     */
    public static final Color DEFAULT_TICK_COLOR = Color.black;

    /**
     *  The default axis line color.
     */
    public static final Color DEFAULT_LINE_COLOR = Color.black;

    /**
     *  The default axis tick length.
     */
    public static final int DEFAULT_TICK_LENGTH = 5;

    /**
     *  The default axis tick spacing.
     */
    public static final double DEFAULT_TICK_SPACING = 1.0;

    /**
     *  The default axis tick label format