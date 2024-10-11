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
	*/
	@Test
	void testGet_1() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.get(0);
		});
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_2() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(1, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_3() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		assertEquals(2, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_4() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		assertEquals(3, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_5() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		assertEquals(4, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_6() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		assertEquals(5, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_7() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		assertEquals(6, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
		assertEquals(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), run.get(5));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_8() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		assertEquals(7, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
		assertEquals(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), run.get(5));
		assertEquals(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE), run.get(6));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_9() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE));
		assertEquals(8, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
		assertEquals(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), run.get(5));
		assertEquals(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE), run.get(6));
		assertEquals(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE), run.get(7));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet_10() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(17.0, 18.0, true, PlotSymbol.CIRCLE));
		assertEquals(9, run.size());
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), run.get(4));
		assertEquals(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), run.get(5));
		assertEquals(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE), run.get(6));
		assertEquals(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE), run.get(7));
		assertEquals(new PlotDatum(17.0, 18.0, true, PlotSymbol.CIRCLE), run.get(8));
	}
	
}