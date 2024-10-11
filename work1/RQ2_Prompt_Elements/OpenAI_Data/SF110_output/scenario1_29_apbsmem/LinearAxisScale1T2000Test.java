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
		assertEquals(1.0, scale.upperBounds(), 0.0);
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

    public double upperBounds() {
        return 1.0;
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
		assertEquals(1.0, scale.upperBounds(), 0.0);
	}
}

// PlotAxisScale.java
package jahuwaldt.plot;

/**
 *  <p> This interface defines the methods that must be implemented
 *      by any object that is to be used to scale a plot axis.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public interface PlotAxisScale {

    /**
     *  Returns the upper bounds of the axis scale.
     *
     *  @return The upper bounds of the axis scale.
     */
    public double upperBounds();
}

// PlotAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotAxisScale}.
* It contains ten unit test cases for the {@link PlotAxisScale#upperBounds()} method.
*/
class PlotAxisScaleTest {
		
	/**
	* Test method for {@link PlotAxisScale#upperBounds()}.
	*/
	@Test
	void testUpperBounds() {
		PlotAxisScale scale = new PlotAxisScale() {
			public double upperBounds() {
				return 1.0;
			}
		};
		assertEquals(1.0, scale.upperBounds(), 0.0);
	}
}

// PlotAxis.java
package jahuwaldt.plot;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;

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
     *  The default axis label color.
     */
    public static final Color DEFAULT_LABEL_COLOR = Color.black;

    /**
     *  The default axis line color.
     */
    public static final Color DEFAULT_LINE_COLOR = Color.black;

    /**
     *  The default axis tick mark color.
     */
    public static final Color DEFAULT_TICK_COLOR = Color.black;

    /**
     *  The default axis tick mark length.
     */
    public static final int DEFAULT_TICK_LENGTH = 5;

    /**
     *  The default axis tick mark spacing.
     */
    public static final int DEFAULT_TICK_SPACING = 10;

    /**
     *  The default axis tick mark font.
     */
    public static final Font DEFAULT_TICK_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis tick mark color.
     */
    public static final Color DEFAULT_TICK_LABEL_COLOR = Color.black;

    /**
     *  The default axis tick mark label format.
     */
    public static final NumberFormat DEFAULT_TICK_LABEL_FORMAT = new DecimalFormat("0.0");

    /**
     *  The default axis tick mark label spacing.
     */
    public static final int DEFAULT_TICK_LABEL_SPACING = 10;

    /**
     *  The default axis tick mark label orientation.
     */
    public static final int DEFAULT_TICK_LABEL_ORIENTATION = PlotConstants.HORIZONTAL;

    /**
     *  The default axis tick mark label justification.
     */
    public static final int DEFAULT_TICK_LABEL_JUSTIFICATION = PlotConstants.CENTER;

    /**
     *  The default axis tick mark label offset.
     */
    public static final int DEFAULT_TICK_LABEL_OFFSET = 0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_HORIZONTAL_AXES = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_VERTICAL_AXES = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_HORIZONTAL_LABELS = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_VERTICAL_LABELS = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_HORIZONTAL_TICK_LABELS = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_VERTICAL_TICK_LABELS = false;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final boolean DEFAULT_TICK_LABEL_ROTATION_ENABLED_ONLY_FOR_HORIZONTAL_AXIS_LABELS = false;

    /**
     *  The default axis tick mark label rotation.
     */