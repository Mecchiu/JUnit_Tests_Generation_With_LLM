// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {

	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#size()} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#iterator()} method.
	* Test case for {@link PlotRunList#clear()} method.
	* Test case for {@link PlotRunList#add(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#getMinX()} method.
	* Test case for {@link PlotRunList#getMaxX()} method.
	* Test case for {@link PlotRunList#getMinY()} method.
	* Test case for {@link PlotRunList#getMaxY()} method.
	*/
	@Test
	void testRemove() {
		PlotRunList list = new PlotRunList();
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		run.add(new PlotDatum(6, 6));
		run.add(new PlotDatum(7, 7));
		run.add(new PlotDatum(8, 8));
		run.add(new PlotDatum(9, 9));
		run.add(new PlotDatum(10, 10));
		list.add(run);
		assertEquals(1, list.size());
		assertEquals(run, list.get(0));
		assertEquals(run, list.iterator().next());
		assertEquals(1, list.getMinX());
		assertEquals(10, list.getMaxX());
		assertEquals(1, list.getMinY());
		assertEquals(10, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.remove(0);
		assertEquals(0, list.size());
		assertEquals(null, list.get(0));
		assertEquals(false, list.iterator().hasNext());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinX());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxX());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinY());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.add(run);
		assertEquals(1, list.size());
		assertEquals(run, list.get(0));
		assertEquals(run, list.iterator().next());
		assertEquals(1, list.getMinX());
		assertEquals(10, list.getMaxX());
		assertEquals(1, list.getMinY());
		assertEquals(10, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.clear();
		assertEquals(0, list.size());
		assertEquals(null, list.get(0));
		assertEquals(false, list.iterator().hasNext());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinX());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxX());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinY());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.add(run);
		assertEquals(1, list.size());
		assertEquals(run, list.get(0));
		assertEquals(run, list.iterator().next());
		assertEquals(1, list.getMinX());
		assertEquals(10, list.getMaxX());
		assertEquals(1, list.getMinY());
		assertEquals(10, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.remove(0);
		assertEquals(0, list.size());
		assertEquals(null, list.get(0));
		assertEquals(false, list.iterator().hasNext());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinX());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxX());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinY());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.add(run);
		assertEquals(1, list.size());
		assertEquals(run, list.get(0));
		assertEquals(run, list.iterator().next());
		assertEquals(1, list.getMinX());
		assertEquals(10, list.getMaxX());
		assertEquals(1, list.getMinY());
		assertEquals(10, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.clear();
		assertEquals(0, list.size());
		assertEquals(null, list.get(0));
		assertEquals(false, list.iterator().hasNext());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinX());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxX());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinY());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.add(run);
		assertEquals(1, list.size());
		assertEquals(run, list.get(0));
		assertEquals(run, list.iterator().next());
		assertEquals(1, list.getMinX());
		assertEquals(10, list.getMaxX());
		assertEquals(1, list.getMinY());
		assertEquals(10, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		// Test case for {@link PlotRunList#size()} method.
		// Test case for {@link PlotRunList#get(int)} method.
		// Test case for {@link PlotRunList#iterator()} method.
		// Test case for {@link PlotRunList#clear()} method.
		// Test case for {@link PlotRunList#add(int, Object)} method.
		// Test case for {@link PlotRunList#set(int, Object)} method.
		// Test case for {@link PlotRunList#getMinX()} method.
		// Test case for {@link PlotRunList#getMaxX()} method.
		// Test case for {@link PlotRunList#getMinY()} method.
		// Test case for {@link PlotRunList#getMaxY()} method.
		list.remove(0);
		assertEquals(0, list.size());
		assertEquals(null, list.get(0));
		assertEquals(false, list.iterator().hasNext());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinX());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxX());
		assertEquals(Double.POSITIVE_INFINITY, list.getMinY());
		assertEquals(Double.NEGATIVE_INFINITY, list.getMaxY());
		
		// Test case for {@link PlotRunList#remove(int)} method.
