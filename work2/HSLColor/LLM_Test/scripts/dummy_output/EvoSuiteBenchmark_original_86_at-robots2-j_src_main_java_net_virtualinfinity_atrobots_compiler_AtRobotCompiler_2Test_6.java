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
		 static int i = 9;
		 /**
		 * @throws IOException if there is a problem reading from or writing to the specified stream.
		 */
        @Test
        public void CompileTest() throws IOException {
				assertEquals(i, AtRobotCompiler.compile(new InputStreamReader(new ByteArrayInputStream("Hello".getBytes())), false));
				assertEquals(i, AtRobotCompiler.compile(new StringReader("Hello ".getBytes()), false));
				assertEquals(i, AtRobotCompiler.compile(new InputStreamReader(new ByteArrayInputStream(System.getProperty("java.class.path").split(System.getProperty("file.separator") + System.getProperty("path.separator"))+"java.jar")), false));
				assertEquals(i, AtRobotCompiler.compile(new FileInputStream("hello.txt"), false));
				assertEquals(i, AtRobotCompiler.compile(new StringWriter(), false));
		}
        
}