// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {

	/**
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.get(0));
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(datum, run.get(1));
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(datum, run.get(2));
		datum = new PlotDatum(7.0, 8.0);
		run.add(datum);
		assertEquals(datum, run.get(3));
		datum = new PlotDatum(9.0, 10.0);
		run.add(datum);
		assertEquals(datum, run.get(4));
		datum = new PlotDatum(11.0, 12.0);
		run.add(datum);
		assertEquals(datum, run.get(5));
		datum = new PlotDatum(13.0, 14.0);
		run.add(datum);
		assertEquals(datum, run.get(6));
		datum = new PlotDatum(15.0, 16.0);
		run.add(datum);
		assertEquals(datum, run.get(7));
		datum = new PlotDatum(17.0, 18.0);
		run.add(datum);
		assertEquals(datum, run.get(8));
		datum = new PlotDatum(19.0, 20.0);
		run.add(datum);
		assertEquals(datum, run.get(9));
	}
}

// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#set(int, Object)} method.
*/
class PlotRun_2Test {
		
	/**
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	*/
	@Test
	void testSet() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		datum = new PlotDatum(7.0, 8.0);
		run.add(datum);
		datum = new PlotDatum(9.0, 10.0);
		run.add(datum);
		datum = new PlotDatum(11.0, 12.0);
		run.add(datum);
		datum = new PlotDatum(13.0, 14.0);
		run.add(datum);
		datum = new PlotDatum(15.0, 16.0);
		run.add(datum);
		datum = new PlotDatum(17.0, 18.0);
		run.add(datum);
		datum = new PlotDatum(19.0, 20.0);
		run.add(datum);
		datum = new PlotDatum(21.0, 22.0);
		run.set(0, datum);
		assertEquals(datum, run.get(0));
		datum = new PlotDatum(23.0, 24.0);
		run.set(1, datum);
		assertEquals(datum, run.get(1));
		datum = new PlotDatum(25.0, 26.0);
		run.set(2, datum);
		assertEquals(datum, run.get(2));
		datum = new PlotDatum(27.0, 28.0);
		run.set(3, datum);
		assertEquals(datum, run.get(3));
		datum = new PlotDatum(29.0, 30.0);
		run.set(4, datum);
		assertEquals(datum, run.get(4));
		datum = new PlotDatum(31.0, 32.0);
		run.set(5, datum);
		assertEquals(datum, run.get(5));
		datum = new PlotDatum(33.0, 34.0);
		run.set(6, datum);
		assertEquals(datum, run.get(6));
		datum = new PlotDatum(35.0, 36.0);
		run.set(7, datum);
		assertEquals(datum, run.get(7));
		datum = new PlotDatum(37.0, 38.0);
		run.set(8, datum);
		assertEquals(datum, run.get(8));
		datum = new PlotDatum(39.0, 40.0);
		run.set(9, datum);
		assertEquals(datum, run.get(9));
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
* It contains ten unit test cases for the {@link PlotRun#add(int, Object)} method.
*/
class PlotRun_3Test {
		
	/**
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object