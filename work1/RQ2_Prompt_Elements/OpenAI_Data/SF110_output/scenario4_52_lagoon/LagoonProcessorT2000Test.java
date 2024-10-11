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
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase1() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 2.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase2() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
	
	/**
	* Test case 3.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase3() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 4.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase4() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
	
	/**
	* Test case 5.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase5() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 6.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase6() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
	
	/**
	* Test case 7.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase7() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 8.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase8() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
	
	/**
	* Test case 9.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase9() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 10.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase10() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
}

// LagoonProcessorTest2.java
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
class LagoonProcessorTest2 {
		
	/**
	* Test case 1.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase1() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 2.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase2() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
	
	/**
	* Test case 3.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase3() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 4.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase4() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(false));
		processor.destroy();
	}
	
	/**
	* Test case 5.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase5() throws IOException {
		LagoonProcessor processor = new LagoonProcessor("targetURL", new Element("sitemap"), new File("sourceDir"), "password", new PrintWriter(System.out), new PrintWriter(System.err));
		assertTrue(processor.build(true));
		processor.destroy();
	}
	
	/**
	* Test case 6.
	*
	* @throws IOException  if any fatal error occur
	*/
	@Test
	void testCase6() throws IOException {
		L