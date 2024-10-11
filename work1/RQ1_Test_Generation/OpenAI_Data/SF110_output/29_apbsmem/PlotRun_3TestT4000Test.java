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
	* Test of {@link PlotRun#iterator()} method.
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
	* Test of {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.get(0);
		});
		
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
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.get(5);
		});
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
	* Test of {@link PlotRun#set(int, Object)} method.
	*/
	@Test
	void testSet() {
		PlotRun run = new PlotRun();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.set(0, new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		});
		
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
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.set(5, new PlotDatum(21.0, 22.0, true, PlotSymbol.CIRCLE));
		});
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
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#add(int, Object)} method.
*/
class PlotRun_6Test {
		
	/**
	* Test of {@link PlotRun#add(int, Object)} method.
	*/
	@Test
	void testAdd() {
		PlotRun run = new PlotRun();
		run.add(0, new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(1, new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(2, new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(3, new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(4, new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.get(5);
		});
	}
	
}

// PlotRun_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_7Test {
		
	/**
	* Test of {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove() {
		PlotRun run = new PlotRun();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.remove(0);
		});
		
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.remove(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.remove(0));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.remove(0));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.remove(0));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.remove(0);
		});
	}
	
}

// PlotRun_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clear()} method.
*/
class PlotRun_8Test {
		
	/**
	* Test of {@link PlotRun#clear()} method.
	*/
	@Test
	void testClear() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.clear();
		assertEquals(0, run.size());
	}
	
}

// PlotRun_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clone()} method.
*/
class PlotRun_9Test {
		
	/**
	* Test of {@link PlotRun#clone()} method.
	*/
	@Test
	void testClone() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		PlotRun run2 = (PlotRun) run.clone();
		assertEquals(run, run2);
		assertNotSame(run, run2);
	}
	
}

// PlotSymbol.java
/*
*   PlotSymbol  -- Enumeration of the different plot symbols.
*
*   Copyright (C) 2000-2002 by Joseph A. Huwaldt <jhuwaldt@knology.net>.
*   All rights reserved.
*   
*   This library is free software; you can redistribute it and/or
*   modify it under the terms of the GNU Library General Public
*   License as published by the Free Software Foundation; either
*   version 2 of the License, or (at your option) any later version.
*   
*   This library is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
*   Library General Public License for more details.
**/
package jahuwaldt.plot;

/**
 *  <p> This class represents the different plot symbols that can be used