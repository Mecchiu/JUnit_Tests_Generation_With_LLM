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
		 * Compile a test data.
		 */
	@Test
	public void test_compile() throws IOException {
		AtRobotCompilerOutput result = AtRobotCompiler.compile("../jars/file.tgz");
		assertEquals(4, result.size());
		assertTrue(result.contains("file_1.txt"));
		assertTrue(result.contains("file_2.txt"));
		assertTrue(result.contains("file_3.txt"));
	}
}

// AtRobotCompiler.java
