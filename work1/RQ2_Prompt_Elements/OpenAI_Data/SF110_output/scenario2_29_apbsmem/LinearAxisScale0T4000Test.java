// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScaleTest {

	/**
	* Test method for {@link LinearAxisScale#lowerBounds()}.
	*/
	@Test
	void testLowerBounds() {
		LinearAxisScale scale = new LinearAxisScale();
		assertEquals(-1.0, scale.lowerBounds(), 0.0);
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
     *  Method that returns the default lower bounds for
     *  this axis scale.  Returns 0.1.
     */
    public double lowerBounds() {
        return 0.1;
    }
}

// LogAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogAxisScale}.
* It contains ten unit test cases for the {@link LogAxisScale#lowerBounds()} method.
*/
class LogAxisScaleTest {
		
	/**
	* Test method for {@link LogAxisScale#lowerBounds()}.
	*/
	@Test
	void testLowerBounds() {
		LogAxisScale scale = new LogAxisScale();
		assertEquals(0.1, scale.lowerBounds(), 0.0);
	}
}

// PlotAxis.java
package jahuwaldt.plot;

import java.awt.*;
import java.awt.geom.*;

/**
 *  <p> This class represents a plot axis.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt   </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public class PlotAxis extends Object {

    /**
     *  The default axis label.
     */
    public static final String DEFAULT_LABEL = "";

    /**
     *  The default axis label font.
     */
    public static final Font DEFAULT_LABEL_FONT = new Font("Helvetica", Font.PLAIN, 12);

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_LABEL_COLOR = Color.black;

    /**
     *  The default axis label location.
     */
    public static final int DEFAULT_LABEL_LOCATION = PlotConstants.BOTTOM;

    /**
     *  The default axis label offset.
     */
    public static final int DEFAULT_LABEL_OFFSET = 5;

    /**
     *  The default axis line color.
     */
    public static final Color DEFAULT_LINE_COLOR = Color.black;

    /**
     *  The default axis line width.
     */
    public static final float DEFAULT_LINE_WIDTH = 1.0f;

    /**
     *  The default axis line style.
     */
    public static final int DEFAULT_LINE_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark color.
     */
    public static final Color DEFAULT_TICK_COLOR = Color.black;

    /**
     *  The default axis tick mark length.
     */
    public static final int DEFAULT_TICK_LENGTH = 5;

    /**
     *  The default axis tick mark width.
     */
    public static final float DEFAULT_TICK_WIDTH = 1.0f;

    /**
     *  The default axis tick mark style.
     */
    public static final int DEFAULT_TICK_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label font.
     */
    public static final Font DEFAULT_TICK_FONT = new Font("Helvetica", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label color.
     */
    public static final Color DEFAULT_TICK_LABEL_COLOR = Color.black;

    /**
     *  The default axis tick mark label location.
     */
    public static final int DEFAULT_TICK_LABEL_LOCATION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label offset.
     */
    public static final int DEFAULT_TICK_LABEL_OFFSET = 5;

    /**
     *  The default axis tick mark label format.
     */
    public static final String DEFAULT_TICK_LABEL_FORMAT = "%.2f";

    /**
     *  The default axis tick mark label precision.
     */
    public static final int DEFAULT_TICK_LABEL_PRECISION = 2;

    /**
     *  The default axis tick mark label exponent format.
     */
    public static final String DEFAULT_TICK_LABEL_EXPONENT_FORMAT = "E%+03d";

    /**
     *  The default axis tick mark label exponent precision.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_PRECISION = 3;

    /**
     *  The default axis tick mark label exponent location.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_LOCATION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label exponent offset.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_OFFSET = 5;

    /**
     *  The default axis tick mark label exponent font.
     */
    public static final Font DEFAULT_TICK_LABEL_EXPONENT_FONT = new Font("Helvetica", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_EXPONENT_WIDTH = 1.0f;

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent style.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = PlotConstants.SOLID;

    /**
     *  The default axis tick mark label exponent width.
     */
    public static final float DEFAULT_TICK_LABEL_