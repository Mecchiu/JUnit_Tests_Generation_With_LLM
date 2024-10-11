// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {
		/**
		 * Test the method it generates, in case the test was not properly executed.
		 */
		@Test
	    public void itGeneratesCp32() {
	    		AtRobotCompiler c = new AtRobotCompiler();
	    		assertEquals("Incorrect input", 2, c.compile(new BufferedReader(new FileReader("Cp32Test/cp32_in.in"))).processor);
	    	}
}