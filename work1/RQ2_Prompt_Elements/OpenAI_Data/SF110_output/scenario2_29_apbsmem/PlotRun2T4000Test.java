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
	* It tests the case when the index is negative.
	*/
	@Test
	void testRemove_NegativeIndex() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(-1));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is greater than the size of the list.
	*/
	@Test
	void testRemove_IndexGreaterThanSize() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(5));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list.
	*/
	@Test
	void testRemove_IndexEqualToSize() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(5));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is zero.
	*/
	@Test
	void testRemove_IndexZero() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(0);
		assertEquals(1, removed.getX());
		assertEquals(1, removed.getY());
		assertEquals(4, run.size());
		assertEquals(2, ((PlotDatum) run.get(0)).getX());
		assertEquals(2, ((PlotDatum) run.get(0)).getY());
		assertEquals(3, ((PlotDatum) run.get(1)).getX());
		assertEquals(3, ((PlotDatum) run.get(1)).getY());
		assertEquals(4, ((PlotDatum) run.get(2)).getX());
		assertEquals(4, ((PlotDatum) run.get(2)).getY());
		assertEquals(5, ((PlotDatum) run.get(3)).getX());
		assertEquals(5, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list minus one.
	*/
	@Test
	void testRemove_IndexEqualToSizeMinusOne() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(4);
		assertEquals(5, removed.getX());
		assertEquals(5, removed.getY());
		assertEquals(4, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(2, ((PlotDatum) run.get(1)).getX());
		assertEquals(2, ((PlotDatum) run.get(1)).getY());
		assertEquals(3, ((PlotDatum) run.get(2)).getX());
		assertEquals(3, ((PlotDatum) run.get(2)).getY());
		assertEquals(4, ((PlotDatum) run.get(3)).getX());
		assertEquals(4, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwo() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(2);
		assertEquals(3, removed.getX());
		assertEquals(3, removed.getY());
		assertEquals(4, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(2, ((PlotDatum) run.get(1)).getX());
		assertEquals(2, ((PlotDatum) run.get(1)).getY());
		assertEquals(4, ((PlotDatum) run.get(2)).getX());
		assertEquals(4, ((PlotDatum) run.get(2)).getY());
		assertEquals(5, ((PlotDatum) run.get(3)).getX());
		assertEquals(5, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two plus one.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwoPlusOne() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(3);
		assertEquals(4, removed.getX());
		assertEquals(4, removed.getY());
		assertEquals(4, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(2, ((PlotDatum) run.get(1)).getX());
		assertEquals(2, ((PlotDatum) run.get(1)).getY());
		assertEquals(3, ((PlotDatum) run.get(2)).getX());
		assertEquals(3, ((PlotDatum) run.get(2)).getY());
		assertEquals(5, ((PlotDatum) run.get(3)).getX());
		assertEquals(5, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two minus one.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwoMinusOne() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(1);
		assertEquals(2, removed.getX());
		assertEquals(2, removed.getY());
		assertEquals(4, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(3, ((PlotDatum) run.get(1)).getX());
		assertEquals(3, ((PlotDatum) run.get(1)).getY());
		assertEquals(4, ((PlotDatum) run.get(2)).getX());
		assertEquals(4, ((PlotDatum) run.get(2)).getY());
		assertEquals(5, ((PlotDatum) run.get(3)).getX());
		assertEquals(5, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two minus two.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwoMinusTwo() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(0);
		assertEquals(1, removed.getX());
		assertEquals(1, removed.getY());
		assertEquals(4, run.size());
		assertEquals(2, ((PlotDatum) run.get(0)).getX());
		assertEquals(2, ((PlotDatum) run.get(0)).getY());
		assertEquals(3, ((PlotDatum) run.get(1)).getX());
		assertEquals(3, ((PlotDatum) run.get(1)).getY());
		assertEquals(4, ((PlotDatum) run.get(2)).getX());
		assertEquals(4, ((PlotDatum) run.get(2)).getY());
		assertEquals(5, ((PlotDatum) run.get(3)).getX());
		assertEquals(5, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two plus two.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwoPlusTwo() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(4);
		assertEquals(5, removed.getX());
		assertEquals(5, removed.getY());
		assertEquals(4, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(2, ((PlotDatum) run.get(1)).getX());
		assertEquals(2, ((PlotDatum) run.get(1)).getY());
		assertEquals(3, ((PlotDatum) run.get(2)).getX());
		assertEquals(3, ((PlotDatum) run.get(2)).getY());
		assertEquals(4, ((PlotDatum) run.get(3)).getX());
		assertEquals(4, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two plus three.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwoPlusThree() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(5);
		assertEquals(5, removed.getX());
		assertEquals(5, removed.getY());
		assertEquals(4, run.size());
		assertEquals(1, ((PlotDatum) run.get(0)).getX());
		assertEquals(1, ((PlotDatum) run.get(0)).getY());
		assertEquals(2, ((PlotDatum) run.get(1)).getX());
		assertEquals(2, ((PlotDatum) run.get(1)).getY());
		assertEquals(3, ((PlotDatum) run.get(2)).getX());
		assertEquals(3, ((PlotDatum) run.get(2)).getY());
		assertEquals(4, ((PlotDatum) run.get(3)).getX());
		assertEquals(4, ((PlotDatum) run.get(3)).getY());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* It tests the case when the index is equal to the size of the list divided by two plus four.
	*/
	@Test
	void testRemove_IndexEqualToSizeDividedByTwoPlusFour() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 1));
		run.add(new PlotDatum(2, 2));
		run.add(new PlotDatum(3, 3));
		run.add(new PlotDatum(4, 4));
		run.add(new PlotDatum(5, 5));
		PlotDatum removed = (PlotDatum) run.remove(6);
		assertEquals(5, removed.getX());
		assertEquals(5, removed.get