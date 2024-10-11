// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {

	/**
	* Test method for {@link PlotRun#iterator()}.
	*/
	@Test
	void testIterator() {
		PlotRun run = new PlotRun();
		Iterator<PlotDatum> it = run.iterator();
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), it.next());
		assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRun_4Test {
		
	/**
	* Test method for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(5));
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
* It contains ten unit test cases for the {@link PlotRun#set(int, Object)} method.
*/
class PlotRun_5Test {
		
	/**
	* Test method for {@link PlotRun#set(int, Object)}.
	*/
	@Test
	void testSet() {
		PlotRun run = new PlotRun();
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(0, new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE)));
		
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.set(0, new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE)));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.set(1, new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE)));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.set(2, new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE)));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.set(3, new PlotDatum(17.0, 18.0, true, PlotSymbol.CIRCLE)));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.set(4, new PlotDatum(19.0, 20.0, true, PlotSymbol.CIRCLE)));
		assertThrows(IndexOutOfBoundsException.class, () -> run.set(5, new PlotDatum(21.0, 22.0, true, PlotSymbol.CIRCLE)));
		
		assertEquals(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(17.0, 18.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(19.0, 20.0, true, PlotSymbol.CIRCLE), run.get(4));
	}
	
}

// PlotRun_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api