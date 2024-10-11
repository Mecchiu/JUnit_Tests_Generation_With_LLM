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
		/**
		* Test if {@link PlotRunList#remove(int)} returns a PlotRun object.
		*
		* @throws  ClassCastException - if the specified element is not a
		*                               Platott object.
		*/
    			@Test
    		
    	public void testIsPlotRun() throws ClassCastException {
    	  assertNotNull("testIsPlotRun", ((PlotRunList) new PlotRunList()).remove(0));
    	}

    /**
     *  Test if an index out of bounds {@link PlotRunList#remove(int)
     *  returns an exception and does not throw ClassCastException}.
     *
     *  @throws  Exception - if the specified index is out of bounds with
     *                                 the specified object
     */
        
    	  @Test(expected = ArrayIndexOutOfBoundsException.class)
     	    public void testRemove_outOfBoundsIndex() throws Exception {
     		  new PlotRunList().remove(5);
     	  }

    	@Test
    	public void testGet() throws Exception {
         
         assertNotNull("testGet", DataType.toPlotDataType(((PlotRunList) new PlotRunList()).get(0)));
    }

}