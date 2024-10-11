// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_0() {
		PlotRunList runList = new PlotRunList();
		assertEquals(0, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_1() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		assertEquals(1, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_2() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(2, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_3() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(3, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_4() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(4, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_5() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(5, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_6() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(6, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_7() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(7, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_8() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(8, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_9() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(9, runList.size());
	}
	
	/**
	* Test case for {@link PlotRunList#size()}.
	*/
	@Test
	void testSize_10() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(10, runList.size());
	}
	
}

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
	* Test case for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet_0() {
		PlotRunList runList = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.get(0);
		});
	}
	
	/**
	* Test case for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet_1() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		assertEquals(new PlotRun(), runList.get(0));
	}
	
	/**
	* Test case for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet_2() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(new PlotRun(), runList.get(0));
	}
	
	/**
	* Test case for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet_3() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		assertEquals(new PlotRun(), runList.get(0));
	}
	
	/**
	* Test case for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet_4() {
		PlotRunList runList = new PlotRunList();
		runList.add(new PlotRun());
		runList.add(new PlotRun());
		runList.add(new Plot