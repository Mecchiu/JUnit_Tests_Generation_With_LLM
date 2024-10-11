// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		
	/**
	* Test method for {@link jahuwaldt.plot.PlotRunList#size()}.
	*/
	@Test
	public void testSize() {
		PlotRunList prl = new PlotRunList();
		assertTrue(prl.size() > 0);
	}
        
        /**
	* Test method for {@link jahuwaldt.plot.PlotRunList#add(java.lang.Object)}.
	*/
	@Test
	public void testAdd() {
		PlotRunList prl = new PlotRunList();
		assertFalse(prl.contains(null));
		prl.add((Object)testObject);
		assertTrue(prl.contains(testObject));
		assertFalse(prl.contains(null));
	}
        
        /**
	* Test method for {@link jahuwaldt.plot.PlotRunList#get(int)}.
	*/
	@Test
	public void testGet() {
		PlotRunList prl = new PlotRunList();
		assertNull(prl.get(0));
		prl.add((Object)testObject);
		assertNotNull(prl.get(testObject.getClass().getName()));
		prl.remove(testObject);
		assertEquals(0, prl.size());
	}
        
        /**
	* Test method for {@link jahuwaldt.plot.PlotRunList#iterator()}.
	*/
	@Test
	public void testIterator() {
                /**
                * Set up some test data.
                */
		PlotRunList prl = new PlotRunList ();

                /**
                * Return an Enumeration over the runs.
                * The iterator() method should return an Iterator object.
                */
		Iterator<PlotRun> iterator = prl.iterator();
                
		double startOffset = 0;
		//Add runs to array
}
}