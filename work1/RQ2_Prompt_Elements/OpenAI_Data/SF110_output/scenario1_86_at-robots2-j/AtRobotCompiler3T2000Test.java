// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompilerTest {

	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* This test case tests the compilation of a simple robot program.
	*/
	@Test
	void testCompileSimpleRobot() throws IOException {
		String source = "; This is a comment\n" +
						"\n" +
						"#include \"robot.h\"\n" +
						"\n" +
						"void main() {\n" +
						"	while (1) {\n" +
						"		drive(100);\n" +
						"		fire(1);\n" +
						"	}\n" +
						"}\n";
		
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
		
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getMessages().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
		assertEquals(0, output.getUnresolvedSymbols().size());
