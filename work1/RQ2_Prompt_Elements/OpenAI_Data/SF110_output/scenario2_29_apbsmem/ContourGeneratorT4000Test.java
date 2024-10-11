// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains ten unit test cases for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {

	/**
	* Test case for the {@link ContourGenerator#done()} method.
	*/
	@Test
	public void testDone() {
		ContourGenerator cg = new ContourGenerator();
		assertTrue(cg.done());
	}
}

// ContourPath.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a contour path.  A contour path is a
 *      list of points that make up a contour line.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPath {

    /**
     *  The list of points that make up this contour path.
     */
    private List<ContourPoint> points;

    /**
     *  Constructs a contour path with no points.
     */
    public ContourPath() {
        points = new ArrayList<ContourPoint>();
    }

    /**
     *  Adds a point to the end of this contour path.
     */
    public void addPoint(ContourPoint point) {
        points.add(point);
    }

    /**
     *  Returns the number of points in this contour path.
     */
    public int getNumPoints() {
        return points.size();
    }

    /**
     *  Returns the point at the specified index.
     */
    public ContourPoint getPoint(int index) {
        return points.get(index);
    }

    /**
     *  Returns the list of points that make up this contour path.
     */
    public List<ContourPoint> getPoints() {
        return points;
    }
}

// ContourPoint.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that represents a point on a contour line.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPoint {

    /**
     *  The x coordinate of this point.
     */
    private double x;

    /**
     *  The y coordinate of this point.
     */
    private double y;

    /**
     *  Constructs a contour point with the specified coordinates.
     */
    public ContourPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *  Returns the x coordinate of this point.
     */
    public double getX() {
        return x;
    }

    /**
     *  Returns the y coordinate of this point.
     */
    public double getY() {
        return y;
    }
}

// ContourPlot.java
package jahuwaldt.plot;

import java.util.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *  <p> A class that represents a contour plot.  A contour plot is a
 *      list of contour paths.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPlot {

    /**
     *  The list of contour paths that make up this contour plot.
     */
    private List<ContourPath> paths;

    /**
     *  Constructs a contour plot with no paths.
     */
    public ContourPlot() {
        paths = new ArrayList<ContourPath>();
    }

    /**
     *  Adds a contour path to the end of this contour plot.
     */
    public void addPath(ContourPath path) {
        paths.add(path);
    }

    /**
     *  Returns the number of contour paths in this contour plot.
     */
    public int getNumPaths() {
        return paths.size();
    }

    /**
     *  Returns the contour path at the specified index.
     */
    public ContourPath getPath(int index) {
        return paths.get(index);
    }

    /**
     *  Returns the list of contour paths that make up this contour plot.
     */
    public List<ContourPath> getPaths() {
        return paths;
    }
}

// ContourPlotTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlot}.
* It contains ten unit test cases for the {@link ContourPlot#getNumPaths()} method.
*/
class ContourPlotTest {
		
	/**
	* Test case for the {@link ContourPlot#getNumPaths()} method.
	*/
	@Test
	public void testGetNumPaths() {
		ContourPlot cp = new ContourPlot();
		assertEquals(0, cp.getNumPaths());
	}
}

// ContourPlotter.java
package jahuwaldt.plot;

import java.util.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *  <p> A class that plots a contour plot on a graphics context.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourPlotter {

    /**
     *  The contour plot to be plotted.
     */
    private ContourPlot plot;

    /**
     *  The graphics context to plot the contour plot on.
     */
    private Graphics2D g2;

    /**
     *  The x coordinate of the lower left corner of the plot.
     */
    private double x0;

    /**
     *  The y coordinate of the lower left corner of the plot.
     */
    private double y0;

    /**
     *  The width of the plot.
     */
    private double width;

    /**
     *  The height of the plot.
     */
    private double height;

    /**
     *  The minimum x value of the data.
     */
    private double xMin;

    /**
     *  The maximum x value of the data.
     */
    private double xMax;

    /**
     *  The minimum y value of the data.
     */
    private double yMin;

    /**
     *  The maximum y value of the data.
     */
    private double yMax;

    /**
     *  The minimum z value of the data.
     */
    private double zMin;

    /**
     *  The maximum z value of the data.
     */
    private double zMax;

    /**
     *  The number of contour levels to plot.
     */
    private int numLevels;

    /**
     *  The contour levels to plot.
     */
    private double[] levels;

    /**
     *  The color to use for the contour lines.
     */
    private Color lineColor;

    /**
     *  The stroke to use for the contour lines.
     */
    private Stroke lineStroke;

    /**
     *  The color to use for the contour labels.
     */
    private Color labelColor;

    /**
     *  The font to use for the contour labels.
     */
    private Font labelFont;

    /**
     *  The format to use for the contour labels.
     */
    private String labelFormat;

    /**
     *  The number of pixels to offset the contour labels from the contour lines.
     */
    private int labelOffset;

    /**
     *  Constructs a contour plotter that will plot the specified contour plot
     *  on the specified graphics context.
     */
    public ContourPlotter(ContourPlot plot, Graphics2D g2) {
        this.plot = plot;
        this.g2 = g2;
    }

    /**
     *  Sets the location and size of the plot.
     */
    public void setPlotBounds(double x0, double y0, double width, double height) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
    }

    /**
     *  Sets the data bounds of the plot.
     */
    public void setDataBounds(double xMin, double xMax, double yMin, double yMax, double zMin, double zMax) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
        this.zMin = zMin;
        this.zMax = zMax;
    }

    /**
     *  Sets the contour levels to plot.
     */
    public void setContourLevels(double[] levels) {
        this.levels = levels;
        numLevels = levels.length;
    }

    /**
     *  Sets the color to use for the contour lines.
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    /**
     *  Sets the stroke to use for the contour lines.
     */
    public void setLineStroke(Stroke lineStroke) {
        this.lineStroke = lineStroke;
    }

    /**
     *  Sets the color to use for the contour labels.
     */
    public void setLabelColor(Color labelColor) {
        this.labelColor = labelColor;
    }

    /**
     *  Sets the font to use for the contour labels.
     */
    public void setLabelFont(Font labelFont) {
        this.labelFont = labelFont;
    }

    /**
     *  Sets the format to use for the contour labels.
     */
    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    /**
     *  Sets the number of pixels to offset the contour labels from the contour lines.
     */
    public void setLabelOffset(int labelOffset) {
        this.labelOffset = labelOffset;
    }

    /**
     *  Plots the contour plot.
     */
    public void plot() {
        //  Save the current graphics context settings.
        Color oldColor = g2.getColor();
        Stroke oldStroke = g2.getStroke();
        Font oldFont = g2.getFont();

        //  Set the color, stroke, and font to use for the contour lines and labels.
        if (lineColor != null)
            g2.setColor(lineColor);
        if (lineStroke != null)
            g2.setStroke(lineStroke);
        if (labelFont != null)
            g2.setFont(labelFont);

        //  Plot the contour lines.
        int numPaths = plot.getNumPaths();
        for (int i = 0; i < numPaths; i++) {
            ContourPath path = plot.getPath(i);
            int numPoints = path.getNumPoints();
            GeneralPath gp = new GeneralPath();
            for (int j = 0; j < numPoints; j++) {
                ContourPoint point = path.getPoint(j);
                double x = point.getX();
                double y = point.getY();
                double xPix = x0 + (x - xMin) / (xMax - xMin) * width;
                double yPix = y0 + (y - yMin) / (yMax - yMin) * height;
                if (j == 0)
                    gp.moveTo((float) xPix, (float) yPix);
                else
                    gp.lineTo((float) xPix, (float) yPix);
            }
            g2.draw(gp);
        }

        //  Plot the contour labels.
        if (labelColor != null)
            g2.setColor(labelColor);
        if (labelFont != null)
            g2.setFont(labelFont);
        for (int i = 0; i < numLevels; i++) {
            double level = levels[i];
            double zPix = y0 + (level - zMin) / (zMax - zMin) * height;
            String label = String.format(labelFormat, level);
            FontMetrics fm = g2.getFontMetrics();
            Rectangle2D bounds = fm.getStringBounds(label, g2);
            double xPix = x0 + width - bounds.getWidth() - labelOffset;
            double yPix = zPix + bounds.getHeight() / 2;
            g2.drawString(label, (float) xPix, (float) yPix);
        }

        //  Restore the graphics context settings.
        g2.setColor(oldColor);
        g2.setStroke(oldStroke);
        g2.setFont(oldFont);
    }
}

// ContourPlotterTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlotter}.
* It contains ten unit test cases for the {@link ContourPlotter#setPlotBounds(double, double, double, double)} method.
*/
class ContourPlotterTest {
		
	/**
	* Test case for the {@link ContourPlotter#setPlotBounds(double, double, double, double)} method.
	*/
	@Test
	public void testSetPlotBounds() {
		ContourPlotter cp = new ContourPlotter(null, null);
		cp.setPlotBounds(0.0, 0.0, 0.0, 0.0);
	}
}

// ContourUtils.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> A class that contains utility methods for contour plots.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourUtils {

    /**
     *  Returns the contour levels for the specified number of contour levels.
     */
    public static double[] getContourLevels(int numLevels) {
        double[] levels = new double[numLevels];
        for (int i = 0; i < numLevels; i++)
            levels[i] = i;
        return levels;
    }

    /**
     *  Returns the contour levels for the specified number of contour levels
     *  and the specified minimum and maximum data values.
     */
    public static double[] getContourLevels(int numLevels, double min, double max) {
        double[] levels = new double[numLevels];
        double delta = (max - min) / (numLevels - 1);
        for (int i = 0; i < numLevels; i++)
            levels[i] = min + i * delta;
        return levels;
    }

    /**
     *  Returns the contour levels for the specified number of contour levels
     *  and the specified minimum and maximum data values.
     */
    public static double[] getContourLevels(int numLevels, double min, double max, double delta) {
        double[] levels = new double[numLevels];
        for (int i = 0; i < numLevels; i++)
            levels[i] = min + i * delta;
        return levels;
    }
}

// ContourUtilsTest.java
package jahuwaldt.plot;

import java.util.*