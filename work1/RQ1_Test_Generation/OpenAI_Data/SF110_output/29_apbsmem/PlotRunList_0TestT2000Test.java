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
	void testSize() {
		PlotRunList runList = new PlotRunList();
		assertEquals(0, runList.size());
		
		PlotRun[] runArr = new PlotRun[10];
		for (int i = 0; i < 10; ++i) {
			runArr[i] = new PlotRun();
			runArr[i].add(new PlotDatum(i, i));
		}
		runList = new PlotRunList(runArr);
		assertEquals(10, runList.size());
		
		Collection runs = new ArrayList();
		for (int i = 0; i < 10; ++i) {
			runs.add(new PlotRun());
		}
		runList = new PlotRunList(runs);
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
	void testGet() {
		PlotRunList runList = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.get(0);
		});
		
		PlotRun[] runArr = new PlotRun[10];
		for (int i = 0; i < 10; ++i) {
			runArr[i] = new PlotRun();
			runArr[i].add(new PlotDatum(i, i));
		}
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.get(0));
		assertEquals(runArr[9], runList.get(9));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.get(10);
		});
		
		Collection runs = new ArrayList();
		for (int i = 0; i < 10; ++i) {
			runs.add(new PlotRun());
		}
		runList = new PlotRunList(runs);
		assertEquals(runs.toArray()[0], runList.get(0));
		assertEquals(runs.toArray()[9], runList.get(9));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.get(10);
		});
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
	* Test case for {@link PlotRunList#set(int, Object)}.
	*/
	@Test
	void testSet() {
		PlotRunList runList = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.set(0, new PlotRun());
		});
		
		PlotRun[] runArr = new PlotRun[10];
		for (int i = 0; i < 10; ++i) {
			runArr[i] = new PlotRun();
			runArr[i].add(new PlotDatum(i, i));
		}
		runList = new PlotRunList(runArr);
		assertEquals(runArr[0], runList.set(0, new PlotRun()));
		assertEquals(runArr[9], runList.set(9, new PlotRun()));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.set(10, new PlotRun());
		});
		
		Collection runs = new ArrayList();
		for (int i = 0; i < 10; ++i) {
			runs.add(new PlotRun());
		}
		runList = new PlotRunList(runs);
		assertEquals(runs.toArray()[0], runList.set(0, new PlotRun()));
		assertEquals(runs.toArray()[9], runList.set(9, new PlotRun()));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.set(10, new PlotRun());
		});
	}
	
}

// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#add(int, Object)} method.
*/
class PlotRunList_3Test {
		
	/**
	* Test case for {@link PlotRunList#add(int, Object)}.
	*/
	@Test
	void testAdd() {
		PlotRunList runList = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.add(0, new PlotRun());
		});
		
		PlotRun[] runArr = new PlotRun[10];
		for (int i = 0; i < 10; ++i) {
			runArr[i] = new PlotRun();
			runArr[i].add(new PlotDatum(i, i));
		}
		runList = new PlotRunList(runArr);
		assertEquals(10, runList.size());
		runList.add(0, new PlotRun());
		assertEquals(11, runList.size());
		runList.add(10, new PlotRun());
		assertEquals(12, runList.size());
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.add(13, new PlotRun());
		});
		
		Collection runs = new ArrayList();
		for (int i = 0; i < 10; ++i) {
			runs.add(new PlotRun());
		}
		runList = new PlotRunList(runs);
		assertEquals(10, runList.size());
		runList.add(0, new PlotRun());
		assertEquals(11, runList.size());
		runList.add(10, new PlotRun());
		assertEquals(12, runList.size());
		assertThrows(IndexOutOfBoundsException.class, () -> {
			runList.add(13, new PlotRun());
		});
	}
	
}

// PlotRunList_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRun