// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {

	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_0() {
		PlotRun plotRun = new PlotRun();
		assertEquals(0, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_1() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(1, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_2() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(2, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_3() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(3, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_4() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(4, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_5() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(5, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_6() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(6, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_7() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		assertEquals(7, plotRun.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_8() {
		PlotRun plotRun = new PlotRun();
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(new PlotDatum(0.0, 0.0, true, new PlotSymbol(PlotSymbol.CROSS, Color.BLACK, 1.0f)));
		plotRun.add(