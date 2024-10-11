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
	* It tests the compilation of a simple robot program.
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
		assertEquals(0, output.getDebugMessages().size());
		assertEquals(0, output.getDebugWarnings().size());
		assertEquals(0, output.getDebugErrors().size());
		
		assertEquals(0x00, output.getByteCode()[0]);
		assertEquals(0x00, output.getByteCode()[1]);
		assertEquals(0x00, output.getByteCode()[2]);
		assertEquals(0x00, output.getByteCode()[3]);
		assertEquals(0x00, output.getByteCode()[4]);
		assertEquals(0x00, output.getByteCode()[5]);
		assertEquals(0x00, output.getByteCode()[6]);
		assertEquals(0x00, output.getByteCode()[7]);
		assertEquals(0x00, output.getByteCode()[8]);
		assertEquals(0x00, output.getByteCode()[9]);
		assertEquals(0x00, output.getByteCode()[10]);
		assertEquals(0x00, output.getByteCode()[11]);
		assertEquals(0x00, output.getByteCode()[12]);
		assertEquals(0x00, output.getByteCode()[13]);
		assertEquals(0x00, output.getByteCode()[14]);
		assertEquals(0x00, output.getByteCode()[15]);
		assertEquals(0x00, output.getByteCode()[16]);
		assertEquals(0x00, output.getByteCode()[17]);
		assertEquals(0x00, output.getByteCode()[18]);
		assertEquals(0x00, output.getByteCode()[19]);
		assertEquals(0x00, output.getByteCode()[20]);
		assertEquals(0x00, output.getByteCode()[21]);
		assertEquals(0x00, output.getByteCode()[22]);
		assertEquals(0x00, output.getByteCode()[23]);
		assertEquals(0x00, output.getByteCode()[24]);
		assertEquals(0x00, output.getByteCode()[25]);
		assertEquals(0x00, output.getByteCode()[26]);
		assertEquals(0x00, output.getByteCode()[27]);
		assertEquals(0x00, output.getByteCode()[28]);
		assertEquals(0x00, output.getByteCode()[29]);
		assertEquals(0x00, output.getByteCode()[30]);
		assertEquals(0x00, output.getByteCode()[31]);
		assertEquals(0x00, output.getByteCode()[32]);
		assertEquals(0x00, output.getByteCode()[33]);
		assertEquals(0x00, output.getByteCode()[34]);
		assertEquals(0x00, output.getByteCode()[35]);
		assertEquals(0x00, output.getByteCode()[36]);
		assertEquals(0x00, output.getByteCode()[37]);
		assertEquals(0x00, output.getByteCode()[38]);
		assertEquals(0x00, output.getByteCode()[39]);
		assertEquals(0x00, output.getByteCode()[40]);
		assertEquals(0x00, output.getByteCode()[41]);
		assertEquals(0x00, output.getByteCode()[42]);
		assertEquals(0x00, output.getByteCode()[43]);
		assertEquals(0x00, output.getByteCode()[44]);
		assertEquals(0x00, output.getByteCode()[45]);
		assertEquals(0x00, output.getByteCode()[46]);
		assertEquals(0x00, output.getByteCode()[47]);
		assertEquals(0x00, output.getByteCode()[48]);
		assertEquals(0x00, output.getByteCode()[49]);
		assertEquals(0x00, output.getByteCode()[50]);
		assertEquals(0x00, output.getByteCode()[51]);
		assertEquals(0x00, output.getByteCode()[52]);
		assertEquals(0x00, output.getByteCode()[53]);
		assertEquals(0x00, output.getByteCode()[54]);
		assertEquals(0x00, output.getByteCode()[55]);
		assertEquals(0x00, output.getByteCode()[56]);
		assertEquals(0x00, output.getByteCode()[57]);
		assertEquals(0x00, output.getByteCode()[58]);
		assertEquals(0x00, output.getByteCode()[59]);
		assertEquals(0x00, output.getByteCode()[60]);
		assertEquals(0x00, output.getByteCode()[61]);
		assertEquals(0x00, output.getByteCode()[62]);
		assertEquals(0x00, output.getByteCode()[63]);
		assertEquals(0x00, output.getByteCode()[64]);
		assertEquals(0x00, output.getByteCode()[65]);
		assertEquals(0x00, output.getByteCode()[66]);
		assertEquals(0x00, output.getByteCode()[67]);
		assertEquals(0x00, output.getByteCode()[68]);
		assertEquals(0x00, output.getByteCode()[69]);
		assertEquals(0x00, output.getByteCode()[70]);
		assertEquals(0x00, output.getByteCode()[71]);
		assertEquals(0x00, output.getByteCode()[72]);
		assertEquals(0x00, output.getByteCode()[73]);
		assertEquals(0x00, output.getByteCode()[74]);
		assertEquals(0x00, output.getByteCode()[75]);
		assertEquals(0x00, output.getByteCode()[76]);
		assertEquals(0x00, output.getByteCode()[77]);
		assertEquals(0x00, output.getByteCode()[78]);
		assertEquals(0x00, output.getByteCode()[79]);
		assertEquals(0x00, output.getByteCode()[80]);
		assertEqu