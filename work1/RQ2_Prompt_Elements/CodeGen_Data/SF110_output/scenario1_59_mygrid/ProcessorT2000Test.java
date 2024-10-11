// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
/**
		* Tests the <code>getTypeDesc</code> method of <code>Class</code> {@link Processor}.
		*/
	@Test
	void testGetTypeDesc() {
		assertEquals("Type-desc of Processor's class.", typeDesc, Processor.class.getCanonicalName());
	}



}
