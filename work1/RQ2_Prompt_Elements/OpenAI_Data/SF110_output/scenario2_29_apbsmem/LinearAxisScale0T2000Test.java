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

// PlotAxisScale.java
package jahuwaldt.plot;

/**
 *  <p> This interface defines the methods that must be implemented
 *      by any object that is to be used as a plot axis scale.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public interface PlotAxisScale {

    /**
     *  Method that returns the default lower bounds for
     *  this axis scale.
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
				return -1.0;
			}
		};
		assertEquals(-1.0, scale.lowerBounds(), 0.0);
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
    public static final double DEFAULT_TICK_LABEL_ROTATION_RADIANS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_DEGREES = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_GRADIANS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_TURNS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_REVOLUTIONS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_CYCLES = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_ROTATIONS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_GONIANS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
    public static final double DEFAULT_TICK_LABEL_ROTATION_GRADS = 0.0;

    /**
     *  The default axis tick mark label rotation.
     */
   