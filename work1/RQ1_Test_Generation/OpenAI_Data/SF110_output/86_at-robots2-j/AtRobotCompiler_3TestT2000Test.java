// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {

	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_1() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_2() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_3() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_4() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_5() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_6() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_7() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_8() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_9() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_10() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
}</code>



I have tried to use the following command to run the test cases:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore net.virtualinfinity.atrobots.compiler.AtRobotCompiler_3Test</code>
However, I get the following error:
<code>JUnit version 4.12
.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.