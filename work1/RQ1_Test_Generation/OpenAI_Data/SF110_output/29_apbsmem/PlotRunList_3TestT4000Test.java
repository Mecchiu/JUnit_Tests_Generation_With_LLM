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
		list.add(0, run2);
		assertEquals(run2, list.get(0));
		assertEquals(run, list.get(1));
		
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
		assertEquals(run2, list.remove(0));
		assertEquals(run, list.remove(0));
		
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
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(2, list.size());
		
		list.clear();
		assertEquals(0, list.size());
	}
	
}

// PlotRunList_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#clone()} method.
*/
class PlotRunList_9Test {
		
	/**
	* Test method for {@link PlotRunList#clone()}.
	*/
	@Test
	void testClone() {
		PlotRunList list = new PlotRunList();
		assertEquals(0, list.size());
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(1, list.size());
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(2, list.size());
		
		PlotRunList list2 = (PlotRunList) list.clone();
		assertEquals(2, list2.size());
		assertEquals(run, list2.get(0));
		assertEquals(run2, list2.get(1));
	}
	
}

// PlotRunList_10Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMinX()} method.
*/
class PlotRunList_10Test {
		
	/**
	* Test method for {@link PlotRunList#getMinX()}.
	*/
	@Test
	void testGetMinX() {
		PlotRunList list = new PlotRunList();
		assertEquals(Double.MAX_VALUE, list.getMinX());
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(Double.MAX_VALUE, list.getMinX());
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(Double.MAX_VALUE, list.getMinX());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1.0, list.getMinX());
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run2.add(datum2);
		assertEquals(1.0, list.getMinX());
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0);
		run2.add(datum3);
		assertEquals(1.0, list.getMinX());
		
		list.remove(run);
		assertEquals(3.0, list.getMinX());
		
		list.remove(run2);
		assertEquals(Double.MAX_VALUE, list.getMinX());
	}
	
}

// PlotRunList_11Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMaxX()} method.
*/
class PlotRunList_11Test {
		
	/**
	* Test method for {@link PlotRunList#getMaxX()}.
	*/
	@Test
	void testGetMaxX() {
		PlotRunList list = new PlotRunList();
		assertEquals(Double.MIN_VALUE, list.getMaxX());
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(Double.MIN_VALUE, list.getMaxX());
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(Double.MIN_VALUE, list.getMaxX());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1.0, list.getMaxX());
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run2.add(datum2);
		assertEquals(3.0, list.getMaxX());
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0);
		run2.add(datum3);
		assertEquals(5.0, list.getMaxX());
		
		list.remove(run);
		assertEquals(5.0, list.getMaxX());
		
		list.remove(run2);
		assertEquals(Double.MIN_VALUE, list.getMaxX());
	}
	
}

// PlotRunList_12Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMinY()} method.
*/
class PlotRunList_12Test {
		
	/**
	* Test method for {@link PlotRunList#getMinY()}.
	*/
	@Test
	void testGetMinY() {
		PlotRunList list = new PlotRunList();
		assertEquals(Double.MAX_VALUE, list.getMinY());
		
		PlotRun run = new PlotRun();
		list.add(run);
		assertEquals(Double.MAX_VALUE, list.getMinY());
		
		PlotRun run2 = new PlotRun();
		list.add(run2);
		assertEquals(Double.MAX_VALUE, list.getMinY());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(2.0, list.getMinY());
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run2.add(datum2);
		assertEquals(2.0, list.getMinY());
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0);
		run2.add(datum3);
		assertEquals(2.0, list.getMinY());
		
		list.remove(run);
		assertEquals(4.0, list.getMinY());
		
		list.remove(run2);
		assertEquals(Double.MAX_VALUE, list.getMinY());
	}
	
}

// PlotRunList_13Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases