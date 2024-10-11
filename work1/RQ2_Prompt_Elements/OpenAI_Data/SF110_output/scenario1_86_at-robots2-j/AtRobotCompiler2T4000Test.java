// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompilerTest {

		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a valid robot source code.
		*/
		@Test
		void testCompileValidRobot() throws IOException {
				final String sourceCode = "; This is a valid robot source code.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
																	"\n" +
																	"void main() {\n" +
																	"\twhile (1) {\n" +
																	"\t\tdrive(100);\n" +
																	"\t\tscan(0, 360, 1);\n" +
																	"\t\tfire(1);\n" +
																	"\t}\n" +
																	"}\n";
				final AtRobotCompiler compiler = new AtRobotCompiler();
				final AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
				assertTrue(output.isSuccess());
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a robot source code that contains a syntax error.
		*/
		@Test
		void testCompileRobotWithSyntaxError() throws IOException {
				final String sourceCode = "; This is a robot source code with a syntax error.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
																	"\n" +
																	"void main() {\n" +
																	"\twhile (1) {\n" +
																	"\t\tdrive(100);\n" +
																	"\t\tscan(0, 360, 1);\n" +
																	"\t\tfire(1);\n" +
																	"\t}\n" +
																	"\n" +
																	"\t// This line is a syntax error.\n" +
																	"\tint a = 1;\n" +
																	"}\n";
				final AtRobotCompiler compiler = new AtRobotCompiler();
				final AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
				assertFalse(output.isSuccess());
				assertEquals(1, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a robot source code that contains a warning.
		*/
		@Test
		void testCompileRobotWithWarning() throws IOException {
				final String sourceCode = "; This is a robot source code with a warning.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
																	"\n" +
																	"void main() {\n" +
																	"\twhile (1) {\n" +
																	"\t\tdrive(100);\n" +
																	"\t\tscan(0, 360, 1);\n" +
																	"\t\tfire(1);\n" +
																	"\t}\n" +
																	"\n" +
																	"\t// This line is a warning.\n" +
																	"\tint a = 1;\n" +
																	"}\n";
				final AtRobotCompiler compiler = new AtRobotCompiler();
				final AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
				assertTrue(output.isSuccess());
				assertEquals(0, output.getErrors().size());
				assertEquals(1, output.getWarnings().size());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a robot source code that contains a syntax error and a warning.
		*/
		@Test
		void testCompileRobotWithSyntaxErrorAndWarning() throws IOException {
				final String sourceCode = "; This is a robot source code with a syntax error and a warning.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
																	"\n" +
																	"void main() {\n" +
																	"\twhile (1) {\n" +
																	"\t\tdrive(100);\n" +
																	"\t\tscan(0, 360, 1);\n" +
																	"\t\tfire(1);\n" +
																	"\t}\n" +
																	"\n" +
																	"\t// This line is a syntax error.\n" +
																	"\tint a = 1;\n" +
																	"\n" +
																	"\t// This line is a warning.\n" +
																	"\tint b = 1;\n" +
																	"}\n";
				final AtRobotCompiler compiler = new AtRobotCompiler();
				final AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
				assertFalse(output.isSuccess());
				assertEquals(1, output.getErrors().size());
				assertEquals(1, output.getWarnings().size());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a robot source code that contains a syntax error and two warnings.
		*/
		@Test
		void testCompileRobotWithSyntaxErrorAndTwoWarnings() throws IOException {
				final String sourceCode = "; This is a robot source code with a syntax error and two warnings.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
																	"\n" +
																	"void main() {\n" +
																	"\twhile (1) {\n" +
																	"\t\tdrive(100);\n" +
																	"\t\tscan(0, 360, 1);\n" +
																	"\t\tfire(1);\n" +
																	"\t}\n" +
																	"\n" +
																	"\t// This line is a syntax error.\n" +
																	"\tint a = 1;\n" +
																	"\n" +
																	"\t// This line is a warning.\n" +
																	"\tint b = 1;\n" +
																	"\n" +
																	"\t// This line is a warning.\n" +
																	"\tint c = 1;\n" +
																	"}\n";
				final AtRobotCompiler compiler = new AtRobotCompiler();
				final AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
				assertFalse(output.isSuccess());
				assertEquals(1, output.getErrors().size());
				assertEquals(2, output.getWarnings().size());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a robot source code that contains two syntax errors and a warning.
		*/
		@Test
		void testCompileRobotWithTwoSyntaxErrorsAndWarning() throws IOException {
				final String sourceCode = "; This is a robot source code with two syntax errors and a warning.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
																	"\n" +
																	"void main() {\n" +
																	"\twhile (1) {\n" +
																	"\t\tdrive(100);\n" +
																	"\t\tscan(0, 360, 1);\n" +
																	"\t\tfire(1);\n" +
																	"\t}\n" +
																	"\n" +
																	"\t// This line is a syntax error.\n" +
																	"\tint a = 1;\n" +
																	"\n" +
																	"\t// This line is a syntax error.\n" +
																	"\tint b = 1;\n" +
																	"\n" +
																	"\t// This line is a warning.\n" +
																	"\tint c = 1;\n" +
																	"}\n";
				final AtRobotCompiler compiler = new AtRobotCompiler();
				final AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
				assertFalse(output.isSuccess());
				assertEquals(2, output.getErrors().size());
				assertEquals(1, output.getWarnings().size());
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
		* This test case tests the compiler with a robot source code that contains two syntax errors and two warnings.
		*/
		@Test
		void testCompileRobotWithTwoSyntaxErrorsAndTwoWarnings() throws IOException {
				final String sourceCode = "; This is a robot source code with two syntax errors and two warnings.\n" +
																	"\n" +
																	"#include <at/atrobots/robot.h>\n" +
													