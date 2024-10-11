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
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_1() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(1, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_2() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(2, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_3() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(3, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_4() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(4, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_5() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(5, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_6() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(6, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_7() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(7, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_8() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(8, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_9() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(9, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_10() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(10, run.size());
	}
	
}

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
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_0() {
		PlotRun run = new PlotRun();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			run.get(0);
		});
	}
	
	/**
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_1() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_2() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(1));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_3() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(2));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_4() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(3));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_5() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(0));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(1));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(2));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(3));
		assertEquals(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), run.get(4));
	}
	
	/**
	* Test case for {@link PlotRun#get(int)}.
	*/
	@Test
	void testGet_6() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add