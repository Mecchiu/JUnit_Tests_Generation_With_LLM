// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains ten unit test cases for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {

	/**
	* Test case 1.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild1() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(true);
	}
	
	/**
	* Test case 2.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild2() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(false);
	}
	
	/**
	* Test case 3.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild3() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(true);
		lp.build(false);
	}
	
	/**
	* Test case 4.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild4() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(false);
		lp.build(true);
	}
	
	/**
	* Test case 5.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild5() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(true);
		lp.build(true);
	}
	
	/**
	* Test case 6.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild6() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(false);
		lp.build(false);
	}
	
	/**
	* Test case 7.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild7() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(true);
		lp.build(false);
		lp.build(true);
	}
	
	/**
	* Test case 8.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild8() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(false);
		lp.build(true);
		lp.build(false);
	}
	
	/**
	* Test case 9.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild9() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(true);
		lp.build(true);
		lp.build(true);
	}
	
	/**
	* Test case 10.
	* Test the {@link LagoonProcessor#build(boolean)} method.
	*
	* @throws IOException if any fatal error occur
	*/
	@Test
	void testBuild10() throws IOException {
		LagoonProcessor lp = new LagoonProcessor();
		lp.build(false);
		lp.build(false);
		lp.build(false);
	}
}