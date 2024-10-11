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
/**
     * Test method for {@link net.virtualinfinity.atrobots.compiler.AtRobotCompiler#compile(File)}.
     */
        @Test
        void testCompileFile() {//NOSONAR
            final String message = "Hello.";
            final File testFile = new File("/Users/David/Dropbox/OpenDataProject/atRobotCompiler/atrobots/atrobots_output/atRobotCompiler.java");
            assertEquals("Unexpected file", testFile, AtRobotCompiler.compile(new File("./")));
            String actual = atRobotCompiler.getMessageFor(testFile.getPath());
			assertEquals("Unexpected message", "Hello.", actual);

		}
}
