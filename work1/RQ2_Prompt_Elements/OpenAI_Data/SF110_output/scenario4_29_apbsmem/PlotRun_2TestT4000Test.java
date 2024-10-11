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
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run.set(0, datum2);
		assertEquals(1, run.size());
		assertEquals(datum2, run.get(0));
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0);
		run.add(0, datum3);
		assertEquals(2, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		
		PlotDatum datum4 = new PlotDatum(7.0, 8.0);
		run.add(datum4);
		assertEquals(3, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		
		PlotDatum datum5 = new PlotDatum(9.0, 10.0);
		run.add(datum5);
		assertEquals(4, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		
		PlotDatum datum6 = new PlotDatum(11.0, 12.0);
		run.add(datum6);
		assertEquals(5, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		
		PlotDatum datum7 = new PlotDatum(13.0, 14.0);
		run.add(datum7);
		assertEquals(6, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		
		PlotDatum datum8 = new PlotDatum(15.0, 16.0);
		run.add(datum8);
		assertEquals(7, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		assertEquals(datum8, run.get(6));
		
		PlotDatum datum9 = new PlotDatum(17.0, 18.0);
		run.add(datum9);
		assertEquals(8, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		assertEquals(datum8, run.get(6));
		assertEquals(datum9, run.get(7));
		
		PlotDatum datum10 = new PlotDatum(19.0, 20.0);
		run.add(datum10);
		assertEquals(9, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		assertEquals(datum8, run.get(6));
		assertEquals(datum9, run.get(7));
		assertEquals(datum10, run.get(8));
		
		PlotDatum datum11 = new PlotDatum(21.0, 22.0);
		run.add(datum11);
		assertEquals(10, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		assertEquals(datum8, run.get(6));
		assertEquals(datum9, run.get(7));
		assertEquals(datum10, run.get(8));
		assertEquals(datum11, run.get(9));
		
		assertEquals(datum3, run.remove(0));
		assertEquals(9, run.size());
		assertEquals(datum2, run.get(0));
		assertEquals(datum4, run.get(1));
		assertEquals(datum5, run.get(2));
		assertEquals(datum6, run.get(3));
		assertEquals(datum7, run.get(4));
		assertEquals(datum8, run.get(5));
		assertEquals(datum9, run.get(6));
		assertEquals(datum10, run.get(7));
		assertEquals(datum11, run.get(8));
		
		assertEquals(datum2, run.remove(0));
		assertEquals(8, run.size());
		assertEquals(datum4, run.get(0));
		assertEquals(datum5, run.get(1));
		assertEquals(datum6, run.get(2));
		assertEquals(datum7, run.get(3));
		assertEquals(datum8, run.get(4));
		assertEquals(datum9, run.get(5));
		assertEquals(datum10, run.get(6));
		assertEquals(datum11, run.get(7));
		
		assertEquals(datum4, run.remove(0));
		assertEquals(7, run.size());
		assertEquals(datum5, run.get(0));
		assertEquals(datum6, run.get(1));
		assertEquals(datum7, run.get(2));
		assertEquals(datum8, run.get(3));
		assertEquals(datum9, run.get(4));
		assertEquals(datum10, run.get(5));
		assertEquals(datum11, run.get(6));
		
		assertEquals(datum5, run.remove(0));
		assertEquals(6, run.size());
		assertEquals(datum6, run.get(0));
		assertEquals(datum7, run.get(1));
		assertEquals(datum8, run.get(2));
		assertEquals(datum9, run.get(3));
		assertEquals(datum10, run.get(4));
		assertEquals(datum11, run.get(5));
		
		assertEquals(datum6, run.remove(0));
		assertEquals(5, run.size());
		assertEquals(datum7, run.get(0));
		assertEquals(datum8, run.get(1));
		assertEquals(datum9, run.get(2));
		assertEquals(datum10, run.get(3));
		assertEquals(datum11, run.get(4));
		
		assertEquals(datum7, run.remove(0));
		assertEquals(4, run.size());
		assertEquals(datum8, run.get(0));
		assertEquals(datum9, run.get(1));
		assertEquals(datum10, run.get(2));
		assertEquals(datum11, run.get(3));
		
		assertEquals(datum8, run.remove(0));
		assertEquals(3, run.size());
		assertEquals(datum9, run.get(0));
		assertEquals(datum10, run.get(1));
		assertEquals(datum11, run.get(2));
		
		assertEquals(datum9, run.remove(0));
		assertEquals(2, run.size());
		assertEquals(datum10, run.get(0));
		assertEquals(datum11, run.get(1));
		
		assertEquals(datum10, run.remove(0));
		assertEquals(1, run.size());
		assertEquals(datum11, run.get(0));
		
		assertEquals(datum11, run.remove(0));
		assertEquals(0, run.size());
		
		run.clear();
		assertEquals(0, run.size());
		
		Iterator it = run.iterator();
		assertFalse(it.hasNext());
		
		PlotRun run2 = (PlotRun) run.clone();
		assertEquals(0, run2.size());
		
		it = run2.iterator();
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#size()} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testRemove2() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run.set(0, datum2);
		assertEquals(1, run.size());
		assertEquals(datum2, run.get(0));
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0);
		run.add(0, datum3);
		assertEquals(2, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		
		PlotDatum datum4 = new PlotDatum(7.0, 8.0);
		run.add(datum4);
		assertEquals(3, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		
		PlotDatum datum5 = new PlotDatum(9.0, 10.0);
		run.add(datum5);
		assertEquals(4, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		
		PlotDatum datum6 = new PlotDatum(11.0, 12.0);
		run.add(datum6);
		assertEquals(5, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		
		PlotDatum datum7 = new PlotDatum(13.0, 14.0);
		run.add(datum7);
		assertEquals(6, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		
		PlotDatum datum8 = new PlotDatum(15.0, 16.0);
		run.add(datum8);
		assertEquals(7, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		assertEquals(datum4, run.get(2));
		assertEquals(datum5, run.get(3));
		assertEquals(datum6, run.get(4));
		assertEquals(datum7, run.get(5));
		assertEquals(datum8, run.get(6));
		
		PlotDatum datum9 = new PlotDatum(17.0, 18.0);
	