// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {

	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		run.clear();
		assertEquals(0, run.size());
		assertFalse(run.iterator().hasNext());
		assertEquals(run, run.clone());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove2() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		assertEquals(1, run.size());
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(2, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(1, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		run.clear();
		assertEquals(0, run.size());
		assertFalse(run.iterator().hasNext());
		assertEquals(run, run.clone());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove3() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(1, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		assertEquals(2, run.size());
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(0));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(3, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(2, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		run.clear();
		assertEquals(0, run.size());
		assertFalse(run.iterator().hasNext());
		assertEquals(run, run.clone());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove4() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(1, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(2, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		assertEquals(3, run.size());
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(0));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(1));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(4, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(3, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		run.clear();
		assertEquals(0, run.size());
		assertFalse(run.iterator().hasNext());
		assertEquals(run, run.clone());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove5() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(1, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(2, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(3, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		assertEquals(4, run.size());
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(0));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(1));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(2));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(4));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(4));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(5, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(4, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		run.clear();
		assertEquals(0, run.size());
		assertFalse(run.iterator().hasNext());
		assertEquals(run, run.clone());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove6() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(1, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(2, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(3, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(4, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		assertEquals(5, run.size());
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(0));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(1));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(2));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(3));
		assertEquals(new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)), run.get(4));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(5));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(5));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(6, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(5, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1))));
		run.clear();
		assertEquals(0, run.size());
		assertFalse(run.iterator().hasNext());
		assertEquals(run, run.clone());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove7() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(1, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(2, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(3, new PlotDatum(0, 0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1)));
		run.add(