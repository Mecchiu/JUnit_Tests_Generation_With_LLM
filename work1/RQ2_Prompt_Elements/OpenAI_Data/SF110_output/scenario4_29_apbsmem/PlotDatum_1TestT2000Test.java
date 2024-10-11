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
	* Test case 1 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_1() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case 2 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_2() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case 3 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_3() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		assertTrue(datum.connected());
	}
	
	/**
	* Test case 4 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_4() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		assertFalse(datum.connected());
	}
	
	/**
	* Test case 5 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_5() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setConnected(false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case 6 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_6() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setConnected(true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case 7 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_7() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setConnected(true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case 8 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_8() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setConnected(false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case 9 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_9() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setConnected(false);
		datum.setConnected(true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case 10 for {@link PlotDatum#connected()}.
	*/
	@Test
	public void testConnected_10() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setConnected(true);
		datum.setConnected(false);
		assertFalse(datum.connected());
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
	* Test case 1 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_1() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true);
		assertEquals(Color.BLACK, datum.getLineColor());
	}
	
	/**
	* Test case 2 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_2() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false);
		assertEquals(Color.BLACK, datum.getLineColor());
	}
	
	/**
	* Test case 3 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_3() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		assertEquals(Color.BLACK, datum.getLineColor());
	}
	
	/**
	* Test case 4 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_4() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		assertEquals(Color.BLACK, datum.getLineColor());
	}
	
	/**
	* Test case 5 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_5() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setLineColor(Color.RED);
		assertEquals(Color.RED, datum.getLineColor());
	}
	
	/**
	* Test case 6 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_6() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setLineColor(Color.RED);
		assertEquals(Color.RED, datum.getLineColor());
	}
	
	/**
	* Test case 7 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
	public void testGetLineColor_7() {
		PlotDatum datum = new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0f));
		datum.setLineColor(Color.RED);
		datum.setLineColor(Color.BLACK);
		assertEquals(Color.BLACK, datum.getLineColor());
	}
	
	/**
	* Test case 8 for {@link PlotDatum#getLineColor()}.
	*/
	@Test
