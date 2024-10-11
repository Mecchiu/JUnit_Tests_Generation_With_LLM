// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		Processor() { 
		}
		// Method for testing the TypeDesc object
		@Test
		public void testTypeDesc() {
			Processor processor=new Processor();
			processor.setType("myGrid");
			assertTrue(processor.getTypeDesc().getValue().endsWith(processor.getType()));
		}
}