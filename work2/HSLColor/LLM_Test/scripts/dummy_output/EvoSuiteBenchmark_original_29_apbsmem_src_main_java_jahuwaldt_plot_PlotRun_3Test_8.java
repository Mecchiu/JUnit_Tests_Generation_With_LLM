// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {
		
	/**
	 * Constructs a new instance of this class from the specified array
	 * of PlotRun objects.
	 * @param runArr An array of arrays containing the PlotDatum objects to
	 *              be copied.
	 */
	public PlotRun_3Test(PlotRun[] runArr) {
	}
	
	/**
		Returns the number of PlotDatum objects in this plotrun as
		a <code>int</code>
	*/
	@Test
	public final void testSize() {
	}
	
	/**
		Returns the PlotDatum object at the specified position in this
		plotrun.
	*/
	@Test
	public final void testGet(int index) throws ClassCastException {
	}
	
	/**
		Replaces the plot data element at the specified position
		in this run with the specified datum.
	*/
	@Test
	public final void testSet(int index, Object element) {
	}

	/**
		Inserts the specified 
		(if valid) PlotData object at the specified position
		in this run.  Shifts the plot data element
		currently at that position (if any) and any subsequent
		data elements to the right (adds one to their indices).
	*/
	@Test
	public final void testAdd(int index, Object element) {
	}
}