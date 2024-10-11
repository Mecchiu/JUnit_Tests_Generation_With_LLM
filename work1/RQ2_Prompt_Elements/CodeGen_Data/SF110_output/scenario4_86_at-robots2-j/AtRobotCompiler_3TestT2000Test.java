// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {
public @Test void atRobotCompiler_3Test() {
			// GIVEN -> A LineNumberReader
			final LineNumberReader reader = new LineNumberReader(new StringReader(""));
			// WHEN -> Compile the given source
			AtRobotCompiler.compile(reader);
			// THEN -> Should get no error
		}
}
