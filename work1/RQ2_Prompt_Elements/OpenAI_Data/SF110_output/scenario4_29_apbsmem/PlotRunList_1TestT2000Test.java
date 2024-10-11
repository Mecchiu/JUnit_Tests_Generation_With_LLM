// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {

	/**
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	* Test case for {@link PlotRunList#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(2.0, 3.0));
		run.add(new PlotDatum(3.0, 4.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 5.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(6.0, 7.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(8.0, 9.0));
		run.add(new PlotDatum(9.0, 10.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(10.0, 11.0));
		run.add(new PlotDatum(11.0, 12.0));
		run.add(new PlotDatum(12.0, 13.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(13.0, 14.0));
		run.add(new PlotDatum(14.0, 15.0));
		run.add(new PlotDatum(15.0, 16.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(16.0, 17.0));
		run.add(new PlotDatum(17.0, 18.0));
		run.add(new PlotDatum(18.0, 19.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(19.0, 20.0));
		run.add(new PlotDatum(20.0, 21.0));
		run.add(new PlotDatum(21.0, 22.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(22.0, 23.0));
		run.add(new PlotDatum(23.0, 24.0));
		run.add(new PlotDatum(24.0, 25.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(25.0, 26.0));
		run.add(new PlotDatum(26.0, 27.0));
		run.add(new PlotDatum(27.0, 28.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(28.0, 29.0));
		run.add(new PlotDatum(29.0, 30.0));
		run.add(new PlotDatum(30.0, 31.0));
		runList.add(run);
		assertEquals(runList.get(0), runList.get(0));
		assertEquals(runList.get(1), runList.get(1));
		assertEquals(runList.get(2), runList.get(2));
		assertEquals(runList.get(3), runList.get(3));
		assertEquals(runList.get(4), runList.get(4));
		assertEquals(runList.get(5), runList.get(5));
		assertEquals(runList.get(6), runList.get(6));
		assertEquals(runList.get(7), runList.get(7));
		assertEquals(runList.get(8), runList.get(8));
		assertEquals(runList.get(9), runList.get(9));
	}
}

// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#set(int, Object)} method.
*/
class PlotRunList_2Test {
		
	/**
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	* Test case for {@link PlotRunList#set(int, Object)} method.
	*/
	@Test
	void testSet() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(2.0, 3.0));
		run.add(new PlotDatum(3.0, 4.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 5.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(6.0, 7.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(8.0, 9.0));
		run.add(new PlotDatum(9.0, 10.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(10.0, 11.0));
		run.add(new PlotDatum(11.0, 12.0));
		run.add(new PlotDatum(12.0, 13.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(13.0, 14.0));
		run.add(new PlotDatum(14.0, 15.0));
		run.add(new PlotDatum(15.0, 16.0));
		runList.add(run);
		run = new PlotRun();
	