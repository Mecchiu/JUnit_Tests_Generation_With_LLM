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
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertFalse(run.iterator().hasNext());
		assertEquals(0, run.size());
		run.clear();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertFalse(run.iterator().hasNext());
		assertEquals(0, run.size());
		PlotRun run2 = (PlotRun) run.clone();
		assertEquals(0, run2.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run2.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run2.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run2.add(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run2.set(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertFalse(run2.iterator().hasNext());
		assertEquals(0, run2.size());
		run2.clear();
		assertEquals(0, run2.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run2.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run2.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run2.add(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run2.set(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertFalse(run2.iterator().hasNext());
		assertEquals(0, run2.size());
		run.add(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE));
		assertEquals(1, run.size());
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(1, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(1, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertTrue(run.iterator().hasNext());
		assertEquals(1, run.size());
		run.clear();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(0, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertFalse(run.iterator().hasNext());
		assertEquals(0, run.size());
		run.add(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE));
		assertEquals(1, run.size());
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(1, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(1, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertTrue(run.iterator().hasNext());
		assertEquals(1, run.size());
		run.add(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE));
		assertEquals(2, run.size());
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.remove(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.add(2, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(2, new PlotDatum(0, 0, true, PlotSymbol.CIRCLE)));
		assertTrue(run.iterator().hasNext());
		assertEquals(2, run.size());
		run.add(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE));
		assertEquals(3, run.size());
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(0, 0, true, PlotSymbol.CIRCLE), run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfB