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
		private static final int POS = 1;
		private static final short TESTTYPE = 0;

		@Test
		void testPOS() {
				compile(new ByteArrayInputStream("" + Integer.toHexString(POS) + " " + Integer.toHexString(POS) + "\n10\n20\n30".getBytes()));
		}

		@Test
		void testTESTTYPE() {
				compile(new ByteArrayInputStream("" + Integer.toHexString(TESTTYPE) + "\n".getBytes(StandardCharsets.UTF_8)));
		}
}