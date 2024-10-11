// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {
		String name;
		double minY;
		double maxY;
        Color color;

    /** 
     *  Test method for remove.
     */
    @Test
	public void testRemove() {
        PlotRunList list = new PlotRunList();
        assertTrue( list instanceof PlotRunList_16_0 );
        list.add( new PlotRun() );
        list.add( null );
        list.add( new double[] {-0.1, 0.1} );
        double[] values = list.values();
   
        //test remove
        list.remove( 0 );
        assertEquals( values[0], list.values()[0], 1e-15 );
        list.remove( 1 );
        assertEquals( values[1], list.values()[1], 1e-15 );
        list.remove( 2 );
        assertNull( list.values()[2] );
    }

}

/** 
 * {@literal @}org.junit.jupiter.api.Test
 */
class PlotRunList_16_0 extends PlotRunList {}