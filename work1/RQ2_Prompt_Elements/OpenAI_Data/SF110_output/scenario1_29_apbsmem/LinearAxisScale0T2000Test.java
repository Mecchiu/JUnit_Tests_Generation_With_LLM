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
     *  The default axis label color.
     */
    public static final Color DEFAULT_TICK_COLOR = Color.black;

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_GRID_COLOR = Color.lightGray;

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_AXIS_COLOR = Color.black;

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_BACKGROUND_COLOR = Color.white;

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_BORDER_COLOR = Color.black;

    /**
     *  The default axis label color.
     */
    public static final Color DEFAULT_TITLE_COLOR = Color.black;

    /**
     *  The default axis label color.
     */
    public static final Font DEFAULT_TITLE_FONT = new Font("SansSerif", Font.BOLD, 14);

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LENGTH = 5;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_SPACING = 10;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LABEL_SPACING = 5;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LABEL_DIGITS = 2;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LABEL_SIZE = 10;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LABEL_OFFSET = 0;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LABEL_ROTATION = 0;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TITLE_OFFSET = 10;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TITLE_ROTATION = 0;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_LABEL_OFFSET = 10;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_LABEL_ROTATION = 0;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_BORDER_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_GRID_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_AXIS_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TICK_LABEL_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_TITLE_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_LABEL_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_BACKGROUND_WIDTH = 1;

    /**
     *  The default axis label color.
     */
    public static final int DEFAULT_BORDER_HEIGHT = 1