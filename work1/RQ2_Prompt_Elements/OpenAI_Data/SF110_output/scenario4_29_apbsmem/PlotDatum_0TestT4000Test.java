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
	public void testHasErrorBar_1() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		boolean expected = false;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_2() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(0.0);
		boolean expected = false;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_3() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(1.0);
		boolean expected = true;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_4() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.NaN);
		boolean expected = false;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_5() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.POSITIVE_INFINITY);
		boolean expected = false;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_6() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.NEGATIVE_INFINITY);
		boolean expected = false;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_7() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_VALUE);
		boolean expected = true;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_8() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MAX_VALUE);
		boolean expected = true;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_9() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		boolean expected = true;
		boolean actual = datum.hasErrorBar();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link PlotDatum#hasErrorBar()}.
	*/
	@Test
	public void testHasErrorBar_10() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		boolean expected = true;
		boolean actual = datum.hasErrorBar();
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
	public void testGetYError_1() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		double expected = 0.0;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_2() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(0.0);
		double expected = 0.0;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_3() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(1.0);
		double expected = 1.0;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_4() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.NaN);
		double expected = Double.NaN;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_5() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.POSITIVE_INFINITY);
		double expected = Double.POSITIVE_INFINITY;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_6() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.NEGATIVE_INFINITY);
		double expected = Double.NEGATIVE_INFINITY;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_7() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_VALUE);
		double expected = Double.MIN_VALUE;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_8() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MAX_VALUE);
		double expected = Double.MAX_VALUE;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_9() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		double expected = Double.MIN_NORMAL;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link PlotDatum#getYError()}.
	*/
	@Test
	public void testGetYError_10() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		double expected = Double.MIN_NORMAL;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
}

// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setYError(double)} method.
*/
class PlotDatum_2Test {
		
	/**
	* Test case 1 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_1() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(0.0);
		double expected = 0.0;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_2() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(1.0);
		double expected = 1.0;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_3() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.NaN);
		double expected = Double.NaN;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_4() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.POSITIVE_INFINITY);
		double expected = Double.POSITIVE_INFINITY;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_5() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.NEGATIVE_INFINITY);
		double expected = Double.NEGATIVE_INFINITY;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_6() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_VALUE);
		double expected = Double.MIN_VALUE;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_7() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MAX_VALUE);
		double expected = Double.MAX_VALUE;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_8() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		double expected = Double.MIN_NORMAL;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_9() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		double expected = Double.MIN_NORMAL;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link PlotDatum#setYError(double)}.
	*/
	@Test
	public void testSetYError_10() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		datum.setYError(Double.MIN_NORMAL);
		double expected = Double.MIN_NORMAL;
		double actual = datum.getYError();
		assertEquals(expected, actual);
	}
	
}

// PlotDatum_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setConnected(boolean)} method.
*/
class PlotDatum