// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatumTest {

	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected2() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected3() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected4() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected5() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected6() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected7() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected8() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, false);
		assertFalse(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected9() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, true);
		assertTrue(datum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected10() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, Color.BLACK, false);
		assertFalse(datum.connected());
	}
	
}