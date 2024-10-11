// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompilerTest {

		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a valid source code.
		*/
		@Test
		public void testCompileValidSourceCode() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n}".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(0, output.getErrorCount());
				assertEquals(0, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing a syntax error.
		*/
		@Test
		public void testCompileSourceCodeWithSyntaxError() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(1, output.getErrorCount());
				assertEquals(0, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing a warning.
		*/
		@Test
		public void testCompileSourceCodeWithWarning() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n}".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(0, output.getErrorCount());
				assertEquals(1, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing a syntax error and a warning.
		*/
		@Test
		public void testCompileSourceCodeWithSyntaxErrorAndWarning() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(1, output.getErrorCount());
				assertEquals(1, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing a syntax error and two warnings.
		*/
		@Test
		public void testCompileSourceCodeWithSyntaxErrorAndTwoWarnings() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(1, output.getErrorCount());
				assertEquals(2, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing two syntax errors and a warning.
		*/
		@Test
		public void testCompileSourceCodeWithTwoSyntaxErrorsAndWarning() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(2, output.getErrorCount());
				assertEquals(1, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing two syntax errors and two warnings.
		*/
		@Test
		public void testCompileSourceCodeWithTwoSyntaxErrorsAndTwoWarnings() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(2, output.getErrorCount());
				assertEquals(2, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing a syntax error and three warnings.
		*/
		@Test
		public void testCompileSourceCodeWithSyntaxErrorAndThreeWarnings() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(1, output.getErrorCount());
				assertEquals(3, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing three syntax errors and a warning.
		*/
		@Test
		public void testCompileSourceCodeWithThreeSyntaxErrorsAndWarning() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(3, output.getErrorCount());
				assertEquals(1, output.getWarningCount());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
		* This test case tests the compiler with a source code containing three syntax errors and two warnings.
		*/
		@Test
		public void testCompileSourceCodeWithThreeSyntaxErrorsAndTwoWarnings() throws IOException {
				final InputStream in = new ByteArrayInputStream("#include <at/atrobots/robot.h>\n\nvoid main() {\n\n".getBytes());
				final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
				assertEquals(3, output.getErrorCount());
				assertEquals(2, output.getWarningCount());
		}
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

/**
 * Output of the compiler.
 *
 * @author Daniel Pitts
 */
public class AtRobotCompilerOutput {
    private final int errorCount;
    private final int warningCount;