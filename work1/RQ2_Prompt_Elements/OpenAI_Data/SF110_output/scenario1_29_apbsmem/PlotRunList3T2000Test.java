// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunListTest {

	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator2() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator3() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator4() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator5() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator6() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator7() {
		PlotRunList runList = new PlotRunList();
		
		// Create a run of data.
		PlotDatum[] run = new PlotDatum[10];
		for (int i=0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		
		// Add the run to the run list.
		runList.add(run);
		
		// Create an iterator for the run list.
		Iterator iter = runList.iterator();
		
		// Verify that the iterator has data.
		assertTrue(iter.hasNext());
		
		// Verify that the iterator returns the correct data.
		for (int i=0; i < run.length; i++) {
			assertEquals(run[i], iter.next());
		}
		
		// Verify that the iterator has no more data.
		assertFalse(iter.hasNext());
	}
	
	/**
	* Test of {@link PlotRunList#iterator()} method.