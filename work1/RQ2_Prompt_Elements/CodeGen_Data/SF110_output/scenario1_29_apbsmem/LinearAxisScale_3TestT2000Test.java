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
		/**
		 *  <code>calcTickMarks</code> tests the implementation.
		
		 *  <p>This method tests the implementation of the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
		 *  
		 *  <p>See {@link LinearAxisScale_3Test#calcTickMarks(double, double, double, double, double)}
		 *  for description of test methods.
		*/
		@Test
        public void calcTickMarks_Test() {
        	int aLB = 4;
        	int aUB = 10;
        	double q = aUB;
        	int xA = 10;
        	double xB = -5;
        	int xn = 0;
                double quantum = 1;
                for (double x = 0.; x < 5.; ++x) {
                    double xl = modfloor(aLB, quantum);
                    double xu = modfloor(aUB - quantum / 10., quantum / 5.) + quantum / 10.;
                    double markValue = func(x) * xA + xB;
                    if (q > 0.)
                        if (x <= aLB || x >= aUB)
                            continue;
                    if (q < 0.)
                        if (x >= aLB || x <= aUB)
                            continue;
                    //	Create a tick mark data object and pass it out.
                    int lmark = PlotAxis.kTick;
                    float markValueFloat = (float) markValue;
                    xn = (int) (quantum / 5.) + 1;
                    TickMarkData data = new TickMarkData();
                    data.mark = new int[xn];
                    data.lmark = new int[xn];
                    data.markValue = new float[xn];
                    data.markValueFloat = markValueFloat;
                    int xl = Math.floor(xl);
                    int xu = Math.floor(xu);
                    System.arraycopy(lmark, 0, data.lmark, 0, markValueFloat);
                    System.arraycopy(lmark, (xu - xl), data.lmark, (xu - xl), markValueFloat);
                    System.arraycopy(lmark, xl, data.lmark, (xl + xn), markValueFloat);
                    System.arraycopy(lmark, xu, data.lmark, (xu + xn), markValueFloat);
                    if (xn < xl || (aUB - quantum) >= xu) {
                        System.arraycopy(lmark, (xu - xl), data.lmark, (xu - xl), markValue);
                    }
                    assertEquals("In calcTickMarks()...", markValue, data.mark[xn]);
                    assertEquals("In calcTickMarks()...", markValueFloat, data.markValue[xn]);
                    assertEquals("In calcTickMarks()...", xl, data.lmark[xn]);
                    assertEquals("In calcTickMarks()...", xu, data.lmark[xn + 1]);
                    assertEquals("In calcTickMarks()...", markValue, data.mark[xn + 1]);
                    assertEquals("In calcTickMarks()...", markValue, data.lmark[xn + 1]);
                    if (calcTickMarks(quantum, aUB, aUB, xl, xu)!= 0) {
                        throw new AssertionError("In calcTickMarks()...");
                    }
						//	Check for a special case.
                    if (xn < xl) assertEquals("In calcTickMarks()...", data.lmark[--xn], data.lmark[--xn]);
                }
        }}
