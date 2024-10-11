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
		
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.set(0, datum2);
		assertEquals(1, run.size());
		assertEquals(datum2, run.get(0));
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.add(0, datum3);
		assertEquals(2, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		
		run.clear();
		assertEquals(0, run.size());
		
		Iterator<PlotDatum> it = run.iterator();
		assertFalse(it.hasNext());
		
		PlotRun run2 = (PlotRun) run.clone();
		assertEquals(0, run2.size());
	}
}

// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_3Test {
		
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
		
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.set(0, datum2);
		assertEquals(1, run.size());
		assertEquals(datum2, run.get(0));
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.add(0, datum3);
		assertEquals(2, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		
		run.clear();
		assertEquals(0, run.size());
		
		Iterator<PlotDatum> it = run.iterator();
		assertFalse(it.hasNext());
		
		PlotRun run2 = (PlotRun) run.clone();
		assertEquals(0, run2.size());
	}
}

// PlotRun_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_4Test {
		
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
		
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		
		PlotDatum datum2 = new PlotDatum(3.0, 4.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.set(0, datum2);
		assertEquals(1, run.size());
		assertEquals(datum2, run.get(0));
		
		PlotDatum datum3 = new PlotDatum(5.0, 6.0, true, new PlotSymbol(Color.BLACK, PlotSymbol.CIRCLE, 5));
		run.add(0, datum3);
		assertEquals(2, run.size());
		assertEquals(datum3, run.get(0));
		assertEquals(datum2, run.get(1));
		
		run.clear();
		assertEquals(0, run.size());
		
		Iterator<PlotDatum> it = run.iterator();
		assertFalse(it.hasNext());
		
		PlotRun run2 = (PlotRun) run.clone();
		assertEquals(0, run2.size());
	}
}

// PlotRun_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains