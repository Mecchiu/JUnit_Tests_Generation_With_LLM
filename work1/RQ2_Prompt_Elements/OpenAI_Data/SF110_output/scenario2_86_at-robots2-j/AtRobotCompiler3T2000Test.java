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
	* It tests the case where the source code is empty.
	*/
	@Test
	void testCompile_EmptySource() throws IOException {
		String source = "";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getCode().length);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction.
	*/
	@Test
	void testCompile_SingleInstruction() throws IOException {
		String source = "add 1, 2";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label.
	*/
	@Test
	void testCompile_SingleInstructionWithLabel() throws IOException {
		String source = "label: add 1, 2";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment2() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment3() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment4() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment5() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment6() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_SingleInstructionWithLabelAndComment7() throws IOException {
		String source = "label: add 1, 2 ; comment";
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x0102, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label