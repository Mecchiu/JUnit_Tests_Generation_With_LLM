// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {

	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_1() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_2() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_3() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_4() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_5() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_6() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_7() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setConnected(false);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_8() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setConnected(true);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_9() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setConnected(true);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected_10() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, false);
		plotDatum.setConnected(false);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
}

// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getLineColor()} method.
*/
class PlotDatum_2Test {
		
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_1() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		assertEquals(Color.black, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_2() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setLineColor(Color.red);
		assertEquals(Color.red, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_3() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setLineColor(Color.red);
		plotDatum.setLineColor(Color.blue);
		assertEquals(Color.blue, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_4() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setLineColor(Color.red);
		plotDatum.setLineColor(Color.blue);
		plotDatum.setLineColor(Color.green);
		assertEquals(Color.green, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_5() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setLineColor(Color.red);
		plotDatum.setLineColor(Color.blue);
		plotDatum.setLineColor(Color.green);
		plotDatum.setLineColor(Color.yellow);
		assertEquals(Color.yellow, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_6() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setLineColor(Color.red);
		plotDatum.setLineColor(Color.blue);
		plotDatum.setLineColor(Color.green);
		plotDatum.setLineColor(Color.yellow);
		plotDatum.setLineColor(Color.orange);
		assertEquals(Color.orange, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	*/
	@Test
	void testGetLineColor_7() {
		PlotDatum plotDatum = new PlotDatum(0.0, 0.0, true);
		plotDatum.setLineColor(Color.red);
		plotDatum.setLineColor(Color.blue);
		plotDatum.setLineColor(Color.green);
		plotDatum.setLineColor(Color.yellow);
		plotDatum.setLineColor(Color.orange);
		plotDatum.setLineColor(Color.pink);
		assertEqu