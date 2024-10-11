// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunListTest {

	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove2() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove3() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove4() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove5() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove6() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove7() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove8() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove9() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
	
	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove10() {
		PlotRunList list = new PlotRunList();
		PlotDatum[] run = new PlotDatum[2];
		run[0] = new PlotDatum(1.0, 2.0);
		run[1] = new PlotDatum(3.0, 4.0);
		list.add(run);
		list.remove(0);
		assertEquals(0, list.size());
	}
}