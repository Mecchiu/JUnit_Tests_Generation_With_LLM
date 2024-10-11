// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRunTest {

	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is negative.
	*/
	@Test
	void testRemoveNegativeIndex() {
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
		
		try {
			run.remove(-1);
			fail("Expected IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is greater than the size of the list.
	*/
	@Test
	void testRemoveIndexGreaterThanSize() {
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
		
		try {
			run.remove(10);
			fail("Expected IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is equal to the size of the list.
	*/
	@Test
	void testRemoveIndexEqualToSize() {
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
		
		try {
			run.remove(10);
			fail("Expected IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is zero.
	*/
	@Test
	void testRemoveIndexZero() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(0);
		assertEquals(1, removed.getX());
		assertEquals(1, removed.getY());
		assertEquals(9, run.size());
		assertEquals(2, ((PlotDatum) run.get(0)).getX());
		assertEquals(2, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is equal to the size of the list minus one.
	*/
	@Test
	void testRemoveIndexEqualToSizeMinusOne() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(9);
		assertEquals(10, removed.getX());
		assertEquals(10, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(9, ((PlotDatum) run.get(8)).getX());
		assertEquals(9, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is in the middle of the list.
	*/
	@Test
	void testRemoveIndexMiddle() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(5);
		assertEquals(6, removed.getX());
		assertEquals(6, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is in the middle of the list.
	*/
	@Test
	void testRemoveIndexMiddle2() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(4);
		assertEquals(5, removed.getX());
		assertEquals(5, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is in the middle of the list.
	*/
	@Test
	void testRemoveIndexMiddle3() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(3);
		assertEquals(4, removed.getX());
		assertEquals(4, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is in the middle of the list.
	*/
	@Test
	void testRemoveIndexMiddle4() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(2);
		assertEquals(3, removed.getX());
		assertEquals(3, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is in the middle of the list.
	*/
	@Test
	void testRemoveIndexMiddle5() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(1);
		assertEquals(2, removed.getX());
		assertEquals(2, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case where the index is in the middle of the list.
	*/
	@Test
	void testRemoveIndexMiddle6() {
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
		
		PlotDatum removed = (PlotDatum) run.remove(8);
		assertEquals(9, removed.getX());
		assertEquals(9, removed.getY());
		assertEquals(9, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(10, ((PlotDatum) run.get(8)).getX());
		assertEquals(10, ((PlotDatum) run.get(8)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case