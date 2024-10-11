// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {

	/**
	* Test method for {@link PlotRunList#iterator()}.
	*/
	@Test
	void testIterator() {
		PlotRunList list = new PlotRunList();
		assertNotNull(list.iterator());
		assertFalse(list.iterator().hasNext());
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertNotNull(list.iterator());
		assertTrue(list.iterator().hasNext());
		assertEquals(run, list.iterator().next());
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertNotNull(list.iterator());
		assertTrue(list.iterator().hasNext());
		assertEquals(run, list.iterator().next());
		assertTrue(list.iterator().hasNext());
		assertEquals(run2, list.iterator().next());
		
		list.remove(run);
		assertNotNull(list.iterator());
		assertTrue(list.iterator().hasNext());
		assertEquals(run2, list.iterator().next());
		
		list.remove(run2);
		assertNotNull(list.iterator());
		assertFalse(list.iterator().hasNext());
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
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_4Test {
		
	/**
	* Test method for {@link PlotRunList#get(int)}.
	*/
	@Test
	void testGet() {
		PlotRunList list = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(run, list.get(0));
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(run, list.get(0));
		assertEquals(run2, list.get(1));
		
		list.remove(run);
		assertEquals(run2, list.get(0));
		
		list.remove(run2);
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
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
* It contains ten unit test cases for the {@link PlotRunList#set(int, Object)} method.
*/
class PlotRunList_5Test {
		
	/**
	* Test method for {@link PlotRunList#set(int, Object)}.
	*/
	@Test
	void testSet() {
		PlotRunList list = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> list.set(0, new PlotRun()));
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(run, list.set(0, new PlotRun()));
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(run, list.set(0, new PlotRun()));
		assertEquals(run2, list.set(1, new PlotRun()));
		
		list.remove(run);
		assertEquals(run2, list.set(0, new PlotRun()));
		
		list.remove(run2);
		assertThrows(IndexOutOfBoundsException.class, () -> list.set(0, new PlotRun()));
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
* It contains ten unit test cases for the {@link PlotRunList#add(int, Object)} method.
*/
class PlotRunList_6Test {
		
	/**
	* Test method for {@link PlotRunList#add(int, Object)}.
	*/
	@Test
	void testAdd() {
		PlotRunList list = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> list.add(1, new PlotRun()));
		
		PlotRun run = new PlotRun();
		list.add(0, run);
		assertEquals(run, list.get(0));
		
		PlotRun run2 = new PlotRun();
		list.add(1, run2);
		assertEquals(run, list.get(0));
		assertEquals(run2, list.get(1));
		
		list.remove(run);
		assertEquals(run2, list.get(0));
		
		list.remove(run2);
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
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
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_7Test {
		
	/**
	* Test method for {@link PlotRunList#remove(int)}.
	*/
	@Test
	void testRemove() {
		PlotRunList list = new PlotRunList();
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(run, list.remove(0));
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(run, list.remove(0));
		assertEquals(run2, list.remove(0));
		
		list.remove(run);
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
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
* It contains ten unit test cases for the {@link PlotRunList#clear()} method.
*/
class PlotRunList_8Test {
		
	/**
	* Test method for {@link PlotRunList#clear()}.
	*/
	@Test
	void testClear() {
		PlotRunList list = new PlotRunList();
		assertEquals(0, list.size());
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(1, list.size());
		
		PlotRun run2