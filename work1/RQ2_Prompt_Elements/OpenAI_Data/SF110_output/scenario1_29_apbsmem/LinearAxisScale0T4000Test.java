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

    public double lowerBounds() {
        return 0.0;
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
		assertEquals(0.0, scale.lowerBounds(), 0.0);
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
     *  Returns the lower bounds of the axis scale.
     *
     *  @return The lower bounds of the axis scale.
     */
    public double lowerBounds();
}

// PlotAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotAxisScale}.
* It contains ten unit test cases for the {@link PlotAxisScale#lowerBounds()} method.
*/
class PlotAxisScaleTest {
		
	/**
	* Test method for {@link PlotAxisScale#lowerBounds()}.
	*/
	@Test
	void testLowerBounds() {
		PlotAxisScale scale = new PlotAxisScale() {
			public double lowerBounds() {
				return 0.0;
			}
		};
		assertEquals(0.0, scale.lowerBounds(), 0.0);
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
 *  <p> This class provides a plot axis that can be used to
 *      label a plot.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
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
    public static final Font DEFAULT_LABEL_FONT = new Font("SansSerif", Font.PLAIN, 12);

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_LABEL_COLOR = Color.black;

    /**
     *  The default axis label position.
     */
    public static final int DEFAULT_LABEL_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis label offset.
     */
    public static final int DEFAULT_LABEL_OFFSET = 0;

    /**
     *  The default axis tick mark length.
     */
    public static final int DEFAULT_TICK_LENGTH = 5;

    /**
     *  The default axis tick mark color.
     */
    public static final Color DEFAULT_TICK_COLOR = Color.black;

    /**
     *  The default axis tick mark position.
     */
    public static final int DEFAULT_TICK_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark offset.
     */
    public static final int DEFAULT_TICK_OFFSET = 0;

    /**
     *  The default axis tick mark label font.
     */
    public static final Font DEFAULT_TICK_LABEL_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label color.
     */
    public static final Color DEFAULT_TICK_LABEL_COLOR = Color.black;

    /**
     *  The default axis tick mark label position.
     */
    public static final int DEFAULT_TICK_LABEL_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label offset.
     */
    public static final int DEFAULT_TICK_LABEL_OFFSET = 0;

    /**
     *  The default axis tick mark label format.
     */
    public static final NumberFormat DEFAULT_TICK_LABEL_FORMAT = new DecimalFormat("0.0");

    /**
     *  The default axis tick mark label precision.
     */
    public static final int DEFAULT_TICK_LABEL_PRECISION = 1;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION = 0.0;

    /**
     *  The default axis tick mark label justification.
     */
    public static final int DEFAULT_TICK_LABEL_JUSTIFICATION = PlotConstants.CENTER;

    /**
     *  The default axis tick mark label spacing.
     */
    public static final int DEFAULT_TICK_LABEL_SPACING = 0;

    /**
     *  The default axis tick mark label exponent.
     */
    public static final boolean DEFAULT_TICK_LABEL_EXPONENT = false;

    /**
     *  The default axis tick mark label exponent font.
     */
    public static final Font DEFAULT_TICK_LABEL_EXPONENT_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent position.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label exponent offset.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_OFFSET = 0;

    /**
     *  The default axis tick mark label exponent format.
     */
    public static final NumberFormat DEFAULT_TICK_LABEL_EXPONENT_FORMAT = new DecimalFormat("0.0");

    /**
     *  The default axis tick mark label exponent precision.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_PRECISION = 1;

    /**
     *  The default axis tick mark label exponent rotation.
     */
    public static final double DEFAULT_TICK_LABEL_EXPONENT_ROTATION = 0.0;

    /**
     *  The default axis tick mark label exponent justification.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_JUSTIFICATION = PlotConstants.CENTER;

    /**
     *  The default axis tick mark label exponent spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_SPACING = 0;

    /**
     *  The default axis tick mark label exponent exponent.
     */
    public static final boolean DEFAULT_TICK_LABEL_EXPONENT_EXPONENT = false;

    /**
     *  The default axis tick mark label exponent exponent font.
     */
    public static final Font DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label exponent exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent exponent position.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label exponent exponent offset.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_OFFSET = 0;

    /**
     *  The default axis tick mark label exponent exponent format.
     */
    public static final NumberFormat DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_FORMAT = new DecimalFormat("0.0");

    /**
     *  The default axis tick mark label exponent exponent precision.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_PRECISION = 1;

    /**
     *  The default axis tick mark label exponent exponent rotation.
     */
    public static final double DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_ROTATION = 0.0;

    /**
     *  The default axis tick mark label exponent exponent justification.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_JUSTIFICATION = PlotConstants.CENTER;

    /**
     *  The default axis tick mark label exponent exponent spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_SPACING = 0;

    /**
     *  The default axis tick mark label exponent exponent exponent.
     */
    public static final boolean DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT = false;

    /**
     *  The default axis tick mark label exponent exponent exponent font.
     */
    public static final Font DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label exponent exponent exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent exponent exponent position.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label exponent exponent exponent offset.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_OFFSET = 0;

    /**
     *  The default axis tick mark label exponent exponent exponent format.
     */
    public static final NumberFormat DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_FORMAT = new DecimalFormat("0.0");

    /**
     *  The default axis tick mark label exponent exponent exponent precision.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_PRECISION = 1;

    /**
     *  The default axis tick mark label exponent exponent exponent rotation.
     */
    public static final double DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_ROTATION = 0.0;

    /**
     *  The default axis tick mark label exponent exponent exponent justification.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_JUSTIFICATION = PlotConstants.CENTER;

    /**
     *  The default axis tick mark label exponent exponent exponent spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_SPACING = 0;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent.
     */
    public static final boolean DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT = false;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent font.
     */
    public static final Font DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_FONT = new Font("SansSerif", Font.PLAIN, 10);

    /**
     *  The default axis tick mark label exponent exponent exponent exponent color.
     */
    public static final Color DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_COLOR = Color.black;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent position.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_POSITION = PlotConstants.BOTTOM;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent offset.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_OFFSET = 0;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent format.
     */
    public static final NumberFormat DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_FORMAT = new DecimalFormat("0.0");

    /**
     *  The default axis tick mark label exponent exponent exponent exponent precision.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_PRECISION = 1;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent rotation.
     */
    public static final double DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_ROTATION = 0.0;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent justification.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_JUSTIFICATION = PlotConstants.CENTER;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent spacing.
     */
    public static final int DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_SPACING = 0;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent exponent.
     */
    public static final boolean DEFAULT_TICK_LABEL_EXPONENT_EXPONENT_EXPONENT_EXPONENT_EXPONENT = false;

    /**
     *  The default axis tick mark label exponent exponent exponent exponent exponent font.
     */
    public static final Font DE