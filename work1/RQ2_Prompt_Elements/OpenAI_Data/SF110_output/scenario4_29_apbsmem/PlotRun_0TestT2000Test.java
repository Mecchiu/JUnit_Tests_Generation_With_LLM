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
		run.add(new PlotDatum(1.0, 2.0));
		assertEquals(1, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_2() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		assertEquals(2, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_3() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		assertEquals(3, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_4() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		assertEquals(4, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_5() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(9.0, 10.0));
		assertEquals(5, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_6() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(9.0, 10.0));
		run.add(new PlotDatum(11.0, 12.0));
		assertEquals(6, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_7() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(9.0, 10.0));
		run.add(new PlotDatum(11.0, 12.0));
		run.add(new PlotDatum(13.0, 14.0));
		assertEquals(7, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_8() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(9.0, 10.0));
		run.add(new PlotDatum(11.0, 12.0));
		run.add(new PlotDatum(13.0, 14.0));
		run.add(new PlotDatum(15.0, 16.0));
		assertEquals(8, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_9() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(9.0, 10.0));
		run.add(new PlotDatum(11.0, 12.0));
		run.add(new PlotDatum(13.0, 14.0));
		run.add(new PlotDatum(15.0, 16.0));
		run.add(new PlotDatum(17.0, 18.0));
		assertEquals(9, run.size());
	}
	
	/**
	* Test case for {@link PlotRun#size()}.
	*/
	@Test
	void testSize_10() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(9.0, 10.0));
		run.add(new PlotDatum(11.0, 12.0));
		run.add(new PlotDatum(13.0, 14.0));
		run.add(new PlotDatum(15.0, 16.0));
		run.add(new PlotDatum(17.0, 18.0));
		run.add(new PlotDatum(19.0, 20.0));
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