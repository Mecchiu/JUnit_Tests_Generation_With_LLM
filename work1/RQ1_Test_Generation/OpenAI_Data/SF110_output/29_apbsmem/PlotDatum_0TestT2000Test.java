// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {

	/**
	* Test case 1 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_1() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		boolean expected = false;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_2() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(0.0);
		boolean expected = false;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_3() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(1.0);
		boolean expected = true;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_4() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.NaN);
		boolean expected = false;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_5() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.NEGATIVE_INFINITY);
		boolean expected = false;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_6() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.POSITIVE_INFINITY);
		boolean expected = false;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_7() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.MIN_VALUE);
		boolean expected = true;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_8() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.MAX_VALUE);
		boolean expected = true;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_9() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.MIN_NORMAL);
		boolean expected = true;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	void testHasErrorBar_10() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.MIN_NORMAL);
		boolean expected = true;
		boolean actual = plotDatum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
}

// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getYError()} method.
*/
class PlotDatum_1Test {
		
	/**
	* Test case 1 for {@link PlotDatum#getYError()}.
	*/
	@Test
	void testGetYError_1() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		double expected = 0.0;
		double actual = plotDatum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link PlotDatum#getYError()}.
	*/
	@Test
	void testGetYError_2() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(0.0);
		double expected = 0.0;
		double actual = plotDatum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link PlotDatum#getYError()}.
	*/
	@Test
	void testGetYError_3() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(1.0);
		double expected = 1.0;
		double actual = plotDatum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link PlotDatum#getYError()}.
	*/
	@Test
	void testGetYError_4() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.NaN);
		double expected = 0.0;
		double actual = plotDatum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link PlotDatum#getYError()}.
	*/
	@Test
	void testGetYError_5() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.NEGATIVE_INFINITY);
		double expected = 0.0;
		double actual = plotDatum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link PlotDatum#getYError()}.
	*/
	@Test
	void testGetYError_6() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setYError(Double.POSITIVE_IN