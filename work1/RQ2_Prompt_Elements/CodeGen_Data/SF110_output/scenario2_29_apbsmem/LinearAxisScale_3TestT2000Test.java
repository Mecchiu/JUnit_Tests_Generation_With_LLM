// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
// LinearAxisScale.java
package jahuwaldt.plot;

/**
 *  <p> This object provides linear scaling for plot axes.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public class LinearAxisScale extends Object implements PlotAxisScale {

    /**
     *  Find the position and size (in screen coordinates) of tick
     *  marks for a given axis scale.
     *
     * @param quantum Tick mark step size for the axis using this scale.
     * @param aLB Lower bounds of axis using this scale.
     * @param aUB Upper bounds of axis using this scale.
     * @param xA Scaling coefficient for this axis.
     * @param xB Scaling coefficient for this axis.
     * @return An TickMarkData object containing the tick mark positions, lengths,
     *          and data values at each tick mark.
     */
    public TickMarkData calcTickMarks(double quantum, double aLB, double aUB, double xA, double xB) {
        double xl = 0;
        double xu = 0;
        double q = quantum;
        if (q > 0.) {
            xl = modfloor(aLB, q);
            xu = modfloor(aUB - q / 10., q / 5.) + q / 10.;
        } else {
            xl = modfloor(aUB, q);
            xu = modfloor(aLB + q / 10., q / 5.) - q / 10.;
        }
        //	Determine the number of tick marks.
        int xn = (int) ((xu - xl) / (Math.abs(quantum) / 5.));
        if (DEBUG) {
            System.out.println("In calcTickMarks()...");
            System.out.println("    quantum = " + quantum + ", aLB = " + aLB + ", aUB = " + aUB);
            System.out.println("    xA = " + xA + ", xB = " + xB);
            System.out.println("    xl = " + xl + ", xu = " + xu);
            System.out.println("    xn = " + xn);
        }
        //	Allocate memory for tick mark arrays.
        int[] mark = new int[xn];
        int[] lmark = new int[xn];
        float[] markValue = new float[xn];
        xn = 0;
        int i = 0;
        for (double x = xl; x <= xu; x += Math.abs(quantum) / 5., ++i) {
            //	Bounds check.
            if (q > 0.)
                if (x <= aLB || x >= aUB)
                    continue;
            if (q < 0.)
                if (x >= aLB || x <= aUB)
                    continue;
            //	Store tick mark.
            mark[xn] = (int) (func(x) * xA + xB);
            markValue[xn] = (float) x;
            if (i % 5!= 0)
                //	Minor tick mark.
                lmark[xn++] = PlotAxis.kTick;
            else
                //	Major tick mark.
                lmark[xn++] = 3 * PlotAxis.kTick;
        }
        if (DEBUG) {
            System.out.println("Tick mark values:");
            int length = markValue.length;
            for (i = 0; i < length; ++i) System.out.print("   " + markValue[i]);
            System.out.println();
        }
        //	Create a tick mark data object and pass it out.
        TickMarkData data = new TickMarkData();
        data.mark = mark;
        data.lmark = lmark;
        data.markValue = markValue;
        return data;
    }
}

// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		@Test
		void calcTickMarks() {
			try {
				//	Create a tick marker data object and passing it to the
				//	{@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
				//	This method runs in linear quadrant units.
				LinearAxisScale instance = new LinearAxisScale();
				assertEquals(0, instance.calcTickMarks(-.1d, 0, -.1d, 0, 0));
				assertEquals(0, instance.calcTickMarks(-.1d, 0, 0, 0, 0));
				assertEquals(0, instance.calcTickMarks(-0.01d, 0, -0.1d, 0, 0));
				assertEquals(0, instance.calcTickMarks(-0.1d, 0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks((double) Math.PI / 2, 0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks((double) Math.PI / 2, -2.0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks((double) Math.PI, -2.0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks(0.1d, 0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks(0.1d, 0, -2.0, 0, 0));
				assertEquals(1, instance.calcTickMarks(0.1d, 0, -2.0, -1.0, 0));
				assertEquals(1, instance.calcTickMarks(0.1d, 0, -0.1d, 0, 0));
				assertEquals(1, instance.calcTickMarks(0.1d, 0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks(.1d, 0, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks(.1d, 0, -0.1d, 0, 0));
				assertEquals(1, instance.calcTickMarks(.1d, 0, -0.1d, -1.0, 0));
				assertEquals(1, instance.calcTickMarks(.1d, 0, -0.1d, -1.0, -.1d));
				assertEquals(1, instance.calcTickMarks(.1d, -.1d, 0, 0, 0));
				assertEquals(1, instance.calcTickMarks(.1d, -.1d, 0, 0,.1d));
				assertEquals(1, instance.calcTickMarks(.1d, -.1d, -.1d, 0, 0));
				assertEquals(2, instance.calcTickMarks(.5d, -0.1d, -.1d, 0, 0));
				assertEquals(2, instance.calcTickMarks(.5d, -0.1d, 0, 0,.5d));
				assertEquals(3, instance.calcTickMarks(.5d, 0, 0, 0, 0));
				assertEquals(3, instance.calcTickMarks(.5d, -0.1d, 0, 0, 1));
				assertEquals(3, instance.calcTickMarks(.5d, -0.1d, 0,.5d,.5d));
				assertEquals(3, instance.calcTickMarks(.5d, 0, 0, 0, 0));
				assertEquals(0, instance.calcTickMarks(.2d, 0, 0, 0, 0));
				assertEquals