// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		public final static int VALUE = 10;
    final static Color COLOR = Color.white;
    final static int VALUE = VALUE + VALUE;
    final static double VALUE = VALUE + 1 / VALUE;
    final static double VALUE_2 = VALUE + VALUE * 2 / 0.5;

    /**
     *  Test case for {@link PlotRun#remove(int)} method
     *  with an invalid argument.
	 */
    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void invalid(int index) throws ArrayIndexOutOfBoundsException {
    }

    /**
     *  Test case for {@link PlotRun#remove(int)} method
     *  with zero arguments.
	 */
    @Test (expected=NullPointerException.class)
    public void nullArgument( ) throws NullPointerException {
    }

    /**
     *  Test case for {@link PlotRun#remove(int)} method
     *  with a valid index argument.
	 */
    @Test
    public void removeIndex1( ) {
        int index = 2;
        PlotRun obj = null;
        try {
            obj = (PlotRun) Graph.getPlot().getPlotRun(index);
            PlotRun.remove(index);
            PlotRun.remove(index);
        } catch (ArrayIndexOutOfBoundsException e){
            fail("ArrayIndexOutOfBoundsException should have been thrown");
        } catch (ObjectRetrievalFailureException e){
            assertEquals("PlotRun.remove(int) should have returned a PlotRun not a Plot.null", obj, e.obj);
        }
    }

    /**
     *  Test case for {@link PlotRun#remove(int)} method
     *  with an invalid index argument.
	 */
    @Test
    public void removeIndex2( ) {
    }






}