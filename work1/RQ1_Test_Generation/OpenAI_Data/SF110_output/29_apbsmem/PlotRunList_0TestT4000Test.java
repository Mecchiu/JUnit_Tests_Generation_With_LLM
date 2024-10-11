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
		
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(1, runList.size());
		
		runList.add(run);
		assertEquals(2, runList.size());
		
		runList.add(run);
		assertEquals(3, runList.size());
		
		runList.add(run);
		assertEquals(4, runList.size());
		
		runList.add(run);
		assertEquals(5, runList.size());
		
		runList.add(run);
		assertEquals(6, runList.size());
		
		runList.add(run);
		assertEquals(7, runList.size());
		
		runList.add(run);
		assertEquals(8, runList.size());
		
		runList.add(run);
		assertEquals(9, runList.size());
		
		runList.add(run);
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
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(run, runList.get(0));
		
		runList.add(run);
		assertEquals(run, runList.get(1));
		
		runList.add(run);
		assertEquals(run, runList.get(2));
		
		runList.add(run);
		assertEquals(run, runList.get(3));
		
		runList.add(run);
		assertEquals(run, runList.get(4));
		
		runList.add(run);
		assertEquals(run, runList.get(5));
		
		runList.add(run);
		assertEquals(run, runList.get(6));
		
		runList.add(run);
		assertEquals(run, runList.get(7));
		
		runList.add(run);
		assertEquals(run, runList.get(8));
		
		runList.add(run);
		assertEquals(run, runList.get(9));
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
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(run, runList.set(0, run));
		
		runList.add(run);
		assertEquals(run, runList.set(1, run));
		
		runList.add(run);
		assertEquals(run, runList.set(2, run));
		
		runList.add(run);
		assertEquals(run, runList.set(3, run));
		
		runList.add(run);
		assertEquals(run, runList.set(4, run));
		
		runList.add(run);
		assertEquals(run, runList.set(5, run));
		
		runList.add(run);
		assertEquals(run, runList.set(6, run));
		
		runList.add(run);
		assertEquals(run, runList.set(7, run));
		
		runList.add(run);
		assertEquals(run, runList.set(8, run));
		
		runList.add(run);
		assertEquals(run, runList.set(9, run));
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
		PlotRun run = new PlotRun();
		runList.add(0, run);
		assertEquals(1, runList.size());
		
		runList.add(1, run);
		assertEquals(2, runList.size());
		
		runList.add(2, run);
		assertEquals(3, runList.size());
		
		runList.add(3, run);
		assertEquals(4, runList.size());
		
		runList.add(4, run);
		assertEquals(5, runList.size());
		
		runList.add(5, run);
		assertEquals(6, runList.size());
		
		runList.add(6, run);
		assertEquals(7, runList.size());
		
		runList.add(7, run);
		assertEquals(8, runList.size());
		
		runList.add(8, run);
		assertEquals(9, runList.size());
		
		runList.add(9, run);
		assertEquals(10, runList.size());
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
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_4Test {
		
	/**
	* Test case for {@link PlotRunList#remove(int)}.
	*/
	@Test
	void testRemove() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
		
		runList.add(run);
		assertEquals(run, runList.remove(0));
	}
}

// PlotRunList_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#clear()} method.
*/
class PlotRunList_5Test {
		
	/**
	* Test case for {@link PlotRunList#clear()}.
	*/
	@Test
	void testClear() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.add(run);
		runList.clear();
		assertEquals(0, runList.size());
	}
}

// PlotRunList_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_6Test {
		
	/**
	* Test case for {@link PlotRunList#iterator()}.
	*/
	@Test
	void testIterator() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		runList.add(run);
		Iterator iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
		
		runList.add(run);
		iterator = runList.iterator();
		assertEquals(run, iterator.next());
	}
}

// PlotRunList_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#clone()} method.
*/
class PlotRunList_7Test {
		
	/**
	* Test case for {@link PlotRunList#clone()}.
	*/
	@Test
	void testClone() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		runList.add(run);
		PlotRunList clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
		
		runList.add(run);
		clone = (PlotRunList) runList.clone();
		assertEquals(runList, clone);
	}
}

// PlotRunList_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMinX()} method.
*/
class PlotRunList_8Test {
		
	/**
	* Test case for {@link PlotRunList#getMinX()}.
	*/
	@Test
	void testGetMinX() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 1.0));
		runList.add(run);
		assertEquals(1.0, runList.getMinX());
		
		run.add(new PlotDatum(2.0, 2.0));
		runList.add(run);
		assertEquals(1.0, runList.getMinX());
		
		run.add(new PlotDatum(3.0, 3