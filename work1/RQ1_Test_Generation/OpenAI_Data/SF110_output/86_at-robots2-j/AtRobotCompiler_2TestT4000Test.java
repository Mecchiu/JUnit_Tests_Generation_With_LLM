// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {

	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x00.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_1() throws Exception {
		final String source = "nop";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x00, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x01.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_2() throws Exception {
		final String source = "add";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x01, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x02.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_3() throws Exception {
		final String source = "sub";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x02, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x03.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_4() throws Exception {
		final String source = "mul";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x03, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x04.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_5() throws Exception {
		final String source = "div";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x04, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x05.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_6() throws Exception {
		final String source = "mod";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x05, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The test case expects the compiler to return a {@link AtRobotCompilerOutput} object.
	* The test case expects the {@link AtRobotCompilerOutput#getErrors()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getWarnings()} method to return an empty list.
	* The test case expects the {@link AtRobotCompilerOutput#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.CodeLine} object.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getLineNumber()} method to return 1.
	* The test case expects the {@link AtRobotCompilerOutput.CodeLine#getCode()} method to return a list containing a single {@link AtRobotCompilerOutput.Code} object.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getCode()} method to return the value 0x06.
	* The test case expects the {@link AtRobotCompilerOutput.Code#getArgument()} method to return the value 0x0000.
	*/
	@Test
	void testCompile_7() throws Exception {
		final String source = "and";
		final Reader reader = new StringReader(source);
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().size());
		final AtRobotCompilerOutput.CodeLine codeLine = output.getCode().get(0);
		assertEquals(1, codeLine.getLineNumber());
		assertEquals(1, codeLine.getCode().size());
		final AtRobotCompilerOutput.Code code = codeLine.getCode().get(0);
		assertEquals(0x06, code.getCode());
		assertEquals(0x0000, code.getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	*