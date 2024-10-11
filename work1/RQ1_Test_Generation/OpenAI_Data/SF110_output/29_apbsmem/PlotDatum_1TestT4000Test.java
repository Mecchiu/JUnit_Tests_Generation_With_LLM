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
	void testConnected() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected2() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected3() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected4() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected5() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected6() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected7() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected8() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected9() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	*/
	@Test
	void testConnected10() {
		PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
}