// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScaleTest {

	/**
	* Test method for {@link LinearAxisScale#upperBounds()}.
	*/
	@Test
	void testUpperBounds() {
		LinearAxisScale scale = new LinearAxisScale();
		assertEquals(1.0, scale.upperBounds(), "Upper bounds should be 1.0.");
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
     *  Method that returns the default upper bounds for
     *  this axis scale.  Returns 10.0.
     */
    public double upperBounds() {
        return 10.0;
    }
}

// LogAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogAxisScale}.
* It contains ten unit test cases for the {@link LogAxisScale#upperBounds()} method.
*/
class LogAxisScaleTest {
		
	/**
	* Test method for {@link LogAxisScale#upperBounds()}.
	*/
	@Test
	void testUpperBounds() {
		LogAxisScale scale = new LogAxisScale();
		assertEquals(10.0, scale.upperBounds(), "Upper bounds should be 10.0.");
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
     *  The default axis tick mark length.
     */
    public static final int DEFAULT_TICK_LENGTH = 5;

    /**
     *  The default axis tick mark color.
     */
    public static final Color DEFAULT_TICK_COLOR = Color.black;

    /**
     *  The default axis tick mark font.
     */
    public static final Font DEFAULT_TICK_FONT = new Font("Helvetica", Font.PLAIN, 10);

    /**
     *  The default axis tick mark color.
     */
    public static final Color DEFAULT_TICK_LABEL_COLOR = Color.black;

    /**
     *  The default axis tick mark label offset.
     */
    public static final int DEFAULT_TICK_LABEL_OFFSET = 5;

    /**
     *  The default axis tick mark label format.
     */
    public static final String DEFAULT_TICK_LABEL_FORMAT = "%.2f";

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
     *  The default axis scale.
     */
    public static final PlotAxisScale DEFAULT_SCALE = new LinearAxisScale();

    /**
     *  The default axis minimum value.
     */
    public static final double DEFAULT_MIN = 0.0;

    /**
     *  The default axis maximum value.
     */
    public static final double DEFAULT_MAX = 1.0;

    /**
     *  The default axis tick mark spacing.
     */
    public static final double DEFAULT_TICK_SPACING = 0.1;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_COUNT = 10;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LOCATION = PlotConstants.BOTH;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_LOCATION = PlotConstants.BOTH;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_COUNT = 10;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_STYLE = PlotConstants.DECIMAL;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_ROTATION = 0;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_PRECISION = 2;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT = 0;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_LOCATION = PlotConstants.TOP;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_SIGN = PlotConstants.POSITIVE;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_FONT = PlotConstants.NORMAL;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_OFFSET = 5;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_SIZE = 10;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_STYLE = Font.PLAIN;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_ROTATION = 0;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_PRECISION = 2;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT = 0;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_