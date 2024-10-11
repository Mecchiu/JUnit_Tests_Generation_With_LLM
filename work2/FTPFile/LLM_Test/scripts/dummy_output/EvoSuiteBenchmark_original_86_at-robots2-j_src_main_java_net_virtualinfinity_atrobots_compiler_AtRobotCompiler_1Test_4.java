// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {
		
	@Test
	void unitTest() {
		// TODO this is wrong
		String input = "Hello, the world\n"; // should have only one line
		String result = "The message";

		AtRobotCompiler compiler = new  AtRobotCompiler();
		AtRobotCompilerOutput out = compiler.compile(input);
		assertNotNull("Compiled file did not exist!", out);
		// assertEquals( "Compiled file did not match! ", expectedResult, out.getCompiledResult());
		assertEquals( "Got wrong value for output!", result, out.getResult());
		assertNotNull( "Compiled file did not exist!", out.getCompiledFile());
		//System.gc();
	}
}