// AtRobotCompiler_0Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_0Test {
@Test public void a() {
			final AtRobotCompilerOutput output = new AtRobotCompilerOutput();
			output.addSourceFile("a");
			final String code = output.compile(new File(new File("a"), "file.cpp"));
			assertTrue(new File("a").canRead());
			assertEquals(code, "return false;\n");
		}
	}
// AtRobotCompiler.java
