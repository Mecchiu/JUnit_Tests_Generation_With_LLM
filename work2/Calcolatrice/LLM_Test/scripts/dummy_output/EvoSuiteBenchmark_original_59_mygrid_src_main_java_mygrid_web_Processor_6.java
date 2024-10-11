// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		final java.lang.String testString;
		final Processor processor;
		final java.lang.String assembl;
		public ProcessorTest(String testString, Processor processor, java.lang.String assembl) {
			this.testString = testString;
			this.processor = processor;
			this.assembl = assembl;
		}
		@Test
		public void test_getTypeDesc() {
			org.apache.axis.description.TypeDesc typeDesc = getTypeDesc();
			assertNotNull(typeDesc);
		}
		@Test
		public void test_getAssembly() {
			// TODO: implement me...
		}
	}