// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {

	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_1() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_2() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_3() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_4() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_5() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_6() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_7() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_8() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).get