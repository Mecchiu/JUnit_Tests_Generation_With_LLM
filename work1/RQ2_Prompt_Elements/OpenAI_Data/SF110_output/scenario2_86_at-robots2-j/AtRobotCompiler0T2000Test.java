// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompilerTest {

	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file is empty.
	*/
	@Test
	void testCompile_EmptyFile() throws IOException {
		File sourceFile = new File("src/test/resources/empty.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getCode().length);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code.
	*/
	@Test
	void testCompile_SingleLine() throws IOException {
		File sourceFile = new File("src/test/resources/singleline.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label.
	*/
	@Test
	void testCompile_SingleLineWithLabel() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabel.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a comment.
	*/
	@Test
	void testCompile_SingleLineWithComment() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithcomment.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment2() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment2.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment3() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment3.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment4() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment4.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment5() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment5.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment6() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment6.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a